package com.ccigmall.auto.test.page.pc.retailer.registered;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * 
 * @author chenjingli  零售商注册
 *
 */
public class RegisteredPage extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public RegisteredPage(WebDriver driver) {
		super(driver);
	}
	/**
	 *operators经营主体名称
	 */
	@FindBy(id="companyname")
	private WebElement iDTypeCompanyname;
	/**
	 *营业执照注册business  license编号
	 */
	@FindBy(id="companynumber")
	private WebElement iDTypeCompanynumber;
	/**
	 *商户名称merchants 
	 */
	@FindBy(id="businessname")
	private WebElement iDTypeMerchantName;
	/**
	 *商户编号
	 */
	@FindBy(id="businessnumber")
	private WebElement iDTypeBusinessNumber;
	/**
	 *商户地址
	 */
	@FindBy(id="companyaddr")
	private WebElement iDTypeCompanyAddr;
	/**
	 *经营业姓名
	 */
	@FindBy(id="contactname")
	private WebElement iDTypeContactName;
	/**
	 *经营者证件编号
	 */
	@FindBy(id="contactnumber")
	private WebElement iDTypeContactNumber;
	/**
	 *手机
	 */
	@FindBy(id="tele")
	private WebElement iDTypeMob;
	/**
	 *邮箱
	 */
	@FindBy(id="mailbox")
	private WebElement iDTypEmail;
	/**
	 *联系人传真、电话
	 */
	@FindBy(id="contacttele")
	private WebElement iDTypeFax;
	/**
	 *工商执照  上传证件
	 */
	@FindBy(xpath="//input[@value='上传']")
	private WebElement xpathCliUpload;
	/**
	 *账户信息开始-start 用户名
	 */
	@FindBy(id="regName")
	private WebElement iDTypeRegName;
	/**
	 *密码
	 */
	@FindBy(id="pwd")
	private WebElement iDTypePassword;

	/**
	 *确认密码
	 */
	@FindBy(id="pwdRepeat")
	private WebElement iDTypeConfirmPwd;
	/**
	 *验证码
	 */
	@FindBy(id="kaptcha")
	private WebElement iDTypeVerificationCode;
	/**
	 * 点击 注册按钮
	 */
	@FindBy(id="registsubmit")
	private WebElement iDCliRegistButton;
	
	
	
	
	
	public WebElement getiDTypeCompanyname() {
		return iDTypeCompanyname;
	}
	public WebElement getiDTypeCompanynumber() {
		return iDTypeCompanynumber;
	}
	public WebElement getiDTypeMerchantName() {
		return iDTypeMerchantName;
	}
	public WebElement getiDTypeBusinessNumber() {
		return iDTypeBusinessNumber;
	}
	public WebElement getiDTypeCompanyAddr() {
		return iDTypeCompanyAddr;
	}
	public WebElement getiDTypeContactName() {
		return iDTypeContactName;
	}
	public WebElement getiDTypeContactNumber() {
		return iDTypeContactNumber;
	}
	public WebElement getiDTypeMob() {
		return iDTypeMob;
	}
	public WebElement getiDTypEmail() {
		return iDTypEmail;
	}
	public WebElement getiDTypeFax() {
		return iDTypeFax;
	}
	public WebElement getXpathCliUpload() {
		return xpathCliUpload;
	}
	public WebElement getiDTypeRegName() {
		return iDTypeRegName;
	}
	public WebElement getiDTypePassword() {
		return iDTypePassword;
	}
	public WebElement getiDTypeConfirmPwd() {
		return iDTypeConfirmPwd;
	}
	public WebElement getiDTypeVerificationCode() {
		return iDTypeVerificationCode;
	}
	public WebElement getiDCliRegistButton() {
		return iDCliRegistButton;
	}
	
	
}
