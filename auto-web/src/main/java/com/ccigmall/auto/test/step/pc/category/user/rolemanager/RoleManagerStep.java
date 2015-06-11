package com.ccigmall.auto.test.step.pc.category.user.rolemanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.user.rolemanager.RoleManagerAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author zhaixiaoyue
 *   角色管理-添加管理角色
 */
public class RoleManagerStep extends CategoryStep{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RoleManagerStep.class);
	
	protected RoleManagerAct rma;
	
	@Test(description = "角色管理-添加修改角色")
	public void RoleManage(){
		try {
			rma=new RoleManagerAct(driver);
			//点击角色管理
			rma.clickUserManage();
			rma.clickRolemanger();
			//点击添加角色
			rma.clickAddButton();
			//输入角色名
			setMemVal(Constant.CATEGORYROLE_NAME, rma.typeAddRoleName("rcg")); 			
			//点击保存按钮	
			rma.clickAddSubmit();		
			//输入搜索角色名
			String rolename = getMemVal(Constant.CATEGORYROLE_NAME);
			rma.typeRoleName(rolename);	
			//点击搜索按钮
			rma.clickSearchButton();	
			//判断是否添加成功
			if(rma.isExistRole(rolename)){
				logger.info("添加角色成功");
			}else{
				logger.info("添加角色失败");
				throw new TestNGException("添加角色失败");
			}
			
			//点击角色修改按钮
			rma.clickEditRoleBtn();
			//输入修改的邮箱
			setMemVal(Constant.CATEGORYROLE_NAME, rma.typeEditRole("rcg2"));
			//点击保存按钮
			rma.clickAddSubmit();
			//输入搜索角色名
			rolename = getMemVal(Constant.CATEGORYROLE_NAME);
			rma.typeRoleName(rolename);	
			//点击搜索按钮
			rma.clickSearchButton();		
			//点击授权按钮
			rma.clickAuthorizeBtn();	
			//授权操作
			rma.Authorize();
			//点击保存按钮			
			
		} catch (AssertionError e) {
			logger.error("角色管理 ", e);
			Assert.fail("角色管理 >> " + e.getMessage());
			rma.failScreenShot("assert role manage fail");
		} catch (Exception e) {
			logger.error("角色管理", e);
			rma.failScreenShot("role manage fail");
			throw new TestNGException("角色管理 >> " + e.getMessage(), e);
		}
		
	}	

}
