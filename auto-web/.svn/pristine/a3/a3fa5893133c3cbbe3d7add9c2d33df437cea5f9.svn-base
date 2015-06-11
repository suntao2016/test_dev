package com.ccigmall.auto.test.step.pc.retailer.my.ordercenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;

/**
 * 
 * @author chenjingli
 * retailer 我的鑫网-我的订单-取消订单
 */
public class CancelOrderStep extends RetailerStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CancelOrderStep.class);
	protected MyOderFormAct formAct;
	@Test(description = " retailer 我的鑫网-我的订单-取消订单")
	public void testCancelOrder()  {
		try {
			/**
			 * 初始化对象
			 */
			logger.info("retailer 我的鑫网-我的订单-取消订单 测试用例执行开始，测试用例名称是：{}", getClass().getName());
			
			formAct = new MyOderFormAct(driver);
			// 点击我的鑫网
			formAct.clickMyCcigmall();
		    // 点击我的订单
			formAct.clickMyOrder();
			//点击代付款
			formAct.clickToPay();
			if(0!=formAct.getPayOrders()){
				//点击取消订单
				formAct.clickPayFinalButton();
			}else{
				logger.error("没有可以取消的订单，去造个数据吧");
				Assert.fail("没有可以取消的订单，去造个数据吧");
			}
			String orderNumber = formAct.getOrderNumber();
			//点击确定
			formAct.clickSureButton();
			formAct.pause(1);
			//点击已取消
			formAct.clickDisabled();
			//输入订单号
			formAct.typeSearchInput(orderNumber.trim());
			//点击搜索按钮
			formAct.clickSearchButton();
			
			formAct.pause(2);
			String tempStatu=formAct.getOrderStatu();
	    	Assert.assertEquals("已取消",tempStatu);
			logger.info("retailer我的鑫网-我的订单-取消订单测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_CANCEL_ORDER_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_CANCEL_ORDER_FAIL + " >> "
					+ e.getMessage());
		} catch (TestNGException e) {
			logger.error(Constant.TEST_RETAILER_CANCEL_ORDER_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_CANCEL_ORDER_FAIL >> "
					+ e.getMessage(), e);
		}
	}
	
}
