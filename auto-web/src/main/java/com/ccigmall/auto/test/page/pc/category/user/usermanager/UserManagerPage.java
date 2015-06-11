package com.ccigmall.auto.test.page.pc.category.user.usermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.pc.category.user.UserPage;

/**
 * @author zhaixiaoyue
 * 用户管理
 */
public class UserManagerPage extends UserPage{
	/**
	 * 
	 * @param driver
	 */
	public UserManagerPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 搜索栏用户名输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='userName']")
	private WebElement userName;
	
	/**
	 * 搜索栏email输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement email;
	
	/**
	 * 搜索栏电话输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='phone']")
	private WebElement phone;
	
	/**
	 * 搜索按钮
	 */
	@FindBy(how = How.XPATH, using = "//div/button")
	private WebElement searchButton;
	
	/**
	 * 添加用户按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='user_add']")
	private WebElement addUserBtn;
	
	/**
	 * 删除用户按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='user_delete']")
	private WebElement delUserBtn;
	
	/**
	 * 修改用户按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='user_edit']/span[text()='修改用户']")
	private WebElement editUserBtn;
	
	/**
	 * 修改密码按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='user_edit']/span[text()='修改密码']")
	private WebElement editPwdBtn;
	
	/**
	 * 第一条记录
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]")
	private WebElement firstUser;
	
	/**
	 * 添加用户用户名输入框
	 */
	@FindBy(how = How.XPATH, using = "//form/div[1]/p[1]/input")
	private WebElement addUserName;
	
	/**
	 * 添加用户密码输入框
	 */
	@FindBy(how = How.XPATH, using = "//form/div[1]/p[2]/input")
	private WebElement addPassword;
	
	/**
	 * 添加用户密码真实姓名输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='realName']")
	private WebElement addRealName;
	
	/**
	 * 添加用户电话输入框
	 */
	@FindBy(how = How.XPATH, using = "//form/div[1]/p[4]/input")
	private WebElement addPhone;
	
	/**
	 * 添加用户邮箱输入框
	 */
	@FindBy(how = How.XPATH, using = "//form/div[1]/p[5]/input")
	private WebElement addEmail;
	
	/**
	 * 添加用户角色选择框
	 */
	@FindBy(how = How.XPATH, using = "//select[@name='roleId']")
	private WebElement addRoleSlt;
	
	/**
	 * 添加或修改用户保存按钮
	 */
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement addSubmit;
	
	/**
	 * 添加或修改用户取消按钮
	 */
	@FindBy(how = How.XPATH, using = "//button[@class='close']")
	private WebElement addCancel;
	
	/**
	 * 提示框确定按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='button']/span[text()='确定']")
	private WebElement queryBtn;
	
	/**
	 * 提示框取消按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='button']/span[text()='取消']")
	private WebElement cancelBtn;
	
	/**
	 * 修改用户用户名输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@class='textInput readonly valid']")
	private WebElement editUserName;
	
	/**
	 * 修改用户电话输入框
	 */
	@FindBy(how = How.XPATH, using = "//form/div[1]/p[3]/input")
	private WebElement editUserPhone;
	
	/**
	 * 修改用户邮箱输入框
	 */
	@FindBy(how = How.XPATH, using = "//form/div[1]/p[4]/input")
	private WebElement editUserEmail;
	
	/**
	 * 修改密码新密码输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement editPwd;
	
	/**
	 * 修改密码密码确认输入框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='newpassword']")
	private WebElement editPwdSec;
	
	/**
	 * 搜索结果为空
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/h2")
	private WebElement searchresult;
	
	/**
	 * 操作成功确认按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li/a/span")
	private WebElement query;
	
	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}
	
	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}
	
	/**
	 * @return the phone
	 */
	public WebElement getPhone() {
		return phone;
	}
	
	
	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	/**
	 * @return the addUserBtn
	 */
	public WebElement getAddUserBtn() {
		return addUserBtn;
	}
	
	
	/**
	 * @return the delUserBtn
	 */
	public WebElement getDelUserBtn() {
		return delUserBtn;
	}
	
	/**
	 * @return the editUserBtn
	 */
	public WebElement getEditUserBtn() {
		return editUserBtn;
	}
	
	/**
	 * @return the editPsdBtn
	 */
	public WebElement getEditPwdBtn() {
		return editPwdBtn;
	}
	
	/**
	 * @return the firstUser
	 */
	public WebElement getFirstUser() {
		return firstUser;
	}	
	
	/**
	 * @return the addUserName
	 */
	public WebElement getAddUserName() {
		return addUserName;
	}	
	
	/**
	 * @return the addPassword
	 */
	public WebElement getAddPassword() {
		return addPassword;
	}	
	
	/**
	 * @return the addRealName
	 */
	public WebElement getAddRealName() {
		return addRealName;
	}	
	
	/**
	 * @return the addPhone
	 */
	public WebElement getAddPhone() {
		return addPhone;
	}	
	
	/**
	 * @return the addEmail
	 */
	public WebElement getAddEmail() {
		return addEmail;
	}	
	
	/**
	 * @return the addRoleSlt
	 */
	public WebElement getAddRoleSlt() {
		return addRoleSlt;
	}	
	
	/**
	 * @return the addSubmit
	 */
	public WebElement getAddSubmit() {
		return addSubmit;
	}	
	
	/**
	 * @return the addCancel
	 */
	public WebElement getAddCancel() {
		return addCancel;
	}	
	
	/**
	 * @return the queryBtn
	 */
	public WebElement getQueryBtn() {
		return queryBtn;
	}	
	
	/**
	 * @return the cancelBtn
	 */
	public WebElement getCancelBtn() {
		return cancelBtn;
	}	
	
	/**
	 * @return the editUserName
	 */
	public WebElement getEditUserName() {
		return editUserName;
	}	
	
	/**
	 * @return the editUserPhone
	 */
	public WebElement getEditUserPhone() {
		return editUserPhone;
	}	
	
	
	/**
	 * @return the editUserEmail
	 */
	public WebElement getEditUserEmail() {
		return editUserEmail;
	}	
	
	
	/**
	 * @return the editPwd
	 */
	public WebElement getEditPwd() {
		return editPwd;
	}	
	
	/**
	 * @return the editPwdSec
	 */
	public WebElement getEditPwdSec() {
		return editPwdSec;
	}	
	
	/**
	 * @return the searchresult
	 */
	public WebElement getSearchresult() {
		return searchresult;
	}
	
	/**
	 * @return the query
	 */
	public WebElement getQuery() {
		return query;
	}
}
