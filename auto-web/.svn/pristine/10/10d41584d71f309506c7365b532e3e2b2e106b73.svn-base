/**
 * 
 */
package com.ccigmall.auto.test.page.pc.platform.seller.order;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author dengshuhai
 * @since 2014-12-18
 * 现货订单
 */
public class SpotOrderPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public SpotOrderPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 等待分单
	 * 
	 */
	@FindBy(linkText= "等待分单")
	private WebElement waitToSpilt;
	
	/**
	 * 订单编号输入框
	 */
	@FindBy(id="orderId")
	private WebElement orderIdInput;
	
	/**
	 * 搜索button
	 */
	@FindBy(xpath="//button[text()='搜索']")
	private WebElement searchButton;
	
	/**
	 * 立即分单
	 */
	@FindBy(partialLinkText= "立即分单")
	private WebElement splitOrder;
	
	/**
	 * 现货分单
	 */
	@FindBy(linkText= "现货分单")
	private List<WebElement> spotSplit;
	
	/**
	 * 弹框确定
	 */
	@FindBy(xpath= "//button[text()='确定']")
	private WebElement confirmButton;
	
	/**
	 * 弹框确定
	 */
	@FindBy(xpath= "//input[@value='确定']")
	private WebElement confirmButton_;
	
	/**
	 * 获取搜索 订单编号 结果
	 */
	@FindBy(xpath= "//*[@id='J_BoughtTable']/tbody/tr[2]/td[1]/div/span")
	private WebElement searchResult;
	
	

	
	public WebElement getSearchResult() {
		return searchResult;
	}

	public WebElement getWaitToSpilt() {
		return waitToSpilt;
	}

	public WebElement getOrderIdInput() {
		return orderIdInput;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSplitOrder() {
		return splitOrder;
	}



	public List<WebElement> getSpotSplit() {
		return spotSplit;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public WebElement getConfirmButton_() {
		return confirmButton_;
	}
	
	
	
	
	
}
