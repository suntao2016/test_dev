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
 *   用户管理-删除用户
 */
public class UserDelStep extends CategoryStep{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserDelStep.class);
	
	protected UserManagerAct uma;
	
	@Test(description = "用户管理-删除用户")
	public void UserDel(){
		try {
			uma=new UserManagerAct(driver);
			//点击用户管理
			uma.clickUserManage();
			uma.clickUsermanger();					
			//输入搜索用户名
			String username = getMemVal(Constant.CATEGORYUSER_NAME);
			uma.typeUserName(username);	
			//点击搜索按钮
			uma.clickSearchButton();			
			//点击用户删除按钮
			uma.clickDelUserBtn();
			//输入搜索用户名
			uma.typeUserName(username);	
			//点击搜索按钮
			uma.clickSearchButton();	
						
			//判断是否删除成功
			if(uma.isDelUser()){
				logger.info("删除用户成功");
			}else{
				logger.info("删除用户失败");
				throw new TestNGException("删除用户失败！");
			}
						
		} catch (AssertionError e) {
			logger.error("用户删除 ", e);
			Assert.fail("用户删除 >> " + e.getMessage());
			uma.failScreenShot("assert user delete fail");
		} catch (Exception e) {
			logger.error("用户管理", e);
			uma.failScreenShot("user delete fail");
			throw new TestNGException("用户删除 >> " + e.getMessage(), e);
		}
		
	}	

}
