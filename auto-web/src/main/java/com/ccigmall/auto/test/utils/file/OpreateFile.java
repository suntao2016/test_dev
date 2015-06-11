/**
 * 
 */
package com.ccigmall.auto.test.utils.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ccigmall.auto.test.bean.CaseBean;

/**
 * @author jianping.gao
 *
 */
public class OpreateFile {

	/**
	 * 读取path的文件
	 * 
	 * @param filePath
	 * @return
	 */
	public static void getFiles(String path, List<String> list) {
		File root = new File(path);
		File[] files = root.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				/*
				 * 递归调用
				 */
				getFiles(file.getAbsolutePath(), list);
			} else {
				list.add(file.getPath());
			}
		}
	}

	/**
	 * 获取
	 * 
	 * @param list
	 * @param path
	 */
	public static void getCaseAuthor(CaseBean caseBean, String path) {
		File file = new File(path);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:MM");
		caseBean.setLastModifyTime(sdf.format(new Date(file.lastModified())));
		caseBean.setFileName(file.getName().substring(0,
				file.getName().lastIndexOf(".")));
		caseBean.setFilePath(path);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				if (tempString.indexOf("@author") != -1) {
					caseBean.setAuthor(tempString.substring(
							"@author   ".length() + 1).trim());
					break;
				}
			}
			Process p = Runtime.getRuntime().exec("cmd /C dir " + path + "/tc");
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			String createTime = null;
			while ((line = br.readLine()) != null) {
				if (line.endsWith(".java")) {
					createTime = line.substring(0, 17);
					caseBean.setCreatTime(createTime);
					break;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

	public static void main(String[] args) {
		String temp = "@author jianping.gao 经销商";
		System.out.println(temp.substring("@author".length() + 1,
				temp.lastIndexOf(" ")));
	}

}
