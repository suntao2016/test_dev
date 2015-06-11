package com.ccigmall.auto.test.page.pc.platform.user.info.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ccigmall.auto.test.page.pc.platform.user.UserIndexPage;

/**
 * 
 * @author dengshuhai
 * <p>platform wofe用户中心-基本信息管理
 * @since 2015-02-02
 * @version 1.0
 */
public class BaseInfoPage extends UserIndexPage {

	public BaseInfoPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 基本信息 修改按钮
	 */
	@FindBy(xpath = "//input[@value='修改'][@onclick='subUpdate()']")
	private  WebElement  modifyInfoButton ;
	
	/**
	 * 基本信息 保存按钮
	 */
	@FindBy(xpath = "//input[@value='保存'][@onclick='subUpdate()']")
	private  WebElement  saveInfoButton ;
	
	/**
	 * 基本信息 保存按钮
	 */
	@FindBy(name = "iconUrl")
	private  WebElement  headImg ;
	
	/**
	 * 公司名称
	 */
	@FindBy(name = "name")
	private  WebElement  companyName ;
	/**
	 * 详细地址
	 */
	@FindBy(name = "address")
	private  WebElement  address ;
	/**
	 * 联系人
	 */
	@FindBy(name = "contactor")
	private  WebElement  contactor ;
	/**
	 * 手机
	 */
	@FindBy(name = "mobile")
	private  WebElement  mobile ;
	
	/**
	 * 邮箱
	 */
	@FindBy(name = "email")
	private  WebElement  email ;
	
	/**
	 * 电话
	 */
	@FindBy(name = "phone")
	private  WebElement  phone ;
	
	/**
	 * 传真
	 */
	@FindBy(name = "fax")
	private  WebElement  fax ;
	
	/**
	 * 邮政编码
	 */
	@FindBy(name = "post")
	private  WebElement  post ;

	public WebElement getModifyInfoButton() {
		return modifyInfoButton;
	}

	public WebElement getSaveInfoButton() {
		return saveInfoButton;
	}

	public WebElement getHeadImg() {
		return headImg;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getContactor() {
		return contactor;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getPost() {
		return post;
	}
	
	
}
