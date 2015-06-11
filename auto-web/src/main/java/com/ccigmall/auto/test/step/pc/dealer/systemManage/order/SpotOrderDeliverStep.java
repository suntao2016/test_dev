/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.systemManage.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.SpotOrderAct;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;

/**
 * 经销商-发货
 * 
 * @author dengshuhai
 *         <p>
 * @since 2014-12-15
 *        </P>
 *        <p>
 * @version 1.0
 *          </P>
 */
public class SpotOrderDeliverStep extends DealerStep {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SpotOrderDeliverStep.class);
	// 现货订单页面动作
	private SpotOrderAct spotOrderAct;

	/**
	 * 经销商现货发货
	 * 
	 * @throws Exception
	 */
	@Test(description = "经销商现货发货")
	public void TestSpotDeliver() throws Exception {
		try {
			// 现货订单页面动作初始化
			spotOrderAct = new SpotOrderAct(driver);
			logger.info("测试用例-经销商现货发货-开始，测试用例名称是：{}", getClass().getName());

			// 点击 系统管理
			spotOrderAct.clickSystemManageBar();

			// 点击 现货订单
			spotOrderAct.clickSpotOrder();

			// 点击 等待发货
			spotOrderAct.click_WaitToDeliver();

			// logger.info("输入订单号");
			spotOrderAct.inputOrderId(orderId);

			// 点击搜索
			spotOrderAct.clickSearchButton();
			
			spotOrderAct.isSearchResultExist(orderId);

			// 点击 确认发货
			spotOrderAct.clickConfirmDeliveryButton();

		} catch (AssertionError e) {
			logger.error("dealer spot deliver fail ", e);
			spotOrderAct.failScreenShot("dealer spot deliver fail ");
			Assert.fail("dealer spot deliver fail  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer spot deliver fail  ", e);
			spotOrderAct.failScreenShot("dealer spot deliver fail ");
			throw new Exception("dealer spot deliver fail  >> "
					+ e.getMessage(), e);

		}

	}
}
