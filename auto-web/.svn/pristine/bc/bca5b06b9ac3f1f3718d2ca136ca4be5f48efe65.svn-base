package com.ccigmall.auto.test.page.pc.supplier.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.pc.supplier.IndexPage;


/**
 * @author zhaixiaoyue
 * 供应商-用户中心公共部分
 */
public class UserCenterPage extends IndexPage {
	
	/**
	 * 
	 * @param driver
	 */
	public UserCenterPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 基本信息管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/div/p[1]/a")
	private WebElement userinfo;
	
	/**
	 * 用户管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/div/p[2]/a")
	private WebElement userlist;
	
	/**
	 * 子供应商管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/div/p[3]/a")
	private WebElement subsupplier;
	
	/**
	 * 权限管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/div/p[4]/a")
	private WebElement userrole;
	
	/**
	 * @return the userinfo
	 */
	public WebElement getUserinfo() {
		return userinfo;
	}
	
	/**
	 * @return the userlist
	 */
	public WebElement getUserlist() {
		return userlist;
	}
	
	/**
	 * @return the subsupplier
	 */
	public WebElement getSubSupplier() {
		return subsupplier;
	}
	
	
	/**
	 * @return the userrole
	 */
	public WebElement getUserRole() {
		return userrole;
	}
	
}
