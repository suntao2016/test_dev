package com.ccigmall.auto.test.step.pc.retailer.my.account;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.account.PrivilegeManagementAct;
import com.ccigmall.auto.test.act.pc.retailer.my.account.UserManagementAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
/**
 * 
 * @author  chenjingli
 * 我的鑫网-我的订单-账户中心-用户管理-删除用户step
 */
public class UpdateUserStep extends RetailerStep{
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UpdateUserStep.class);
	
	protected UserManagementAct act;
	@Test(description = "我的鑫网-我的订单-账户中心-用户管理-修改用户")
	public void testAddNewRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new UserManagementAct(driver);
			
			logger.info("reailer 我的鑫网-我的订单-账户中心-用户管理-修改用户测试用例执行开始，测试用例名称是：{}", getClass().getName());
			/**
			 * 通过点击第一个checkbox去删除
			 */
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击用户管理
			act.clickUserManagement();
			//点击最后一个修改
			act.clickLastUpd();
			//输入密码
			act.typeUpdatePwd("111111");
			//再次输入密码
			act.typeUpdatePwdAgain("111111");
			//选择角色
			act.selectUpdateRole(1);
			//点击修改
			act.clickUpdate();
			
			logger.info("retailer我的鑫网-我的订单-账户中心-用户管理-修改用户测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_UPDATE_USER_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_UPDATE_USER_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_RETAILER_UPDATE_USER_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_UPDATE_USER_FAIL >> "
					+ e.getMessage(), e);
		}
	}
}
