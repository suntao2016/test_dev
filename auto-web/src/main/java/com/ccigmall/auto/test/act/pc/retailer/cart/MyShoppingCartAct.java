package com.ccigmall.auto.test.act.pc.retailer.cart;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.retailer.cart.MyShoppingCartPage;
/**
 * @author chenjingli
 * 我的购物车 动作
 */
public class MyShoppingCartAct  extends SettingActiton{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MyShoppingCartAct.class);
	/**
	 * 我的购物车page
	 */
	private MyShoppingCartPage cartPage;
	
	/**
	 * 
	 * @param driver
	 */
	public MyShoppingCartAct(WebDriver driver) {
		super(driver);
		cartPage=new MyShoppingCartPage(driver);
	}
	/**
	 * 点击全选按钮
	 */
	public void clickAllSelect() {
		logger.info("点击全选按钮");
		click(cartPage.getIdCliAllSelect());
	}
	/**
	 * 点击第一个多选框
	 */
	public void clickFirstCheckbox() {
		logger.info("点击第一个多选框");
		click(cartPage.getXpathCliFirstCheckbox());
	}
	/**
	 * 点击确认信息
	 */
	public void clickPayButton() {
		logger.info("点击确认信息按钮");
		click(cartPage.getIdCliPayButton());
	}
	
	/**
	 * 点击提交订单
	 */
	public void clickSubmitButton() {
		logger.info(" 点击提交订单按钮");
		click(cartPage.getSubmitButton());
	}
}
