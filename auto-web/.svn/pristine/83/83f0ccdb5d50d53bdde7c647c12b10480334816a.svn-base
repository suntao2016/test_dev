package com.ccigmall.auto.test.step.pc.retailer.my.account;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.account.UserManagementAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;
/**
 * 
 * @author  chenjingli
 * 我的鑫网-我的订单-账户中心-用户管理-删除用户step
 */
public class DelUserStep extends RetailerStep{
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(DelUserStep.class);
	
	protected UserManagementAct act;
	@Test(description = "我的鑫网-我的订单-账户中心-用户管理-删除用户")
	public void testAddNewRole()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new UserManagementAct(driver);
			
			logger.info("reailer 我的鑫网-我的订单-账户中心-用户管理-删除用户测试用例执行开始，测试用例名称是：{}", getClass().getName());
			/**
			 * 通过点击第一个checkbox去删除
			 */
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击用户管理
			act.clickUserManagement();
			//判断是否有册数数据
			if(1==act.getNoUserPromptInfo()){
				this.errorInfo();
			}
			//获得用户列表
			int roles = act.getUserList();
			if(1==roles){
				//选择第一个测试用户去删除
				act.clickLastDel();
				//点击弹出框确定
				act.clickDelSure2();
				//=1s
				act.pause(1);
				Assert.assertEquals(1, act.getNoUserPromptInfo());
			}else{
				/**
				 * 通过点击第一个删除按钮去删除
				 */
				String beforeDelName2 = act.getFirstUserName();
				//选择第一个测试用户去删除
				act.clickLastDel();
				//点击弹出框确定
				act.clickDelSure2();
				//=1s
				act.pause(1);
				
				String afterDelName2 = act.getLastUserName();
				
				Assert.assertEquals(beforeDelName2,afterDelName2);
			}
			
		
			logger.info("retailer我的鑫网-我的订单-账户中心-用户管理-删除用户测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_DEL_USER_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_DEL_USER_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_RETAILER_DEL_USER_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_DEL_USER_FAIL >> "
					+ e.getMessage(), e);
		}
	}
	private void errorInfo(){
		logger.error("请增加测试数据请跑增加用户用例：retailer-add-user.xml");
		Assert.fail("没有要删除的测试数据，请增加测试数据");
	}
}
