/**
 * 
 */
package com.ccigmall.auto.test.step.pc.retailer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.ccigmall.auto.test.act.pc.retailer.IndexAct;
import com.ccigmall.auto.test.act.pc.retailer.LoginAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.SettingStep;

/**
 * @author jianping.gao
 * 
 *         零售商
 */
public class RetailerStep extends SettingStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RetailerStep.class);

	/**
	 * 零售商登录动作
	 */
	protected LoginAct loginAct;

	/**
	 * 零售商首页
	 */
	protected IndexAct indexAct;

	/**
	 * 
	 */
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.RETAILER);
		retailerLogin();
	}

	/**
	 * 零售商登录
	 * 
	 * @throws Exception
	 */
	public void retailerLogin() {
		try {
			// 初始化loginAct
			loginAct = new LoginAct(driver);
			indexAct = new IndexAct(driver);
			// 判断系统是否登录
			if (!indexAct.isExistLoginAct()) {
				return;
			} else {
				indexAct.clickLogin();
			}

			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					// 刷新
					loginAct.refresh();
				}
				// 输入登录名
				if(getMemVal(Constant.LOGINNAME)!=null){
					loginName=getMemVal(Constant.LOGINNAME);
				}
				
				loginAct.enterLoginName(loginName);
				// 输入密码
				loginAct.enterPassword(password);
				// 点击登录
				loginAct.clickSubmit();
				// 判断是否登录成功
				if ("鑫网易商-首页".equals(driver.getTitle())) {
					break;
				}
			}
			loginAct.pause(2);
		} catch (AssertionError e) {
			logger.error("pc retailer login fail ", e);
			Assert.fail("pc retailer login fail >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("pc retailer login fail ", e);
			// throw new TestNGException("pc retailer login fail >> " +
			// e.getMessage(),
			// e);
		}
	}

}
