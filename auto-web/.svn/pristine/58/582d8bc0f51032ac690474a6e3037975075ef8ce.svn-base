package com.ccigmall.auto.test.step.pc.platform.buyer.order;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
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
 * 期货合单 step
 */
public class ToMergeOrderStep extends PlatformStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ToMergeOrderStep.class);
	/**
	 * 引入 待合并 已合并 首页 act
	 */
	protected toMergeOrderAct mergeOrderAct;
	protected ConsolidatedOrderAct orderAct;
	/**
	 * wofe期货合单
	 * @throws Exception 
	 */
	@Test(description = "wofe期货合单")
	public void testToMergeOrder()   {
		try{
			logger.info("wofo合单的测试用例执行开始，测试用例名称是：{}",getClass().getName());
			/**
			 * 初始化对象
			 */
			mergeOrderAct = new toMergeOrderAct(driver);
			orderAct = new ConsolidatedOrderAct(driver);
			
			//点击 wofe 平台的买家中心
			mergeOrderAct.clickBuyersCenter();
			//点击待合并订单
			mergeOrderAct.clickToMergeOrder();
			//输入测试商品
			mergeOrderAct.typeGoodsName(productName);
			//点击搜索按钮
			mergeOrderAct.clickSearchButton();
			String tempProductName = mergeOrderAct.getSearchProductName();
			if(productName.equals(tempProductName)){
				mergeOrderAct.clickMergeOrder();
			}else{
				Assert.fail("点击搜索没有搜索到指定内容");
			}
			//点击全选按钮
			mergeOrderAct.clickAllSelChekbox();
			//=2s
			mergeOrderAct.pause(2);
			//点击 合并 并提交按钮
			mergeOrderAct.clickSubmitButton();
			
			if(mergeOrderAct.getText(driver.findElement(By.xpath("//div[@class='ui_content']"))).contains("合并订单成功了")){
				//=2s
				mergeOrderAct.pause(2);
				//点击弹出框确定
				mergeOrderAct.clickConfirmButton();
			}else{
				logger.error("提交合单异常，提示信息为：{}",
						mergeOrderAct.getText(driver.findElement(By.xpath("//div[@class='ui_content']"))));
				Assert.fail("提交合单异常");
			}
			
			/**
			 * 在输入商品判断是否合单成功
			 */
			mergeOrderAct.pause(1);
			//点击买家中心
			mergeOrderAct.clickBuyersCenter();
			//输入产品信息
			mergeOrderAct.typeGoodsName(productName);
			//=2s
			mergeOrderAct.pause(2);
			//选择下拉框  已合单
			orderAct.selOrderStatus("已合单".trim());
			//点击搜索按钮
			orderAct.clickSearchButton();
			
			logger.info("把采购单号存入缓存中,单号id={}",getNum());
			setMemVal(Constant.PURCHASE_ID, getNum());
			//=2s
			mergeOrderAct.pause(2);
			Assert.assertEquals("已合单".trim(),orderAct.getOrderStatus());
			logger.info("wofo合单的测试用例执行结束 ！");
		}catch (AssertionError e) {
			logger.error("Constant.TEST_PLATFORM_SINGLEHE__FIAL ", e);
			Assert.fail(Constant.TEST_PLATFORM_SINGLEHE__FIAL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_PLATFORM_SINGLEHE__FIAL, e);
			throw new TestNGException("Constant.TEST_PLATFORM_SINGLEHE__FIAL >> "
					+ e.getMessage(), e);
		}
	}
	/**
	 * 获取{友情提示中}的数字用来输入期货数量  1:代表友情提示  2：代表支付号
	 * 
	 * @return
	 */
	private String getNum() {
		String regEx = "[^0-9]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(orderAct.getOrderNum());
		return m.replaceAll("").substring(0,18);
	}
}
