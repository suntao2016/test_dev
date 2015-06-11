/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.user.authority;

import java.text.SimpleDateFormat;
import java.util.Date;

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
 * <p>经销商创建新角色
 * 
 */
public class RoleAddStep extends DealerStep {

	/**
	 * 用户中心-权限管理创建新角色
	 */
	protected AuthorityManageAct authorityManageAct;

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	/**
	 * 经销商 用户中心-权限管理-创建新角色
	 * 
	 * @throws Exception
	 */
	@Test(description="经销商 用户中心-权限管理-创建新角色")
	public void testAuthorityAdd() throws Exception{
		try {
			String roleName = "自动化角色"+new SimpleDateFormat("yyMMddHHmm").format(new Date());
			authorityManageAct = new AuthorityManageAct(driver);
			logger.info("dealer  经销商 用户中心-权限管理-创建新角色-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//用户中心
			authorityManageAct.UserCenter();
			//点击权限管理
			authorityManageAct.clickRoleManage();
			//点击添加新角色
			authorityManageAct.clickAddNewRole();
			//输入新角色的名称
			authorityManageAct.inputRoleName(roleName);
			//点击确定
			authorityManageAct.clickAlertAddConfirm();
			//点击已添加
			authorityManageAct.clickAddedRole(roleName);
			//点击全选
			authorityManageAct.clickCheckAll();
			//点击确定
			authorityManageAct.clickConfirm();
			//角色名称存入缓存
			this.setMemVal(Constant.DEALER_ROLE, roleName);
			logger.info("dealer  经销商 用户中心-权限管理-创建新角色-测试用例执行结束，测试用例名称是：{}", getClass().getName());
		} catch (AssertionError e) {
			logger.error("dealer authority addrole failed ", e);
			//失败时截图
			authorityManageAct.failScreenShot("dealer authority addrole failed ");
			Assert.fail("dealer authority addrole failed   >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer authority addrole failed  ", e);
			//失败时截图
			authorityManageAct.failScreenShot("dealer authority addrole failed ");
			throw new Exception("dealer authority addrole failed   >> " + e.getMessage(),
					e);
		}
	}
	
}
