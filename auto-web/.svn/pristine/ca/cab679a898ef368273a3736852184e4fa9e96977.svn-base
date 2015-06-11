package com.ccigmall.auto.test.page.pc.retailer.my.account;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.retailer.my.MyIndexPage;

/**
 * 
 * @author chenjingli
 *  我的鑫网-我的订单-账户中心-用户管理
 */
public class UserManagementPage extends MyIndexPage {
	public UserManagementPage(WebDriver driver) {
		super(driver);
	}
	// ****************************************************add user********************************************
	/**
	 * 创建新用户
	 */
	@FindBy(id="button")
	public WebElement idCliCreateNewUser;
	/**
	 * 输入心用户名
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::input[1]")
	public WebElement idTypeUserName;
	/**
	 * 输入密码
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::input[2]")
	public WebElement idTypePwd;/**
	 * 再次输入密码
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::input[3]")
	public WebElement idTypePwdAgain;
	/**
	 * 选择角色
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::select")
	public WebElement idSelRole;
	/**
	 * 添加按钮
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::input[4]")
	public WebElement idCliSubmit;
	/**
	 * select 角色中的个数
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::option[@value!='']")
	public List<WebElement> xpathGetSelectRoles;
	/**
	 * select 选择第一个角色
	 */
	@FindBy(xpath="//div[@id='userCreate-box']/descendant::option[@value!=''][1]")
	public WebElement xpathSelFirstRole;
	/**
	 * 获得最后一个用户名的名称
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::tr[last()]/td[3]")
	public WebElement xpathGetLastRoleName;
	
	// ****************************************************delete user********************************************
	/**
	 * 用户列表个数
	 */
	@FindBy(id="checkbox")
	public List<WebElement> idGetUserList;
	/**
	 * 默认点击第一个删除按钮
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::a[1]")
	public WebElement xpathCliFirstDel;
	
	/**
	 * 默认点击最后一个删除按钮
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::a[last()-1]")
	public WebElement xpathCliLastDel;
	
	/**
	 * 点击删除中确定1按钮
	 */
	@FindBy(xpath="//div[@id='delete-user-box']/descendant::input[3]")
	public WebElement xpathCliDelSure1;

	/**
	 * 点击删除1按钮
	 */
	@FindBy(id="delete_users")
	public WebElement idDelButton;
	/**
	 * 点击删除中确定2按钮
	 */
	@FindBy(xpath="//div[@id='delete-user-box']/descendant::input[2]")
	public WebElement xpathCliDelSure2;
	
	/**
	 * 点击第一个checkbox测试 选择删除
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::input[1]")
	public WebElement xpathCliFirstbox;
	
	/**
	 * 点击第一个checkbox测试 选择删除
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::input[last()]")
	public WebElement xpathCliLasttbox;
	
	/**
	 * 获得第一个用户名称
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::tr[2]/td[3]")
	public WebElement xpathGetFirstUserName;
	/**
	 * 获得最后一个用户名称
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::tr[last()]/td[3]")
	public WebElement xpathGetLastUserName;
	
	/**
	 * 获得没有用户时的提示内容
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::tr[2]/td")
	public List<WebElement> xpathGetPromptInfo;
	// ****************************************************update user********************************************
	
	/**
	 * 默认点击第一个修改按钮
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::a[2]")
	public WebElement xpathCliFirstUpd;
	
	
	/**
	 * 默认点击最后一个修改按钮
	 */
	@FindBy(xpath="//form[@id='userForm']/descendant::a[last()]")
	public WebElement xpathCliLastUpd;
	
	/**
	 * 默认点击修改
	 */
	@FindBy(xpath="//div[@id='userUpdate-box']/descendant::input[5]")
	public WebElement xpathCliUpdate;
	
	/**
	 * 输入密码
	 */
	@FindBy(xpath="//div[@id='userUpdate-box']/descendant::input[3]")
	public WebElement xpathTypeUpdPwd;/**
	 * 再次输入密码
	 */
	@FindBy(xpath="//div[@id='userUpdate-box']/descendant::input[4]")
	public WebElement xpathTypeUpdPwdAgain;
	
	/**
	 * 选择修改的角色
	 */
	@FindBy(xpath="//div[@id='userUpdate-box']/descendant::select")
	public WebElement xpathSelRole;
	
	//******************************************element location end****************************************************
	public WebElement getIdCliCreateNewUser() {
		return idCliCreateNewUser;
	}

	public WebElement getIdTypeUserName() {
		return idTypeUserName;
	}

	public WebElement getIdTypePwd() {
		return idTypePwd;
	}

	public WebElement getIdTypePwdAgain() {
		return idTypePwdAgain;
	}

	public WebElement getIdSelRole() {
		return idSelRole;
	}

	public WebElement getIdCliSubmit() {
		return idCliSubmit;
	}

	public List<WebElement> getXpathGetSelectRoles() {
		return xpathGetSelectRoles;
	}

	public WebElement getXpathSelFirstRole() {
		return xpathSelFirstRole;
	}

	public List<WebElement> getIdGetUserList() {
		return idGetUserList;
	}

	public WebElement getXpathCliFirstDel() {
		return xpathCliFirstDel;
	}

	public WebElement getXpathCliDelSure1() {
		return xpathCliDelSure1;
	}

	public WebElement getXpathCliDelSure2() {
		return xpathCliDelSure2;
	}

	public WebElement getXpathCliFirstbox() {
		return xpathCliFirstbox;
	}

	public WebElement getXpathCliFirstUpd() {
		return xpathCliFirstUpd;
	}

	public WebElement getXpathCliUpdate() {
		return xpathCliUpdate;
	}

	public WebElement getXpathGetLastRoleName() {
		return xpathGetLastRoleName;
	}

	public WebElement getXpathGetFirstUserName() {
		return xpathGetFirstUserName;
	}

	public WebElement getIdDelButton() {
		return idDelButton;
	}


	public List<WebElement> getXpathGetPromptInfo() {
		return xpathGetPromptInfo;
	}

	public WebElement getXpathCliLastDel() {
		return xpathCliLastDel;
	}

	public WebElement getXpathCliLasttbox() {
		return xpathCliLasttbox;
	}

	public WebElement getXpathGetLastUserName() {
		return xpathGetLastUserName;
	}

	public WebElement getXpathCliLastUpd() {
		return xpathCliLastUpd;
	}

	public WebElement getXpathTypeUpdPwd() {
		return xpathTypeUpdPwd;
	}

	public WebElement getXpathTypeUpdPwdAgain() {
		return xpathTypeUpdPwdAgain;
	}

	public WebElement getXpathSelRole() {
		return xpathSelRole;
	}
	
	
}
