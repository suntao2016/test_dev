/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.systemManage.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.FuturesOrderAct;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;

/**
 * 经销商-期货发货
 * 
 * @author dengshuhai
 *         <p>
 * @since 2014-12-16
 *        </P>
 *        <p>
 * @version 1.0
 *          </P>
 */
public class FuturesOrderDeliverStep extends DealerStep {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(FuturesOrderDeliverStep.class);
	protected FuturesOrderAct futuresOrderAct;

	/**
	 * 经销商发货
	 * 
	 * @throws Exception
	 */
	@Test(description = "经销商-发期货")
	public void testFuturesOrder() throws Exception {
		try {
			futuresOrderAct = new FuturesOrderAct(driver);
			logger.info("测试用例-经销商期货发货-开始，测试用例名称是：{}", getClass().getName());

			// 点击 系统管理
			futuresOrderAct.clickSystemManageBar();

			// 点击 期货订单
			futuresOrderAct.clickFuturesOrder();

			// 输入检索条件 订单编号
			futuresOrderAct.inputOrderId(purchaseId);

			// 点击 搜索
			futuresOrderAct.clickSearchButton();

			// 点击 订单详情
			futuresOrderAct.clickOrderDetails();

			// 切换至当前浏览器
			futuresOrderAct.switchToWindow(driver.getTitle());

			// 点击 确认发货
			futuresOrderAct.clickFuturesConfirmDeliver();


			logger.info("测试用例-经销商期货发货-结束！");

		} catch (AssertionError e) {
			logger.error("dealer FuturesDelivery failed ", e);
			futuresOrderAct.failScreenShot("dealer FuturesDelivery failed");
			Assert.fail("dealer FuturesDelivery failed >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer FuturesDelivery failed ", e);
			futuresOrderAct.failScreenShot("dealer FuturesDelivery failed");
			Assert.fail("dealer FuturesDelivery failed >> " + e.getMessage());
			throw new Exception("dealer FuturesDelivery failed >> "
					+ e.getMessage(), e);
		}

	}
}
