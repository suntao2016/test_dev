package com.ccigmall.auto.test.act.pad.retailer.my;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.page.pad.retailer.my.MyOrderPage;

/**
 * @author jianping.gao
 *  支付
 */
public class MyOrderAct extends MyIndexAct{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MyOrderAct.class);
	
	private MyOrderPage orderPage;

	/**
	 * 
	 * @param driver
	 */
	public MyOrderAct(WebDriver driver) {
		super(driver);
		orderPage=new MyOrderPage(driver);
	}
	
	/**
	 * 搜索框
	 */
    public void enterId(String id){
    	logger.info("输入搜索的内容：{}",id);
    	type(orderPage.getSearch_type(), id);
    }
	
	/**
	 * 搜索按钮
	 */
	public void clickSearch_btn(){
		logger.info("点击查询");
		click(orderPage.getSearch_btn());
	}
	
	/**
	 * 搜索结果
	 */
	public String checkSearchResult(){
		if(isElementPresent(orderPage.getResult_orderId())){
			logger.info("订单id 【{}】",orderPage.getResult_orderId().getText());
		}else{
			logger.info("订单id 【{}】","null");
		}
		return orderPage.getResult_orderId().getText();
	}


}
