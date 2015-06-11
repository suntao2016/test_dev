/**
 * 
 */
package com.ccigmall.auto.test.bean;

import java.io.Serializable;

/**
 * @author jianping.gao
 *
 */
public class CaseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6289068931962429927L;

	/**
	 * 文件路径
	 */
	private String filePath;

	/**
	 * java路径
	 */
	private String packagePath;

	/**
	 * 文件名
	 */
	private String fileName;

	/**
	 * 责任人
	 */
	private String author;

	/**
	 * case描述
	 */
	private String desc;

	/**
	 * 创建时间
	 */
	private String creatTime;

	/**
	 * 最后修改时间
	 */
	private String lastModifyTime;

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath
	 *            the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return the packagePath
	 */
	public String getPackagePath() {
		return packagePath;
	}

	/**
	 * @param packagePath
	 *            the packagePath to set
	 */
	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the creatTime
	 */
	public String getCreatTime() {
		return creatTime;
	}

	/**
	 * @param creatTime
	 *            the creatTime to set
	 */
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}

	/**
	 * @return the lastModifyTime
	 */
	public String getLastModifyTime() {
		return lastModifyTime;
	}

	/**
	 * @param lastModifyTime
	 *            the lastModifyTime to set
	 */
	public void setLastModifyTime(String lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
