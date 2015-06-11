/**
 * 
 */
package com.ccigmall.auto.test.step.pc.dealer.user.usermanage;

import java.text.SimpleDateFormat;
import java.util.Date;
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
 * <p>经销商-用户管理-删除用户
 * 
 */
public class UserDelStep extends DealerStep {

	/**
	 * 用户中心-用户管理-删除用户
	 */
	protected UserManageAct userManageAct;

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	/**
	 * 经销商 用户中心-用户管理-删除用户
	 *  
	 * @throws Exception
	 */
	@Test(description="经销商 用户中心-用户管理-删除用户")
	public void testUserDele() throws Exception{
		try {
			userManageAct = new UserManageAct(driver);
			//获取缓存中的角色名称
			String dealName = this.getMemVal(Constant.DEALER_USER);
		
			logger.info("dealer  经销商 用户中心-用户管理-删除用户-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//用户中心
			userManageAct.UserCenter();
			//点击用户管理
			userManageAct.clickUserManage();
			//点击删除新用户
			userManageAct.selectDelByUserName(dealName);
			//删除 弹窗 确定
			userManageAct.clickDelAlertConfirm();
			userManageAct.clickDelAlertConfirm();
			logger.info("dealer  经销商 用户中心-用户管理-删除用户-测试用例执行结束，测试用例名称是：{}", getClass().getName());
		} catch (AssertionError e) {
			logger.error("dealer delete user  failed ", e);
			userManageAct.failScreenShot("dealer delete user  failed ");
			Assert.fail("dealer deelte user  failed >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer delete user  failed", e);
			userManageAct.failScreenShot("dealer delete user  failed ");
			throw new Exception("dealer delete user  failed >> " + e.getMessage(),
					e);
		}
	}
	
}
