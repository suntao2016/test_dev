package com.ccigmall.auto.test.act.pc.category.user.usermanager;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.category.IndexAct;
import com.ccigmall.auto.test.page.pc.category.user.usermanager.UserManagerPage;

/**
 * @author zhaixiaoyue
 * 用户管理
 */
public class UserManagerAct extends IndexAct {

	

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserManagerAct.class);
	private UserManagerPage umg;
	
	public UserManagerAct(WebDriver driver) {
		super(driver);
		umg = new UserManagerPage(driver);
	}
	
	/**
	 * 点击添加用户管理
	 * 
	 * @param 
	 * 
	 */
	public void clickUsermanger() {
		logger.info("点击添加用户按钮");
		click(umg.getUsermanger());
	}
	
	/**
	 * 点击添加用户按钮
	 * 
	 * @param 
	 * 
	 */
	public void clickAddButton() {
		logger.info("点击添加用户按钮");
		click(umg.getAddUserBtn());
	}
	
	/**
	 * 添加用户用户名输入框
	 * 
	 * @param username
	 * 
	 */
	public String typeAddUserName(String username) {
		username = username + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入用户名 +  {}",username);
		type(umg.getAddUserName(),username);
		return username;
	}
	
	/**
	 * 添加用户密码输入框
	 * 
	 * @param password
	 * 
	 */
	public void typeAddPassword(String password) {
		logger.info("输入密码 +  {}",password);
		type(umg.getAddPassword(),password);
		
	}
	
	/**
	 * 添加用户真实姓名输入框
	 * 
	 * @param addRealName
	 * 
	 */
	public void typeAddRealName(String addRealName) {
		logger.info("输入真实姓名 +  {}",addRealName);
		type(umg.getAddRealName(),addRealName);
		
	}
	
	/**
	 * 添加用户电话输入框
	 * 
	 * @param addPhone
	 * 
	 */
	public void typeAddPhone(String addPhone) {
		logger.info("输入电话 +  {}",addPhone);
		type(umg.getAddPhone(),addPhone);
		
	}
	
	/**
	 * 添加用户邮箱输入框
	 * 
	 * @param addEmail
	 * 
	 */
	public void typeAddEmail(String addEmail) {
		logger.info("输入邮箱 +  {}",addEmail);
		type(umg.getAddEmail(),addEmail);		
	}
	
	/**
	 * 添加用户选择角色
	 * 
	 * @param role
	 * 
	 */
	public void typeAddRoleSlt(String role) {
		logger.info("选择角色 +  {}",role);
		select(umg.getAddRoleSlt(), role);
		
	}
	
	/**
	 * 点击用户编辑保存按钮
	 * 
	 * @param 
	 * 
	 */
	public void clickAddSubmit() {
		logger.info("点击保存按钮");
		click(umg.getAddSubmit());
		click(umg.getQuery());
	}
	
	/**
	 * 点击用户编辑取消按钮
	 * 
	 * @param 
	 * 
	 */
	public void clickAddCancel() {
		logger.info("点击取消按钮");
		click(umg.getAddCancel());
	}
	
	/**
	 * 搜索-用户名输入框
	 * 
	 * @param username
	 * 
	 */
	public void typeUserName(String username) {
		logger.info("输入要搜索的用户名 +  {}",username);
		type(umg.getUserName(),username);
		
	}
	
	
	/**
	 * 点击搜索按钮
	 * 
	 * @param 
	 * 
	 */
	public void clickSearchButton() {
		logger.info("点击搜索按钮");
		click(umg.getSearchButton());
	}
	
	/**
	 * 点击第一条记录
	 * 
	 * @param 
	 * 
	 */
	public void clickFirstUser() {
		logger.info("点击第一条记录");
		click(umg.getFirstUser());
	}
	
	/**
	 * 判断用户是否添加成功
	 * 
	 * @param uname
	 * 
	 */
	public boolean isExistUser(String uname) {
		
		if(isElementPresent(umg.getFirstUser(), uname)){
			logger.info("查找用户成功");
			return true;
		}else{
			logger.info("查找用户失败");
			return false;
		}		
	}
	
	/**
	 * 判断用户是否删除成功
	 * 
	 * @param 
	 * 
	 */
	public boolean isDelUser() {
		
		if(isElementPresent(umg.getSearchresult(),"暂无数据")){
			logger.info("查找用户失败");
			return true;
		}else{
			logger.info("查找用户成功");
			return false;
		}		
	}
	
	/**
	 * 点击修改用户按钮
	 * 
	 * @param 
	 * 
	 */
	public void clickEditUserBtn() {
		clickFirstUser();
		logger.info("点击修改用户按钮");
		click(umg.getEditUserBtn());
	}
	
	/**
	 * 修改用户邮箱
	 * 
	 * @param editUserEmail
	 * 
	 */
	public void typeEditUserEmail(String editUserEmail) {
		logger.info("输入用户新邮箱 + {}",editUserEmail);
		type(umg.getEditUserEmail(),editUserEmail);
	}
	
	/**
	 * 点击修改密码按钮
	 * 
	 * @param editUserBtn
	 * 
	 */
	public void clickEditPwdBtn() {
		clickFirstUser();
		logger.info("点击修改用户按钮");
		click(umg.getEditPwdBtn());
	}
	
	/**
	 * 修改用户密码
	 * 
	 * @param editPwd
	 * 
	 */
	public void typeEditPwd(String editPwd) {
		logger.info("输入新密码 + {}",editPwd);
		type(umg.getEditPwd(),editPwd);
		logger.info("输入新密码确认 + {}",editPwd);
		type(umg.getEditPwdSec(),editPwd);
	}
	
	/**
	 * 删除用户
	 * 
	 * @param 
	 * 
	 */
	public void clickDelUserBtn() {
		clickFirstUser();
		logger.info("删除用户");
		click(umg.getDelUserBtn());
		click(umg.getQueryBtn());
		click(umg.getQuery());
	}
	
}
