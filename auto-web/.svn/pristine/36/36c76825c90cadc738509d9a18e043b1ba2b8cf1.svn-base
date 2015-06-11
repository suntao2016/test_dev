package com.ccigmall.auto.test.step.pc.retailer.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.booking.CheckTheOrderAct;
import com.ccigmall.auto.test.act.pc.retailer.booking.ProductDetailsAct;
import com.ccigmall.auto.test.act.pc.retailer.cart.MyShoppingCartAct;
import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.page.pc.retailer.booking.ProductDetailsPage;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
import com.ccigmall.auto.test.utils.UpdateOrderStatus;

/**
 * 
 * @author chenjingli
 * 
 *         2015-1-9
 * 
 * @version 1.0 期货下单
 */
public class RetailerPlaceAnOrderPadStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RetailerPlaceAnOrderPadStep.class);
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
	public void testRetailerPlaceAnOrder() throws Exception {
		try {
			/**
			 * 初始化对象
			 */
			detailsAct = new ProductDetailsAct(driver);
			theOrderAct = new CheckTheOrderAct(driver);
			cartAct = new MyShoppingCartAct(driver);
			formAct = new MyOderFormAct(driver);
			
			logger.info("开始支付手笔款项，支付id={}",payId);
			UpdateOrderStatus.first(payId);
			logger.debug("支付成功");
			
			//点击我的鑫网
			formAct.clickMyCcigmall();
			//点击我的订单按钮
			formAct.clickMyOrder();
			//=1s
			formAct.pause(1);
			//输入支付号
			formAct.typeSearchInput(payId);
			//点击搜索按钮
			formAct.clickSearchButton();					
			
			//=1s
			formAct.pause(1);
			String tempId = formAct.getOrderId();
			logger.info("把订单号放入缓存中,订单号是：{}",tempId);
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
			throw new Exception("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
					+ e.getMessage(), e);
		}
	}

	/**
	 * 获取{友情提示中}的数字用来输入期货数量  1:代表友情提示  2：代表支付号
	 * 
	 * @return
	 */
	private String getNum(String flag) {
		ProductDetailsPage detailsPage = new ProductDetailsPage(driver);
		StringBuffer sb = new StringBuffer();
		String numTest = "";
		if (flag.equals("1")) {
			numTest = formAct.getText(detailsPage.getXpathgetMinNum());
		} else if (flag.equals("2")) {
			WebElement element = driver.findElement(By.xpath("//div[@class='order-success']/descendant::li[1]"));
			numTest = element.getText();
		}
		for (String num : numTest.split("[^0-9]+")) {
			if (num.length() > 0) {
				sb.append(num);
			}
		}
		logger.info("获取友情提示中的数字是={}", sb.toString());
		return sb.toString();
	}
}
