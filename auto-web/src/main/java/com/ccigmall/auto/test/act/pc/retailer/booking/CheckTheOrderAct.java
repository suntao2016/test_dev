package com.ccigmall.auto.test.act.pc.retailer.booking;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.retailer.booking.CheckTheOrderPage;

/**
 * @author chenjingli
 * 确认订单 动作
 */
public class CheckTheOrderAct extends SettingActiton {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CheckTheOrderAct.class);
	/**
	 * 确认订单page
	 */
	private CheckTheOrderPage orderPage;
	/**
	 * 
	 * @param driver
	 */
	public CheckTheOrderAct(WebDriver driver) {
		super(driver);
		orderPage=new CheckTheOrderPage(driver);
	}
	/**
	 * 点击提交订单按钮
	 */
	public void clickSubmitOrderButton() {
		logger.info("点击提交订单按钮");
		click(orderPage.getXpathCliSubmitOrderButton());
	}
}
