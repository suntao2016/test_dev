package com.ccigmall.auto.test.step.pc.dealer.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.service.CustomerServiceAct;
import com.ccigmall.auto.test.act.pc.dealer.user.RegisterAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;

/**
 * 
 * @author dengshuhai 
 * <p>经销商-联系客服-提交投诉
 * @since 2015-1-29
 * @version 1.0
 */
public class ComplaintAddStep extends DealerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ComplaintAddStep.class);
	// 经销商-联系客服-act
	private CustomerServiceAct customerServiceAct;

	/**
	 * 经销商-联系客服-提交投诉
	 * 
	 * @throws Exception
	 */
	@Test(description = "dealer 经销商-联系客服-提交投诉")
	public void testDealerRegister() throws Exception  {
		try {
			customerServiceAct = new CustomerServiceAct(driver);
			// 设置输入注册参数 前缀
			Date date = new Date();
			// 时间格式yyMMddHHmm
			SimpleDateFormat sd_yyMMddHHmm = new SimpleDateFormat("yyMMddHHmm");
			// 时间戳 后缀
			String timeStamp = sd_yyMMddHHmm.format(date);
 			logger.info("dealer 经销商-联系客服-提交投诉-测试用例执行开始，测试用例名称是：{}", getClass()
					.getName());
 			//点击联系客服
 			customerServiceAct.clickContactService();
 			//点击我要反馈
 			customerServiceAct.clickFeedback();
 			//填写涉及订单
 			customerServiceAct.inputInvolvingOrder("涉及订单"+timeStamp);
 			//投诉级别
 			customerServiceAct.selectComplaintType(2);
 			//投诉类型
 			customerServiceAct.selectComplaintLevel(2);
 			//投诉内容
 			customerServiceAct.inputComplaintContent("投诉内容"+timeStamp);
 			//联系方式
 			customerServiceAct.inputContactWay(timeStamp+"@"+timeStamp+".com");
 			//点击提交反馈
 			customerServiceAct.clickSubmitComplaint();	
 			//
 			customerServiceAct.clickHandled();
 			//
 			customerServiceAct.clickUnhandled();
 			//
 			customerServiceAct.pause(100);
			logger.info("dealer 经销商-联系客服-提交投诉-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("dealer ComplaintAdd failed ", e);
			customerServiceAct.failScreenShot("dealer ComplaintAdd failed");
			Assert.fail("dealer ComplaintAdd failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer ComplaintAdd failed ", e);
			customerServiceAct.failScreenShot("dealer ComplaintAdd failed");
			Assert.fail("dealer ComplaintAdd failed  >> " + e.getMessage());
			throw new Exception("dealer ComplaintAdd failed  >> " + e.getMessage(),
					e);
		}

	}

}
