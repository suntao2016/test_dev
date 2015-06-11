package com.ccigmall.auto.test.act.pc.retailer.my.account;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.account.UserManagementPage;
/**
 * 
 * @author chenjingli
 *  我的鑫网-我的订单-账户中心-用户管理
 */
public class UserManagementAct extends MyIndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserManagementAct.class);
	
	protected UserManagementPage page;
	public UserManagementAct(WebDriver driver) {
		super(driver);
		this.page = new UserManagementPage(driver);
	}
	// ****************************************************add user********************************************
		/**
		 * 创建新用户
		 */
	public void clickCreateNewUser(){
		logger.info("点击{创建新用户}按钮");
		click(page.getIdCliCreateNewUser());
	}
	/**
	 * 输入新用户名
	 */
	public void typeUserName(String userName){
		logger.info("输入新用户名：{}",userName);
		type(page.getIdTypeUserName(), userName);
	}
	/**
	 * 输入密码
	 */
	public void typePwd(String pwd){
		logger.info("输入密码：{}",pwd);
		type(page.getIdTypePwd(), pwd);
	}
	/**
	 * 再次输入密码
	 */
	public void typePwdAgain(String pwdAgain){
		logger.info("再次输入密码：{}",pwdAgain);
		type(page.getIdTypePwdAgain(), pwdAgain);
	}
	/**
	 * 选择角色
	 */
	public void selectRole(int role){
		logger.info("选择角色：{}",role);
		selectByIndex(page.getIdSelRole(), role);
	}
	/**
	 * 点击添加按钮
	 */
	public void clickAddSubmit(){
		logger.info("点击{添加}按钮");
		click(page.getIdCliSubmit());
	}
	/**
	 * 获得最后一个用户名的名称
	 */
	public String getLastRoleName(){
		logger.info("获得最后一个用户名的名称:{}",getText(page.getXpathGetLastRoleName()));
		return getText(page.getXpathGetLastRoleName());
	}
	/**
	 * 获得下拉框角色名称个数
	 */
	public int getSelectRoles(){
		logger.info("获得下拉框角色名称个数:{}",getElementsNum(page.getXpathGetSelectRoles()));
		return getElementsNum(page.getXpathGetSelectRoles());
	}
	
	// ****************************************************del user********************************************
	/**
	 * 点击第一个删除按钮
	 */
	public void clickFirstDel(){
		logger.info("点击第一个{删除}按钮");
		click(page.getXpathCliFirstDel());
	}
	/**
	 * 点击最后一个删除按钮
	 */
	public void clickLastDel(){
		logger.info("点击最后一个{删除}按钮");
		click(page.getXpathCliLastDel());
	}
	/**
	 * 点击删除中的确定按钮button
	 */
	public void clickDelSure2(){
		logger.info("点击删除中的{确定}按钮button");
		click(page.getXpathCliDelSure2());
	}
	/**
	 * 点击删除中的确定按钮
	 */
	public void clickDelSure1(){
		logger.info("点击删除中的{确定}按钮");
		click(page.getXpathCliDelSure1());
	}
	/**
	 * 点击第一个checkbox
	 */
	public void clickFirstbox(){
		logger.info("点击第一个checkbox");
		click(page.getXpathCliFirstbox());
	}
	/**
	 * 点击最后一个checkbox
	 */
	public void clickLastbox(){
		logger.info("点击最后一个checkbox");
		click(page.getXpathCliLasttbox());
	}
	/**
	 * 点击删除1按钮
	 */
	public void clickDelButton(){
		logger.info("点击{删除}1按钮");
		click(page.getIdDelButton());
	}
	/**
	 * 获得第一个用户名称
	 */
	public String getFirstUserName(){
		logger.info("获得第一个用户名称:{}",getText(page.getXpathGetFirstUserName()));
		return getText(page.getXpathGetFirstUserName());
	}
	/**
	 * 获得最后一个用户名称
	 */
	public String getLastUserName(){
		logger.info("获得最后一个用户名称:{}",getText(page.getXpathGetLastUserName()));
		return getText(page.getXpathGetLastUserName());
	}
	/**
	 * 获得用户列表
	 */
	public int getUserList(){
		logger.info("获得用户列表个数:{}",getElementsNum(page.getIdGetUserList()));
		return getElementsNum(page.getIdGetUserList());
	}
	/**
	 * 获得没有用户时的提示内容
	 */
	public int getNoUserPromptInfo(){
		logger.info("获得没有用户时的提示内容:{}",getElementsNum(page.getXpathGetPromptInfo()));
		return getElementsNum(page.getXpathGetPromptInfo());
	}
	
	//******************************************************update user***********************************************
	
	/**
	 * 点击最后一个修改按钮
	 */
	public void clickLastUpd(){
		logger.info("点击最后一个{修改}按钮");
		click(page.getXpathCliLastUpd());
	}
	
	/**
	 * 点击最后一个修改按钮
	 */
	public void clickUpdate(){
		logger.info("点击{修改}按钮");
		click(page.getXpathCliUpdate());
	}
	/**
	 * 输入密码
	 */
	public void typeUpdatePwd(String pwd){
		logger.info("输入密码：{}",pwd);
		type(page.getXpathTypeUpdPwd(), pwd);
	}
	/**
	 * 再次输入密码
	 */
	public void typeUpdatePwdAgain(String pwdAgain){
		logger.info("再次输入密码：{}",pwdAgain);
		type(page.getXpathTypeUpdPwdAgain(), pwdAgain);
	}
	/**
	 * 选择角色
	 */
	public void selectUpdateRole(int role){
		logger.info("选择角色：{}",role);
		selectByIndex(page.getXpathSelRole(), role);
	}
}
