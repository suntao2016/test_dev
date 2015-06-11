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
 * 我的鑫网-我的订单-账户中心-修改角色step
 */
public class UpdatePrivilegeRoleStep extends RetailerStep {
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UpdatePrivilegeRoleStep.class);
	
	protected PrivilegeManagementAct act;
	
	@Test(description = "我的鑫网-我的订单-账户中心-删除角色")
	public void testUpdatePrivilegeRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new PrivilegeManagementAct(driver);
			
			logger.info("retailer 我的鑫网-我的订单-账户中心-修改角色测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击权限管理
			act.clickAuthorityManagement();
			
			int number = act.getRoleList();
			if(0 != number){
				//默认修改第一个角色
				act.clickUpdateFirst();
				act.pause(1);
			}else{
				logger.debug("没有可修改角色，先去创建个角色吧 详细请见：retailer-add-new-rolename.xml");
				Assert.fail("没有可修改角色，先去创建个角色吧 ");
			}
			
			//获得未修改之前的角色名称
			String beforeRoleName = act.getFirstRole();
			String newRoleName = "";
			for (int i = 0; i < 5; i++) {
				//随机生成一要修改的角色的名称
				newRoleName = "t"+String.valueOf(new Random().nextInt()).substring(1, 5);
				if(!newRoleName.equals(beforeRoleName)){
					//输入角色名称
					act.typeUpdRoleName(newRoleName);
					act.pause(1);
					//点击确定按钮
					act.clickUpdSubmitButton();
					//点击确定按钮
					//act.clickUpdSubmitButton();
					break;
				}else{
					continue;
				}
			}
			
			act.pause(1);
			
			Assert.assertNotEquals(beforeRoleName, newRoleName);
			
			logger.info("retailer我的鑫网-我的订单-账户中心-修改角色测试用例执行结束！");
		} catch (AssertionError e) {
			
			logger.error("Constant.TEST_RETAILER_UPDATE_ROLE_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_UPDATE_ROLE_FAIL + " >> "
					+ e.getMessage());
			
		} catch (Exception e) {
			
			logger.error(Constant.TEST_RETAILER_UPDATE_ROLE_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_UPDATE_ROLE_FAIL >> "
					+ e.getMessage(), e);
		}
	}
}
