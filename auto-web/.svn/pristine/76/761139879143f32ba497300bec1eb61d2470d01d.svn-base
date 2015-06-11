package com.ccigmall.auto.test.act.pad.retailer.my;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pad.retailer.my.MyIndexPage;

/**
 * @author jianping.gao
 *  支付
 */
public class MyIndexAct extends SettingActiton{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MyIndexAct.class);
	
	private MyIndexPage myIndexPage;

	/**
	 * 
	 * @param driver
	 */
	public MyIndexAct(WebDriver driver) {
		super(driver);
		myIndexPage=new MyIndexPage(driver);
	}
	
	/**
	 * 点击我的订单
	 */
	public void clickMyOrder(){
		logger.info("点击我的订单");
		click(myIndexPage.getMyOrder());
	}

}
