package com.ccigmall.auto.test.step.pc.supplier.user.usermanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.user.usermanager.UserManagerAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * @author zhaixiaoyue
 * 供应商-用户中心-用户管理
 */
public class UserDelStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserDelStep.class);
	protected UserManagerAct uma;
	
	@Test(description = "用户中心-用户管理删除")
	public void UserManager(){
		try {
			uma=new UserManagerAct(driver);
			//点击用户中心
			uma.clickUserCenter();
			//点击用户管理
			uma.clickUserManager();				
			
			//删除用户
			String name=getMemVal(Constant.SUPPLIERUSER_NAME);
			if(!uma.deleteUser(name)){
				throw new  TestNGException("删除用户失败-可能是用户添加失败或已经不存在了");
			}
			
			
		} catch (AssertionError e) {
			logger.error("用户管理-删除 ", e);
			Assert.fail("用户管理 >> " + e.getMessage());
			uma.failScreenShot("assert user delete fail");
		} catch (Exception e) {
			logger.error("用户管理", e);
			uma.failScreenShot("user delete fail");
			throw new TestNGException("用户管理 >> " + e.getMessage(), e);
		}
		
	}	

	
	
	
	
}
