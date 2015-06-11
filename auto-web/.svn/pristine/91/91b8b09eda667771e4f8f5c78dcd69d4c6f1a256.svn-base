package com.ccigmall.auto.test.page.pc.dealer.user.authority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ccigmall.auto.test.page.pc.dealer.user.UserCenterPage;

/**
 * @author dengshuhai
 * @since 2015 01 23
 * 用户中心-权限管理页面
 */
public class AuthorityManagePage extends UserCenterPage{
	/**
	 * 
	 * @param driver
	 */
	public AuthorityManagePage(WebDriver driver) {
		super(driver);
	}
	
	
	/**
	 *创建新角色
	 */
	@FindBy(id="addbutton")
	private WebElement addRole;
	/**
	 *确定按钮
	 */
	@FindBy(xpath="//button[@onclick='submitForm()'][text()='确定']")
	private WebElement confirmButton;
	/**
	 *全选
	 */
	@FindBy(id="treeDemo_1_check")
	private WebElement checkAll;
	
	/**
	 *修改角色 
	 */
	@FindBy(id="name1")
	private WebElement modifyName;
	
	/**
	 *修改角色 -修改
	 */
	@FindBy(id="editBtn")
	private WebElement editBtn;
	
	/**
	 *修改角色 -取消
	 */
	@FindBy(id="editBtnCancel")
	private WebElement editBtnCancel;
	
	/**
	 *添加角色 
	 */
	@FindBy(id="name")
	private WebElement roleName;
	
	
	/**
	 *添加角色 -确定
	 */
	@FindBy(id="addBtn")
	private WebElement alertAddConfirm;
	
	/**
	 *添加角色 -取消
	 */
	@FindBy(id="addBtnCancel")
	private WebElement alertAddCancel;
	
	
	/**
	 *删除角色 -确定
	 */
	@FindBy(xpath="//input[@value='确定']")
	private WebElement alertDelConfirm;
	
	/**
	 *删除角色 -取消
	 */
	@FindBy(id="//input[@value='取消]")
	private WebElement alertDelCancel;
	
	

	public WebElement getAddRole() {
		return addRole;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public WebElement getCheckAll() {
		return checkAll;
	}

	public WebElement getRoleName() {
		return roleName;
	}

	public WebElement getAlertAddConfirm() {
		return alertAddConfirm;
	}

	public WebElement getAlertAddCancel() {
		return alertAddCancel;
	}

	public WebElement getAlertDelConfirm() {
		return alertDelConfirm;
	}

	public WebElement getAlertDelCancel() {
		return alertDelCancel;
	}

	public WebElement getModifyName() {
		return modifyName;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getEditBtnCancel() {
		return editBtnCancel;
	}
	
}
