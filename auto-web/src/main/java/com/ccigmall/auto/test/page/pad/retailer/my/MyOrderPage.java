package com.ccigmall.auto.test.page.pad.retailer.my;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 *  支付
 */
public class MyOrderPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public MyOrderPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 搜索框
	 */
	@FindBy(how = How.ID, using = "search-type")
	private WebElement search_type;
	
	
	/**
	 * 搜索按钮
	 */
	@FindBy(how = How.ID, using = "search-btn")
	private WebElement search_btn;
	
	/**
	 * 搜索结果
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[6]/div[1]/div[2]/p[1]")
	private WebElement result_orderId;

	/**
	 * @return the search_type
	 */
	public WebElement getSearch_type() {
		return search_type;
	}

	/**
	 * @return the search_btn
	 */
	public WebElement getSearch_btn() {
		return search_btn;
	}

	/**
	 * @return the result_orderId
	 */
	public WebElement getResult_orderId() {
		return result_orderId;
	}

	
}
