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
 * <p>经销商-用户管理-创建用户
 * 
 */
public class UserAddStep extends DealerStep {

	/**
	 * 用户中心-用户管理-创建用户
	 */
	protected UserManageAct userManageAct;

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	/**
	 * 经销商 用户中心-用户管理-创建用户
	 * 
	 * @throws Exception
	 */
	@Test(description="经销商 用户中心-用户管理-创建用户")
	public void testUserAdd() throws Exception{
		try {
			userManageAct = new UserManageAct(driver);
			//获取缓存中的角色名称
			String roleName = this.getMemVal(Constant.DEALER_ROLE);
			//用户名
			String userName = "自动化名称"+new SimpleDateFormat("yyMMddHHmm").format(new Date());
			logger.info("dealer  经销商 用户中心-用户管理-创建用户-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//用户中心
			userManageAct.UserCenter();
			//点击用户管理
			userManageAct.clickUserManage();
			//点击添加新用户
			userManageAct.clickAddUser();
			//输入新用户
			userManageAct.inputUserName(userName);
			//输入密码
			userManageAct.inputPassword("123456aa");
			//输入确认密码
			userManageAct.inputRePassword("123456aa");
			//选择角色
			userManageAct.selectRole(roleName);
			//点击确定
			userManageAct.clickSaveButton();
			userManageAct.pause(2);
			//用户存入缓存
			this.setMemVal(Constant.DEALER_USER, userName);
			logger.info("dealer  经销商 用户中心-用户管理-创建用户-测试用例执行结束，测试用例名称是：{}", getClass().getName());
		} catch (AssertionError e) {
			logger.error("dealer adduser  failed ", e);
			userManageAct.failScreenShot("dealer adduser  failed ");
			Assert.fail("dealer adduser failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer adduser failed ", e);
			userManageAct.failScreenShot("dealer adduser  failed ");
			throw new Exception("dealer adduser failed  >> " + e.getMessage(),
					e);
		}
	}
	
}
