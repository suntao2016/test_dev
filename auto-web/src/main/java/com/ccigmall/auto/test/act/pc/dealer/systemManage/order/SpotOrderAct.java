/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.systemManage.order;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.SystemManageAct;
import com.ccigmall.auto.test.page.pc.dealer.systemManage.order.SpotOrderPage;

/**
 * @author dengshuhai
 * 经销商现货订单动作
 */
public class SpotOrderAct extends SystemManageAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SpotOrderAct.class);

	/**
	 * 经销商-现货订单动作
	 * 
	 */
	protected SpotOrderPage   spotOrderPage;

	/**
	 * 
	 * @param driver
	 */
	public SpotOrderAct(WebDriver driver) {
		super(driver);
		spotOrderPage = new SpotOrderPage(driver);
	}

	/**
	 * 点击等待发货
	 */
	public void click_WaitToDeliver() {
		logger.info("点击等待发货");
		click(spotOrderPage.getWaitToDeliver());
	}
	
	/**
	 * 输入订单编号
	 */
	public void inputOrderId(String text) {
		if(text.contains("过期")){
			Assert.fail("订单编号过期，流程无法继续！");
		}
		logger.info(" 输入订单编号:{}", text );
		type(spotOrderPage.getOrderIdInput(), text );
	}

	/**
	 * 点击确认发货
	 */
	public void clickConfirmDeliveryButton() {
		
		List<WebElement> eles = spotOrderPage.getConfirmDelivery();
		int size = eles.size();
		logger.info(" 确认发货共有{}个",size);
		for(int i =0;i<size ;i++){
			 eles = spotOrderPage.getConfirmDelivery();
			 logger.info("点击第{}个确认发货",i+1);
			 click(eles.get(0));
				// 点击 弹窗确定
			clickAlertConfirmButton();
			clickAlertConfirmButton();
			
		}
			
	}
	
	/**
	 * 点击确认发货-确定
	 */
	public void clickAlertConfirmButton() {
		logger.info(" 点击确认发货-确定");
		click(spotOrderPage.getAlertConfirm());
	}
	/**
	 * 判断orderId 搜索结果是否存在
	 * @param orderId
	 */
	public void isSearchResultExist(String orderId) {
		boolean flag = this.isElementExist("//*[@id='J_BoughtTable']/tbody/tr[2]/td[1]/div/span/em", 3);
		if(flag){
			String searchResult = this.getText(spotOrderPage.getSearchResult());
			if(searchResult.contains(orderId)){
				logger.info(" 获取订单编号：{}的搜索结果-存在",orderId);
			}else{
				logger.error(" 获取订单编号：{}的搜索结果-不存在",orderId);
				Assert.fail(" 获取订单编号"+orderId+"：的搜索结果-不存在");
			}
		}else{
			logger.error(" 获取订单编号：{}的搜索结果-不存在",orderId);
			Assert.fail(" 获取订单编号"+orderId+"：的搜索结果-不存在");
		}
	}
}
