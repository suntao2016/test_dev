package com.ccigmall.auto.test.page.pc.platform.buyer.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.platform.IndexPage;
/**
 * 
 * @author chenjingli
 * wofe 买家中心>已合并订单page
 *
 */
public class ConsolidatedOrderPage extends IndexPage {
	/**
	 * @param driver
	 */
	public ConsolidatedOrderPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击 已合并 订单
	 */
	@FindBy(xpath="//a[contains(text(),'已合并订单')]")
	private WebElement xpathCliConsolidatedOrder;
	/**
	 * 点击 下拉框
	 */
	@FindBy(id="status")
	private WebElement IdSelOrderStatus;
	/**
	 * 点击 搜索 按钮
	 */
	@FindBy(xpath="//button[contains(text(),'搜索')]")
	private WebElement xpathCliSearchButton;
	/**
	 * 获取采购订单 编号
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::span[2]")
	private WebElement xpathGetOrderNum;
	/**
	 * 获取 交易状态
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::i[6]")
	private WebElement xpathGetOrderStatus;
	/**
	 * 点击 期货 分单 按钮
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::button[1]")
	private WebElement xpathCliQiFenButton;
	/**
	 * 点选择 分销商 单选框
	 */
	@FindBy(xpath="//div[@id='dealer']/descendant::input[1]")
	private WebElement xpathCliDistributorRadio;
	/**
	 * 点击 确定 按钮
	 */
	@FindBy(xpath="//div[@id='dealer']/descendant::button[1]")
	private WebElement xpathCliSureButton;
	/**
	 * 点击 弹出框中 确定
	 */
	@FindBy(xpath="//body[@id='CS5']/descendant::input[1]")
	private WebElement xpathCliConfirmButton;
	/**
	 * 输入 采购订单编号
	 * @return
	 */
	@FindBy(id="orderId")
	private WebElement idTypePurchaseId;
	
	public WebElement getXpathCliConsolidatedOrder() {
		return xpathCliConsolidatedOrder;
	}
	public WebElement getXpathCliDistributorRadio() {
		return xpathCliDistributorRadio;
	}
	public WebElement getXpathCliSureButton() {
		return xpathCliSureButton;
	}
	public WebElement getXpathCliConfirmButton() {
		return xpathCliConfirmButton;
	}
	public WebElement getIdTypePurchaseId() {
		return idTypePurchaseId;
	}
	public WebElement getIdSelOrderStatus() {
		return IdSelOrderStatus;
	}
	public WebElement getXpathCliSearchButton() {
		return xpathCliSearchButton;
	}
	public WebElement getXpathGetOrderNum() {
		return xpathGetOrderNum;
	}
	public WebElement getXpathGetOrderStatus() {
		return xpathGetOrderStatus;
	}
	public WebElement getXpathCliQiFenButton() {
		return xpathCliQiFenButton;
	}
	
}
