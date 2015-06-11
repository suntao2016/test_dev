/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;
import com.ccigmall.auto.test.page.pc.dealer.LoginPage;
import com.ccigmall.auto.test.page.pc.dealer.user.RegisterPage;
import com.ccigmall.auto.test.page.pc.dealer.user.UserCenterPage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-07 经销商用户中心页面act
 */
public class UserCenterAct extends IndexAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(UserCenterAct.class);

	/**
	 * 用户中心页面
	 * 
	 */
	private UserCenterPage userCenterPage;

	/**
	 * 
	 * @param driver
	 */
	public UserCenterAct(WebDriver driver) {
		super(driver);
		userCenterPage = new UserCenterPage(driver);
	}



	/**
	 * 信息管理
	 */
	public void clickInfoManage() {
		logger.info("点击信息管理: {}", userCenterPage.getInfoManage());
		click(userCenterPage.getInfoManage());	
	}

	/**
	 * 基本信息管理
	 */
	public void clickBaseInfoManage() {
		logger.info("点击基本信息管理: {}", userCenterPage.getBaseInfoManage());
		click(userCenterPage.getBaseInfoManage());	
	}
	
	/**
	 * 用户管理
	 */
	public void clickUserManage() {
		logger.info("点击用户管理: {}", userCenterPage.getUserManage());
		click(userCenterPage.getUserManage());	
	}
	
	/**
	 * 权限管理
	 */
	public void clickRoleManage() {
		logger.info("点击权限管理: {}", userCenterPage.getRoleManage());
		click(userCenterPage.getRoleManage());	
	}
}
