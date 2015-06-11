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
 * @author dengshuhai
 * 经销商首页
 */
public class IndexPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public IndexPage(WebDriver driver) {
		super(driver);
	}
	
	
	/**
	 * 用户信息
	 *
	 */
	@FindBy(how = How.CLASS_NAME, using = ".m1")
	private WebElement userInfo;
	
	/**
	 * 退出
	 *
	 */
	@FindBy(how = How.CLASS_NAME, using = ".m3")
	private WebElement quit;
	
	/**
	 * 首页
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "首页")
	private WebElement index;

	/**
	 * 系统管理
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "系统管理")
	private WebElement systemManageBar;
	

	/**
	 * 用户中心
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "用户中心")
	private WebElement userCenter;
	
	/**
	 * 联系客服
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "联系客服")
	private WebElement contactService;
	
	
	/**
	 * 搜索按钮
	 */
	@FindBy(xpath="//button[text()='搜索']")
	private WebElement searchButton;
	

	public WebElement getUserInfo() {
		return userInfo;
	}

	public WebElement getQuit() {
		return quit;
	}

	public WebElement getIndex() {
		return index;
	}

	public WebElement getSystemManageBar() {
		return systemManageBar;
	}

	public WebElement getUserCenter() {
		return userCenter;
	}

	public WebElement getContactService() {
		return contactService;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	
	
}
