package com.ccigmall.auto.test.step.pc.retailer.my.account;

import java.util.Random;

import netscape.javascript.JSException;

import org.openqa.selenium.JavascriptExecutor;
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
 * 我的鑫网-我的订单-账户中心-为角色分配权限step
 */
public class AddPrivilegeForRoleStep  extends RetailerStep{
	/* 
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AddPrivilegeForRoleStep.class);
	
	protected PrivilegeManagementAct act;
	@Test(description = "我的鑫网-我的订单-账户中心-为角色分配权限")
	public void testAddPrivilege()  {
		try {
			/**
			 * 初始化对象
			 */
			act = new PrivilegeManagementAct(driver);
			
			logger.info("retailer 我的鑫网-我的订单-账户中心-为角色分配权限测试用例执行开始，测试用例名称是：{}", getClass().getName());
			// 点击我的鑫网
			act.clickMyCcigmall();
			//点击权限管理
			act.clickAuthorityManagement();
			//获得角色列表个数
			int number = act.getRoleList();
			
			if(0 != number){
				//点击最后一个角色名称
				act.clickLastRole();
				act.pause(1);
			}else{
				logger.debug("没有可删除角色，先去创建个角色吧 详细请见：retailer-add-new-rolename.xml");
				Assert.fail("没有可删除角色，先去创建个角色吧 ");
			}
			//点击优惠券checkbox
			act.clickTestCheckbox();
			//点击确定
			act.clickSureButton();
			//再点几最后一个角色名称开始验证是否增加角色成功
			act.clickLastRole();
			//=2s
			act.pause(2);
			this.verifyChecked();
			logger.info("retailer我的鑫网-我的订单-账户中心-为角色分配权限测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_ADD_PRIVILEGE_FOR_ROLE_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_ADD_PRIVILEGE_FOR_ROLE_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_RETAILER_ADD_PRIVILEGE_FOR_ROLE_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_ADD_PRIVILEGE_FOR_ROLE_FAIL >> "
					+ e.getMessage(), e);
		}
	}
	
	private void verifyChecked(){
		JavascriptExecutor jsScript = (JavascriptExecutor) driver;
		String jsString = "var roles = document.getElementsByName('menus'); var getChecked;" +
				"for(var i=0;i<roles.length;i++){" +
				"getChecked =  roles[i].getAttribute('checked'); " +
				"}" +
				"return getChecked;";
		String returnResults = (String) jsScript.executeScript(jsString);
		logger.info("返回值结果：{}",returnResults);
		if("checked".equals(returnResults)){
			Assert.assertFalse(false);
		}else{
			Assert.fail("角色没有分配成功，请检查");
			Assert.assertFalse(true);
		}
	} 
}
