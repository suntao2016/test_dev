/**
 * 
 */
package com.ccigmall.auto.test.step;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.utils.DataProvider;
import com.ccigmall.auto.test.utils.Selenium;

/**
 * @author jianping.gao
 * 
 */
public class SettingStep extends ConstantStep {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SettingStep.class);

	public SettingStep() {
		if (selenium == null) {
			selenium = new Selenium();
		}
		if (autoMap == null || autoMap.size() == 0) {
			autoMap = new HashMap<String, Map<String, Object>>();
		}
	}

	/**
	 * test before
	 * 
	 * @param args
	 */
	@BeforeSuite
	@Parameters({ "baseUrl", "loginname", "password" })
	public void beforeSuite(String baseUrl, String loginname, String password) {
		this.baseUrl = baseUrl;
		this.loginName = loginname;
		this.password = password;
	}

	/**
	 * test after
	 * 
	 * @throws IOException
	 */
	@AfterSuite(alwaysRun = true)
	public void afterSuite() throws IOException {
		DataProvider.shutDown(Constant.memcachedClient);
		quitBrowser();
	}

	/**
	 * 
	 */
	@BeforeTest
	public void beforeTest() {

	}

	/**
	 * 
	 */
	@AfterTest(alwaysRun = true)
	public void afterTest() {

	}

	/**
	 * 
	 * @param sys
	 */
	@BeforeClass
	public void beforeClass() {

	}

	/**
	 * 
	 */
	@AfterClass(alwaysRun = true)
	public void afterClass() {

	}

	/**
	 * 
	 */

	public void beforeMethod(String sys) {
		initReady(sys);
		printCaseInfo();
		initCommon();
		// 打开首页
		driver.get(baseUrl);
	}

	/**
	 * 
	 */
	@AfterMethod
	public void afterMethod() {
		String singleton = getMemVal(Constant.SINGLETON);
		if ("true".equals(singleton)) {
			quitBrowser();
		}
	}

	/**
	 * 参数文件
	 * 
	 * @param key
	 * @return
	 */
	public String getVal(String key) {
		return bundle.getString(key);
	}

	/**
	 * 退出浏览器
	 */
	private void quitBrowser() {
		Iterator<String> it = autoMap.keySet().iterator();
		while (it.hasNext()) {
			Map<String, Object> map = autoMap.get(it.next());
			driver = (WebDriver) map.get(Constant.DRIVER);
			if (driver != null) {
				driver.quit();
			}
		}
		autoMap.clear();
	}

	/**
	 * 加载case的准备信息
	 */
	private void initReady(String sys) {
		// 初始化case执行前信息
		if (autoMap.get(sys) == null) {
			selenium.init(sys, autoMap);
		}
		// 获取本次case驱动
		driver = (WebDriver) autoMap.get(sys).get(Constant.DRIVER);
		// 获取执行方式
		String sw = getMemVal(Constant.SWITCH);
		if ("true".equals(sw)) {
			// 获取首页的url
			baseUrl = (String) autoMap.get(sys).get(Constant.BASEURL);
			// 登录名
			loginName = (String) autoMap.get(sys).get(Constant.LOGINNAME);
			// 登录密码
			password = (String) autoMap.get(sys).get(Constant.PASSWWORD);
		}
	}

	/**
	 * 获取pad的支付验证码
	 * 
	 * @return
	 */
	public String getPadCode(String mobile, String useId) {
		String code = null;
		for (int i = 0; i < 10; i++) {
			code = getMemVal("ccigmall-web-retailer_mobileCode" + mobile
					+ useId, null);
			if (code == null) {
				continue;
			} else {
				break;
			}
		}
		return code;
	}
}
