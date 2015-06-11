package com.ccigmall.auto.test.page.pc.retailer.my.ordercenter;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ccigmall.auto.test.page.pc.retailer.my.MyIndexPage;
/**
 * 
 * @author chenjingli  我的订单 零售商
 *
 */
public class MyOderFormPage extends MyIndexPage{
	/**
	 * 
	 * @param driver
	 */
	public MyOderFormPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 在搜索框输入信息
	 */
	@FindBy(id="cur_keyWord")
	private WebElement idTypeSearchInput;
	/**
	 * 点击查询按钮
	 */
	@FindBy(id="search_order")
	private WebElement idCliSearchButton;
	
	/** 订单列表信息元素定位开始-------------------------------------------------------start*/
	/**
	 * 获取订单编号
	 */
	@FindBy(xpath="//div[@id='order']/descendant::a[7]")
	private WebElement xpathgetOrderNum;
	
	/**
	 * 获取订单支付号
	 */
	@FindBy(css=".list-orderinfo>li")
	private WebElement payId;
	
	/**
	 * 获取订单状态
	 */
	@FindBy(xpath="//div[@id='order']/descendant::span[2]")
	private WebElement xpathgetOrderStatu;

	/**
	 * 点击去付余款 按钮  当操作栏中 按钮为三个的时候  就可以用作 取消订单使用
	 */
	@FindBy(xpath="//div[@id='order']/descendant::a[12]")
	private WebElement xpathCliPayFinal;

	/**
	 * 获取订单状态
	 */
	@FindBy(xpath= "//*[@id='order-detail']/div[1]/div[1]/h3")
	private WebElement orderStatu ;
	
	/**
	 * 订单列表支付待支付订单个数
	 */
	@FindBy(xpath= "//div[@id='order']/descendant::tbody/tr[1]/td")
	private List<WebElement> xpathGetPayOrders ;
	/**
	 * 点击取消订单中的确定
	 */
	@FindBy(xpath="//div[@id='cancelOrder-box']/descendant::input[2]")
	private WebElement xpathCliSureButton;
	
	/**
	 * 获得 取消订单 弹框中的 订单号
	 */
	@FindBy(xpath="//div[@id='cancelOrder-box']/descendant::span[2]")
	private WebElement xpathGetOrderNumber;
	
	/** 订单列表信息元素定位结束-------------------------------------------------------end*/
	
	/** 我的订单状态栏 横向元素定位-------------------------------------------------------start*/
	
	
	/**
	 * 点击订单查看
	 */
	@FindBy(xpath= "(//a[text()='查看'])[1]")
	private WebElement orderView ;
	
	/**
	 * 点击待收现货
	 */
	@FindBy(linkText= "待收现货")
	private WebElement waitToReceive ;
	/**
	 * 点击待付款
	 */
	@FindBy(linkText= "待付款")
	private WebElement linkCilToPay ;
	/**
	 * 点击待付余款
	 */
	@FindBy(linkText= "待付余款")
	private WebElement linkCilToPayBalance ;
	/**
	 * 点击已完成
	 */
	@FindBy(linkText= "已完成")
	private WebElement linkCilCompleted ;
	/**
	 * 点击已取消
	 */
	@FindBy(linkText= "已取消")
	private WebElement linkCilToDisabled ;

	
	/**
	 * 点击待收期货
	 */
	@FindBy(linkText= "待收期货")
	private WebElement waitToReceiveFutures ;
	
	
	/**
	 * 点击订单状态为‘ 经销商已发货’ 的 【查看】
	 */
	@FindBy(xpath= "(//span[contains(normalize-space(text()),'经销商已发货')])[1]/following::a[1]")
	private WebElement receiveCheck ;
	
	/**
	 * 点击确认收货'
	 */
	@FindBy(xpath= "//a[text()='确认收货']")
	private List<WebElement> confirmReceipt ;
	
	/**
	 * 点击确认收货-弹框确定
	 */
	@FindBy(id= "submit_user")
	private WebElement alertConfirm ;
	
	/** 我的订单状态栏元素定位-------------------------------------------------------*/

	/**
	 * 评价链接元素
	 */
	@FindBy(linkText= "评价")
	private WebElement comment ;
	
	public WebElement getXpathCliPayFinal() {
		return xpathCliPayFinal;
	}
	
	public WebElement getXpathCliSureButton() {
		return xpathCliSureButton;
	}

	public List<WebElement> getXpathGetPayOrders() {
		return xpathGetPayOrders;
	}

	public WebElement getWaitToReceiveFutures() {
		return waitToReceiveFutures;
	}
	public List<WebElement> getConfirmReceipt() {
		return confirmReceipt;
	}
	public WebElement getAlertConfirm() {
		return alertConfirm;
	}

	public WebElement getReceiveCheck() {
		return receiveCheck;
	}
	public WebElement getWaitToReceive() {
		return waitToReceive;
	}
	public WebElement getOrderView() {
		return orderView;
	}
	public WebElement getPayId() {
		return payId;
	}
	public WebElement getIdTypeSearchInput() {
		return idTypeSearchInput;
	}
	public WebElement getIdCliSearchButton() {
		return idCliSearchButton;
	}
	public WebElement getXpathgetOrderNum() {
		return xpathgetOrderNum;
	}
	public WebElement getXpathgetOrderStatu() {
		return xpathgetOrderStatu;
	}
	public WebElement getLinkCilToPay() {
		return linkCilToPay;
	}
	public WebElement getLinkCilToPayBalance() {
		return linkCilToPayBalance;
	}
	public WebElement getLinkCilCompleted() {
		return linkCilCompleted;
	}
	public WebElement getLinkCilToDisabled() {
		return linkCilToDisabled;
	}

	public WebElement getOrderStatu() {
		return orderStatu;
	}

	public WebElement getXpathGetOrderNumber() {
		return xpathGetOrderNumber;
	}
	
	public WebElement getComment() {
		return comment;
	}
}
