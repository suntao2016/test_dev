package com.ccigmall.auto.test.step.pc.supplier.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.register.SupplierRegisterAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.SettingStep;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * @author zhaixiaoyue
 *  创建商品
 */
public class SupplierRegisterStep extends SettingStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierStep.class);

	protected SupplierRegisterAct registerAct;

	/**
	 * 供应商注册
	 */
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod(Constant.SUPPLIER);

	}

	/**
	 * 打开注册页面
	 * 
	 * @throws InterruptedException
	 */
	@Test(description = "供应商注册")
	public void Register()   throws Exception  {
		try {
		logger.info("点击免费注册");
		registerAct = new SupplierRegisterAct(driver);
		registerAct.clickRegister();
		// 获取验证码
		String kaptcha = null;
		while (true) {
			kaptcha = getMemVal(registerAct.getUUID() + "kaptcha", null);
			registerAct.pause(1);
			if (kaptcha != null) {
				break;
			}
			registerAct.refresh();
		}
		// 输入验证码
		registerAct.enterKaptcha(kaptcha);
		//输入供应商名称
		setMemVal(Constant.SUPPLIER_MERCHANT,registerAct.enterCompanyName("zhaitest"));
		//选择商户类型
		registerAct.selectCompanyType("贸易商");
		//选择国家地区
		registerAct.selectCompanyarea("德国");
		//输入公司地址
		registerAct.enterCompanyaddr("意大利米兰");
		//输入联系人
		registerAct.enterContactname("zhaicon");
		//输入手机号
		registerAct.enterTele("12333333333");
		//输入邮箱
		registerAct.enterMailbox("12@qq.com");
		//上传资质图片
		registerAct.enterFileField();
		//选择商品类别
		registerAct.enterMercgr();
		//输入商品品牌
		registerAct.enterMerbrand("LV,老人头");
		//用户名
		String regName=registerAct.enterRegName("zhaitest1");
		//密码
		registerAct.enterPwd("123aaa");
		//密码确认
		registerAct.enterPwdRepeat("123aaa");
		//点击提交
		registerAct.clickRegistsubmit(regName);
		logger.info("供应商注册成功.......");
	
	} catch (AssertionError e) {
		logger.error("dealer register failed ", e);
		 registerAct.failScreenShot("Assert supplier register failed");
		Assert.fail("dealer register failed  >> " + e.getMessage());
	} catch (Exception e) {
		logger.error("dealer register failed ", e);
	    registerAct.failScreenShot("supplier register failed");
		Assert.fail("dealer register failed  >> " + e.getMessage());
		throw new Exception("dealer register failed  >> " + e.getMessage(),
				e);
	}
}
}
	
