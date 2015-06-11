package com.ccigmall.auto.test.step.pad.retailer.booking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pad.retailer.booking.OrderAct;
import com.ccigmall.auto.test.act.pad.retailer.booking.PayAct;
import com.ccigmall.auto.test.act.pad.retailer.my.MyOrderAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pad.retailer.RetailerStep;
import com.ccigmall.auto.test.utils.UpdateOrderStatus;

/**
 * 
 * @author dengshuhai 
 * <p>pad零售商下单-购物车-支付 
 * @since 2014-12-18
 * @version 1.0
 */
public class FutureBookingStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(FutureBookingStep.class);
	// 商品详情动作
	private OrderAct orderAct;
	// 我的订单
	private MyOrderAct myOrderAct;
	// 商品支付动作
	private PayAct payAct;
	/**
	 * pad 零售商期货下单
	 * 
	 * @throws Exception
	 */
	@Test(description = "pad retailer 零售商期货下单")
	@Parameters({ "moblie", "useID" ,"padUserName","padPassword"})
	public void testfutureBooking(String moblie, String useID,String padUserName,String padPassword) throws Exception {
		try {
			orderAct = new OrderAct(driver);
			payAct =new PayAct(driver);
			if(productId.contains("过期")){
				Assert.fail("商品ID过期，流程无法继续");
			}
			String host = "http://192.168.1.122:8080/ccigmall-web-retailer";
			if (getMemVal(Constant.ENV).equals("sit")) {
				host = "http://192.168.0.122:8080";
			}
			driver.get(host + "/itemController/toItemDetail.do?PID="
					+ productId);
			logger.info("pad 零售商期货下单-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			String handleTitle = driver.getTitle();
			logger.info("获取当前的浏览器句柄是：{}", handleTitle);
			// 选择期货类型
			orderAct.clickFuturesType();
			// 输入期货数量
			orderAct.inputFuturesAmount();
			// 点击 加入进货单 连续暴击4次
			orderAct.pause(1);
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			// 点击 进入购物车
			orderAct.clickEnterShoppingCart();
			// 切换当前页面
			orderAct.switchToWindow(driver.getTitle());
    		// 去结算
			orderAct.clickPayPriceButton();
			// 点击用户名
			orderAct.clickUserName(padUserName);
			// 输入用户密码
			orderAct.inputPassword(padPassword);
			orderAct.pause(2);
			// 点击登录
			orderAct.clickLogin();
			// 删除已选订单
			orderAct.clickDeleteButton();
			// 点击订单-删除按钮-弹窗确定
			orderAct.clickAlertConfirm();
			// 点击订单-删除按钮-弹窗确定
			orderAct.clickAlertConfirm();
			driver.get(host + "/itemController/toItemDetail.do?PID="
					+ productId);
			orderAct.switchToWindow(handleTitle);
			// 选择期货类型
			orderAct.clickFuturesType();
			// 输入期货数量
			orderAct.inputFuturesAmount();
			// 点击 加入进货单 连续暴击4次
			orderAct.pause(1);
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			// 点击 进入购物车
			orderAct.clickEnterShoppingCart();
			// 切换当前页面
			orderAct.switchToWindow(driver.getTitle());
	     	// 点击全选
			//orderAct.clickCheckAll();
			//orderAct.pause(1);
			// 点击第一个checkbox
			//orderAct.clickFirstCheckbox();
			// 去结算
			orderAct.clickPayPriceButton();
			//
			orderAct.switchToWindow(driver.getTitle());
			// 给卖家留言
			orderAct.inputLeaveMessage("卖家留言");
			// 提交订单
			orderAct.clickSubmitOrder();
			String payId = payAct.getPayId().trim();
			char[] ch = payId.toCharArray();
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 48 && ch[i] <= 57) {
					sb.append(ch[i]);
				}
			}
			payId = sb.toString();
			setMemVal(Constant.PAYID, payId);
			
			
//			 //点击确认支付
//			 payAct.clickConfirmPay();
//			 orderAct.pause(10);
			UpdateOrderStatus.first(payId);
			// Assert.assertEquals(actualResult, "订单已确认");*/
			myOrderAct = new MyOrderAct(driver);
			myOrderAct.open(host + "/retailerOrder/findRetailerOrder");
			// 点击我的订单
			myOrderAct.clickMyOrder();
			// 输入payId
			myOrderAct.enterId(payId);
			// 点击搜索
			myOrderAct.clickSearch_btn();
			orderId = myOrderAct.checkSearchResult();
			ch = orderId.toCharArray();
			sb = new StringBuilder("");
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 48 && ch[i] <= 57) {
					sb.append(ch[i]);
				}
			}
			orderId = sb.toString();
			setMemVal(Constant.ORDERID, orderId);
			logger.info("pad 零售商期货下单-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("pad retailer futurebooking failed ", e);
			Assert.fail("pad retailer futurebooking failed >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("pad retailer futurebooking failed ", e);
			throw new Exception("pad retailer futurebooking failed >> "
					+ e.getMessage(), e);
		}

	}

}
