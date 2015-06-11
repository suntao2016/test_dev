/**
 * 
 */
package com.ccigmall.auto.test.step.pc.platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.ccigmall.auto.test.act.pc.platform.LoginAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.SettingStep;

/**
 * @author jianping.gao
 * 平台
 */
public class PlatformStep extends SettingStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(PlatformStep.class);

	/**
	 * 平台登录动作
	 */
	protected LoginAct loginAct;

	/**
	 * 
	 */
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.PLATFORM);	
		platformLogin();
	}
	/**
	 * wofe平台登录
	 * 
	 * @throws Exception
	 */
	public void platformLogin() {
		try {
			//初始化loginAct
			loginAct = new LoginAct(driver);
			//判断是否在系统首页
			if ("Welcome_鑫网易商".equals(driver.getTitle())) {
				return;
			}		
			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					//刷新
					loginAct.refresh();
				}
				//输入登录名
				loginAct.enterLoginName(loginName);
				//输入密码
				loginAct.enterPassword(password);
				//点击登录
				loginAct.clickSubmit();
				//判断是否登录成功
				if ("Welcome_鑫网易商".equals(driver.getTitle())) {
					break;
				}
			}
			loginAct.pause(2);
		} catch (AssertionError e) {
			logger.error("pc platform login fail ", e);
			Assert.fail("pc platform login fail >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("pc platform login fail ", e);
//			throw new TestNGException("pc platform login fail >> " + e.getMessage(),
//					e);
		}
	}

}
