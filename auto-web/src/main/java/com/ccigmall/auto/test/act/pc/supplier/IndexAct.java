/**
 * 
 */
package com.ccigmall.auto.test.act.pc.supplier;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.supplier.IndexPage;

/**
 * @author jianping.gao 供应商首页动作
 */
public class IndexAct extends SettingActiton {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(LoginAct.class);
	/**
	 * 
	 */
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
	 * 点击供应商会员
	 */
	public void clickSupplier() {
		logger.info("点击供应商会员");
		click(indexPage.getSupplier());
	}

	/**
	 * 点击退出
	 */
	public void clickQuit() {
		logger.info("点击退出");
		click(indexPage.getQuit());
	}

	/**
	 * 点击卖家中心
	 */
	public void clickSellerCenter() {
		logger.info("点击卖家中心");
		click(indexPage.getSellerCenter());
	}

	/**
	 * 点击用户中心
	 */
	public void clickUserCenter() {
		logger.info("点击用户中心");
		click(indexPage.getUserCenter());
	}

	/**
	 * 点击首页
	 */
	public void clickIndex() {
		logger.info("点击首页");
		click(indexPage.getIndex());
	}

}
