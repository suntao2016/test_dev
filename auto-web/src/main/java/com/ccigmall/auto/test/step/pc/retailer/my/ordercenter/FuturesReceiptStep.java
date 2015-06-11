package com.ccigmall.auto.test.step.pc.retailer.my.ordercenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;



/**
 * 
 * @author dengshuhai
 * 
 * @since 2014-12-16
 * 
 * @version 1.0
 * <p>
 * 零售商期货收货
 * </p>
 */
public class FuturesReceiptStep extends RetailerStep{

	private final static Logger logger = LoggerFactory.getLogger(FuturesReceiptStep.class);
	protected MyOderFormAct myOderFormAct ;

	/**
	 * 零售商期货收货
	 * @throws Exception 
	 */
	@Test(description = "零售商期货收货")
	public void testFuturesReceipt() throws Exception {
		try {
			myOderFormAct = new MyOderFormAct(driver);
			logger.info("测试用例-零售商期货收货-开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			myOderFormAct.clickMyCcigmall();
			// 点击我的订单
			myOderFormAct.clickMyOrder();
			// 点击 待收期货
			myOderFormAct.clickWaitToReceiveFutures();

			myOderFormAct.typeSearchInput(orderId);
			//点击搜索按钮
			myOderFormAct.clickSearchButton();
			//确认收货
			myOderFormAct.clickConfirmReceipt();

			//判断是否 现货收货-执行成功
			logger.info("输入订单号");
			myOderFormAct.typeSearchInput(orderId);
			//点击查询按钮
			myOderFormAct.clickSearchButton();
			String actualResult = myOderFormAct.getOrderStatu().trim();
			if(actualResult.contains("订单完成")){
				logger.info("期货收货成功");
				Assert.assertTrue(true);
			}
			else{
				logger.info("期货收货失败");
				Assert.assertTrue(false);
			}
			logger.info("测试用例-零售商期货收货-结束！");

		} catch (AssertionError e) {
			logger.error("retailer FuturesReceipts failed ", e);
			myOderFormAct.failScreenShot("retailer FuturesReceipts failed");
			Assert.fail("retailer FuturesReceipts failed >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("retailer FuturesReceipts failed ", e);
			myOderFormAct.failScreenShot("retailer FuturesReceipts failed");
			throw new Exception("retailer FuturesReceipts failed >> "
					+ e.getMessage(), e);
		}
	}

}
