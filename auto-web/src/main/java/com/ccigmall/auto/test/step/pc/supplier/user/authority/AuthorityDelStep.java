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
public class AuthorityDelStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AuthorityDelStep.class);
	protected AuthorityManagerAct ama;
	
	@Test(description = "用户中心-权限管理-删除角色")
	public void AuthorityManager(){
		try {
			ama=new AuthorityManagerAct(driver);
			//点击用户中心
			ama.clickUserCenter();
			//点击权限管理
			ama.clickUserRole();			
			//点击刚添加的角色
			String rolename = getMemVal(Constant.SUPPLIERROLE_NAME);			
			//删除角色
			ama.clickDelBtn(rolename);
			
			if(ama.searchRecord(rolename)>0){
				throw new TestNGException("删除角色失败！");
			}
			
		} catch (AssertionError e) {
			logger.error("用户中心-权限管理 ", e);
			Assert.fail("用户中心-权限管理 >> " + e.getMessage());
			ama.failScreenShot("assert user authority delete fail");
		} catch (Exception e) {
			logger.error("用户中心-权限管理", e);
			ama.failScreenShot("user authority delete fail");
			throw new TestNGException("用户中心-权限管理 >> " + e.getMessage(), e);
		}
		
	}	

	
	
	
	
}
