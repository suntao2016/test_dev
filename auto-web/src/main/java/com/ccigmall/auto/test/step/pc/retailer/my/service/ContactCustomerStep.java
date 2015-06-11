package com.ccigmall.auto.test.step.pc.retailer.my.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.service.ContactCustomerAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
import com.ccigmall.auto.test.step.pc.retailer.my.ordercenter.PayFinalPaymentStep;
/**
 * 
 * @author chenjingli
 * 我的鑫网-客户服务-联系客服
 */
public class ContactCustomerStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(PayFinalPaymentStep.class);
	protected ContactCustomerAct customerAct;
	@Test(description = "我的鑫网-客户服务-联系客服")
	public void testContactCustomer()  {
		try {
			/**
			 * 初始化对象
			 */
			customerAct = new ContactCustomerAct(driver);
			logger.info("retailer 我我的鑫网-客户服务-联系客服 测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			customerAct.clickMyCcigmall();
			//点击联系客服
			customerAct.clickContactCustomerService();
			//选择反馈类型1,2
			customerAct.selectFeedbackType("管理相关");
			customerAct.pause(1);
			customerAct.selectFeedbackType2("紧急");
			customerAct.typeFeedbackInfo("this is a test info!");
			//输入反馈联系方式
			String strInfo = "132"+String.valueOf(new Random().nextInt()).substring(1, 9);
			customerAct.typeContentWay(strInfo);
			//点击提交按钮
			customerAct.clickSubmit();
			customerAct.pause(1);
			//点击我的反馈记录
			customerAct.clickMyFeedback();
			customerAct.pause(1);
			//获取我的反馈记录内容 并与生成的信息作对比
			Assert.assertEquals(strInfo, customerAct.getContentInfo());
			logger.info("retailer我的鑫网-客户服务-联系客服测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_CONTACT_CUSTOMER_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_CONTACT_CUSTOMER_FAIL + " >> "
					+ e.getMessage());
		} catch (TestNGException e) {
			logger.error(Constant.TEST_RETAILER_CONTACT_CUSTOMER_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_CONTACT_CUSTOMER_FAIL >> "
					+ e.getMessage(), e);
		}
	}
}
