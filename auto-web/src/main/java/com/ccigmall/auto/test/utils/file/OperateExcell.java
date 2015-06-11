/**
 * 
 */
package com.ccigmall.auto.test.utils.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.UnderlineStyle;
import jxl.write.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import com.ccigmall.auto.test.bean.CaseBean;

/**
 * @author jianping.gao
 *
 */
public class OperateExcell {

	public static final String HEADERINFO = "headInfo";
	public static final String DATAINFON = "dataInfo";

	public static void writeExcel(String pathname,
			TreeMap<String, List<CaseBean>> map) throws IOException,
			ClassNotFoundException, WriteException {
		int sum = 0;
		/*
		 * 检查文件是否存在
		 */
		File tempExcelFile = new File(pathname);
		if (tempExcelFile.exists()) {
			tempExcelFile.delete();
		}
		/*
		 * 创建文件
		 */
		tempExcelFile.createNewFile();
		WritableWorkbook workBook = Workbook
				.createWorkbook(new FileOutputStream(tempExcelFile));

		int sheetIndex = 0;
		/*
		 * 创建case总结sheet
		 */
		WritableSheet sumSheet = workBook.createSheet("ccigmall", 0);
		sheetIndex++;
		/*
		 * 设置单元格样式
		 */
		WritableCellFormat tcellFormat = getCellStyle();
		tcellFormat.setBackground(Colour.RED);
		/*
		 * Map<"责任人",List<CaseBean>>
		 */
		TreeMap<String, List<CaseBean>> treeMap = new TreeMap<String, List<CaseBean>>();

		/*
		 * 获取系统分类
		 */
		Iterator<String> sysClassicIt = map.keySet().iterator();
		while (sysClassicIt.hasNext()) {
			String sysClassic = sysClassicIt.next();
			/*
			 * 创建不同系统的sheet
			 */
			WritableSheet sheet = workBook.createSheet(sysClassic, sheetIndex);

			/*
			 * 创建表头
			 */
			sheet.setColumnView(0, 40);
			sheet.setColumnView(1, 120);
			sheet.addCell(new Label(0, 0, "责任人", tcellFormat));
			sheet.addCell(new Label(1, 0, "用例名称", tcellFormat));

			List<CaseBean> caseBeans = map.get(sysClassic);
			int count = 1;
			for (CaseBean caseBean : caseBeans) {
				sheet.addCell(new Label(0, count, caseBean.getAuthor(),
						getCellStyleM()));
				sheet.addCell(new Label(1, count, caseBean.getDesc(),
						getCellStyleM()));
				count++;
				if (!treeMap.containsKey(caseBean.getAuthor())) {
					treeMap.put(caseBean.getAuthor(), new ArrayList<CaseBean>());
				} else {
					treeMap.get(caseBean.getAuthor()).add(caseBean);
				}
			}
			sheet.addCell(new Label(0, count + 3, sysClassic + "总数:",
					tcellFormat));
			sheet.addCell(new Label(1, count + 3, String.valueOf(count),
					tcellFormat));
			sum += caseBeans.size();
			sheetIndex++;
		}

		/*
		 * 写入总case
		 */
		sumSheet.addCell(new Label(0, 0, "测试用例总数", tcellFormat));
		sumSheet.addCell(new Label(1, 0, String.valueOf(sum), tcellFormat));
		sumSheet.setColumnView(0, 40);
		sumSheet.setColumnView(1, 120);

		Iterator<String> person = treeMap.keySet().iterator();

		while (person.hasNext()) {
			String per = person.next();
			WritableSheet sheet = workBook.createSheet(per, sheetIndex);
			/*
			 * 创建表头
			 */
			sheet.setColumnView(0, 20);
			sheet.setColumnView(1, 80);
			sheet.setColumnView(2, 40);
			sheet.addCell(new Label(0, 0, "责任人", tcellFormat));
			sheet.addCell(new Label(1, 0, "case描述", tcellFormat));
			sheet.addCell(new Label(2, 0, "case文件", tcellFormat));
			// sheet.addCell(new Label(3, 0, "最后修改时间", tcellFormat));
			// sheet.addCell(new Label(4, 0, "创建时间", tcellFormat));
			sum = 0;
			for (CaseBean caseBean : treeMap.get(per)) {
				sum++;
				if (sum == 1) {
					sheet.addCell(new Label(0, 1, caseBean.getAuthor(),
							getCellStyleM()));
				}

				sheet.addCell(new Label(1, sum, caseBean.getDesc(),
						getCellStyleM()));
				sheet.addCell(new Label(2, sum, caseBean.getFileName(),
						getCellStyleM()));
				// sheet.addCell(new Label(3, sum, caseBean
				// .getLastModifyTime()));
				// sheet.addCell(new Label(4, sum, caseBean.getCreatTime()));
			}
			sheet.mergeCells(0, 1, 0, sum);
			sheet.setColumnView(0, 30);
			sheet.setColumnView(1, 80);

			sheet.addCell(new Label(0, sum + 3, "总数:", tcellFormat));
			sheet.addCell(new Label(1, sum + 3, String.valueOf(sum),
					tcellFormat));
			sheetIndex++;
		}
		workBook.write();
		workBook.close();
	}

	/**
	 * 获取单元格样式
	 * 
	 * @param tcellFormat
	 * @throws WriteException
	 */
	private static WritableCellFormat getCellStyle()
			throws WriteException {
		/**
		 * 设置Excel表的第一行即表头
		 */
		WritableCellFormat tcellFormat = new WritableCellFormat();
		tcellFormat.setAlignment(jxl.format.Alignment.CENTRE);// 设置水平居中
		tcellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);// 设置垂直居中
		tcellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
		tcellFormat.setFont(new WritableFont(WritableFont
				.createFont("楷体_GB2312"), 16, WritableFont.NO_BOLD, false,
				UnderlineStyle.NO_UNDERLINE, Colour.BLACK)); // 设置显示的字体样式，字体，字号，是否粗体，字体颜色
		return tcellFormat;
	}

	/**
	 * 获取单元格样式
	 * 
	 * @param tcellFormat
	 * @throws WriteException
	 */
	private static WritableCellFormat getCellStyleM() throws WriteException {
		/**
		 * 设置Excel表的第一行即表头
		 */
		WritableCellFormat tcellFormat = new WritableCellFormat();
		tcellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);// 设置垂直居中
		tcellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
		return tcellFormat;
	}
}
