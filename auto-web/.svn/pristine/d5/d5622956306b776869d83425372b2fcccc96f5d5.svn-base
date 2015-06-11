/**
 * 
 */
package com.ccigmall.auto.test.page.pc.retailer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 
 *        经销商登陆页
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
	 * 登录
	 */
	@FindBy(how = How.ID, using = "loginsubmit")
	private WebElement submit;
	/**
	 * 免费注册按钮
	 */
	@FindBy(xpath="//a[contains(text(),'[免费注册]')]")
	private WebElement xpathCliFreeRegistered;
	
	public WebElement getXpathCliFreeRegistered() {
		return xpathCliFreeRegistered;
	}

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
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}

}
