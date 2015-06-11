/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.systemManage;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.page.pc.dealer.systemManage.SystemManageIndexPage;

/**
 * @author dengshuhai
 * 经销商登录动作
 */
public class SystemManageAct extends IndexAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SystemManageAct.class);

	/**
	 * 系统管理内部页面
	 * 
	 */
	private static SystemManageIndexPage indexPage;

	/**
	 * 
	 * @param driver
	 */
	public SystemManageAct(WebDriver driver) {
		super(driver);
		indexPage = new SystemManageIndexPage(driver);
	}

	/**
	 * 点击现货订单
	 */
	public void clickSpotOrder() {
		logger.info("点击现货订单");
		click(indexPage.getSpotOrder());
	}
	

	/**
	 * 点击期货订单
	 */
	public void clickFuturesOrder() {
		logger.info("点击期货订单");
		click(indexPage.getFuturesOrder());
	}
	
	
	/**
	 * 点击库存查询
	 */
	public void clickStockQuery() {
		logger.info("点击库存查询");
		click(indexPage.getStockQuery());
	}
	
	/**
	 * 点击搜索按钮
	 */
	public void clickSearchButton() {
		logger.info("点击搜索按钮");
		click(indexPage.getSearchButton());
	}
	
}
