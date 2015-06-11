/**
 * 
 */
package com.ccigmall.auto.test.page.pc.platform.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 卖家中心
 */
public class SellerIndexPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public SellerIndexPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 商品列表
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "商品列表")
	private WebElement productList;
	
	/**
	 * 库存管理
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "库存管理")
	private WebElement stockManage;
	
	/**
	 * 期货订单
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "期货订单")
	private WebElement futuresOrder;
	
	/**
	 * 现货订单
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "现货订单")
	private WebElement spotOrder;
	
	/**
	 * 交易账务
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "交易账务")
	private WebElement tradingAccount;
	
	
	/**
	 * 商品名称
	 * 
	 */
	@FindBy(how = How.ID, using = "productName")
	private WebElement productName;
	
	/**
	 * 商品ID
	 * 
	 */
	@FindBy(how = How.ID, using = "productId")
	private WebElement productId;
	
	
	/**
	 * 商品搜索按钮                       
	 * 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='cp3']/div[1]/form/p[3]/button")
	private WebElement productSearchButton;
	
	/**
	 * 搜索商品结果table
	 */
	@FindBy(how = How.XPATH, using = "//tbody[@id='showListTbody']/tr[2]/td[1]/div/p/i")
	private WebElement searchResult;

	/**
	 * @return the productList
	 */
	public WebElement getProductList() {
		return productList;
	}

	/**
	 * @return the stockManage
	 */
	public WebElement getStockManage() {
		return stockManage;
	}

	/**
	 * @return the futuresOrder
	 */
	public WebElement getFuturesOrder() {
		return futuresOrder;
	}

	/**
	 * @return the spotOrder
	 */
	public WebElement getSpotOrder() {
		return spotOrder;
	}

	/**
	 * @return the tradingAccount
	 */
	public WebElement getTradingAccount() {
		return tradingAccount;
	}

	/**
	 * @return the productName
	 */
	public WebElement getProductName() {
		return productName;
	}

	/**
	 * @return the productId
	 */
	public WebElement getProductId() {
		return productId;
	}

	/**
	 * @return the productSearchButton
	 */
	public WebElement getProductSearchButton() {
		return productSearchButton;
	}

	/**
	 * @return the searchResult
	 */
	public WebElement getSearchResult() {
		return searchResult;
	}

	
	

}
