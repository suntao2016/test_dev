package com.ccigmall.auto.test.act.pad.retailer.booking;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pad.retailer.booking.ProductDetailsPage;
import com.ccigmall.auto.test.page.pad.retailer.booking.ShoppingCartPage;

/**
 * @author dengshuhai
 *购物车页面 动作
 */
public class ShoppingCartAct  extends ProductDetailsAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ShoppingCartAct.class);
	/**
	 *pad 购物车page
	 */
	private ShoppingCartPage shoppingCartPage;
	
	/**
	 * 
	 * @param driver
	 */
	public ShoppingCartAct(WebDriver driver) {
		super(driver);
		shoppingCartPage=new ShoppingCartPage(driver);
	}

	/**
	 *点击全选
	 */
	public  void clickCheckAll() {
		logger.info("点击全选：{}",shoppingCartPage.getCheckAll());
		this.click(shoppingCartPage.getCheckAll());
	}
	
	/**
	 *点击第一个复选框
	 */
	public  void clickFirstCheckbox() {
		logger.info("点击第一个复选框：{}",shoppingCartPage.getFirstCheckbox());
		this.click(shoppingCartPage.getFirstCheckbox());
	}
	
	/**
	 *点击去结算按钮
	 */
	public  void clickPayPriceButton() {
		logger.info("点击去结算按钮：{}",shoppingCartPage.getPayPriceButton());
		this.click(shoppingCartPage.getPayPriceButton());
	}

	/**
	 *点击用户名选择框
	 */
	public  void clickUserName(String username) {
		logger.info("点击用户名选择框，选中名称为：{}",username);
		new Select(shoppingCartPage.getUserName()).selectByVisibleText(username);
	}
	
	/**
	 *输入用户密码
	 */
	public  void inputPassword(String password) {
		logger.info("输入用户密码：{}",password);
		this.type(shoppingCartPage.getPassWord(),password);
	}
	
	/**
	 *点击用户登录按钮
	 */
	public  void clickLogin() {
		logger.info("点击用户登录按钮：{}",shoppingCartPage.getToLoginButton());
		this.click(shoppingCartPage.getToLoginButton());
	}
	
	/**
	 *选择用户名称
	 */
	/*public  void clickChoseUserName() {
		logger.info("选择用户名称：{}",shoppingCartPage.getChoseUserName());
		this.click(shoppingCartPage.getChoseUserName());
	}*/
	
	/**
	 *点击订单-删除按钮
	 */
	public  void clickDeleteButton() {
		logger.info("点击订单-删除按钮：{}",shoppingCartPage.getDeleteButton());
		this.click(shoppingCartPage.getDeleteButton());
	}
	/**
	 *弹窗确定
	 */
	public  void clickAlertConfirm() {
		logger.info("弹窗确定：{}",shoppingCartPage.getAlertConfirm());
		this.click(shoppingCartPage.getAlertConfirm());
	}
	/**
	 *点击订单-删除按钮
	 */
	public  void clickAlertCancel() {
		logger.info("弹窗取消：{}",shoppingCartPage.getAlertCancel());
		this.click(shoppingCartPage.getAlertCancel());
	}
}
