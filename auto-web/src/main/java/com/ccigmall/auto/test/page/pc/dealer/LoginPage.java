/**
 * 
 */
package com.ccigmall.auto.test.page.pc.dealer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 
 *         经销商登陆页
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
	@FindBy(how = How.ID, using = "nloginpwd")
	private WebElement password;

	/**
	 * 隐藏input uuid
	 */
	@FindBy(how = How.ID, using = "uid")
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
	 * 免费注册
	 */
	@FindBy(linkText = "免费注册>>")
	private WebElement registerButton;

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
	 * 免费注册按钮
	 * @return
	 */
	public WebElement getRegisterButton() {
		return registerButton;
	}

}
