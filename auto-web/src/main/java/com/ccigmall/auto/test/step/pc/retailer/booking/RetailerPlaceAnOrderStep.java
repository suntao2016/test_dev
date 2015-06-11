package com.ccigmall.auto.test.step.pc.retailer.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.booking.CheckTheOrderAct;
import com.ccigmall.auto.test.act.pc.retailer.booking.ProductDetailsAct;
import com.ccigmall.auto.test.act.pc.retailer.cart.MyShoppingCartAct;
import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
import com.ccigmall.auto.test.utils.UpdateOrderStatus;

/**
 * 
 * @author chenjingli
 * 
 *         2014-12-4
 * 
 * @version 1.0 期货下单
 */

public class RetailerPlaceAnOrderStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RetailerPlaceAnOrderStep.class);
	/**
	 * 依次添加 商品详情，订单确认，购物车，我的订单 action
	 */
	protected ProductDetailsAct detailsAct;
	protected CheckTheOrderAct theOrderAct;
	protected MyShoppingCartAct cartAct;
	protected MyOderFormAct formAct;
	/**
	 * 零售商下单
	 * 
	 * @throws Exception
	 */
	@Test(description = "pc 零售商下单")
	public void testRetailerPlaceAnOrder()   {
		try {
			/**
			 * 初始化对象
			 */
			detailsAct = new ProductDetailsAct(driver);
			theOrderAct = new CheckTheOrderAct(driver);
			cartAct = new MyShoppingCartAct(driver);
			formAct = new MyOderFormAct(driver);
			
			logger.info("零售商下单的测试用例执行开始，测试用例名称是：{}", getClass().getName());
			String[] getIpAdress =  driver.getCurrentUrl().split("/");
			
			logger.info("获取ip地址：{},商品id是：{}",getIpAdress[2],productId);
			formAct.open(getIpAdress[2]+"/item/toItemDetail.do?PID="+productId);
			//跳转指定窗口
			formAct.switchToWindow(driver.getWindowHandle());
			//获得期货最小数量
			String minNumber = detailsAct.getFutureMinNum();
			//输入最小数量
			detailsAct.typeFutureMinNum(minNumber);
			//点击加入购物车按钮
			detailsAct.clickJoinStock();
			//点击加入购物车
			detailsAct.clickLoginShoppingCart();
			//点击全选按钮
			cartAct.clickAllSelect();
			//点击第一个复选框
			cartAct.clickFirstCheckbox();
			//确认信息后准备提交到收银台支付
			cartAct.clickPayButton();
			//跳转到收银台支付
			theOrderAct.clickSubmitOrderButton();
			//=2s
			formAct.pause(2);
			//获得最小数量
			String orderPayId =  getNum();
			logger.info("把支付号存入缓存中:放入的支付id是：",orderPayId);
			System.out.println(orderPayId+"zhifuhao:");
			setMemVal(Constant.PAYID, orderPayId);
			//开始支付首付款
			UpdateOrderStatus.first(orderPayId);
			logger.info("支付成功!");
			//点击我的鑫网
			formAct.clickMyCcigmall();
			//点击我的订单按钮
			formAct.clickMyOrder();
			//=1s
			formAct.pause(1);
			//输入支付号
			formAct.typeSearchInput(orderPayId);
			//点击搜索按钮
			formAct.clickSearchButton();
			//=1s
			formAct.pause(1);
			String tempId = formAct.getOrderId();
			logger.info("把订单号放入缓存中,订单号是：{}",tempId);
			System.out.println(tempId+"订单号:");
			setMemVal(Constant.ORDERID,tempId);
			String tempStatu=formAct.getOrderStatu();
			if("定金支付成功，订单待确认".equals(tempStatu) || "订单已确认".equals(tempStatu)){
				logger.info("零售商下单成功");
			}
			logger.info("零售商下单的测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
			Assert.fail(Constant.TEST_SUBMITORDER_SEARCH__FIAL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_SUBMITORDER_SEARCH__FIAL, e);
			throw new TestNGException("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
					+ e.getMessage(), e);
		}
	}

	/**
	 * 获取{友情提示中}的数字用来输入期货数量  1:代表友情提示  2：代表支付号
	 * 
	 * @return
	 */
	private String getNum() {
		StringBuffer sb = new StringBuffer();
		WebElement element = driver.findElement(By.xpath("//div[@class='order-success']/descendant::li[1]"));
		String	numTest = element.getText();
		for (String num : numTest.split("[^0-9]+")) {
			if (num.length() > 0) {
				sb.append(num);
			}
		}
		return sb.toString();
	}
}
