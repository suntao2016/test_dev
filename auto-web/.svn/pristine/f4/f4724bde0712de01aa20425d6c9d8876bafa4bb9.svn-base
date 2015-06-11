/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.platform.IndexPage;

/**
 * @author jianping.gao
 *
 */
public class IndexAct extends SettingActiton{
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
		indexPage=new IndexPage(driver);
	}
	
	
	/**
	 * 点击wofe会员
	 */
	public void clickWofe(){
		logger.info("点击wofe会员");
		click(indexPage.getWofe());
	}
	
	
	/**
	 * 点击退出
	 */
	public void clickQuit(){
		logger.info("点击退出");
		click(indexPage.getQuit());
	}
	
	/**
	 * 点击首页
	 */
	public void clickIndex(){
		logger.info("点击首页");
		click(indexPage.getIndex());
	}
	
	/**
	 * 点击卖家中心
	 */
	public void clickSellerCenter(){
		logger.info("点击卖家中心");
		click(indexPage.getSellerCenter());
	}
	
	
	/**
	 * 点击买家中心
	 */
	public void clickBuyersCenter(){
		logger.info("点击买家中心");
		click(indexPage.getBuyersCenter());
	}
	

	/**
	 * 点击促销管理
	 */
	public void clickPromotionManage(){
		logger.info("点击促销管理");
		click(indexPage.getPromotionManage());
	}
	
	/**
	 * 点击用户中心
	 */
	public void clickUserCenter(){
		logger.info("点击用户中心");
		click(indexPage.getUserCenter());
	}

}
