package com.ccigmall.auto.test.page.pc.platform.user.review.brand;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.platform.user.UserIndexPage;
/**
 * 
 * @author chenjingli
 * wofe -- 用户中心 -- 审核管理 -- 品牌审核page
 */
public class BrandAuditPage extends UserIndexPage {

	public BrandAuditPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 品牌名称
	 */
	@FindBy(id="name")
	private WebElement idTypeBrandName;
	/**
	 * 供应商名称
	 */
	@FindBy(id="supplierName")
	private WebElement idTypeSupplierName;
	/**
	 * 当前状态
	 */
	@FindBy(id="status")
	private WebElement idSelStatus;
	/**
	 * 开始创建时间
	 */
	@FindBy(id="startTime")
	private WebElement idTypeStartTime;
	/**
	 * 获取当前表格查看 链接的按钮
	 */
	@FindBy(xpath="//div[@id='c24']/descendant::span")
	private List<WebElement> xpathGettrNumber;
	/**
	 * 点击第一个查看的按钮
	 */
	@FindBy(xpath="//div[@id='c24']/descendant::span[1]")
	private WebElement xpathCliFirstView;
	/**
	 * 判断代理类型
	 */
	@FindBy(xpath="//input[@name='legalPersonNo']")
	private WebElement booleanBrandType;
	
	/**
	 * 点击通过按钮
	 */
	@FindBy(xpath="//div[@class='right f_l']/descendant::button[1]")
	private WebElement xpathCliPassButton;
	/**
	 * 点击提交按钮
	 */
	@FindBy(xpath="//div[@id='error-box']/descendant::a")
	private WebElement xpathCliSubmitButton;
	/**
	 * 点击返回 按钮
	 */
	@FindBy(xpath="//input[@value='返回']")
	private WebElement xpathCliRuturnButton;
	/**
	 * 获取 品牌类型
	 */
	@FindBy(name="legalPersonNo")
	private WebElement nameGetBrandType;
	/**
	 * 获取 品牌审核管理列表的{当前状态}
	 */
	@FindBy(xpath="//div[@id='c24']/descendant::p[7]")
	private WebElement xpathGetBrandStatus;
	
	/**
	 * 获取 审核弹框后的内容
	 */
	@FindBy(xpath="//table[@class='ui_dialog']/descendant::div[4]")
	private WebElement xpathGetAlertInfo;
	
	public WebElement getXpathCliRuturnButton() {
		return xpathCliRuturnButton;
	}
	public WebElement getXpathGetAlertInfo() {
		return xpathGetAlertInfo;
	}
	public WebElement getIdTypeBrandName() {
		return idTypeBrandName;
	}
	public WebElement getIdTypeSupplierName() {
		return idTypeSupplierName;
	}
	public WebElement getIdSelStatus() {
		return idSelStatus;
	}
	public WebElement getIdTypeStartTime() {
		return idTypeStartTime;
	}
	
	public List<WebElement> getXpathGettrNumber() {
		return xpathGettrNumber;
	}
	public WebElement getXpathCliFirstView() {
		return xpathCliFirstView;
	}
	public WebElement getBooleanBrandType() {
		return booleanBrandType;
	}
	public WebElement getXpathCliPassButton() {
		return xpathCliPassButton;
	}
	public WebElement getXpathCliSubmitButton() {
		return xpathCliSubmitButton;
	}
	public WebElement getNameGetBrandType() {
		return nameGetBrandType;
	}
	public WebElement getXpathGetBrandStatus() {
		return xpathGetBrandStatus;
	}
	
}
