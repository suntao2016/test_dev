/**
 * 
 */
package com.ccigmall.auto.test.act.pc.retailer.my;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.retailer.IndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.MyIndexPage;

/**
 * @author jianping.gao
 * 我的鑫网首页
 */
public class MyIndexAct extends IndexAct{
	

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MyIndexAct.class);
	
	/**
	 * 我的鑫网首页
	 */
	private MyIndexPage myIndexPage;
	
	/**
	 * 
	 * @param driver
	 */
	public MyIndexAct(WebDriver driver) {
		super(driver);
		myIndexPage=new MyIndexPage(driver);
	}
	
	/**
	 * 点击我的订单
	 */
	public void clickMyOrder(){
		logger.info("点击我的订单");
		click(myIndexPage.getMyOrder());
	}
	
	/**
	 * 点击联系客服
	 */
	public void clickContactCustomerService(){
		logger.info("点击联系客服");
		click(myIndexPage.getContactCustomerService());
	}
	
	/**
	 * 点击优惠券
	 */
	public void clickCoupon(){
		logger.info("点击优惠券");
		click(myIndexPage.getCoupon());
	}
	
	/**
	 * 点击权限管理
	 */
	public void clickAuthorityManagement(){
		logger.info("点击权限管理");
		click(myIndexPage.getAuthorityManagement());
	}
	
	/**
	 * 点击用户管理
	 */
	public void clickUserManagement(){
		logger.info("点击用户管理");
		click(myIndexPage.getUserManagement());
	}
	
	/**
	 * 点击财务管理
	 */
	public void clickFinanceManagement(){
		logger.info("点击财务管理");
		click(myIndexPage.getFinanceManagement());
	}
	
	/**
	 * 点击商户信息
	 */
	public void clickMerchantManagement(){
		logger.info("点击商户信息");
		click(myIndexPage.getMerchantManagement());
	}

}
