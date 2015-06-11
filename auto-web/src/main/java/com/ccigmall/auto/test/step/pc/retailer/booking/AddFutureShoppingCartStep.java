package com.ccigmall.auto.test.step.pc.retailer.booking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.booking.ProductDetailsAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;

/**
 * 
* @ClassName: AddFutureShoppingCartStep 
* @Description: 零售商--期货下单-加入购物车
* @author chenjingli 
* @date 2015-2-2 下午12:17:39
 */
public class AddFutureShoppingCartStep extends RetailerStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AddFutureShoppingCartStep.class);
	
	protected static ProductDetailsAct detailsAct;
	/**
	 * 
	* @Title: testAddFutureShoppingCart 
	* @Description: 
	* @param @throws Exception    
	* @return void 
	* @throws
	 */
	@Test(description = "pc 期货下单-加入购物车")
	public void testAddFutureShoppingCart() {
		try {
			logger.info("零售商--期货下单-加入购物车测试用例执行开始，测试用例名称是：{}", getClass().getName());
			/**
			 * 初始化对象
			 */
			detailsAct = new ProductDetailsAct(driver);
			String[] getIpAdress =  driver.getCurrentUrl().split("/");
			logger.info("获取ip地址：{},商品id是：{}",getIpAdress[2],productId);
			detailsAct.open(getIpAdress[2]+"/item/toItemDetail.do?PID="+productId);
			//跳转指定窗口
			detailsAct.switchToWindow(driver.getWindowHandle());
			//点击预售货
			detailsAct.clickFutureButton();
			//获得最小预定数量
			String minNumber = detailsAct.getFutureMinNum();
			//输入最小预定数量
			detailsAct.typeFutureMinNum(minNumber);
			//点击加入进货单按钮
			detailsAct.clickJoinStock();
			//点击继续购物
			detailsAct.clickGoOnShopping();
			//点击加入进货单按钮
			detailsAct.clickJoinStock();
			//获得提示信息
			String promptInfo = detailsAct.getPromptInfo();
			if(promptInfo.contains("添加购物车成功")){
				Assert.assertFalse(false, "添加购物车测试成功");
			}else{
				Assert.assertFalse(true, "添加购物车测试失败");
			}
			logger.info("零售商--期货下单-加入购物车测试用例执行结束！");
		} catch (AssertionError e) {
			detailsAct.failScreenShot(Constant.TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL);
			logger.error("Constant.TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			detailsAct.failScreenShot(Constant.TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL);
			logger.error(Constant.TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL >> "
					+ e.getMessage(), e);
		}
	}

}
