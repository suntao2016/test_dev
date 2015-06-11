/**
 * 
 */
package com.ccigmall.auto.test.page.pc.dealer.systemManage.order;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author dengshuhai
 * 经销商-系统管理-现货订单-期货发货页面-首页
 */
public class FuturesOrderPage extends SpotOrderPage{

	/**
	 * 
	 * @param driver
	 */
	public FuturesOrderPage(WebDriver driver) {
		super(driver);
	}

	
	/**
	 * 点击期货订单详情页面
	 */
	@FindBy(xpath="(//a[contains(normalize-space(text()),'订单详情')])[1]")
	private WebElement orderDetails;
	
	/**
	 * 点击期货的确认发货
	 */
	
	@FindBy(xpath="//input[@type='button'][@value='确认发货']")
	private List<WebElement> futureConfirmDelivery;
	/**
	 * 点击下单按钮
	 */
	@FindBy(linkText="下单")
	private WebElement linkPlaceOrder;
	/**
	 * 点击确认合同按钮
	 */
	@FindBy(xpath="//a[contains(text(),'确认合同')]")
	private WebElement linkCliConfirmContract;
	/**
	 * 点击确认收货
	 */
	@FindBy(xpath="//a[contains(text(),'确认收货')]")
	private WebElement linkCliConfirmReceiving;
	
	/**
	 * 获取期货状态
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::i[7]")
	private WebElement xpathGetFuturesStatu;
	/**
	 * 获取弹出框中的可能存在的网络异常
	 */
	@FindBy(xpath="//body[@id='CS5']/descendant::div[6]")
	private WebElement xpathGetException;
	
	public WebElement getXpathGetException() {
		return xpathGetException;
	}
	public WebElement getLinkCliConfirmContract(){
		return linkCliConfirmContract;
	}
	public WebElement getXpathGetFuturesStatu() {
		return xpathGetFuturesStatu;
	}
	public WebElement getLinkPlaceOrder() {
		return linkPlaceOrder;
	}
	public WebElement getOrderDetails() {
		return orderDetails;
	}
	
	public List<WebElement> getFutureConfirmDelivery() {
		return futureConfirmDelivery;
	}
	public WebElement getLinkCliConfirmReceiving() {
		return linkCliConfirmReceiving;
	}
	
	
}
