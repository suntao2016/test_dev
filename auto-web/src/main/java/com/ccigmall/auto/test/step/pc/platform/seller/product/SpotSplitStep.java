package com.ccigmall.auto.test.step.pc.platform.seller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.platform.seller.SpotOrderAct;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;

/**
 * @author dengshuhai
 * <p>platform 现货分单
 *  @version  1.0
 * 
 */
public class SpotSplitStep extends PlatformStep {

	/**
	 * slf4j
	 */

	private final static Logger logger = LoggerFactory
			.getLogger(SpotSplitStep.class);
	
	protected 	SpotOrderAct spotOrderAct;

	/**
	 * test pc wofe 现货分单
	 * @throws Exception 
	 */
	@Test(description = "test pc wofe 现货分单")
	public void testSplitBill() throws Exception {

		try {
			spotOrderAct = new SpotOrderAct(driver);
			logger.info("wofe现货分单的-测试用例-执行开始 ！测试用例名称：{}" , getClass().getName());
			// 点击卖家中心
			spotOrderAct.clickSellerCenter();
			// 点击 现货订单
			spotOrderAct.clickSpotOrder();
			// 点击 等待分单
			spotOrderAct.clickWaitToSplit();
			// 输入订单号
			spotOrderAct.inputOrderID( orderId );
			//spotOrderAct.inputOrderID( "142033727267329534" );
			// 点击搜索
			spotOrderAct.clickSearchButton();
			//判断搜索结果是否 符合
			spotOrderAct.isSearchResultExist(orderId);
			// 点击 立即分单
			spotOrderAct.pause(2);
			spotOrderAct.clickSplitOrder();
			// 切换至当前浏览器句柄
			spotOrderAct.switchToWindow(driver.getTitle());
			// 点击 现货分单
			spotOrderAct.clickSpotSplit();
			logger.info("wofe现货分单-测试用例-执行结束 ！");
		} catch (AssertionError e) {
			logger.error("wofe spot splitBills fail ", e);
			spotOrderAct.failScreenShot("wofe spot splitBills fail");
			Assert.fail("wofe spot splitBills fail >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("wofe spot splitBills fail ", e);
			spotOrderAct.failScreenShot("wofe spot splitBills fail");
			throw new Exception("wofe spot splitBills fail >> "
					+ e.getMessage(), e);
		}

	}

}
