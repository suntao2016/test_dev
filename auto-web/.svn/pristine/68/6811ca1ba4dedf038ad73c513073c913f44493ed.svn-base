package com.ccigmall.auto.test.page.pc.retailer.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * 
 * @author chenjingli  我的购物车 零售商
 *
 */
public class MyShoppingCartPage  extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public MyShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击全选框
	 */
	@FindBy(id="checkbox")
	private WebElement idCliAllSelect;
	/**
	 * 点击第一个刚添加的测试商品单选框
	 */
	@FindBy(xpath="//div[@id='cart']/descendant::input[2]")
	private WebElement xpathCliFirstCheckbox;
	/**
	 * 点击继续购物
	 */
	@FindBy(xpath="//a[contains(text(),'继续购物')]")
	private WebElement xpathCliContinueShopping;
	/**
	 * 点击删除按钮
	 */
	@FindBy(xpath="//*[@id='cart']/div/div[3]/div[2]/a")
	private WebElement xpathCliDelButton;
	/**
	 * 点击确认信息
	 */
	@FindBy(id="//div[@id='cart']/div[2]/descendant::a[2]")
	private WebElement idCliPayButton;
	
	/**
	 * 点击提交订单
	 */
	@FindBy(xpath="//input[@value='提交订单']")
	private WebElement submitButton ;
	
	
	
	public WebElement getIdCliAllSelect() {
		return idCliAllSelect;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getXpathCliFirstCheckbox() {
		return xpathCliFirstCheckbox;
	}
	public WebElement getXpathCliContinueShopping() {
		return xpathCliContinueShopping;
	}
	public WebElement getXpathCliDelButton() {
		return xpathCliDelButton;
	}
	public WebElement getIdCliPayButton() {
		return idCliPayButton;
	}
	
	
	
	
	
}
