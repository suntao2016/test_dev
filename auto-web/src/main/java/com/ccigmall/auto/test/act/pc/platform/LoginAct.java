/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.platform.LoginPage;

/**
 * @author jianping.gao
 * 平台登录动作
 */
public class LoginAct extends SettingActiton{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(LoginAct.class);
	/**
	 * 平台登录页
	 */
	private LoginPage loginPage;
	/**
	 * 
	 * @param driver
	 */
	public LoginAct(WebDriver driver) {
		super(driver);
		loginPage=new LoginPage(driver);
	}
	
	/**
	 * 输入登录名
	 * 
	 * @param loginname
	 * 
	 */
	public void enterLoginName(String loginname) {
		logger.info("输入登录名  {}", loginname);
		type(loginPage.getLoginName(), loginname);
	}

	/**
	 * 输入密码
	 * @param password
	 * 
	 */
	public void enterPassword(String password) {
		logger.info("输入登录密码  {}", password);
		type(loginPage.getPassword(), password);
	}
	
	
	/**
	 * 点击登录
	 */
	public void clickSubmit() {
		logger.info("点击提交");
		click(loginPage.getSubmit());
	}
}
