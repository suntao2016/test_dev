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
 * 我的鑫网-我的订单-账户中心-用户管理-新增用户step
 */
public class AddUserStep extends RetailerStep{
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AddUserStep.class);
	
	protected UserManagementAct act;
	@Test(description = "我的鑫网-我的订单-账户中心-用户管理-新增用户")
	public void testAddNewRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new UserManagementAct(driver);
			
			logger.info("retailer 我的鑫网-我的订单-账户中心-用户管理-新增用户测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击用户管理
			act.clickUserManagement();
			//点击创建新用户
			act.clickCreateNewUser();
			//随机生成6位数字
			String newUserName = "u"+String.valueOf(new Random().nextInt()).substring(1, 7);
			//输入新用户名称
			act.typeUserName(newUserName);
			//输入密码
			act.typePwd("111111");
			//再次输入密码
			act.typePwdAgain("111111");
			//选择角色，默认选择第一个
			this.ifRolesIsZero();
			//点击添加按钮
			act.clickAddSubmit();
			
			//点击添加按钮
			//act.clickAddSubmit();
			act.pause(1);
			String lastRoleName = act.getLastRoleName();
			Assert.assertEquals(newUserName, lastRoleName);
			logger.info("retailer我的鑫网-我的订单-账户中心-用户管理-新增用户测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_ADD_USER_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_ADD_USER_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_RETAILER_ADD_USER_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_ADD_USER_FAIL >> "
					+ e.getMessage(), e);
		}
	}
	private void ifRolesIsZero(){
		int roles = act.getSelectRoles();
		if(0!=roles){
			act.selectRole(1);
		}else{
			logger.error("没有要选择的角色名称，先去创建个角色吧详见：retailer-add-rolename.xml");
			Assert.fail("没有要选择的角色名称，先去创建个角色吧");
		}
	}
}
