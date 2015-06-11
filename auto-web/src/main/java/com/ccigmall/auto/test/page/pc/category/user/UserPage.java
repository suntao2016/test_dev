package com.ccigmall.auto.test.page.pc.category.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author zhaixiaoyue
 * 用户管理公共元素
 */
public class UserPage extends SettingPage {

	/**
	 * 
	 * @param driver
	 */
	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 点击用户管理
	 */
	@FindBy(how = How.XPATH, using = "//a[text()='用户管理']")
	private WebElement usermanger;
	
	/**
	 * 点击用户管理
	 */
	@FindBy(how = How.XPATH, using = "//a[text()='角色管理']")
	private WebElement rolemanager;
	
	/**
	 * @return the usermanger
	 */
	public WebElement getUsermanger() {
		return usermanger;
	}

	
	/**
	 * @return the rolemanager
	 */
	public WebElement getRolemanager() {
		return rolemanager;
	}


}
