package com.ccigmall.auto.test.step.pc.retailer.registered;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.registered.RegisteredAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.SettingStep;

/**
 * 
 * @author chenjingli
 * 
 *         零售商注册
 */
public class RetailerRegisteredStep extends SettingStep {
	/**
	 * slf4j
	 */
	private final static String MOB = "132";
	private final static String E_MAIL = "@qq.com";
	private final static String PWD = "qqqqqq";
	private final static Logger logger = LoggerFactory
			.getLogger(RetailerRegisteredStep.class);
	protected RegisteredAct registeredAct;

	private List<WebDriver> webDrivers = new ArrayList<WebDriver>();

	/**
	 * 
	 */
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.RETAILER);
	}

	@Override
	@AfterMethod
	public void afterMethod() {
		super.afterMethod();
		if (webDrivers.size() > 0) {
			for (WebDriver webDriver : webDrivers) {
				webDriver.quit();
			}
		}

	}

	/**
	 * 零售商注册带验证码
	 * 
	 * @throws IOException
	 */
	@Test(description = "零售商注册")
	public void testRegistered() throws InterruptedException, IOException {
		
		try {
			/**
			 * 初始化所需对象
			 */
			registeredAct = new RegisteredAct(driver);

			logger.info("点击零售商首页的免费注册");
			registeredAct.clickFreeRegistered();
			logger.info("点击零售商注册图片");
			registeredAct.clickRetailer();
			
			logger.info("零售商注册测试用例执行开始：{}", getClass().getName());
			String kaptcha = this.registerKaptcha();
			registeredAct.typeVerificationCode(kaptcha);
			this.regRetail();
			logger.info("点击注册按钮");
			registeredAct.clickRegistButton();
			logger.info("开始判读阿奴是否注册成功");
			registeredAct.pause(2);
			Assert.assertEquals(
					"正在注册，敬请等待！".trim(),
					this.driver.findElement(
							By.xpath("//span[text()='正在注册，敬请等待！']")).getText());
			logger.info("零售商注册成功.......");
		} catch (AssertionError e) {
			logger.error(Constant.TEST_RETAILER_REGIST_RETAILER__FIAL, e);
			throw new AssertionError(
					Constant.TEST_RETAILER_REGIST_RETAILER__FIAL);
		} catch (NoSuchElementException e) {
			logger.error("不能定位元素", e);
			throw new NoSuchElementException("不能定位元素");
		}
	}

	/**
	 * 零售商注册
	 */
	public void regRetail() {
		try {
			/**
			 * 零售商注册公司信息 ---start
			 */
			logger.info("输入经验主体名称");
			registeredAct.typeCompanyName("test零售商经营主体");

			logger.info("输入营业执照注册编号");
			registeredAct.typeCompanynumber(randomNumbers());

			logger.info("输入商户名称");
			String merchant = "商户" + randomNumbers();
			registeredAct.typeMerchantName(merchant);
			setMemVal(Constant.RETAILER_MERCHANT, merchant);

			logger.info("输入商户编号");
			registeredAct.typeBusinessNumber(randomNumbers());

			logger.info("输入商户地址");
			registeredAct.typeCompanyAddr("test商户地址");

			logger.info("输入经营者姓名");
			registeredAct.typeContactName("test经营者姓名");

			logger.info("输入经营者证件编号");
			registeredAct.typeContactNumber(randomNumbers());

			logger.info("输入经营者手机号码");
			registeredAct.typeMob(MOB + randomNumbers());

			logger.info("输入经营者email");
			registeredAct.typeEmail(randomNumbers() + E_MAIL);

			logger.info("输入经营者传真");
			registeredAct.typeFax(randomNumbers());
			registeredAct.pause(2);
			// 上传 Y.jpg
			logger.info("上传图片开始");
			registeredAct.clickUploadButton();
			/**
			 * 零售商注册公司信息 ---end
			 */
			logger.info("输入账户信息--用户名");
			String loginName = "用户" + randomNumbers();
			registeredAct.typeRegName(loginName);
			setMemVal(Constant.LOGINNAME, loginName);

			logger.info("输入账户信息--密码");
			registeredAct.typePassword(PWD);

			logger.info("再次输入账户信息--密码");
			registeredAct.typeConfirmPwd(PWD);
		} catch (AssertionError e) {
			logger.error("注册输入信息有误{}", e);
		} catch (Exception e) {
			logger.error("键盘输入键值无效{}", e);
		}
	}

	/**
	 * PC retailer register kaptcha
	 * 
	 * @return
	 * @throws IOException
	 */
	public String registerKaptcha() throws IOException {
		String kaptcha = null;

		for (int j = 0; j < 5; j++) {
			registeredAct.pause(3);
			if (j != 0) {
				webDrivers.add(driver);
				autoMap.remove(Constant.RETAILER);
				super.beforeMethod(Constant.RETAILER);
				registeredAct = new RegisteredAct(driver);
				registeredAct.open(baseUrl);
				logger.info("点击零售商首页的免费注册");
				registeredAct.clickFreeRegistered();
				logger.info("点击零售商注册图片");
				registeredAct.clickRetailer();
				logger.info("零售商注册测试用例执行开始：{}", getClass().getName());

			}
			String key = this.driver.manage().getCookieNamed("JSESSIONID")
					.getValue()
					+ "kapt";
			for (int i = 0; i < 3; i++) {
				kaptcha = getMemVal(key, null);
				if (kaptcha == null || "".equals(kaptcha)) {
					logger.info("key={}   ||   kaptcha={}", key, kaptcha);
					continue;
				} else {
					logger.info("key={}   ||   kaptcha={}", key, kaptcha);
					return kaptcha;
				}
			}
			if (kaptcha == null || "".equals(kaptcha)) {
				Constant.memcachedClient.shutdown();
				Constant.memcachedClient = null;
				continue;
			}
		}

		if(kaptcha==null){
			throw new TestNGException("验证码是空值");
		}
		return kaptcha;
	}

	private String randomNumbers() {
		return new SimpleDateFormat("MMddhhmm").format(new Date());
	}

}
