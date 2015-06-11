package com.ccigmall.auto.test.page.pc.retailer.my.account;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.retailer.my.MyIndexPage;
/**
 * 
 * @author  chenjingli
 * 我的鑫网-我的订单-账户中心-权限管理
 */
public class PrivilegeManagementPage extends MyIndexPage {

	public PrivilegeManagementPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 新建角色
	 */
	@FindBy(id="create_new_role")
	public WebElement idCliCreateNewRole;
	/**
	 * 确定
	 */
	@FindBy(id="updateRoleMenu")
	public WebElement idCliSureButton;
	/**
	 * {删除}第一个角色
	 */
	@FindBy(xpath="//div[@id='rightsManage']/descendant::a[2]")
	public WebElement xpathCliDelOne;
	/**
	 * {删除}最后一个角色
	 */
	@FindBy(xpath="//div[@id='rightsManage']/descendant::a[last()-1]")
	public WebElement xpathCliDelLastOne;
	/**
	 * {修改}第一个角色
	 */
	@FindBy(xpath="//div[@id='rightsManage']/descendant::a[3]")
	public WebElement xpathCliUpdateOne;
	/**
	 * 获得角色列表
	 */
	@FindBy(xpath="//div[@id='rightsManage']/div[1]/ul/li")
	public List<WebElement> xpathGetRoleList;
	/**
	 * 获得最后一个角色名称
	 */
	@FindBy(xpath="//div[@id='rightsManage']/descendant::em[last()-1]/a")
	public WebElement xpathGetLastRole;
	/**
	 * 获得最第一个角色名称
	 */
	@FindBy(xpath="//div[@id='rightsManage']/descendant::em[1]/a")
	public WebElement xpathGetFirstRole;
	/**
	 * 输入新建角色名称
	 */
	@FindBy(xpath="//input[@name='roleName' and @id='role_name']")
	public WebElement xpathTypeRoleName;
	
	/**
	 * 输入修改角色名称
	 */
	@FindBy(xpath="//input[@name='roleName' and @id='roleName']")
	public WebElement xpathTypeUpdRoleName;
	/**
	 * 点击提交确定
	 */
	@FindBy(id="submit")
	public WebElement idCliSubmit;
	
	/**
	 * 点击修改中的确定
	 */
	@FindBy(xpath="//div[@id='update-user-box']/descendant::input[3]")
	public WebElement xpathCliUpdSureButton;
	/**
	 * 测试数据 优惠券 checkbox
	 */
	@FindBy(xpath="//form[@id='menu_form']/descendant::input[last()]")
	public WebElement xpathTestCheckbox;
	
	/**
	 * 点击删除中的确定按钮
	 */
	@FindBy(id="delete_role")
	public WebElement idCliDelSure;
	
	public WebElement getIdCliDelSure() {
		return idCliDelSure;
	}
	public WebElement getIdCliCreateNewRole() {
		return idCliCreateNewRole;
	}
	public WebElement getIdCliSureButton() {
		return idCliSureButton;
	}
	public WebElement getXpathCliDelOne() {
		return xpathCliDelOne;
	}
	public WebElement getXpathCliUpdateOne() {
		return xpathCliUpdateOne;
	}
	public List<WebElement> getXpathGetRoleList() {
		return xpathGetRoleList;
	}
	public WebElement getXpathGetLastRole() {
		return xpathGetLastRole;
	}
	public WebElement getXpathGetFirstRole() {
		return xpathGetFirstRole;
	}
	public WebElement getXpathTypeRoleName() {
		return xpathTypeRoleName;
	}
	public WebElement getIdCliSubmit() {
		return idCliSubmit;
	}
	public WebElement getXpathTestCheckbox() {
		return xpathTestCheckbox;
	}
	public WebElement getXpathTypeUpdRoleName() {
		return xpathTypeUpdRoleName;
	}
	public WebElement getXpathCliUpdSureButton() {
		return xpathCliUpdSureButton;
	}
	public WebElement getXpathCliDelLastOne() {
		return xpathCliDelLastOne;
	}
	
}
