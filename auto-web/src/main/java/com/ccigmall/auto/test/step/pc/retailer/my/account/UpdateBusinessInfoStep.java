package com.ccigmall.auto.test.step.pc.retailer.my.account;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.account.BusinessInfoAct;
import com.ccigmall.auto.test.act.pc.retailer.my.account.PrivilegeManagementAct;
import com.ccigmall.auto.test.act.pc.retailer.my.account.UserManagementAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
/**
 * 
 * @author  chenjingli
 * 我的鑫网-我的订单-账户中心-修改商户信息
 */
public class UpdateBusinessInfoStep extends RetailerStep{
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UpdateBusinessInfoStep.class);
	
	static  BusinessInfoAct act;
	@Test(description = "我的鑫网-我的订单-账户中心-修改商户信息")
	public void testAddNewRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new BusinessInfoAct(driver);
			
			logger.info("retailer 我的鑫网-我的订单-账户中心-修改商户信息测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击商户信息
			act.clickMerchantManagement();
			//随机生成8位数字
			String number = String.valueOf(new Random().nextInt()).substring(1, 9);
			//输入手机
			act.typePhone("132"+number);
			//输入email
			act.typeEmail(number+"@qq.com");
			//输入fax
			act.typeFax("010-"+number);
			//点击修改按钮
			act.clickUpdButton();
			//获得手机的value值
			String phoneValue = act.getPhoneValue();
			
			act.pause(1);
			Assert.assertEquals("132"+number,phoneValue);
			logger.info("retailer我的鑫网-我的订单-账户中心-修改商户信息测试用例执行结束！");
		} catch (AssertionError e) {
			act.failScreenShot(Constant.TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL);
			logger.error("Constant.TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			act.failScreenShot(Constant.TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL);
			logger.error(Constant.TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL >> "
					+ e.getMessage(), e);
		}
	}
}
