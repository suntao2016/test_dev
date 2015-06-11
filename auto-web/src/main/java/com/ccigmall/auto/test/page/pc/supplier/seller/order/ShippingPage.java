package com.ccigmall.auto.test.page.pc.supplier.seller.order;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.supplier.seller.SellerIndexPage;
/**
 * 
 * @author chenjigli
 * supplier 确认发货page
 */
public class ShippingPage extends SellerIndexPage {

	public ShippingPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 输入批次号
	 */
	@FindBy(name="batchNo")
	private WebElement nameTypeBatchNum;
	/**
	 * 输入批次号
	 */
	@FindBy(name="qty")
	private WebElement nameTypeNumber;
	/**
	 * 点击提交按钮
	 */
	@FindBy(xpath="//form[@id='despatch']/div/button")
	private WebElement linkCliSubmit;
	/**
	 * 点击弹出框中的确定
	 */
	@FindBy(xpath="//input[@value='确定']")
	private WebElement xpathCliConfirm;
	/**
	 * 获得输入数量
	 */
	@FindBy(xpath="//form[@id='despatch']/descendant::span[7]")
	private WebElement getTypeNumber;
	/**
	 * 获取报错弹出框中的内容
	 */
	@FindBy(xpath="//div[@class='ui_inner']/descendant::span")
	private WebElement xpathGetAlertText;
	
	/**
	 * 获取正确弹出框中的内容
	 */
	@FindBy(xpath="//div[@class='ui_inner']/descendant::div[4]")
	private WebElement xpathGetAlertRightText;
	/**
	 * 判断元素时间框元素是否存在
	 */
	@FindBy(xpath="//form[@id='despatch']/div/div[1]/descendant::td[4]")
	private WebElement xpathIsExistElement;
	/**
	 * 判断div的个数
	 */
	@FindBy(xpath="//form[@id='despatch']/div/div")
	private List<WebElement> xpathGetDivNumber;
	/**
	 * 获得判断是否有时间框的内容
	 */
	@FindBy(xpath="//form[@id='despatch']/div/div[1]/descendant::th[3]")
	private WebElement xpathGetText;
	/**
	 * 获得input框数量
	 */
	@FindBy(xpath="//form[@id='despatch']/descendant::input")
	private List<WebElement> getInputNumber;
	/**
	 * 点击生成日期 时间框
	 */
	@FindBy(id="createTime")
	private WebElement idCliCreateTime;
	/**
	 * 点击生成日期 时间框
	 */
	@FindBy(id="endTime")
	private WebElement idCliEndTime;
	
	public List<WebElement> getGetInputNumber() {
		return  getInputNumber;
	}
	public WebElement getIdCliCreateTime() {
		return idCliCreateTime;
	}
	public WebElement getIdCliEndTime() {
		return idCliEndTime;
	}
	public WebElement getNameTypeBatchNum() {
		return nameTypeBatchNum;
	}
	public WebElement getNameTypeNumber() {
		return nameTypeNumber;
	}
	public WebElement getLinkCliSubmit() {
		return linkCliSubmit;
	}
	public WebElement getXpathCliConfirm() {
		return xpathCliConfirm;
	}
	public WebElement getGetTypeNumber() {
		return getTypeNumber;
	}
	public WebElement getXpathIsExistElement() {
		return xpathIsExistElement;
	}
	public List<WebElement> getXpathGetDivNumber() {
		return xpathGetDivNumber;
	}
	public WebElement getXpathGetAlertText() {
		return xpathGetAlertText;
	}
	public WebElement getXpathGetText() {
		return xpathGetText;
	}
	public WebElement getXpathGetAlertRightText() {
		return xpathGetAlertRightText;
	}
	
}
