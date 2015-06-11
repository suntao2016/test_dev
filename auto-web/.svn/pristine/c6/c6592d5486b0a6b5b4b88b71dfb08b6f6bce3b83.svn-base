/**
 * 
 */
package com.ccigmall.auto.test.page.pc.dealer.systemManage.order;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;
import com.ccigmall.auto.test.page.pc.dealer.systemManage.SystemManageIndexPage;

/**
 * @author dengshuhai
 * 经销商-系统管理-现货订单页面-首页
 */
public class SpotOrderPage extends SystemManageIndexPage{

	/**
	 * 
	 * @param driver
	 */
	public SpotOrderPage(WebDriver driver) {
		super(driver);
	}
		

	
	/**
	 * 所有订单
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "所有订单")
	private WebElement allOrder;
	
	/**
	 * 等待发货
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "等待发货")
	private WebElement waitToDeliver;
	
	/**
	 * 已发货
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "已发货")
	private WebElement delivered;
	
	/**
	 * 已完成
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "已完成")
	private WebElement completed;
	
	/**
	 * 订单编号输入框
	 */
	@FindBy(id="orderId")
	private WebElement orderIdInput;
	
	/**
	 * 点击确认发货
	 */
	@FindBy(linkText="确认发货")
	private List<WebElement> confirmDelivery;
	/**
	 *点击 弹窗确定
	 */
	@FindBy(xpath="//input[@type='button'][@value='确定']")
	private WebElement alertConfirm;
	
	/**
	 *订单搜索结果
	 */
	@FindBy(xpath="//*[@id='J_BoughtTable']/tbody/tr[2]/td[1]/div/span/em")
	private WebElement searchResult;
	
	

	public WebElement getSearchResult() {
		return searchResult;
	}

	public WebElement getAllOrder() {
		return allOrder;
	}

	public WebElement getWaitToDeliver() {
		return waitToDeliver;
	}

	public WebElement getDelivered() {
		return delivered;
	}

	public WebElement getCompleted() {
		return completed;
	}

	public WebElement getOrderIdInput() {
		return orderIdInput;
	}


	public List<WebElement> getConfirmDelivery() {
		return confirmDelivery;
	}

	public WebElement getAlertConfirm() {
		return alertConfirm;
	}

	
}
