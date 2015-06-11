package com.ccigmall.auto.test.step.pc.dealer.user;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.user.RegisterAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;

/**
 * 
 * @author dengshuhai 
 * <p>经销商注册 
 * @since 2015-1-8
 * @version 1.0
 */
public class RegisterStep extends DealerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisterStep.class);
	// 经销商注册动作
	private RegisterAct registerAct;

	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.DEALER);
	
	}
	/**
	 * 经销商注册
	 * 
	 * @throws Exception
	 */
	@Test(description = "dealer 经销商注册")
	public void testDealerRegister() throws Exception  {
		try {
			registerAct = new RegisterAct(driver);
			// 设置输入注册参数 前缀
			String text = "自动化";
			Date date = new Date();
			// 时间格式yyMMddHHmm
			SimpleDateFormat sd_yyMMddHHmm = new SimpleDateFormat("yyMMddHHmm");
			// 时间格式yyyy-MM-dd
			SimpleDateFormat sd_yyyy_MM_dd = new SimpleDateFormat("yyyy-MM-dd");
			// 时间戳 后缀
			String timeStamp = sd_yyMMddHHmm.format(date);
			// 有效期开始时间
			String startDate = sd_yyyy_MM_dd.format(date);
			// +1年
			date.setYear(date.getYear() + 1);
			// 有效期截止时间
			String endDate = sd_yyyy_MM_dd.format(date);
 			logger.info("dealer 经销商注册-测试用例执行开始，测试用例名称是：{}", getClass()
					.getName());
			registerAct.register();
			// 切换浏览器
			registerAct.switchToWindow(driver.getTitle());
			registerAct.refresh();
			// 获取验证码
			String captcha = null;
			while (true) {
				captcha = getMemVal(registerAct.getVcode() + "kapt", null);
				registerAct.pause(1);
				if (captcha != null) {
					break;
				}
				registerAct.refresh();
			}
			// 输入公司名称
			registerAct.inputCompanyName(text + timeStamp); 
			// 输入法人姓名
			registerAct.inputLegalName(text);
			// 法人证件号码
			registerAct.inputLegalIdNum("13102220" + timeStamp);
			// 联系人姓名
			registerAct.inputContactName(text);
			// 手机
			registerAct.inputMobileNo("181" + timeStamp.substring(2));
			// 邮箱
			registerAct.inputMailbox(timeStamp + "@cigmall.cn");
			// 公司地址
			registerAct.inputCompanyAddr(text);
			// 固定电话
			registerAct.inputContactTele("010-88888888");
			// 邮政编码
			registerAct.inputPostalCode("100000");
			// 营业执照
			registerAct.uploadBusiLicense(registerAct.getPath());
			registerAct.pause(1);
			// 营业执照年检日期
			// 税务登记证
			registerAct.uploadTaxregistcerti(registerAct.getPath());
			registerAct.pause(1);
			// 开户许可证
			registerAct.uploadAccOpenlicense(registerAct.getPath());
			registerAct.pause(1);
			// 一般纳税人资格证明
			registerAct.uploadTaxpayqualicerti(registerAct.getPath());
			registerAct.pause(1);
			// 法人代表身份证明文件
			registerAct.uploadFlegalcerti(registerAct.getPath());
			registerAct.pause(1);
			// 对外贸易经营者备案登记表
			registerAct.uploadFforeigntrade(registerAct.getPath());
			registerAct.pause(1);
			// 进出口货物收发货人报关注册登记证
			registerAct.uploadFforeigntrade1(registerAct.getPath());
			registerAct.pause(1);
			// 货物收发货人报关注册登记证有效日期
			registerAct.inputRegistrationTime(endDate);
			// 食品流通许可证
			// registerAct.uploadFforeigntrade2(registerAct.getPath());
			//registerAct.pause(1);
			// 食品流通许可证有效期限Start
			// registerAct.inputStarttime(startDate);
			// 食品流通许可证有效期限End
			// registerAct.inputEndtime(endDate);
			// 进口食品/化妆品收货人检验检疫备案登记证
			// registerAct.uploadFforeigntrade3(registerAct.getPath());
			// registerAct.pause(1);
			// 酒类经营许可证/酒类流通备案登记表
			 //registerAct.uploadFforeigntrade4(registerAct.getPath());
			// registerAct.pause(1);
			// 保健食品卫生许可证（经营许可证)
			// registerAct.uploadFforeigntrade5(registerAct.getPath());
			// registerAct.pause(1);
			// 用户名
			registerAct.inputRegName("autoTest" + timeStamp);
			// 密码
			registerAct.inputPasswor("password" + timeStamp);
			// 确认密码
			registerAct.inputConfirmPasswor("password" + timeStamp);
			registerAct.pause(1);
			// 输入验证码
			registerAct.inputVcode(captcha);
			// 立即注册
			registerAct.clickRegisterButton();
			registerAct.pause(3);
			//
			registerAct.switchToWindow(driver.getTitle());
			
			//判断注册信息是否提交成功
			Assert.assertEquals(driver.getTitle().trim(), "经销商-注册成功");
			// 用户名存入缓存
			this.setMemVal(Constant.DEALER_USER, "autoTest" + timeStamp);
			//公司名称存入缓存
			this.setMemVal(Constant.DEALER_NAME, text + timeStamp);
			logger.info("dealer 经销商注册-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("dealer register failed ", e);
			 registerAct.failScreenShot("Assert dealer register failed");
			Assert.fail("dealer register failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer register failed ", e);
		    registerAct.failScreenShot("dealer register failed");
			Assert.fail("dealer register failed  >> " + e.getMessage());
			throw new Exception("dealer register failed  >> " + e.getMessage(),
					e);
		}

	}

}
