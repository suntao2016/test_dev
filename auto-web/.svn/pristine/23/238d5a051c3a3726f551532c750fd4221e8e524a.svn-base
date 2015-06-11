package com.ccigmall.auto.test.act.pc.supplier.user;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.IndexAct;
import com.ccigmall.auto.test.page.pc.supplier.user.UserCenterPage;


/**
 * @author zhaixiaoyue
 * 供应商-用户中心公共部分
 */
public class UserCenterAct extends IndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserCenterAct.class);
	/**
	 * 
	 */
	private UserCenterPage ucp;
	/**
	 * 
	 * @param driver
	 */
	public UserCenterAct(WebDriver driver) {
		super(driver);
		ucp = new UserCenterPage(driver);
	}
	
	/**
	 * 点击用户管理
	 */
	public void clickUserinfo() {
		logger.info("点击用户管理");
		click(ucp.getUserinfo());
	}	
	
	/**
	 * 点击用户管理
	 */
	public void clickUserManager() {
		logger.info("点击用户管理");
		click(ucp.getUserlist());
	}

	/**
	 * 点击子供应商管理
	 */
	public void clickSubSupplier() {
		logger.info("点击子供应商管理");
		click(ucp.getSubSupplier());
	}
	
	/**
	 * 点击权限管理
	 */
	public void clickUserRole() {
		logger.info("点击权限管理");
		click(ucp.getUserRole());
	}
	
	

}
