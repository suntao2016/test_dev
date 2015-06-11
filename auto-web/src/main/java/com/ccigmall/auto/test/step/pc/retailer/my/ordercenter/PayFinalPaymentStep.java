package com.ccigmall.auto.test.step.pc.retailer.my.ordercenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;
import com.ccigmall.auto.test.act.pc.retailer.booking.CheckTheOrderAct;
import com.ccigmall.auto.test.act.pc.retailer.cart.MyShoppingCartAct;
import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
import com.ccigmall.auto.test.utils.UpdateOrderStatus;
/**
 * 
 * @author chenjingli
 * retailer pay the final payment
 */
public class PayFinalPaymentStep extends RetailerStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(PayFinalPaymentStep.class);
	
	protected CheckTheOrderAct theOrderAct;
	protected MyShoppingCartAct cartAct;
	protected MyOderFormAct formAct;
	/**
	 * retailer pay the final payment
	 * 
	 * @throws Exception
	 */
	@Test(description = "pc retailer pay the final payment")
	public void testPayFinalPayment()   {
		try {
			/**
			 * 初始化对象
			 */
			logger.info("retailer pay the final payment 测试用例执行开始，测试用例名称是：{}", getClass().getName());
			
			theOrderAct = new CheckTheOrderAct(driver);
			cartAct = new MyShoppingCartAct(driver);
			formAct = new MyOderFormAct(driver);
			this.publicOperations();
			//获得订单号
			String tempId=formAct.getOrderId();
			//比较查询出的订单id是否是自己想要的
			if(orderId.equals(tempId)){
	    		//去付余款
				formAct.clickPayFinalButton();
	    	}else{
	    		logger.error("点击搜索按钮后没有找到要催缴的商品，找到的订单号是：{},而要支付余款的订单id是：{}"
						,tempId,orderId);
	    		Assert.assertEquals(tempId, orderId);
	    	}
			//跳转到指定窗口
			formAct.switchToWindow(driver.getWindowHandle());
			logger.info("开始支付尾款，支付号是={}",payId);
	    	UpdateOrderStatus.last(payId);
	    	//再次验证是否支付成功
	    	this.publicOperations();
	    	//=2s
	    	formAct.pause(2);
	    	String tempStatu=formAct.getOrderStatu();
	    	Assert.assertEquals("等待经销商发货",tempStatu);
			logger.info("retailer pay the final payment测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_BLANCE_PAYMENT_TEST_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_BLANCE_PAYMENT_TEST_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_RETAILER_BLANCE_PAYMENT_TEST_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_BLANCE_PAYMENT_TEST_FAIL >> "
					+ e.getMessage(), e);
		}
	}
	
	private void publicOperations(){
		//点击我的鑫网
		formAct.clickMyCcigmall();
		//点击我的订单按钮
		formAct.clickMyOrder();
		//=1s
		formAct.pause(1);
		//输入支付号
		formAct.typeSearchInput(orderId);
		//点击搜索按钮
		formAct.clickSearchButton();
	}

}
