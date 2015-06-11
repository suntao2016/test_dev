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
 * @since 2014-12-15
 * 
 * @version 1.0
 */
public class SpotReceiptStep extends RetailerStep {

	private final static Logger logger = LoggerFactory.getLogger(SpotReceiptStep.class);

	protected MyOderFormAct myOderFormAct ;
	/**
	 * 零售商收货
	 * @throws Exception 
	 */
	@Test(description = "零售商现货收货")
	public void testReceipt() throws Exception {
		try {
			myOderFormAct = new MyOderFormAct(driver);
			logger.info("测试用例-零售商现货收货-开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			myOderFormAct.clickMyCcigmall();
			// 点击我的订单
			myOderFormAct.clickMyOrder();

			myOderFormAct.typeSearchInput(orderId);
			// 点击搜索按钮
			myOderFormAct.clickSearchButton();
			// 点击【经销商已发货】的查看
			myOderFormAct.clickOrderCheck();
			// 切换至当前页面
			myOderFormAct.switchToWindow(driver.getTitle());
			// 确认收货
			myOderFormAct.clickConfirmReceipt();
			//判断是否 现货收货-执行成功
			String actualResult = myOderFormAct.getOrderStatu_();
			if(actualResult.contains("订单完成")){
				logger.info("现货收货成功");
				Assert.assertTrue(true);
			}
			else{
				logger.info("现货收货失败");
				Assert.assertTrue(false);
			}
			logger.info("测试用例-零售商现货收货-结束！");
		} catch (AssertionError e) {
			logger.error("retailer spot receipt fail ", e);
			myOderFormAct.failScreenShot("retailer spot receipt fail ");
			Assert.fail("retailer spot receipt fail  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("retailer spot receipt fail  ", e);
			myOderFormAct.failScreenShot("retailer spot receipt fail ");
			throw new Exception("retailer spot receipt fail  >> "
					+ e.getMessage(), e);
		}
	}

}
