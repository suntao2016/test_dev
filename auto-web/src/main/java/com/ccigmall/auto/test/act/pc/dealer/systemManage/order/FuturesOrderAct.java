/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.systemManage.order;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ccigmall.auto.test.page.pc.dealer.systemManage.order.FuturesOrderPage;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.ToMergeOrderPage;

/**
 * @author dengshuhai
 * 经销商期货订单动作
 */
public class FuturesOrderAct extends SpotOrderAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(FuturesOrderAct.class);

	/**
	 * 经销商-现货订单动作
	 * 
	 */
	protected FuturesOrderPage   futuresOrderPage;
	protected ToMergeOrderPage mergeOrderPage;
	/**
	 * 
	 * @param driver
	 */
	public FuturesOrderAct(WebDriver driver) {
		super(driver);
		futuresOrderPage = new FuturesOrderPage(driver);
		mergeOrderPage = new ToMergeOrderPage(driver);
	}


	public FuturesOrderPage getFuturesOrderPage() {
		return futuresOrderPage;
	}


	public ToMergeOrderPage getMergeOrderPage() {
		return mergeOrderPage;
	}


	/**
	 * 点击期货订单详情
	 */
	public void clickOrderDetails() {
		logger.info("点击期货订单详情：{}",futuresOrderPage.getOrderDetails());
		click(futuresOrderPage.getOrderDetails());
	}
	
	/**
	 * 点击确认发货-确定
	 */
	public void clickFuturesConfirmDeliver() {
		List<WebElement> eles = futuresOrderPage.getFutureConfirmDelivery();
		int size = eles.size();
		logger.info(" 确认发货共有{}个",size);
		for(int i =0;i<size ;i++){
			 eles =futuresOrderPage.getFutureConfirmDelivery();
			 logger.info("点击第{}个确认发货",i+1);
			 click(eles.get(0));
			// 点击 弹窗确定
			clickAlertConfirmButton();
			clickAlertConfirmButton();
		}
	}
	/**
	 * 点击下单 按钮 去填写合同
	 */
	public void clickLinkPlaceOrder() {
		click(futuresOrderPage.getLinkPlaceOrder());
	}
	/**
	 * 点击确认合同 按钮
	 */
	public void clickLinkConfirmContract() {
		 logger.info("点击操作按钮");
		click(futuresOrderPage.getLinkCliConfirmContract());
	}
	/**
	 * 点击确认收货按钮
	 */
	public void clickLinkConfirmReceiving() {
		 logger.info("点击确认收货按钮");
		click(futuresOrderPage.getLinkCliConfirmReceiving());
	}
	/**
	 * 获得经销商 环境下的 产品交易状态
	 */
	public String getDealerProductStatu() {
		logger.info("获得经销商 环境下的 产品交易状态,{}",getText(futuresOrderPage.getXpathGetFuturesStatu()));
		return getText(futuresOrderPage.getXpathGetFuturesStatu());
	}
}
