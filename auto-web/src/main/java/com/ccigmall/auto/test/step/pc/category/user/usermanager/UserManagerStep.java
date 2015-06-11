package com.ccigmall.auto.test.step.pc.category.user.usermanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.user.usermanager.UserManagerAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author zhaixiaoyue
 *   用户管理-添加管理用户
 */
public class UserManagerStep extends CategoryStep{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserManagerStep.class);
	
	protected UserManagerAct uma;
	
	@Test(description = "用户管理-添加修改用户")
	public void UserManage(){
		try {
			uma=new UserManagerAct(driver);
			//点击用户管理
			uma.clickUserManage();
			uma.clickUsermanger();
			//点击添加用户
			uma.clickAddButton();
			//输入用户名
			setMemVal(Constant.CATEGORYUSER_NAME, uma.typeAddUserName("cug")); 
			//输入密码
			uma.typeAddPassword("qqqqqq");
			//输入真实姓名
			uma.typeAddRealName("testregress");
			//输入电话
			uma.typeAddPhone("13333333333");
			//输入邮箱
			uma.typeAddEmail("test@163.com");
			//选择角色
			String rolename = getMemVal(Constant.CATEGORYROLE_NAME);
			uma.typeAddRoleSlt(rolename);
			//点击保存按钮	
			uma.clickAddSubmit();		
			//输入搜索用户名
			String username = getMemVal(Constant.CATEGORYUSER_NAME);
			uma.typeUserName(username);	
			//点击搜索按钮
			uma.clickSearchButton();
			//判断是否添加成功
			if(uma.isExistUser(username)){
				logger.info("添加用户成功");
			}else{
				logger.info("添加用户失败");
				throw new TestNGException("添加用户失败");
			}
			//点击用户修改按钮
			uma.clickEditUserBtn();
			//输入修改的邮箱
			uma.typeEditUserEmail("test@qq.com");
			//点击保存按钮
			uma.clickAddSubmit();
			//输入搜索用户名
			uma.typeUserName(username);	
			//点击搜索按钮
			uma.clickSearchButton();		
			//点击修改密码按钮
			uma.clickEditPwdBtn();	
			//输入新密码
			uma.typeEditPwd("123456");
			//点击保存按钮
			uma.clickAddSubmit();			
			
		} catch (AssertionError e) {
			logger.error("用户管理 ", e);
			Assert.fail("用户管理 >> " + e.getMessage());
			uma.failScreenShot("assert user manage fail");
		} catch (Exception e) {
			logger.error("用户管理", e);
			uma.failScreenShot("user manage fail");
			throw new TestNGException("用户管理 >> " + e.getMessage(), e);
		}
		
	}	

}
