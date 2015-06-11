/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;
import com.ccigmall.auto.test.page.pc.dealer.LoginPage;
import com.ccigmall.auto.test.page.pc.dealer.user.RegisterPage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-07 经销商注册动作
 */
public class RegisterAct extends IndexAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(RegisterAct.class);

	/**
	 * 供应商注册页
	 * 
	 */
	private RegisterPage registerPage;

	/**
	 * 
	 * @param driver
	 */
	public RegisterAct(WebDriver driver) {
		super(driver);
		registerPage = new RegisterPage(driver);
	}


	/**
	 * 获取验证码
	 */
	public String getVcode() {
		String uuid = registerPage.getUuid().getAttribute("value");
		logger.info("获取验证码: {}", uuid);
		return uuid;
	}

	/**
	 * 重新获取验证码
	 */
	public void clickVcode() {
		logger.info("点击验证码重新获取: {}", registerPage.getKaptchaImage());
		click(registerPage.getKaptchaImage());	
	}

	/**
	 * 输入验证码
	 */
	public void inputVcode(String text) {
		logger.info("输入验证码: {}", text);
		type(registerPage.getKaptcha(),text);	
	}

	
	/**
	 * 输入公司名称
	 */
	public void inputCompanyName(String text) {
		logger.info("输入公司名称：{}", text);
		this.type(registerPage.getCompanyName(), text);
		
	}

	/**
	 * 输入法人姓名
	 */
	public void inputLegalName(String text) {
		logger.info("输入法人姓名：{}", text);
		this.type(registerPage.getLegalName(), text);
	}

	/**
	 * 输入法人证件号
	 */
	public void inputLegalIdNum(String text) {
		logger.info("输入法人证件号：{}", text);
		this.type(registerPage.getLegalIdNum(), text);
	}

	/**
	 * 输入联系人
	 */
	public void inputContactName(String text) {
		logger.info("输入联系人：{}", text);
		this.type(registerPage.getContactName(), text);
	}

	/**
	 * 输入手机
	 */
	public void inputMobileNo(String text) {
		logger.info("输入手机：{}", text);
		this.type(registerPage.getMobileNo(), text);
	}

	/**
	 * 输入邮箱
	 */
	public void inputMailbox(String text) {
		logger.info("输入邮箱：{}", text);
		this.type(registerPage.getMailbox(), text);
	}

	/**
	 * 输入地址
	 */
	public void inputCompanyAddr(String text) {
		logger.info("输入地址：{}", text);
		this.type(registerPage.getCompanyAddr(), text);
	}

	/**
	 * 输入座机电话
	 */
	public void inputContactTele(String text) {
		logger.info("输入座机电话：{}", text);
		this.type(registerPage.getContactTele(), text);
	}

	/**
	 * 输入邮编
	 */
	public void inputPostalCode(String text) {
		logger.info("输入邮编：{}", text);
		this.type(registerPage.getPostalCode(), text);
	}

	/**
	 * 输入营业执照
	 */
	/*
	 * public void inputBusiLicense(String text) { logger.info("输入营业执照：{}", text
	 * ); this.type(registerPage.getBusiLicense(), text ); }
	 */

	/**
	 * 上传营业执照
	 * 
	 * @param path
	 */
	public void uploadBusiLicense(String path) {
		click(registerPage.getBusiLicense());
		logger.info("上传营业执照:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传税务登记证
	 * 
	 * @param path
	 */
	public void uploadTaxregistcerti(String path) {
		click(registerPage.getfTaxregistcerti());
		logger.info("上传税务登记证:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传开户许可证
	 * 
	 * @param path
	 */
	public void uploadAccOpenlicense(String path) {
		click(registerPage.getFaccopenlicense());
		logger.info("上传开户许可证:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传一般纳税人资格证明
	 * 
	 * @param path
	 */
	public void uploadTaxpayqualicerti(String path) {
		click(registerPage.getfTaxpayqualicerti());
		logger.info("上传一般纳税人资格证明:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传法人代表身份证明文件
	 * 
	 * @param path
	 */
	public void uploadFlegalcerti(String path) {
		click(registerPage.getFlegalcerti());
		logger.info("上传法人代表身份证明文件:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传对外贸易经营者备案登记表
	 * 
	 * @param path
	 */
	public void uploadFforeigntrade(String path) {
		click(registerPage.getFforeigntrade());
		logger.info("上传对外贸易经营者备案登记表:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传进出口货物收发货人报关注册登记证
	 * 
	 * @param path
	 */
	public void uploadFforeigntrade1(String path) {
		click(registerPage.getFforeigntrade1());
		logger.info("上传进出口货物收发货人报关注册登记证:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传食品流通许可证
	 * 
	 * @param path
	 */
	public void uploadFforeigntrade2(String path) {
		click(registerPage.getFforeigntrade2());
		logger.info("上传食品流通许可证:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传进口食品/化妆品收货人检验检疫备案登记证
	 * 
	 * @param path
	 */
	public void uploadFforeigntrade3(String path) {
		click(registerPage.getFforeigntrade3());
		logger.info("上传进口食品/化妆品收货人检验检疫备案登记证:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传酒类经营许可证/酒类流通备案登记表
	 * 
	 * @param path
	 */
	public void uploadFforeigntrade4(String path) {
		click(registerPage.getFforeigntrade4());
		logger.info("上传酒类经营许可证/酒类流通备案登记表:{}", path);
		robotUpload(path);
	}

	/**
	 * 上传保健食品卫生许可证（经营许可证）
	 * 
	 * @param path
	 */
	public void uploadFforeigntrade5(String path) {
		click(registerPage.getFforeigntrade5());
		logger.info("上传保健食品卫生许可证（经营许可证）:{}", path);
		robotUpload(path);
	}

	/**
	 * 输入货物收发货人报关注册登记证有效日期
	 * 
	 * @param text
	 */
	public void inputRegistrationTime(String text) {
		logger.info("输入货物收发货人报关注册登记证有效日期：{}", text);
		type(registerPage.getGoodsRegistrationTime(), text);
	}

	/**
	 * 食品流通许可证有效期限start
	 * 
	 * @param text
	 */
	public void inputStarttime(String text) {
		logger.info("输入食品流通许可证有效期限start：{}", text);
		type(registerPage.getFoodCirculationStarttime(), text);
	}

	/**
	 * 食品流通许可证有效期限end
	 * 
	 * @param text
	 */
	public void inputEndtime(String text) {
		logger.info("输入食品流通许可证有效期限end：{}", text);
		type(registerPage.getFoodCirculationEndtime(), text);
	}

	/**
	 * 输入用户名
	 * 
	 * @param text
	 */
	public void inputRegName(String text) {
		logger.info(" 输入用户名：{}", text);
		type(registerPage.getRegName(), text);
	}

	/**
	 * 输入密码
	 * 
	 * @param text
	 */
	public void inputPasswor(String text) {
		logger.info("输入密码：{}", text);
		type(registerPage.getPwd(), text);
	}

	/**
	 * 输入确认密码
	 * 
	 * @param text
	 */
	public void inputConfirmPasswor(String text) {
		logger.info("输入确认密码：{}", text);
		type(registerPage.getPwdRepeat(), text);
	}



	/**
	 * 击注册按钮
	 */
	public void clickRegisterButton() {
		logger.info("点击注册按钮：{}", registerPage.getRegistsubmit());
		click(registerPage.getRegistsubmit());

	}
	
	/**
	 * 获取注册结果
	 */
	public String getRegisterResult() {
		String text = getText(registerPage.getRegisterResult());
		logger.info("获取注册结果：{}", text);
		return text;
	}

}
