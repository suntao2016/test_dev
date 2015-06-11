/**
 * 
 */
package com.ccigmall.auto.test.step.pad.retailer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	}
}
