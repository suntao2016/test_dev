package com.ccigmall.auto.test.step.pc.platform.buyer.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.act.pc.platform.buyer.order.ConsolidatedOrderAct;
import com.ccigmall.auto.test.act.pc.platform.buyer.order.toMergeOrderAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.ConsolidatedOrderPage;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.ToMergeOrderPage;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;
/**
 * 
 * @author chenjingli
 * 期货分单 step
 */
public class ConsolidatedOrderStep extends PlatformStep  {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ConsolidatedOrderStep.class);
	/**
	 * 引入 待合并 已合并 首页 act
	 */
	protected ConsolidatedOrderAct orderAct;
	protected toMergeOrderAct mergeOrderAct;
	
	@Test(description = "pc wofe 期货分单")
	public void testConsolidatedOrder()   {
		try{
			logger.info("wofo分单的测试用例执行开始，测试用例名称是：{}",getClass().getName());
			/**
			 * 初始化对象
			 */
			mergeOrderAct = new toMergeOrderAct(driver);
			orderAct = new ConsolidatedOrderAct(driver);
			//点击 wofe 平台的买家中心
			orderAct.clickBuyersCenter();
			//点击已经合并的订单
			orderAct.clickConsolidatedOrder();
			//输入采购订单id
			orderAct.typePurchaseId(purchaseId);
			//点击搜索按钮
			orderAct.clickSearchButton();
			if(productName.equals(mergeOrderAct.getSearchProductName())){
				//点击期货分单按钮
				orderAct.clickQiFenButton();
			}else{
				Assert.fail("点击搜索没有搜索到指定内容");
			}
			if(orderAct.getOrderPage().getXpathCliDistributorRadio().isDisplayed() ==  true){
				//选择分销商按钮
				orderAct.clickDistributorRadio();
			}else{
				Assert.fail("没有找到对应的经销商");
			}
			//点击确定按钮
			orderAct.clickSureButton();
			//点击 弹出框 按钮
			orderAct.clickConfirmButton();
			//回到首页在判断这个订单是否分单成功
			orderAct.typePurchaseId(purchaseId);
			//点击搜索按钮
			orderAct.clickSearchButton();
			//=1s
			orderAct.pause(1);
			
			Assert.assertEquals("已分配".trim(),orderAct.getOrderStatus());
			logger.info("wofo分单的测试用例执行结束 ！");
		}catch (AssertionError e) {
			logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
			Assert.fail(Constant.TEST_PLATFORM_SINGLE__FIAL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_PLATFORM_SINGLE__FIAL, e);
			throw new TestNGException("Constant.TEST_PLATFORM_SINGLE__FIAL >> "
					+ e.getMessage(), e);
		}
	}
}
