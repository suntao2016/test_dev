package com.ccigmall.auto.test.page.pc.supplier.user.usermanage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.pc.supplier.user.UserCenterPage;
/**
 * @author zhaixiaoyue
 * 供应商-用户管理
 */
public class UserManagerPage extends UserCenterPage {
	/**
	 * 
	 * @param driver
	 */
	public UserManagerPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 创建新用户按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[1]/li[2]/button")
	private WebElement addUserBtn;
	
	/**
	 * 删除按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[1]/li[3]/button")
	private WebElement delUserBtn;
	
	/**
	 * 用户名输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='name']")
	private WebElement addUserName;
	
	/**
	 * 密码输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private WebElement addUserPwd;
	
	/**
	 * 密码重复输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='repassword']")
	private WebElement addUserPwdR;
	
	/**
	 * 角色选择框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='roleId']")
	private WebElement addUserRole;
	
	/**
	 * 确定按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='addUser']")
	private WebElement addSubmmit;
	
	/**
	 * 取消按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='addUserCancel']")
	private WebElement addCancel;
	
	/**
	 * 选中第一个按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[3]/div/ul[2]/li[1]/p[1]/input")
	private WebElement recordselA;
	
	/**
	 * 选中第二个按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[3]/div/ul[2]/li[2]/p[1]/input")
	private WebElement recordselB;
	
	
	/**
	 * 记录删除按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[2]/li/p[4]/span[1]")
	private WebElement recorddel;
	
	/**
	 * 修改按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[2]/li/p[4]/span[2]")
	private WebElement recordmodify;
	
	/**
	 * 修改页面的密码输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='password1']")
	private WebElement modifypwd;
	
	/**
	 * 修改页面的密码输入确认框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='repassword1']")
	private WebElement modifypwdre;
	
	/**
	 * 修改页面的修改按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='userEidt']")
	private WebElement modifySubmit;
	
	/**
	 * 修改页面的取消按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='userEidtCancel']")
	private WebElement cancelBtn;
	
	
	
	
	/**
	 * 删除确认按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/div/input[1]")
	private WebElement delQuery;
	
	/**
	 * 删除取消按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/div/input[2]")
	private WebElement delCancel;
	
	/**
	 * 提示框确认按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/div/input")
	private WebElement query;
	
	/**
	 * 用户列表 //div[3]/div/ul[2]
	 *
	 */
	@FindBy(how = How.XPATH, using = "//ul[@class='title_2']/li")
	private List<WebElement> tr;
	
	/**
	 * 删除成功提示框文字
	 *
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div")
	private WebElement success;
	
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
	 * @return the addUserName
	 */
	public WebElement getAddUserName() {
		return addUserName;
	}
	
	/**
	 * @return the addUserPwd
	 */
	public WebElement getAddUserPwd() {
		return addUserPwd;
	}
	
	/**
	 * @return the addUserPwdR
	 */
	public WebElement getAddUserPwdR() {
		return addUserPwdR;
	}
	
	/**
	 * @return the addUserRole
	 */
	public WebElement getAddUserRole() {
		return addUserRole;
	}
	
	/**
	 * @return the addSubmmit
	 */
	public WebElement getAddSubmmit() {
		return addSubmmit;
	}
	
	/**
	 * @return the recordselA
	 */
	public WebElement getRecordselA() {
		return recordselA;
	}
	
	/**
	 * @return the recordselB
	 */
	public WebElement getRecordselB() {
		return recordselB;
	}
	
	/**
	 * @return the addCancel
	 */
	public WebElement getAddCancel() {
		return addCancel;
	}
	
	/**
	 * @return the recorddel
	 */
	public WebElement getRecorddel() {
		return recorddel;
	}
	
	/**
	 * @return the recordmodify
	 */
	public WebElement getRecordmodify() {
		return recordmodify;
	}
	
	/**
	 * @return the delQuery
	 */
	public WebElement getDelQuery() {
		return delQuery;
	}
	
	/**
	 * @return the delCancel
	 */
	public WebElement getDelCancel() {
		return delCancel;
	}
	
	/**
	 * @return the query
	 */
	public WebElement getQuery() {
		return query;
	}
	
	/**
	 * @return the modifypwd
	 */
	public WebElement getModifypwd() {
		return modifypwd;
	}
	
	/**
	 * @return the modifypwdre
	 */
	public WebElement getModifypwdre() {
		return modifypwdre;
	}
	
	/**
	 * @return the modifyBtn
	 */
	public WebElement getModifySubmit() {
		return modifySubmit;
	}
	
	/**
	 * @return the cancelBtn
	 */
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	/**
	 * @return the tr
	 */
	public List<WebElement> getTr() {
		return tr;
	}
	
	/**
	 * @return the success
	 */
	public WebElement getSuccess() {
		return success;
	}
	
}
