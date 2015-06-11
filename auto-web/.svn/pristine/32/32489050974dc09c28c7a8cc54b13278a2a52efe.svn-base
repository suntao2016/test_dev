package com.ccigmall.auto.test.step.pc.retailer.my.ordercenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.retailer.IndexAct;
import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.MyOderFormAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.page.pc.retailer.my.ordercenter.MyOderFormPage;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;

/**
 * 
 * @author chenjingli
 * 
 *         2014-1-05
 * 
 * @version 1.0
 */
public class SearchOrderStatusStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SearchOrderStatusStep.class);
	/**
	 * 依次添加 商品详情，订单确认，购物车，我的订单 action
	 */
	protected SettingActiton settingActiton;
	protected MyOderFormAct formAct;
	protected IndexAct indexAct;
	protected MyIndexAct act;
	protected MyOderFormPage page;
	/**
	 * 零售商 我的订单--》搜索各个订单状态后 成功获取列表
	 * 
	 * @throws Exception
	 */
	@Test(description = "pc 零售商 我的订单--》搜索各个订单状态后 成功获取列表", dependsOnMethods = { "retailerLogin" })
	public void testRetailerPlaceAnOrder()   {
		try {
			/**
			 * 初始化对象
			 */
			settingActiton = new SettingActiton(driver);
			formAct = new MyOderFormAct(driver);
			indexAct = new IndexAct(driver);
			act = new MyIndexAct(driver);
			page = new MyOderFormPage(driver);
			
			logger.info("点击我的鑫网");
			indexAct.clickMyCcigmall();
			
			logger.info("点击我的订单按钮");
			act.clickMyOrder();
			
			logger.info("在搜索框输入要搜索的信息");
			formAct.clickOrderView();
//			formAct.typeSearchInput(orderPayId);
			
//			logger.info("点击搜索按钮");
//			formAct.clickSearchButton();
//			logger.info("把订单号放入缓存中,订单号是：{}",settingActiton.getText(page.getXpathgetOrderNum()));
//			settingActiton.pause(1);
//			setMemVal(Constant.ORDERID,settingActiton.getText(page.getXpathgetOrderNum()));
//			
//			logger.info("判断这个订单状态是否为：待付定金={}",settingActiton.getText(page.getXpathgetOrderStatu()));
//			String temp=settingActiton.getText(page.getXpathgetOrderStatu()).trim();
//			if("定金支付成功，订单待确认".equals(temp) || "订单已确认".equals(temp)){
//				logger.info("零售商下单成功");
//			}
			logger.info("pc 零售商在我的订单模块中搜索各订单状态的测试用例执行结束！");
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

}
