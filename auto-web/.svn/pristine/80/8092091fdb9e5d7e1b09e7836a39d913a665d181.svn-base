/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 *  类别系统登录页
 */
public class LoginPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 用户名
	 */
	@FindBy(how = How.ID, using = "username")
	private WebElement loginName;
	
	/**
	 * 密码
	 */
	@FindBy(how = How.ID, using = "password")
	private WebElement password;
	
	/**
	 * 登录
	 */
	@FindBy(how = How.CLASS_NAME, using = "sub")
	private WebElement submit;

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
