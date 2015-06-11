package com.ccigmall.auto.test.step.pc.supplier.user.authority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.user.authority.AuthorityManagerAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * @author zhaixiaoyue
 * 供应商-用户中心-权限管理
 */
public class AuthorityManagerStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AuthorityManagerStep.class);
	protected AuthorityManagerAct ama;
	
	@Test(description = "用户中心-权限管理")
	public void AuthorityManager(){
		try {
			ama=new AuthorityManagerAct(driver);
			//点击用户中心
			ama.clickUserCenter();
			//点击权限管理
			ama.clickUserRole();			
			//点击添加角色
			ama.clickAddBtn();
			//输入角色名称
			setMemVal(Constant.SUPPLIERROLE_NAME, ama.typeSupplierName("role"));			
			//点击添加按钮
			ama.clickAddSubmmit();	
			//点击刚添加的角色
			String rolename = getMemVal(Constant.SUPPLIERROLE_NAME);
			if(ama.clickRecordSel(rolename)){
				//修改角色权限
				ama.clickCheck();
				
				//修改角色名称
				ama.clickRecordmodify(rolename);
				setMemVal(Constant.SUPPLIERROLE_NAME, ama.typeMdSupplierName("rolen"));			
				//点击修改按钮
				ama.clickEditBtn();	
			}else{
				throw new TestNGException("没有找到刚添加的角色！");
			}
			
									
		} catch (AssertionError e) {
			logger.error("用户中心-权限管理 ", e);
			Assert.fail("用户中心-权限管理 >> " + e.getMessage());
			ama.failScreenShot("assert user authority manager fail");
		} catch (Exception e) {
			logger.error("用户中心-权限管理", e);
			ama.failScreenShot("user authority manager fail");
			throw new TestNGException("用户中心-权限管理 >> " + e.getMessage(), e);
		}
		
	}	

	
	
	
	
}
