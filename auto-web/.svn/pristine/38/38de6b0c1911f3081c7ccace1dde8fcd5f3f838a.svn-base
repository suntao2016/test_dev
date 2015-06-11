package com.ccigmall.auto.test.step.pc.platform.seller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.FuturesOrderAct;
import com.ccigmall.auto.test.act.pc.platform.seller.product.ProductListAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.systemManage.order.ConfirmContractStep;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;
/**
 * 
 * @author chenjingli
 *  worth of platform
 */
public class FuturesWorthStep extends PlatformStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ConfirmContractStep.class);
	protected ProductListAct productListAct;
	protected FuturesOrderAct futuresOrderAct;
	/**
	 * test  催缴平台
	 * @throws Exception 
	 */
	@Test(description = " worth of platform")
	public void testFuturesWorth()   {    
		    try{
		    	logger.info(" worth of platform测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	//初始化所需对象
		    	productListAct = new ProductListAct(driver);
		    	futuresOrderAct = new FuturesOrderAct(driver);
		    	// 点击卖家中心
				productListAct.clickSellerCenter();
				//点击期货订单
				productListAct.clickFuturesOrder();
				//输入订单id
				futuresOrderAct.inputOrderId(orderId);
				//点击搜索按钮
		    	futuresOrderAct.clickSearchButton();
		    	//判断是否想找的商品
		    	productListAct.compareSearchResults(productName);
		    	//点击弹出框中的确定
		    	futuresOrderAct.clickAlertConfirmButton();
		    	//再次点击弹出框中的确定
		    	futuresOrderAct.clickAlertConfirmButton();
		    	//验证是否正确状态
		    	//输入订单id
				futuresOrderAct.inputOrderId(orderId);
				//点击搜索按钮
		    	futuresOrderAct.clickSearchButton();
		    	//=2s
		    	futuresOrderAct.pause(2);
		    	Assert.assertEquals("等待零售商交付余款".trim(),futuresOrderAct.getText(futuresOrderAct.getFuturesOrderPage().getXpathGetFuturesStatu()));
		    	logger.info(" worth of platform合同测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_PLARFORM_PLATFORM_TEST_FAIL ", e);
				Assert.fail(Constant.TEST_PLARFORM_PLATFORM_TEST_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_PLARFORM_PLATFORM_TEST_FAIL, e);
				throw new TestNGException("Constant.TEST_PLARFORM_PLATFORM_TEST_FAIL >> "
						+ e.getMessage(), e);
			}
	}
}
