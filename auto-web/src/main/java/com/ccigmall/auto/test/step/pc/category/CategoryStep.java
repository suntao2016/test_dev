/**
 * 
 */
package com.ccigmall.auto.test.step.pc.category;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;

import com.ccigmall.auto.test.act.pc.category.LoginAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.SettingStep;

/**
 * @author jianping.gao
 * 类别系统
 */
public class CategoryStep extends SettingStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CategoryStep.class);

	/**
	 * 类别系统登录动作
	 */
	protected LoginAct loginAct;

	/**
	 * 
	 */
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.CATEGORY);
		categoryLogin();
	}

	/**
	 * 类别系统登录
	 * 
	 * @throws Exception
	 */
	public void categoryLogin() {
		try {		
			loginAct = new LoginAct(driver);		
			
			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					//刷新
					loginAct.refresh();
				}
				loginAct.confirmAlert(false);
				loginAct.pause(3);
				//输入登录名
				loginAct.enterLoginName(loginName);
				//输入密码
				loginAct.enterPassword(password);
				//点击登录
				loginAct.clickSubmit();
				//判断是否登录成功
				if ("CIGGMALL后台类目管理平台".equals(driver.getTitle())) {
					break;
				}
			}
			loginAct.pause(2);
		} catch (AssertionError e) {
			logger.error("pc category login fail ", e);
			throw new AssertionError("pc category login fail >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("pc category login fail ", e);
//			throw new TestNGException("pc category login fail >> " + e.getMessage(),
//					e);
		}
	}
}
