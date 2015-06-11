/**
 * 
 */
package com.ccigmall.auto.test.act.pc.supplier;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.supplier.LoginPage;

/**
 * @author jianping.gao
 * 供应商登录页动作
 */
public class LoginAct extends SettingActiton {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(LoginAct.class);

	/**
	 * 供应商登陆页
	 * 
	 */
	private static LoginPage loginPage;

	/**
	 * 
	 * @param driver
	 */
	public LoginAct(WebDriver driver) {
		super(driver);
		loginPage = new LoginPage(driver);
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
	 * 获取uuid
	 * @return
	 */
	public String getUUID() {
		String uuid = loginPage.getUid().getAttribute("value");
		logger.info("获取uuid {}", uuid);
		return uuid;
	}

	/**
	 * 输入验证码
	 * @param captcha
	 * 
	 */
	public void enterKaptcha(String captcha) {
		logger.info("输入验证码  {}", captcha);
		type(loginPage.getKaptcha(), captcha);
	}

	/**
	 * 点击登录
	 */
	public void clickSubmit() {
		logger.info("点击提交");
		click(loginPage.getSubmit());
	}
	/**
	 * 点击免费注册
	 */
	public void clickRegister() {
		logger.info("点击免费注册");
		click(loginPage.getRegister());
	}
	/**
	 * 打开 url
	 */
	public void open(String url) {
		logger.info("浏览器打开 {}", url);
		super.open(url, 3);
	}

}
