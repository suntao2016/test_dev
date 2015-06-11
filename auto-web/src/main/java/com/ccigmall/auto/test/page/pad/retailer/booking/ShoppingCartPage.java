package com.ccigmall.auto.test.page.pad.retailer.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * 
 * @author chenjingli  我的购物车 零售商
 *
 */
public class ShoppingCartPage  extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击全选框
	 */
	@FindBy(id="checkall")
	private WebElement checkAll;
	
	/**
	 * 点击第一个复选框
	 */
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement firstCheckbox;
	
	
	/**
	 * 删除按钮
	 */
	@FindBy(xpath="//button[text()='删除']")
	private WebElement deleteButton;
	
	/**
	 * 删除\保存\添加 成功时 - 确定按钮
	 */
	@FindBy(id="alert-btn-ok")
	private WebElement alertConfirm;
	
	/**
	 * 删除按钮
	 */
	@FindBy(id="alert-btn-no")
	private WebElement alertCancel;
	
	
	/**
	 * 现货购买数量:
	 */
	@FindBy(id="spot-buy-qty")
	private WebElement spotBuyQty;
	
	/**
	 * 期货购买数量:
	 */
	@FindBy(id="future-buy-qty")
	private WebElement futureBuyQty;
	
	
	/**
	 *去结算
	 */
	@FindBy(id="payPrice")
	private WebElement payPriceButton;
	
	
	/**
	 *用户名
	 */
	@FindBy(id="userName")
	private WebElement userName;
	
	/**
	 *选择用户名
	 */
	@FindBy(xpath="//option[@value='回归测试'] ")
	private WebElement choseUserName;
	
	
	
	/**
	 *密码
	 */
	@FindBy(id="passWord")
	private WebElement passWord;
	
	/**
	 *登陆
	 */
	@FindBy(id="toLogin")
	private WebElement toLoginButton;
	
	

	public WebElement getCheckAll() {
		return checkAll;
	}



	public WebElement getFirstCheckbox() {
		return firstCheckbox;
	}



	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getSpotBuyQty() {
		return spotBuyQty;
	}

	public WebElement getFutureBuyQty() {
		return futureBuyQty;
	}

	public WebElement getPayPriceButton() {
		return payPriceButton;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getToLoginButton() {
		return toLoginButton;
	}

	public WebElement getChoseUserName() {
		return choseUserName;
	}



	public WebElement getAlertConfirm() {
		return alertConfirm;
	}



	public WebElement getAlertCancel() {
		return alertCancel;
	}
	
	
}
