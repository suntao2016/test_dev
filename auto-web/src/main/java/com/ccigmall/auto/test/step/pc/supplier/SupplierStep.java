/**
 * 
 */
package com.ccigmall.auto.test.step.pc.supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.BeforeMethod;

import com.ccigmall.auto.test.act.pc.supplier.LoginAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.SettingStep;

/**
 * @author jianping.gao
 * 供应商
 */
public class SupplierStep extends SettingStep {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierStep.class);

	/**
	 * 供应商登录动作
	 */
	protected LoginAct loginAct;

	/**
	 * 
	 */
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.SUPPLIER);
		supplierLogin();
	}


	/**
	 * 
	 * @throws Exception
	 */
	public void supplierLogin() {
		try {
			//初始化loginAct
			loginAct = new LoginAct(driver);
			//判断是否在系统首页
			if ("Welcome_鑫网易商".equals(driver.getTitle())) {
				return;
			}	
			
			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					loginAct.refresh();
				}
				//输入登录名
				loginAct.enterLoginName(loginName);
				//输入密码
				loginAct.enterPassword(password);
				//获取验证码
				String captcha = getMemVal(loginAct.getUUID() + "kaptcha", null);
				//输入验证码
				loginAct.enterKaptcha(captcha);
				//点击登录
				loginAct.clickSubmit();
				//判断是否登录成功
				if ("Welcome_鑫网易商".equals(driver.getTitle())) {
					break;
				}
			}
			if(!"Welcome_鑫网易商".equals(driver.getTitle())){
				throw new TestNGException("pc supplier login fail");
			}
			loginAct.pause(2);
		} catch (AssertionError e) {
			logger.error("pc supplier login fail ", e);
			Assert.fail("pc supplier login fail >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("pc supplier login fail ", e);
//			throw new TestNGException("pc supplier login fail >> " + e.getMessage(),
//					e);
		}
	}

}
