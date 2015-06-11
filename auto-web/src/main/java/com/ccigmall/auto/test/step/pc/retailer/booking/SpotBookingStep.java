package com.ccigmall.auto.test.step.pc.retailer.booking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.booking.ProductDetailsAct;
import com.ccigmall.auto.test.act.pc.retailer.cart.MyShoppingCartAct;
import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
import com.ccigmall.auto.test.utils.UpdateOrderStatus;

/**
 * 
 * @author dengshuhai
 * 
 *         2014-12-18
 * 
 * @version 1.0
 */
public class SpotBookingStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SpotBookingStep.class);

	private ProductDetailsAct productDetailsAct;
	private MyShoppingCartAct myShoppingCartAct;
	private MyOderFormAct myOderFormAct;

	/**
	 * 零售商现货下单
	 * 
	 * @throws Exception
	 */
	@Test(description = "pc retailer 零售商现货下单")
	public void testSpotBooking()   {
		try {
			
			// 商品详情动作
			productDetailsAct = new ProductDetailsAct(driver);
			// 购物车动作
			myShoppingCartAct = new MyShoppingCartAct(driver);
			// 订单动作
			myOderFormAct = new MyOderFormAct(driver);
			
			logger.info("零售商现货下单-测试用例执行开始，测试用例名称是：{}", getClass().getName());

			// 输入商品名 准备搜索
			myOderFormAct.inputItem(productName);

			// 点击搜索
			indexAct.clickSearchButton();

			// 点击搜索出来的第一个商品
			myOderFormAct.clickFirstItem();

			// 切换至当前页面
			myOderFormAct.switchToWindow(driver.getTitle());

//			// 输入现货数量
			productDetailsAct.typeSpotMinNum();
//
//			// 点击立即订购
//			productDetailsAct.clickOderButton();

			// 点击全选
			myShoppingCartAct.clickAllSelect();

			// 点击第一个checkbox
			myShoppingCartAct.clickFirstCheckbox();

			// 确认信息准备提交收银台
			logger.info("确认信息准备提交收银台");
			myShoppingCartAct.clickPayButton();

			// 提交订单
			logger.info(" 提交订单");
			myShoppingCartAct.clickSubmitButton();

			// 获取 支付页面的 支付号
			logger.info("获取 支付页面的  支付号");
			// String payId = ".list-orderinfo>li";

			String payID = myOderFormAct.getPayId();

			// 支付号 处理 删除前面的汉字
			String regEx = "[^0-9]";
			Pattern p = Pattern.compile(regEx);
			Matcher m = p.matcher(payID);
			payID = m.replaceAll("");
			// 存入缓存
			setMemVal(Constant.PAYID, payID);

			// 更新支付号 状态为'已支付'
			logger.info("更新支付号:" + payID + "的状态为：'已支付'");
			UpdateOrderStatus.first(payID);

			// 切换至商品详情
			myOderFormAct.switchToWindow("鑫网易商-商品详情页");

			// 点击我的鑫网
			myOderFormAct.clickMyCcigmall();

			// 点击我的订单
			myOderFormAct.clickMyOrder();

			// 输入订单号
			myOderFormAct.typeSearchInput(payID);

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
			throw new TestNGException("retailer spotbooking failed >> "
					+ e.getMessage(), e);
		}

	}

}
