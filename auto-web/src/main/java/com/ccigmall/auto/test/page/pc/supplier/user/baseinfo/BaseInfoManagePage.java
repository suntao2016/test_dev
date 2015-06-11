package com.ccigmall.auto.test.page.pc.supplier.user.baseinfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.supplier.IndexPage;

/**
 * 
 * @author chenjingli
 * 用户中心--信息管理--基本信息管理--修改基本信息page
 */
public class BaseInfoManagePage extends IndexPage {

	public BaseInfoManagePage(WebDriver driver) {
		super(driver);
	}
	/**
	 *  点击上传图像
	 */
	@FindBy(xpath="//*[@id='formID']/div/div[3]/ul/li[1]/div/input")
	public WebElement xpathCliUploadPic;
	/**
	 *  点击修改按钮
	 */
	@FindBy(xpath="//input[@value='修改']")
	public WebElement xpathCliUpdButton;
	/**
	 *  输入公司地址
	 */
	@FindBy(name="address")
	public WebElement nameTypeAddr;
	/**
	 *  输入联系人
	 */
	@FindBy(name="contact")
	public WebElement nameTypeContact;
	/**
	 *  输入手机
	 */
	@FindBy(name="phone")
	public WebElement nameTypeMobPhone;
	/**
	 *  输入邮箱
	 */
	@FindBy(name="email")
	public WebElement nameTypeEmail;
	/**
	 *  输入固定电话
	 */
	@FindBy(name="fax")
	public WebElement nameTypeFax;
	/**
	 *  输入邮政编码
	 */
	@FindBy(name="post")
	public WebElement nameTypePost;
	/**
	 *  选择商品类别
	 */
	@FindBy(id="mer-cgr")
	public WebElement idSelGoodsStyle;
	/**
	 *  输入商品品牌
	 */
	@FindBy(id="mer-brand")
	public WebElement idTypeGoodsBrand;
	/**
	 *  点击提交按钮
	 */
	@FindBy(xpath="//input[@value='提交']")
	public WebElement xpathCliSubmit;
	
	/**
	 *  点击第一个变更按钮
	 */
	@FindBy(xpath="//div[@class='right f_l']/descendant::input[@value='变更'][1]")
	public WebElement xpathCliChangeOne;
	
	/**
	 *  点击第二个变更按钮
	 */
	@FindBy(xpath="//div[@class='right f_l']/descendant::input[@value='变更'][2]")
	public WebElement xpathCliChangeTwo;

	public WebElement getXpathCliUploadPic() {
		return xpathCliUploadPic;
	}

	public WebElement getXpathCliUpdButton() {
		return xpathCliUpdButton;
	}

	public WebElement getNameTypeAddr() {
		return nameTypeAddr;
	}

	public WebElement getNameTypeContact() {
		return nameTypeContact;
	}

	public WebElement getNameTypeMobPhone() {
		return nameTypeMobPhone;
	}

	public WebElement getNameTypeEmail() {
		return nameTypeEmail;
	}

	public WebElement getIdSelGoodsStyle() {
		return idSelGoodsStyle;
	}

	public WebElement getIdTypeGoodsBrand() {
		return idTypeGoodsBrand;
	}

	public WebElement getXpathCliSubmit() {
		return xpathCliSubmit;
	}

	public WebElement getXpathCliChangeOne() {
		return xpathCliChangeOne;
	}

	public WebElement getXpathCliChangeTwo() {
		return xpathCliChangeTwo;
	}

	public WebElement getNameTypeFax() {
		return nameTypeFax;
	}

	public WebElement getNameTypePost() {
		return nameTypePost;
	}
	
}
