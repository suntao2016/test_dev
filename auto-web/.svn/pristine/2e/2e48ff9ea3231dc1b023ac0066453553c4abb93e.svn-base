/**
 * 
 */
package com.ccigmall.auto.test.page.pc.dealer.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;

/**
 * @author dengshuhai
 * @since 2015 01 22
 * 用户中心页面
 */
public class UserCenterPage extends IndexPage{
	/**
	 * @param driver
	 */
	public UserCenterPage(WebDriver driver) {
		super(driver);
	}
	/**
	 *信息管理
	 */
	@FindBy(xpath="//p[text()='信息管理']")
	private WebElement infoManage;
	

	/**
	 *基本信息管理
	 */
	@FindBy(linkText="基本信息管理")
	private WebElement baseInfoManage;
	
	/**
	 *权限管理
	 */
	@FindBy(linkText="权限管理")
	private WebElement roleManage;
	
	/**
	 *用户管理
	 */
	@FindBy(linkText="用户管理")
	private WebElement userManage;

	public WebElement getInfoManage() {
		return infoManage;
	}

	public WebElement getBaseInfoManage() {
		return baseInfoManage;
	}

	public WebElement getRoleManage() {
		return roleManage;
	}

	public WebElement getUserManage() {
		return userManage;
	}
}
