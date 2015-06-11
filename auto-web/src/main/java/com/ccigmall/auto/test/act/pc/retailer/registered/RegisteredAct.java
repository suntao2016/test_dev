package com.ccigmall.auto.test.act.pc.retailer.registered;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.retailer.IndexAct;
import com.ccigmall.auto.test.page.pc.retailer.registered.RegisteredPage;

/**
 * @author chenjingli
 *  零售商注册 act
 */
public class RegisteredAct  extends IndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RegisteredAct.class);
	
	private String img = "\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg\"";
	/**
	 * 注册 page
	 */
	private RegisteredPage registeredPage;
	/**
	 * @param driver
	 */
	public RegisteredAct(WebDriver driver) {
		super(driver);
		registeredPage=new RegisteredPage(driver);
	}
	/**
	 * 输入经营主体名称
	 */
	public void typeCompanyName(String companyName) {
		type(registeredPage.getiDTypeCompanyname(),img);
		robotCopy();
		type(registeredPage.getiDTypeCompanyname(),companyName);
	}
	/**
	 * type营业执照注册business  license编号
	 */
	public void typeCompanynumber(String companyNumber) {
		type(registeredPage.getiDTypeCompanynumber(),companyNumber);
	}
	/**
	 * 商户名称merchants
	 */
	public void typeMerchantName(String merchantName) {
		type(registeredPage.getiDTypeMerchantName(),merchantName);
	}
	/**
	 * 商户编号
	 */
	public void typeBusinessNumber(String businessNumber) {
		type(registeredPage.getiDTypeBusinessNumber(),businessNumber);
	}
	/**
	 * 商户地址
	 */
	public void typeCompanyAddr(String companyAddr) {
		type(registeredPage.getiDTypeCompanyAddr(),companyAddr);
	}
	/**
	 * 经营业姓名
	 */
	public void typeContactName(String contactName) {
		type(registeredPage.getiDTypeContactName(),contactName);
	}
	/**
	 * 经营者证件编号
	 */
	public void typeContactNumber(String contactNumber) {
		type(registeredPage.getiDTypeContactNumber(),contactNumber);
	}
	/**
	 * 手机
	 */
	public void typeMob(String mobphone) {
		type(registeredPage.getiDTypeMob(),mobphone);
	}
	/**
	 * 邮箱
	 */
	public void typeEmail(String email) {
		type(registeredPage.getiDTypEmail(),email);
	}
	/**
	 * 联系人传真、电话
	 */
	public void typeFax(String fax) {
		type(registeredPage.getiDTypeFax(),fax);
	}
	/**
	 * 工商执照  上传证件
	 */
	public void clickUploadButton() {
		click(registeredPage.getXpathCliUpload());
		robotUpload();
	}
	/**
	 * 账户信息开始-start 用户名
	 */
	public void typeRegName(String regName) {
		type(registeredPage.getiDTypeRegName(),regName);
	}
	/**
	 * 密码
	 */
	public void typePassword(String password) {
		type(registeredPage.getiDTypePassword(),password);
	}
	/**
	 * 确认密码
	 */
	public void typeConfirmPwd(String confirmPwd) {
		type(registeredPage.getiDTypeConfirmPwd(),confirmPwd);
	}
	/**
	 * 验证码
	 */
	public void typeVerificationCode(String verificationCode) {
		type(registeredPage.getiDTypeVerificationCode(),verificationCode);
	}
	/**
	 * 点击 注册按钮
	 */
	public void clickRegistButton() {
		click(registeredPage.getiDCliRegistButton());
	}
}
