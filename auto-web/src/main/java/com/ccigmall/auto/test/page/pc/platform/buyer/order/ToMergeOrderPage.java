package com.ccigmall.auto.test.page.pc.platform.buyer.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;
import com.ccigmall.auto.test.page.pc.platform.IndexPage;
/**
 * 
 * @author chenjingli
 * 待合并订单
 *
 */
public class ToMergeOrderPage  extends IndexPage{
	/**
	 * 待合并订单page
	 * @param driver
	 */
	public ToMergeOrderPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击 待合并 订单
	 */
	@FindBy(xpath="//a[contains(text(),'待合并订单')]")
	private WebElement xpathCliMergeOrder;
	/**
	 * 输入商品名称
	 */
	@FindBy(id="pName")
	private WebElement IdTypeGoodsName;
	public WebElement getXpathCliMergeOrder() {
		return xpathCliMergeOrder;
	}
	/**
	 * 输入供应商名称
	 */
	@FindBy(id="supplyName")
	private WebElement IdTypeSupplierName;
	/**
	 * 点击搜索按钮
	 */
	@FindBy(id="sousuo")
	private WebElement IdCliSearchButton;
	/**
	 * 点击 "合并订单" 按钮
	 */
	@FindBy(id="joinOrderBtn")
	private WebElement IdCliQiHeOrderButton;
	/**
	 * 获得商品名称
	 * @return
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::i[2]")
	private WebElement xpathGetProductName;
	
	public WebElement getXpathGetProductName() {
		return xpathGetProductName;
	}
	public WebElement getIdTypeGoodsName() {
		return IdTypeGoodsName;
	}
	public WebElement getIdTypeSupplierName() {
		return IdTypeSupplierName;
	}
	public WebElement getIdCliSearchButton() {
		return IdCliSearchButton;
	}
	public WebElement getIdCliQiHeOrderButton() {
		return IdCliQiHeOrderButton;
	}
	
	
}
