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
public class UserManagerStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserManagerStep.class);
	protected UserManagerAct uma;
	
	@Test(description = "用户中心-用户管理")
	public void UserManager(){
		try {
			uma=new UserManagerAct(driver);
			//点击用户中心
			uma.clickUserCenter();
			//点击用户管理
			uma.clickUserManager();				
			//点击创建新用户
			uma.clickAddUserBtn();
			//输入用户名
			setMemVal(Constant.SUPPLIERUSER_NAME, uma.typeAddUserName("newuser"));			
			//输入密码
			uma.typeAddUserPwd("1234567");
			//选择角色
			String role = getMemVal(Constant.SUPPLIERROLE_NAME);
			uma.selectAddUserRole(role);
			//点击确定按钮
			uma.clickAddSubmmit();
			//点击修改按钮
			String name = getMemVal(Constant.SUPPLIERUSER_NAME);
			if(uma.clickRecordmodify(name)){
				//修改密码
				uma.typeModifyPwd("123456");
				//点击确定按钮
				uma.clickModifySubmit();
			}else{
				throw new TestNGException("没有找到刚添加的用户，可能是添加失败了");
			}
						
		} catch (AssertionError e) {
			logger.error("用户中心-用户管理 ", e);
			Assert.fail("用户中心-用户管理 >> " + e.getMessage());
			uma.failScreenShot("assert usermanager fail");
		} catch (Exception e) {
			logger.error("用户中心-用户管理", e);
			uma.failScreenShot("usermanager fail");
			throw new TestNGException("用户中心-用户管理 >> " + e.getMessage(), e);
		}
		
	}	

	
	
	
	
}
