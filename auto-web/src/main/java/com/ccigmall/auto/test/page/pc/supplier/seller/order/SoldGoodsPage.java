package com.ccigmall.auto.test.page.pc.supplier.seller.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;
/**
 * 
 * @author chenjingli
 * 供应商已卖出物品列表
 */
public class SoldGoodsPage extends SettingPage{
	
	public SoldGoodsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 获得物品名称	
	 */ 
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::i[1]")
	private WebElement xpathGetProductName;
	/**
	 *点击填写合同 按钮
	 */ 
	@FindBy(xpath="//a[contains(text(),'填写合同')]")
	private WebElement linkCliContractButton;
	/**
	 *点击填写合同 按钮
	 */ 
	@FindBy(xpath="//a[contains(text(),'确认发货')]")
	private WebElement linkCliShipingButton;
	
	public WebElement getLinkCliShipingButton() {
		return linkCliShipingButton;
	}
	/**
	 * 获得物品状态
	 */ 
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::i[5]")
	private WebElement xpathGetGoodsStatu;
	
	public WebElement getXpathGetProductName() {
		return xpathGetProductName;
	}
	public WebElement getLinkCliContractButton() {
		return linkCliContractButton;
	}
	public WebElement getXpathGetGoodsStatu() {
		return xpathGetGoodsStatu;
	}
	
}
