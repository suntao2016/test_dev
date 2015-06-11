/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.user.authority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.user.authority.AuthorityManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
import com.ccigmall.auto.test.step.pc.dealer.user.RegisterStep;

/**
 * @author dengshuhai 
 * <p>经销商删除角色
 * 
 */
public class RoleDelStep extends DealerStep {

	/**
	 * 用户中心-权限管理 删除角色
	 */
	protected AuthorityManageAct authorityManageAct;

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	/**
	 * 经销商 用户中心-权限管理-经销商删除角色
	 * 
	 * @throws Exception
	 */
	@Test(description="经销商 用户中心-权限管理-删除角色")
	public void testAuthorityDelete() throws Exception{
		try {
			//获取缓存中的角色名称
			String roleName = this.getMemVal(Constant.DEALER_ROLE);
			authorityManageAct = new AuthorityManageAct(driver);
			logger.info("dealer  经销商 用户中心-权限管理-删除角色-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//用户中心
			authorityManageAct.UserCenter();
			//点击权限管理
			authorityManageAct.clickRoleManage();
			//点击要删除的角色名称 之后的删除
			authorityManageAct.clickDelButton(roleName);
			//点击弹窗确定
			authorityManageAct.clickDelConfirm();
			logger.info("dealer  经销商 用户中心-权限管理-删除角色-测试用例执行结束，测试用例名称是：{}", getClass().getName());
		} catch (AssertionError e) {
			logger.error("dealer authority delete role failed ", e);
			//失败时截图
			authorityManageAct.failScreenShot("dealer authority delete role failed ");
			Assert.fail("dealer authority delete role failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer authority delete role failed", e);
			//失败时截图
			authorityManageAct.failScreenShot("dealer authority delete role failed");
			throw new Exception("dealer authority delete role failed >> " + e.getMessage(),
					e);
		}
	}
	
}
