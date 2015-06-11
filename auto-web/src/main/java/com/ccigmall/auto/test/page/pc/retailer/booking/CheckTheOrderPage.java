package com.ccigmall.auto.test.page.pc.retailer.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * 
 * @author chenjingli  核对订单信息 零售商
 *
 */
public class CheckTheOrderPage extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public CheckTheOrderPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击提交订单按钮
	 */
	@FindBy(xpath="//input[@value='提交订单']")
	private WebElement xpathCliSubmitOrderButton;
	
	
	public WebElement getXpathCliSubmitOrderButton() {
		return xpathCliSubmitOrderButton;
	}
	
}
