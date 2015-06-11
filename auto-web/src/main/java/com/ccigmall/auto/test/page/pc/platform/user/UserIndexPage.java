/**
 * 
 */
package com.ccigmall.auto.test.page.pc.platform.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.pc.platform.IndexPage;

/**
 * @author jianping.gao
 *  用户首页
 */
public class UserIndexPage extends IndexPage{

	/**
	 * 用户首页
	 * @param driver
	 */
	public UserIndexPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 商户审核
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "商户审核")
	private WebElement merchant;
	
	/**
	 * 设备审核
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "设备审核")
	private WebElement device;
	
	/**
	 * 品牌审核
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "品牌审核")
	private WebElement brand;
	
	
	/**
	 * 零售商问题反馈
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "零售商问题反馈")
	private WebElement retailerProblem;
	
	/**
	 * 经销商问题反馈
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "经销商问题反馈")
	private WebElement dealerProblem;
	
	/**
	 * 基本信息管理
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "基本信息管理")
	private WebElement baseInfoManage;
	
	/**
	 * 用户管理
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "用户管理")
	private WebElement userManage;
	
	/**
	 * 权限管理
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "权限管理")
	private WebElement authoriyManage;

	/**
	 * @return the merchant
	 */
	public WebElement getMerchant() {
		return merchant;
	}

	/**
	 * @param merchant the merchant to set
	 */
	public void setMerchant(WebElement merchant) {
		this.merchant = merchant;
	}

	/**
	 * @return the device
	 */
	public WebElement getDevice() {
		return device;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(WebElement device) {
		this.device = device;
	}

	/**
	 * @return the brand
	 */
	public WebElement getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(WebElement brand) {
		this.brand = brand;
	}

	/**
	 * @return the retailerProblem
	 */
	public WebElement getRetailerProblem() {
		return retailerProblem;
	}

	/**
	 * @param retailerProblem the retailerProblem to set
	 */
	public void setRetailerProblem(WebElement retailerProblem) {
		this.retailerProblem = retailerProblem;
	}

	/**
	 * @return the dealerProblem
	 */
	public WebElement getDealerProblem() {
		return dealerProblem;
	}

	/**
	 * @param dealerProblem the dealerProblem to set
	 */
	public void setDealerProblem(WebElement dealerProblem) {
		this.dealerProblem = dealerProblem;
	}

	/**
	 * @return the baseInfoManage
	 */
	public WebElement getBaseInfoManage() {
		return baseInfoManage;
	}

	/**
	 * @param baseInfoManage the baseInfoManage to set
	 */
	public void setBaseInfoManage(WebElement baseInfoManage) {
		this.baseInfoManage = baseInfoManage;
	}

	/**
	 * @return the userManage
	 */
	public WebElement getUserManage() {
		return userManage;
	}

	/**
	 * @param userManage the userManage to set
	 */
	public void setUserManage(WebElement userManage) {
		this.userManage = userManage;
	}

	/**
	 * @return the authoriyManage
	 */
	public WebElement getAuthoriyManage() {
		return authoriyManage;
	}

	/**
	 * @param authoriyManage the authoriyManage to set
	 */
	public void setAuthoriyManage(WebElement authoriyManage) {
		this.authoriyManage = authoriyManage;
	}
	/**
	 * 点击搜索按钮
	 */
	@FindBy(xpath="//button[contains(text(),'搜索')]")
	private WebElement xpathCliSearchButton;
	
	 /**
     * 点击弹出框确定
     */
	@FindBy(xpath="//input[@value='确定']")
    public WebElement xpathCliAlertConfirm;
	public WebElement getXpathCliSearchButton() {
		return xpathCliSearchButton;
	}

	public WebElement getXpathCliAlertConfirm() {
		return xpathCliAlertConfirm;
	}
	
	
}
