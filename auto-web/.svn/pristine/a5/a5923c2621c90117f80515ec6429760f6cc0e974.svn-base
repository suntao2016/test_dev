/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.user.authority;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.user.authority.AuthorityManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
import com.ccigmall.auto.test.step.pc.dealer.user.RegisterStep;

/**
 * @author dengshuhai 
 * <p>经销商修改角色
 * 
 */
public class RoleModifyStep extends DealerStep {

	/**
	 * 用户中心-权限管理 修改角色
	 */
	protected AuthorityManageAct authorityManageAct;

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	/**
	 * 经销商 用户中心-权限管理-经销商修改角色
	 * 
	 * @throws Exception
	 */
	@Test(description="经销商 用户中心-权限管理-修改角色")
	public void testAuthorityModify() throws Exception{
		try {
			//获取缓存中的角色名称
			String roleName = this.getMemVal(Constant.DEALER_ROLE);
			authorityManageAct = new AuthorityManageAct(driver);
			logger.info("dealer  经销商 用户中心-权限管理-修改角色-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//用户中心
			authorityManageAct.UserCenter();
			//点击权限管理
			authorityManageAct.clickRoleManage();
			//点击要修改的角色名称 之后的修改
			authorityManageAct.clickModify(roleName);
			
			roleName = roleName.replace("自动化", "修改后");
			//输入修改后的角色名称
			authorityManageAct.inputModifyRole(roleName);
			//点击保存
			authorityManageAct.clicktModifyRoleConfirm();
			//点击要修改的角色名称
			authorityManageAct.clickAddedRole(roleName);
			//点击全选
			authorityManageAct.clickCheckAll();
			//点击确定
			authorityManageAct.clickConfirm();
			//角色名称存入缓存
			this.setMemVal(Constant.DEALER_ROLE, roleName);
			logger.info("dealer  经销商 用户中心-权限管理-修改角色-测试用例执行结束，测试用例名称是：{}", getClass().getName());
		} catch (AssertionError e) {
			logger.error("dealer authority modify role failed ", e);
			//失败时截图
			authorityManageAct.failScreenShot("dealer authority modify role failed ");
			Assert.fail("dealer authority modify role failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer authority modify role failed", e);
			//失败时截图
			authorityManageAct.failScreenShot("dealer authority modify role failed");
			throw new Exception("dealer authority modify role failed >> " + e.getMessage(),
					e);
		}
	}
	
}
