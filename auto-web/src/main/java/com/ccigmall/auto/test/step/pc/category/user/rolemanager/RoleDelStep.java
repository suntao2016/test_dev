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
 *   角色管理-删除角色
 */
public class RoleDelStep extends CategoryStep{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RoleDelStep.class);
	
	protected RoleManagerAct rma;
	
	@Test(description = "角色管理-删除角色")
	public void RoleDel(){
		try {
			rma=new RoleManagerAct(driver);
			//点击角色管理
			rma.clickUserManage();
			rma.clickRolemanger();				
			//输入搜索角色名
			String rolename = getMemVal(Constant.CATEGORYROLE_NAME);
			rma.typeRoleName(rolename);	
			//点击搜索按钮
			rma.clickSearchButton();							
			//点击角色删除按钮
			rma.clickDelRoleBtn();
			//输入搜索角色名
			rma.typeRoleName(rolename);	
			//点击搜索按钮
			rma.clickSearchButton();	
						
			//判断是否删除成功
			if(rma.isDelUser()){
				logger.info("删除角色成功");
			}else{
				logger.info("删除角色失败");
				throw new TestNGException("删除角色失败！");
			}
						
		} catch (AssertionError e) {
			logger.error("角色删除 ", e);
			Assert.fail("角色删除 >> " + e.getMessage());
			rma.failScreenShot("assert role delete fail");
		} catch (Exception e) {
			logger.error("角色管理", e);
			rma.failScreenShot("role delete fail");
			throw new TestNGException("角色删除 >> " + e.getMessage(), e);
		}
		
	}	

}
