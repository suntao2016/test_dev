package com.ccigmall.auto.test.page.pc.platform.buyer.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.platform.IndexPage;
/**
 * 
 * @author chenjingli
 * wofe 买家中心>待合并订单>订单详情page
 *
 */
public class OrderDetailsPage  extends IndexPage {
	/**
	 * @param driver
	 */
	public OrderDetailsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击全选 单选框
	 */
	@FindBy(id="quanxuan")
	private WebElement IdCliAllSelChekbox;
	/**
	 * 点击 合并 并提交订单
	 */
	@FindBy(xpath="//input[@value='合并提交订单']")
	private WebElement xpathCliSubmitButton;
	/**
	 * 点击 弹出框中的确定按钮
	 */
	@FindBy(xpath="//input[@value='确定']")
	private WebElement xpathCliConfirmButton;
	
	public WebElement getIdCliAllSelChekbox() {
		return IdCliAllSelChekbox;
	}
	public WebElement getXpathCliSubmitButton() {
		return xpathCliSubmitButton;
	}
	public WebElement getXpathCliConfirmButton() {
		return xpathCliConfirmButton;
	}
	
	
	
}
