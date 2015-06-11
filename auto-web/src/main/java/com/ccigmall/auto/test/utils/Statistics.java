/**
 * 
 */
package com.ccigmall.auto.test.utils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import jxl.write.WriteException;

import com.ccigmall.auto.test.bean.CaseBean;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.utils.file.OperateExcell;
import com.ccigmall.auto.test.utils.file.OpreateFile;

/**
 * @author jianping.gao
 *
 */
public class Statistics {

	private static String INPUT_PATH = System.getProperty("user.dir")
			+ "/src/main/java/com/ccigmall/auto/test/step";
	private static String OUT_PATH = System.getProperty("user.dir") + "\\"
			+ new SimpleDateFormat("yyyy-MM-dd-").format(new Date())
			+ "测试case统计.xls";

	public void exportCase() throws IOException, ClassNotFoundException,
			WriteException {
		// case文件的路径
		List<String> list = new ArrayList<String>();
		// 获取case文件的路径
		OpreateFile.getFiles(INPUT_PATH, list);
		// Map<"系统",List<CaseBean>>
		TreeMap<String, List<CaseBean>> map = new TreeMap<String, List<CaseBean>>();
		generateTreeMap(map, list);
		OperateExcell.writeExcel(OUT_PATH, map);
	}

	private void generateTreeMap(TreeMap<String, List<CaseBean>> map,
			List<String> list) throws ClassNotFoundException {

		map.put(Constant.RETAILER, new ArrayList<CaseBean>());
		map.put(Constant.SUPPLIER, new ArrayList<CaseBean>());
		map.put(Constant.PLATFORM, new ArrayList<CaseBean>());
		map.put(Constant.CATEGORY, new ArrayList<CaseBean>());
		map.put(Constant.DEALER, new ArrayList<CaseBean>());

		for (int i = 0; i < list.size(); i++) {
			String path = list.get(i);
			if (path.indexOf(Constant.RETAILER) != -1) {
				generateTreeMap(map.get(Constant.RETAILER), path);
			} else if (path.indexOf(Constant.SUPPLIER) != -1) {
				generateTreeMap(map.get(Constant.SUPPLIER), path);
			} else if (path.indexOf(Constant.PLATFORM) != -1) {
				generateTreeMap(map.get(Constant.PLATFORM), path);
			} else if (path.indexOf(Constant.CATEGORY) != -1) {
				generateTreeMap(map.get(Constant.CATEGORY), path);
			} else if (path.indexOf(Constant.DEALER) != -1) {
				generateTreeMap(map.get(Constant.DEALER), path);
			}
		}
	}

	/**
	 * 
	 * 
	 * @param map
	 * @param packagePath
	 * @throws ClassNotFoundException
	 */
	private void generateTreeMap(List<CaseBean> cases, String path)
			throws ClassNotFoundException {
		CaseBean caseBean = new CaseBean();
		caseBean.setFilePath(path);
		OpreateFile.getCaseAuthor(caseBean, path);

		String filePath = path.substring(
				path.indexOf("com\\ccigmall\\auto\\test\\step"),
				path.indexOf(".java"));
		String packagePath = filePath.replaceAll("\\\\", ".");
		Class<?> temp = Class.forName(packagePath);
		caseBean.setPackagePath(temp.getName());
		Method[] methods = temp.getMethods();
		for (int j = 0; j < methods.length; j++) {
			org.testng.annotations.Test test = methods[j]
					.getAnnotation(org.testng.annotations.Test.class);
			if (test == null) {
				continue;
			}
			if (test.description() == null) {
				return;
			}
			caseBean.setDesc(test.description());
		}
		cases.add(caseBean);
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException, WriteException {
		new Statistics().exportCase();

	}

}
