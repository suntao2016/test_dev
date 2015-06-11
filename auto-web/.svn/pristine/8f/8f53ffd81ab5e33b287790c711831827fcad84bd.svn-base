/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.seller;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.page.pc.platform.seller.SellerIndexPage;
import com.ccigmall.auto.test.page.pc.platform.seller.order.SpotOrderPage;

/**
 * @author jianping.gao 卖家中心
 */
public class SpotOrderAct extends SellerIndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SpotOrderAct.class);

	/**
	 * 
	 */
	private SpotOrderPage spotOrderPage;

	/**
	 * 现货订单
	 * 
	 * @param driver
	 */
	public SpotOrderAct(WebDriver driver) {
		super(driver);
		spotOrderPage = new SpotOrderPage(driver);
	}

	/**
	 * 点击现货订单
	 */
	public void clickSpotOrderBar() {
		clickSpotOrder();
	}
	
	/**
	 * 点击等待分单
	 */
	public void clickWaitToSplit() {
		logger.info("点击等待分单：{}" , spotOrderPage.getWaitToSpilt());
		this.click(spotOrderPage.getWaitToSpilt());
	}
	
	/**
	 * 输入订单编号
	 */
	public void inputOrderID(String text) {
		if(text.contains("过期")){
			Assert.fail("orderID，商品编号过期，流程无法继续");
		}
		logger.info("输入订单编号：{}" , text);
		this.type(spotOrderPage.getOrderIdInput(), text );
	}

	/**
	 * 点击搜索按钮
	 */
	public void clickSearchButton() {
		logger.info("点击搜索按钮：{}" , spotOrderPage.getSearchButton());
		this.click(spotOrderPage.getSearchButton());
	}
	
	/**
	 * 点击立即分单
	 */
	public void clickSplitOrder() {
		logger.info(" 点击立即分单：{}" , spotOrderPage.getSplitOrder());
		this.click(spotOrderPage.getSplitOrder());
	}
	
	/**
	 * 点击现货分单
	 */
	public void clickSpotSplit() {
		
		List<WebElement> eles = spotOrderPage.getSpotSplit();
		int size = eles.size();
		logger.info(" 现货分单共{}个" , size);
		for(int i = 0; i<size ; i++){
			//重新获取一遍，容易丢
			eles = spotOrderPage.getSpotSplit();
			logger.info(" 点击第{}个现货分单" , i+1);
			eles.get(0).click();
			// 点击确定
			logger.info("点击  确定1");
			clickAlert();
			// 点击弹框 确定
			logger.info("点击弹框 确定2");
			clickAlertConfirm();
		}
	}
	
	/**
	 * 点击现货分单弹窗-确定1
	 */
	public void clickAlert() {
		logger.info(" 点击现货分单弹窗-确定：{}" , spotOrderPage.getConfirmButton());
		this.click(spotOrderPage.getConfirmButton());
	}
	
	/**
	 * 点击现货分单弹窗-确定2
	 */
	public void clickAlertConfirm() {
		logger.info(" 点击现货分单弹窗-确定：{}" , spotOrderPage.getConfirmButton_());
		this.click(spotOrderPage.getConfirmButton_());
	}
	
	/**
	 * 判断 订单编号搜索结果是否存在
	 */
	public void isSearchResultExist(String orderId) {
		boolean flag = this.isElementExist("//*[@id='J_BoughtTable']/tbody/tr[2]/td[1]/div/span", 3);
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
