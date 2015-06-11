package com.ccigmall.auto.test.act.pc.supplier.register;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.LoginAct;
import com.ccigmall.auto.test.page.pc.supplier.register.SupplierRegisterPage;

public class SupplierRegisterAct extends LoginAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierRegisterAct.class);

	private static SupplierRegisterPage registerPage;

	public SupplierRegisterAct(WebDriver driver) {
		super(driver);
		registerPage = new SupplierRegisterPage(driver);
	}

	/**
	 * img url
	 */
	private String img = "\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg\"\"";

	/**
	 * 输入公司名称
	 * 
	 * @param companyname
	 * 
	 */
	public String enterCompanyName(String companyname) {
		logger.info("输入图片地址  = {}", img);
		type(registerPage.getCompanyname(), img);
		robotCopy();
		companyname = companyname
				+ new SimpleDateFormat("yyMMddHHmmss").format(new Date());

		logger.info("输入公司名  {}", companyname);
		type(registerPage.getCompanyname(), companyname);
		return companyname;
	}

	/**
	 * 选择公司性质
	 * 
	 * @param companytype
	 * 
	 */
	public void selectCompanyType(String type) {
		logger.info("选择公司类型 + {}",type);
		select(registerPage.getCompanytype(),type);
	}

	/**
	 * 选择国家地区
	 * 
	 * @param companyarea
	 * 
	 */
	public void selectCompanyarea(String companyarea) {
		logger.info("选择国家地区+{}", companyarea);

		select(registerPage.getCompanyarea(), companyarea);
	}

	/**
	 * 输入公司地址
	 * 
	 * @param companyaddr
	 * 
	 */
	public void enterCompanyaddr(String companyaddr) {
		logger.info("输入公司地址+{}", companyaddr);
		type(registerPage.getCompanyaddr(), companyaddr);
	}

	/**
	 * 输入联系人姓名
	 * 
	 * @param contactname
	 * 
	 */
	public void enterContactname(String contactname) {
		logger.info("输入联系人姓名+{}", contactname);
		type(registerPage.getContactname(), contactname);
	}

	/**
	 * 输入手机
	 * 
	 * @param tele
	 * 
	 */
	public void enterTele(String tele) {
		logger.info("输入手机+{}", tele);
		type(registerPage.getTele(), tele);
	}

	/**
	 * 输入邮箱
	 * 
	 * @param mailbox
	 * 
	 */
	public void enterMailbox(String mailbox) {
		logger.info("输入邮箱+{}", mailbox);
		type(registerPage.getMailbox(), mailbox);
	}

	/**
	 * 上传证明文件
	 */
	public void enterFileField() {
		logger.info("上传证明资质的图片");
		click(registerPage.getFileField());
		robotUpload();
		// jsExecutor("$(arguments[0]).click();",
		// registerPage.getFileField());
		this.pause(3);
	}

	/**
	 * 商品类别
	 * 
	 * @param mercgr
	 * 
	 */
	public void enterMercgr() {
		logger.info("点击商品类目");
		click(registerPage.getMercgr());
		click(registerPage.getCategory());
		click(registerPage.getConfirm());
	}

	/**
	 * 商品品牌
	 * 
	 * @param mercgr
	 * 
	 */
	public void enterMerbrand(String merbrand) {
		logger.info("输入商品品牌+{}", merbrand);
		type(registerPage.getMerbrand(), merbrand);
	}

	/**
	 * 用户名
	 * 
	 * @param regName
	 * 
	 */
	public String enterRegName(String regName) {
		regName = regName + new SimpleDateFormat("MMddHHmm").format(new Date());

		logger.info("输入用户名+{}", regName);
		type(registerPage.getRegName(), regName);
		return regName;
	}

	/**
	 * 密码
	 * 
	 * @param pwd
	 * 
	 */
	public void enterPwd(String pwd) {
		logger.info("输入密码+{}", pwd);
		type(registerPage.getPwd(), pwd);
	}

	/**
	 * 确认密码
	 * 
	 * @param pwdRepeat
	 * 
	 */
	public void enterPwdRepeat(String pwdRepeat) {
		logger.info("输入确认密码+{}", pwdRepeat);
		type(registerPage.getPwdRepeat(), pwdRepeat);
	}

	/**
	 * 获取uuid
	 * 
	 * @return
	 */
	public String getUUID() {
		String uuid = registerPage.getUuid().getAttribute("value");
		logger.info("获取uuid {}", uuid);
		return uuid;
	}

	/**
	 * 验证码
	 * 
	 * @param kaptcha
	 * 
	 */
	public void enterKaptcha(String kaptcha) {
		logger.info("输入验证码+{}", kaptcha);
		type(registerPage.getKaptcha(), kaptcha);

	}

	/**
	 * 刷新验证码
	 * 
	 * @param kaptcha
	 * 
	 */
	public void freshKaptcha() {
		logger.info("刷新验证码");
		click(registerPage.getKaptchaImage());

	}

	/**
	 * 验证码
	 * 
	 * @param registsubmit
	 * 
	 */
	public void clickRegistsubmit(String regName) {

		if (isElementPresent(registerPage.getRegistsubmit())) {
			logger.info("点击立即注册按钮");
			click(registerPage.getRegistsubmit());
		} else {
			logger.info("未点击，循环2");
			click(registerPage.getRegistsubmit());			
		}
		logger.info("开始判供应商是否注册成功");
		logger.info(this.driver.getCurrentUrl());
		if (isElementPresent(this.driver.findElement(By.xpath("//p[text()='"
				+ regName + "，您好，感谢您注册鑫网易商 ']")))) {
			logger.info("供应商注册成功");
		}

	}

	/*
	 * public void clickRegistsubmit() {
	 * if(isElementPresent(registerPage.getRegistsubmit())){
	 * click(registerPage.getRegistsubmit()); }else{ this.pause(2); } }
	 */
	public boolean isRegistsuccess() {
		if (isElementPresent(registerPage.getSuccess())) {
			return true;
		} else {
			return false;
		}
	}
}
