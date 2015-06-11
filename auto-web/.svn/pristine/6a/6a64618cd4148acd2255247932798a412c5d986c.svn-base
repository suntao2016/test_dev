/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.user.usermanage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.user.usermanage.UserManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
import com.ccigmall.auto.test.step.pc.dealer.user.RegisterStep;

/**
 * @author dengshuhai 
 * <p>经销商-用户管理-修改用户
 * 
 */
public class UserModifyStep extends DealerStep {

	/**
	 * 用户中心-用户管理-修改用户
	 */
	protected UserManageAct userManageAct;

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	/**
	 * 经销商 用户中心-用户管理-修改用户
	 *  
	 * @throws Exception
	 */
	@Test(description="经销商 用户中心-用户管理-修改用户")
	public void testUserModify() throws Exception{
		try {
			userManageAct = new UserManageAct(driver);
			//获取缓存中的用户名称
			String dealName = this.getMemVal(Constant.DEALER_USER);
			//获取缓存中的角色名称
			String roleName = this.getMemVal(Constant.DEALER_ROLE);
			//dealName = "dengshuhai";
			logger.info("dealer  经销商 用户中心-用户管理-修改用户-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//用户中心
			userManageAct.UserCenter();
			//点击用户管理
			userManageAct.clickUserManage();
			//点击修改新用户
			userManageAct.selectModifyByUserName(dealName);
			//修改密码
			userManageAct.inputModifyPassword("123456aa");
			//修改确认密码
			userManageAct.inputModifyRePassword("123456aa");
			//修改选择角色
			userManageAct.selectModifyRole(roleName);
			//点击修改
			userManageAct.clickModifySaveButton();
			//删除 弹窗 确定
		logger.info("dealer  经销商 用户中心-用户管理-修改用户-测试用例执行结束，测试用例名称是：{}", getClass().getName());
		} catch (AssertionError e) {
			logger.error("dealer modify user  failed ", e);
			userManageAct.failScreenShot("dealer modify user  failed ");
			Assert.fail("dealer modify user  failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer modify user  failed", e);
			userManageAct.failScreenShot("dealer modify user  failed ");
			throw new Exception("dealer modify user  failed >> " + e.getMessage(),
					e);
		}
	}
	
}
