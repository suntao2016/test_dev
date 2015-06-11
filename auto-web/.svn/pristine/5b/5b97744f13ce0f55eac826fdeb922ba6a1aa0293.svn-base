/**
 * 
 */
package com.ccigmall.auto.test.act.pc.category;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.category.IndexPage;

/**
 * @author jianping.gao 后台类目管理平台首页
 */
public class IndexAct extends SettingActiton {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(LoginAct.class);

	private IndexPage indexPage;

	/**
	 * 
	 * @param driver
	 */
	public IndexAct(WebDriver driver) {
		super(driver);
		indexPage = new IndexPage(driver);
	}

	/**
	 * 点击类目管理
	 * 
	 */
	public void clickCategoryManage() {
		logger.info("点击类目管理");
		click(indexPage.getCategoryManage());
	}

	/**
	 * 点击用户管理
	 * 
	 */
	public void clickUserManage() {
		logger.info("点击用户管理");
		click(indexPage.getUserManage());
	}

	/**
	 * 点击基础数据管理
	 * 
	 */
	public void clickBaseDataManage() {
		logger.info("点击基础数据管理");
		click(indexPage.getBaseDataManage());
	}

	/**
	 * 点击系统管理
	 * 
	 */
	public void clickSystemManage() {
		logger.info("点击系统管理");
		click(indexPage.getSystemManage());
	}

	/**
	 * 点击商品管理
	 * 
	 */
	public void clickProductManage() {
		logger.info("点击商品管理");
		click(indexPage.getProductManage());
	}

	/**
	 * 点击主页
	 * 
	 */
	public void clickHome() {
		logger.info("点击主页");
		click(indexPage.getIndex());
	}

	/**
	 * 点击退出
	 * 
	 */
	public void clickQuit() {
		logger.info("点击退出");
		click(indexPage.getQuit());
	}

}
