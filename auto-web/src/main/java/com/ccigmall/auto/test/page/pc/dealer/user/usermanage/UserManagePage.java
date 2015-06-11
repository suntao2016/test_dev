package com.ccigmall.auto.test.page.pc.dealer.user.usermanage;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ccigmall.auto.test.page.pc.dealer.user.UserCenterPage;

/**
 * @author dengshuhai
 * @since 2015 01 23
 * 用户中心-用户管理页面
 */
public class UserManagePage extends UserCenterPage{
	/**
	 * @param driver
	 */
	public UserManagePage(WebDriver driver) {
		super(driver);
	}

	/**
	 *创建新用户
	 */
	@FindBy(xpath="//button[text()='创建新用户']")
	private WebElement addUser;
	
	/**
	 *创建新用户
	 */
	@FindBy(xpath="//button[text()='删除']")
	private WebElement delUser;
	
	/**
	 *用户名
	 */
	@FindBy(id="name")
	private WebElement userName;
	/**
	 *密码
	 */
	@FindBy(id="password")
	private WebElement password;
	/**
	 *确认密码
	 */
	@FindBy(id="repassword")
	private WebElement repassword;
	/**
	 *角色
	 */
	@FindBy(id="roleId")
	private WebElement roleSelect;
	
	
	/**
	 *修改用户名
	 */
	@FindBy(id="name1")
	private WebElement userName1;
	/**
	 *修改密码
	 */
	@FindBy(id="password1")
	private WebElement password1;
	/**
	 *修改确认密码
	 */
	@FindBy(id="repassword1")
	private WebElement repassword1;
	/**
	 *修改角色
	 */
	@FindBy(id="roleId1")
	private WebElement roleSelect1;
	
	
	
	/**
	 *确定
	 */
	@FindBy(id="addUser")
	private WebElement addUserButton;
	
	/**
	 *取消 
	 */
	@FindBy(id="addUserCancel")
	private WebElement addUserCancel;


	/**
	 *修改确定
	 */
	@FindBy(id="userEidt")
	private WebElement userEidtConfirm;
	
	/**
	 *修改取消 
	 */
	@FindBy(id="userEidtCancel")
	private WebElement userEidtCancel;

	/**
	 *全选
	 */
	@FindBy(xpath="//p[text()=' 全选']/preceding::input[@type='checkbox']")
	private WebElement checkAll;
	
	/**
	 *获取用户信息list
	 */
	@FindBy(xpath="//*[@id='deleteForm']/div/div[3]/div/ul[2]/li/p[2]")
	private List<WebElement> userInfoList;
	
	/**
	 *下一页
	 */
	@FindBy(xpath="//button[contains(text(),'下一页')]/img")
	private WebElement nextPage;
	
	/**
	 *上一页
	 */
	@FindBy(xpath="html/body/div[6]/div[3]/button[first()]/img")
	private WebElement previousPage;
	/**
	 *弹窗确定
	 */
	@FindBy(xpath="//input[@type='button'][@value='确定']")
	private WebElement alertConfirm;
	/**
	 *弹窗取消
	 */
	@FindBy(xpath="//input[@type='button'][@value='取消']")
	private WebElement alertCancel;
	

	public WebElement getAddUser() {
		return addUser;
	}

	public WebElement getDelUser() {
		return delUser;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRepassword() {
		return repassword;
	}

	public WebElement getRoleSelect() {
		return roleSelect;
	}

	public WebElement getAddUserButton() {
		return addUserButton;
	}

	public WebElement getAddUserCancel() {
		return addUserCancel;
	}

	public WebElement getCheckAll() {
		return checkAll;
	}

	public List<WebElement> getUserInfoList() {
		return userInfoList;
	}

	
	public WebElement getNextPage() {
		return nextPage;
	}

	public WebElement getPreviousPage() {
		return previousPage;
	}

	public WebElement getUserName1() {
		return userName1;
	}

	public WebElement getPassword1() {
		return password1;
	}

	public WebElement getRepassword1() {
		return repassword1;
	}

	public WebElement getRoleSelect1() {
		return roleSelect1;
	}

	public WebElement getUserEidtConfirm() {
		return userEidtConfirm;
	}

	public WebElement getUserEidtCancel() {
		return userEidtCancel;
	}

	public WebElement getAlertConfirm() {
		return alertConfirm;
	}

	public WebElement getAlertCancel() {
		return alertCancel;
	}
	
	
}
