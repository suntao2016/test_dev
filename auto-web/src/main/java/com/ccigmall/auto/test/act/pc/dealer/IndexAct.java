/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.page.pc.dealer.IndexPage;

/**
 * @author dengshuhai
 * 经销商首页动作
 */
public class IndexAct extends LoginAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(IndexAct.class);

	/**
	 * 供应商登陆页
	 * 
	 */
	private static IndexPage indexPage;

	/**
	 * 
	 * @param driver
	 */
	public IndexAct(WebDriver driver) {
		super(driver);
		indexPage = new IndexPage(driver);
	}

	/**
	 * 点击系统管理
	 */
	public void clickSystemManageBar() {
		logger.info("点击系统管理");
		click(indexPage.getSystemManageBar());
	}
	
	/**
	 * 点击系统管理
	 */
	public void UserCenter() {
		logger.info("点击用户中心");
		click(indexPage.getUserCenter());
	}
	
	/**
	 * 点击联系客服
	 */
	public void clickContactService() {
		logger.info("点击联系客服");
		click(indexPage.getContactService());
	}
}
