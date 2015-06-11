/**
 * 
 */
package com.ccigmall.auto.test.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.constant.Constant;

/**
 * @author jianping.gao
 * 
 */
public class Selenium {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(Selenium.class);

	/**
	 * 火狐浏览器
	 */
	private static String FIREFOX_BROWSER = null;
	/**
	 * IE浏览器
	 */
	private static String IE_BROWSER = null;
	/**
	 * chrome浏览器
	 */
	private static String CHROME_BROWSER = null;
	/**
	 * 超时时间
	 */
	private static String timeout = null;
	/**
	 * 基本路径
	 */
	private static String basePath = null;
	/**
	 * 环境
	 */
	private String env = null;
	/**
	 * ResourceBundle
	 */
	private static ResourceBundle bundle = null;

	/**
	 * WebDriver
	 */
	WebDriver driver = null;

	/**
	 * 初始化
	 */
	public Selenium() {
		if (Constant.memcachedClient == null) {
			bundle = DataProvider.initProperty("selenium");
			// 环境
			env = bundle.getString("env");

			// memcathed
			Constant.memcachedClient = DataProvider.initMemcachedClient(env);
			logger.info("加载 {}  memcathed", env);

			// 环境 放入缓存
			DataProvider.setMemcacheVal(Constant.memcachedClient, Constant.ENV,
					env);
			logger.info("环境 放入缓存  = {}", env);

			// 浏览器类型
			DataProvider.setMemcacheVal(Constant.memcachedClient,
					Constant.BROWSER, bundle.getString("browser"));
			logger.info("浏览器类型= {}", bundle.getString("browser"));

			// 浏览器个数
			String singleton = bundle.getString("singleton");
			DataProvider.setMemcacheVal(Constant.memcachedClient,
					Constant.SINGLETON, singleton);
			if ("true".equals(singleton)) {
				logger.info("单一浏览器 {}", singleton);
			} else {
				logger.info("多浏览器 {}", singleton);
			}

			// 测试标志
			DataProvider.setMemcacheVal(Constant.memcachedClient,
					Constant.SWITCH, bundle.getString("switch"));
			logger.info("测试标志  = {}", bundle.getString("switch"));

			// 基本路径
			basePath = System.getProperty("user.dir").replaceAll("\\\\", "/")
					+ "/src/main/resources/";

			// 火狐浏览器路径
			FIREFOX_BROWSER = bundle.getString("selenium.browser.firefox");
			// chrome浏览器路径
			CHROME_BROWSER = basePath
					+ (String) bundle
							.getString("selenium.browser.chrome.driver");
			// IE浏览器路径
			IE_BROWSER = basePath
					+ (String) bundle
							.getString("selenium.browser.ie.driver.32");

			// 超时时间
			timeout = (String) bundle.getString("selenium.timeout");
			logger.info("超时时间  = {}", timeout);
			
			//储存经销商的名称
			DataProvider.setMemcacheVal(Constant.memcachedClient,
					Constant.DEALER_NAME, bundle.getString("dealer.name"));
			
			// 判断是回归还是单体
			if (!"true".equals(bundle.getString("switch"))) {
				/**
				 * init 配置文件
				 */
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.PRODUCT_ID, bundle.getString("productId"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.PRODUCT_NAME, bundle.getString("productName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.PAYID, bundle.getString("payId"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.ORDERID, bundle.getString("orderId"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.PURCHASE_ID, bundle.getString("purchaseId"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.COUPON_ID, bundle.getString("couponId"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.ACTRULE_NAME, bundle.getString("actruleName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.COUPON_NAME, bundle.getString("couponName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.BRAND_NAME, bundle.getString("brandName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.SUBBRAND_NAME, bundle.getString("subBrandName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.PRODUCTLINEMODLE, bundle.getString("productlineModle"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.CATEGORY_NAME, bundle.getString("categoryName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.DISPLAY_CATEGORY_NAME, bundle.getString("dispCategoryName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.CATEGORYUSER_NAME, bundle.getString("categoryuserName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.CATEGORYROLE_NAME, bundle.getString("categoryroleName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.SUPPLIERUSER_NAME, bundle.getString("supplieruserName"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.SUPPLIERUSER_NAME, bundle.getString("subSupplier"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.SUPPLIERUSER_NAME, bundle.getString("supplierRole"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.DEALER_USER, bundle.getString("dealerUser"));
				DataProvider.setMemcacheVal(Constant.memcachedClient,
						Constant.DEALER_ROLE, bundle.getString("dealerRole"));
			
			} else {
				bundle = DataProvider.initProperty("env/" + env + "/base");
			}
		}
	}

	/**
	 * 初始化系统的基本信息
	 * 
	 * @param sys
	 */
	public void init(String sys, Map<String, Map<String, Object>> autoMap) {
		Map<String, Object> map = autoMap.get(sys);
		// 判断此系统的基本信息是否存在
		if (map == null || map.size() == 0) {
			map = new HashMap<String, Object>();
			String browser = (String) DataProvider.getMemcacheVal(
					Constant.memcachedClient, Constant.BROWSER, false);
			// 默认是火狐浏览器
			if (browser == null) {
				browser = "2";
			}
			map.put(Constant.DRIVER, getBrowser(Integer.parseInt(browser)));
			// 判断是回归还是单体
			String sw = (String) DataProvider.getMemcacheVal(
					Constant.memcachedClient, Constant.SWITCH, false);
			if ("true".equals(sw)) {
				map.put(Constant.BASEURL,
						bundle.getString(sys + "." + Constant.BASEURL));
				map.put(Constant.LOGINNAME,
						bundle.getString(sys + "." + Constant.LOGINNAME));
				map.put(Constant.PASSWWORD,
						bundle.getString(sys + "." + Constant.PASSWWORD));
			}
			autoMap.put(sys, map);
		}
	}
	
	/**
	 * 
	 * @param browser
	 *            1:ie 2:firefox 3:chrome
	 * @return
	 */
	private WebDriver getBrowser(int browser) {
		switch (browser) {
		case 1:
			initIE();
			break;
		case 2:
			initFirefox();
			break;
		case 3:
			initChrome();
			break;
		default:
			initFirefox();
			break;
		}
		driver.manage().timeouts()
				.implicitlyWait(Integer.parseInt(timeout), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * init chrome
	 */
	private void initChrome() {
		if (CHROME_BROWSER == null) {
			CHROME_BROWSER = basePath + "browser/chromedriver.exe";
		}
		System.setProperty("webdriver.chrome.driver", CHROME_BROWSER);
		driver = new ChromeDriver();
		logger.info("启动浏览器   = {}", CHROME_BROWSER);
	}

	/**
	 * init firefox
	 */
	private void initFirefox() {
		if (FIREFOX_BROWSER == null) {
			FIREFOX_BROWSER = basePath + "browser/IEDriverServer.exe";
		}
		try {
			File pathToFirefoxBinary = new File(FIREFOX_BROWSER);
			FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
			FirefoxProfile firefoxProfile = new FirefoxProfile();
			firefoxProfile.addExtension(new File(basePath
					+ "browser/firebug-1.9.0.xpi"));
			firefoxProfile.addExtension(new File(basePath
					+ "browser/firepath-0.9.7-fx.xpi"));
			firefoxProfile.setPreference("extensions.firebug.currentVersion",
					"1.9.2");
			firefoxProfile.setPreference("extensions.firepath.currentVersion",
					"0.9.7");
			driver = new FirefoxDriver(firefoxbin, firefoxProfile, null);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("", e);
		}
		logger.info("启动浏览器   = {}", FIREFOX_BROWSER);
	}

	/**
	 * init IE
	 */
	private void initIE() {
		if (IE_BROWSER == null) {
			IE_BROWSER = basePath + "browser/IEDriverServer.exe";
		}
		System.setProperty("webdriver.ie.driver", IE_BROWSER);
		InternetExplorerDriverService service = InternetExplorerDriverService
				.createDefaultService();
		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
				"about:blank");
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,
				true);
		capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,
				true);
		capabilities.setCapability(
				InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		driver = new InternetExplorerDriver(service, capabilities);
		logger.info("启动浏览器   = {}", IE_BROWSER);
	}
}
