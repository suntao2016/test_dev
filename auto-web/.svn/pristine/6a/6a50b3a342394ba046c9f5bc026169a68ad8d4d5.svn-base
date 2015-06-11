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
 * 零售商首页
 */
public class IndexPage extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public IndexPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 登录
	 */
	@FindBy(how = How.XPATH, using = "//form[@id='login_form']/li[1]/a[1]")
	private WebElement login;
	
	/**
	 * 我的鑫网
	 */
	@FindBy(how = How.XPATH, using = "//li[@class='tb-maps']/a")
	private WebElement myCcigmall;
	
	
	/**
	 * 商品输入框
	 */
	@FindBy(id= "textfield")
	private WebElement textField;
	
	/**
	 * 商品搜索
	 */
	@FindBy(id= "search_item")
	private WebElement searchItemButton;
	/**
	 * 选择注册类型--零售商
	 */
	@FindBy(xpath= "//a[contains(text(),'零售商')]")
	private WebElement xpathCliRetailer;
	/**
	 * 选择注册类型--经销商
	 */
	@FindBy(xpath= "//a[contains(text(),'经销商')]")
	private WebElement xpathCliDealer;
	/**
	 * 选择注册类型--供应商
	 */
	@FindBy(xpath= "//a[contains(text(),'供应商')]")
	private WebElement xpathCliSupplier;
	
	/**
	 * 搜索结果中第一个商品
	 */
	@FindBy(xpath= "//div[@class='plist']/descendant::a[2]")
	private WebElement firstItem;
	
	


	/**
	 * 选择注册类型--零售商
	 */
	public WebElement getXpathCliRetailer() {
		return xpathCliRetailer;
	}
	/**
	 * 选择注册类型--经销商
	 */
	public WebElement getXpathCliDealer() {
		return xpathCliDealer;
	}
	/**
	 * 选择注册类型--供应商
	 */
	public WebElement getXpathCliSupplier() {
		return xpathCliSupplier;
	}

	public WebElement getFirstItem() {
		return firstItem;
	}

	public WebElement getTextField() {
		return textField;
	}

	public WebElement getSearchItemButton() {
		return searchItemButton;
	}




	/**
	 * @return the myCcigmall
	 */
	public WebElement getMyCcigmall() {
		return myCcigmall;
	}




	/**
	 * 
	 * @return the login
	 */
	public WebElement getLogin() {
		return login;
	}
}
