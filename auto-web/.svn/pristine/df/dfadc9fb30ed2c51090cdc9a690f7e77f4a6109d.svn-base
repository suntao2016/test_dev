package com.ccigmall.auto.test.step.pc.retailer.booking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.booking.ProductDetailsAct;
import com.ccigmall.auto.test.act.pc.retailer.cart.MyShoppingCartAct;
import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
import com.ccigmall.auto.test.utils.UpdateOrderStatus;

/**
 * 
 * @author zhaixiaoyue
 * 
 *         2015-1-12
 * 
 * @version 1.0
 */
public class SpotBookingPadStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SpotBookingPadStep.class);

	private ProductDetailsAct productDetailsAct;
	private MyShoppingCartAct myShoppingCartAct;
	private MyOderFormAct myOderFormAct;

	/**
	 * 零售商现货下单
	 * 
	 * @throws Exception
	 */
	@Test(description = "pc retailer 零售商现货下单支付")
	public void testSpotBooking() throws Exception {
		try {
			
			// 商品详情动作
			productDetailsAct = new ProductDetailsAct(driver);
			// 购物车动作
			myShoppingCartAct = new MyShoppingCartAct(driver);
			// 订单动作
			myOderFormAct = new MyOderFormAct(driver);
			
			logger.info("零售商现货下单-测试用例执行开始，测试用例名称是：{}", getClass().getName());

			

			

			
			// 更新支付号 状态为'已支付'
			logger.info("更新支付号:" + payId + "的状态为：'已支付'");
			UpdateOrderStatus.first(payId);

			// 切换至商品详情
			myOderFormAct.switchToWindow("鑫网易商-商品详情页");

			// 点击我的鑫网
			myOderFormAct.clickMyCcigmall();

			// 点击我的订单
			myOderFormAct.clickMyOrder();

			// 输入订单支付号
			myOderFormAct.typeSearchInput(payId);

			// 点击搜索按钮
			myOderFormAct.clickSearchButton();

			// 获取订单编号
			String orderNum = myOderFormAct.getOrderId();
			logger.info("打印订单编号：" + orderNum);

			// 将订单号存入内存
			setMemVal(Constant.ORDERID, orderNum.trim());

			// 获取订单状态
			String actualResult = myOderFormAct.getOrderStatu();

			logger.info("点击查看");
			myOderFormAct.clickOrderView();

			Assert.assertEquals(actualResult, "订单已确认");
			logger.info("零售商现货下单-测试用例执行结束！");

		} catch (AssertionError e) {
			logger.error("retailer spotbooking failed ", e);
			Assert.fail("retailer spotbooking failed >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("retailer spotbooking failed ", e);
			throw new Exception("retailer spotbooking failed >> "
					+ e.getMessage(), e);
		}

	}

}
