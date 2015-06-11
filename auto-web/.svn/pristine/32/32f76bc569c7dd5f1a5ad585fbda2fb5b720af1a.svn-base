package com.ccigmall.auto.test.page.pad.retailer.booking;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;
/**
 * 
 * @author dengshuhai  商品详情页 零售商
 *
 */
public class ProductDetailsPage extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 获得现货最小起订量
	 */
	@FindBy(id="minWholesaleQty")
	private WebElement minWholesaleQty;
	
	
	/**
	 * 获得期货最小起订量
	 */
	@FindBy(id="minSupplierQty")
	private WebElement minSupplierQty;
	
	
	/**
	 * 现货类型	
	 */
	@FindBy(xpath="//li[@id='cash']")
	private WebElement spotType;
	
	/**
	 * 期货类型
	 */
	@FindBy(xpath="//li[@id='future']")
	private WebElement futureType;


	/**
	 * 采购量
	 */
	@FindBy(xpath="//input[@class='amount-input'][@maxlength='10'][@value='0']")
	private List<WebElement> amountPurchased; 

	
	/**
	 * 加入进货单 按钮
	 */
	@FindBy(xpath="//input[@type='button'][@id='button2']")
	private WebElement addToOrderButton;
	

	/**
	 *进入购物车
	 */
	@FindBy(id="alert-btn-no")
	private WebElement enterShoppingCart;
	
	/**
	 *继续购物
	 */
	@FindBy(id="alert-btn-ok")
	private WebElement continueShopping;

	public WebElement getMinWholesaleQty() {
		return minWholesaleQty;
	}

	public WebElement getMinSupplierQty() {
		return minSupplierQty;
	}

	public WebElement getSpotType() {
		return spotType;
	}

	public WebElement getFutureType() {
		return futureType;
	}
	public List<WebElement> getAmountPurchased() {
		return amountPurchased;
	}

	public WebElement getAddToOrderButton() {
		return addToOrderButton;
	}

	public WebElement getEnterShoppingCart() {
		return enterShoppingCart;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}
	
	
	
	
}
