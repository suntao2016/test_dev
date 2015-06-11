package com.ccigmall.auto.test.step.pc.retailer.my.account;


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
 * 我的鑫网-我的订单-账户中心-删除角色step
 */
public class DelPrivilegeRoleStep extends RetailerStep {
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(DelPrivilegeRoleStep.class);
	
	protected PrivilegeManagementAct act;
	
	@Test(description = "我的鑫网-我的订单-账户中心-删除角色")
	public void testDelPrivilegeRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new PrivilegeManagementAct(driver);
			
			logger.info("retailer 我的鑫网-我的订单-账户中心-删除角色测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击权限管理
			act.clickAuthorityManagement();
			String beforeRoleName = act.getLastRole();
			int number = act.getRoleList();
			
			if(0 != number){
				//默认删除第一个角色
				act.clickDeleteLast();
				act.pause(1);
			}else{
				logger.debug("没有可删除角色，先去创建个角色吧 详细请见：retailer-add-new-rolename.xml");
				Assert.fail("没有可删除角色，先去创建个角色吧 ");
			}
			//点击确定按钮
			act.clickDelSure();
			act.pause(1);
			
			String afterRoleName = act.getLastRole();
			
			Assert.assertNotEquals(beforeRoleName, afterRoleName);
				
			logger.info("retailer我的鑫网-我的订单-账户中心-删除角色测试用例执行结束！");
		} catch (AssertionError e) {
			
			logger.error("Constant.TEST_RETAILER_DEL_ROLE_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_DEL_ROLE_FAIL + " >> "
					+ e.getMessage());
			
		} catch (Exception e) {
			
			logger.error(Constant.TEST_RETAILER_DEL_ROLE_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_DEL_ROLE_FAIL >> "
					+ e.getMessage(), e);
		}
	}
}
