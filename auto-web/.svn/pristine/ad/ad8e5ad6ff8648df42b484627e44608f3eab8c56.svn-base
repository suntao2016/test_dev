package com.ccigmall.auto.test.page.pc.retailer.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.retailer.IndexPage;

/**
 * 
 * @author chenjingli  商品详情页 零售商
 *
 */
public class ProductDetailsPage extends IndexPage {
	/**
	 * 
	 * @param driver
	 */
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 获得友情提示中最小购买数量现货
	 */
	@FindBy(xpath="//span[@id='minWholesaleQty']")
	private WebElement xpathgetMinNum;
	/**
	 * 获得友情提示中最小购买数量期货
	 */
	@FindBy(xpath="//span[@id='minSupplierQty']")
	private WebElement xpathGetFutureMinNum;
	/**
	 * 点击预售期货
	 */
	@FindBy(id="future")
	private WebElement idCliFutureButton;
//	/**
//	 * 点击期货 第一行的 “+”
//	 */
//	@FindBy(xpath="//div[@class='product-right']/descendant::a[6]")
//	private WebElement xpathCliAddQi;
//	/**
//	 * 点击期货 第一行的 “-”
//	 */
//	@FindBy(xpath="//div[@class='product-right']/descendant::a[5]")
//	private WebElement xpathCliReduceQi;
//	/**
//	 * 点击现货 第一行的 “+”
//	 */
//	@FindBy(css="ul.sku-list:nth-child(2) > li:nth-child(4) > div:nth-child(1) > a:nth-child(3)")
//	private WebElement xpathCliAddXian;
//	
//	/**
//	 * 输入现货 第一行的数量 “+”
//	 */
//	@FindBy(xpath="//div[@id='xh']/descendant::input[1]")
//	private WebElement inputSpotAmount;
//	
//	/**
//	 * 点击现货 第一行的 “-”
//	 */
//	@FindBy(xpath="//div[@class='product-right']/descendant::a[3]")
//	private WebElement xpathCliReduceXian;
	/**
	 * 点击立即订购的按钮
	 */
	@FindBy(id="button2")
	private WebElement idCliJoinStock;
	/**
	 * 点击 进图购物车按钮
	 */
	@FindBy(id="popup_ok")
	private WebElement idCliLoginShoppingCart;
	
	/**
	 * 点击 继续购物 按钮
	 */
	@FindBy(id="popup_cancel")
	private WebElement idCliGoOnShopping;
	
	/**
	 * 获得添加购物车 提示信息
	 */
	@FindBy(id="popup_message")
	private WebElement idGetPromptInfo;
	
	/**
	 * 输入第一行的数量
	 */
	@FindBy(xpath="//div[@class='detail-top-bd']/descendant::input[1]")
	private WebElement xpathTypeFuturesNum;
	
	
	public WebElement getXpathTypeFuturesNum() {
		return xpathTypeFuturesNum;
	}
//	public WebElement getInputSpotAmount() {
//		return inputSpotAmount;
//	}
//	public WebElement getXpathgetMinNum() {
//		return xpathgetMinNum;
//	}
//	public WebElement getXpathCliAddQi() {
//		return xpathCliAddQi;
//	}
//	public WebElement getXpathCliReduceQi() {
//		return xpathCliReduceQi;
//	}
//	public WebElement getXpathCliAddXian() {
//		return xpathCliAddXian;
//	}
//	public WebElement getXpathCliReduceXian() {
//		return xpathCliReduceXian;
//	}
	public WebElement getXpathgetMinNum() {
		return xpathgetMinNum;
	}


	public WebElement getIdCliFutureButton() {
		return idCliFutureButton;
	}


	public WebElement getIdCliJoinStock() {
		return idCliJoinStock;
	}
	public WebElement getIdCliLoginShoppingCart() {
		return idCliLoginShoppingCart;
	}
	public WebElement getIdCliGoOnShopping() {
		return idCliGoOnShopping;
	}
	public WebElement getIdGetPromptInfo() {
		return idGetPromptInfo;
	}
	public WebElement getXpathGetFutureMinNum() {
		return xpathGetFutureMinNum;
	}
	
}
