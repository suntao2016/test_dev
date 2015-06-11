package com.ccigmall.auto.test.step.pc.retailer.my.account;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.account.PrivilegeManagementAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
/**
 * 
 * @author  chenjingli
 * 我的鑫网-我的订单-账户中心-新增角色step
 */
public class AddNewRoleStep extends RetailerStep {
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AddNewRoleStep.class);
	
	protected PrivilegeManagementAct act;
	@Test(description = "我的鑫网-我的订单-账户中心-新增角色")
	public void testAddNewRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new PrivilegeManagementAct(driver);
			
			logger.info("retailer 我的鑫网-我的订单-账户中心-新增角色测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击权限管理
			act.clickAuthorityManagement();
			//点击创建新角色
			act.clickCreateRole();
			
			act.pause(1);
			String newRoleName = "t"+String.valueOf(new Random().nextInt()).substring(1, 5);
			//输入角色名称
			act.typeRoleName(newRoleName);
			
			act.pause(1);
			//点击确定按钮
			act.clickSubmitButton();
			act.pause(1);
			//点击确定按钮
			act.clickSubmitButton();
			
			act.pause(2);
			
			String addedName = act.getLastRole();
			Assert.assertEquals(addedName, newRoleName);
			
			logger.info("retailer我的鑫网-我的订单-账户中心-新增角色测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_ADD_NEW_ROLE_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_ADD_NEW_ROLE_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_RETAILER_ADD_NEW_ROLE_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_ADD_NEW_ROLE_FAIL >> "
					+ e.getMessage(), e);
		}
	}
}
