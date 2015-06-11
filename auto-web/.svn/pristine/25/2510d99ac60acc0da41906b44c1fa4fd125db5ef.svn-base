/**
 * 
 */
package com.ccigmall.auto.test.page.pc.supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 
 *         供应商登录
 */
public class LoginPage extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 登录名
	 */
	@FindBy(how = How.ID, using = "loginname")
	private WebElement loginName;

	/**
	 * 密码
	 */
	@FindBy(how = How.ID, using = "password")
	private WebElement password;

	/**
	 * 隐藏input uuid
	 */
	@FindBy(how = How.NAME, using = "uid")
	private WebElement uid;

	/**
	 * 验证码
	 */
	@FindBy(how = How.ID, using = "kaptcha")
	private WebElement kaptcha;

	/**
	 * 登录
	 */
	@FindBy(how = How.ID, using = "loginsubmit")
	private WebElement submit;
	
	/**
	 * 注册
	 */
	@FindBy(how = How.XPATH, using = "/html/body/form/div/div[2]/span/a")
	private WebElement register;
	
	/**
	 * @return the loginName
	 */
	public WebElement getLoginName() {
		return loginName;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}

	/**
	 * @return the uid
	 */
	public WebElement getUid() {
		return uid;
	}

	/**
	 * @return the kaptcha
	 */
	public WebElement getKaptcha() {
		return kaptcha;
	}

	/**
	 * @return the loginSubmit
	 */
	public WebElement getSubmit() {
		return submit;
	}
	
	/**
	 * @return the register
	 */
	public WebElement getRegister() {
		return register;
	}
}
