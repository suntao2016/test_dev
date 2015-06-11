package com.ccigmall.auto.test.act.pc.category.user.rolemanager;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.category.IndexAct;
import com.ccigmall.auto.test.page.pc.category.user.rolemanager.RoleManagerPage;


/**
 * @author zhaixiaoyue
 * 角色管理-角色管理
 */
public class RoleManagerAct extends IndexAct {

	

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RoleManagerAct.class);
	private RoleManagerPage rmg;
	
	public RoleManagerAct(WebDriver driver) {
		super(driver);
		rmg = new RoleManagerPage(driver);
	}
	
	/**
	 * 点击添加角色管理
	 * 
	 * @param addRoleBtn
	 * 
	 */
	public void clickRolemanger() {
		logger.info("点击添加角色管理菜单");
		click(rmg.getRolemanager());
	}
	
	/**
	 * 点击添加角色按钮
	 * 
	 * @param addUserBtn
	 * 
	 */
	public void clickAddButton() {
		logger.info("点击添加角色按钮");
		click(rmg.getAddRoleBtn());
	}
	
	/**
	 * 添加角色角色名输入框
	 * 
	 * @param addRoleName
	 * 
	 */
	public String typeAddRoleName(String rolename) {
		rolename = rolename + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入角色名 +  {}",rolename);
		type(rmg.getAddRoleName(),rolename);
		return rolename;
	}	
	
	
	/**
	 * 点击角色编辑保存按钮
	 * 
	 * @param addSubmit
	 * 
	 */
	public void clickAddSubmit() {
		logger.info("点击保存按钮");
		click(rmg.getAddSubmit());
		click(rmg.getQuery());
	}
	
	/**
	 * 点击角色编辑取消按钮
	 * 
	 * @param addCancel
	 * 
	 */
	public void clickAddCancel() {
		logger.info("点击取消按钮");
		click(rmg.getAddCancel());
	}
	
	/**
	 * 搜索-角色名输入框
	 * 
	 * @param addEmail
	 * 
	 */
	public void typeRoleName(String rolename) {
		logger.info("输入要搜索的角色名 +  {}",rolename);
		type(rmg.getRoleName(),rolename);
		
	}
	
	
	/**
	 * 点击搜索按钮
	 * 
	 * @param searchButton
	 * 
	 */
	public void clickSearchButton() {
		logger.info("点击搜索按钮");
		click(rmg.getSearchButton());
	}
	
	/**
	 * 点击第一条记录
	 * 
	 * @param firstUser
	 * 
	 */
	public void clickFirstRole() {
		logger.info("点击第一条记录");
		click(rmg.getFirstRole());
	}
	
	/**
	 * 判断角色是否添加成功
	 * 
	 * @param 
	 * 
	 */
	public boolean isExistRole(String rname) {
		
		if(isElementPresent(rmg.getFirstRole(), rname)){
			logger.info("查找角色成功");
			return true;
		}else{
			logger.info("查找角色失败");
			return false;
		}		
	}
	
	/**
	 * 判断角色是否删除成功
	 * 
	 * @param 
	 * 
	 */
	public boolean isDelUser() {
		
		if(isElementPresent(rmg.getSearchresult(),"暂无数据")){
			logger.info("查找角色失败");
			return true;
		}else{
			logger.info("查找角色成功");
			return false;
		}		
	}
	
	/**
	 * 点击修改角色按钮
	 * 
	 * @param editUserBtn
	 * 
	 */
	public void clickEditRoleBtn() {
		clickFirstRole();
		logger.info("点击修改角色按钮");
		click(rmg.getEditRoleBtn());
	}
	
	/**
	 * 修改角色名称
	 * 
	 * @param editrole
	 * 
	 */
	public String typeEditRole(String editrole) {
		editrole = editrole + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入角色新名称 + {}",editrole);
		type(rmg.getAddRoleName(),editrole);
		return editrole;
	}
	
	
	/**
	 * 点击角色授权按钮
	 * 
	 * @param 
	 * 
	 */
	public void clickAuthorizeBtn() {
		clickFirstRole();
		logger.info("点击修改角色按钮");
		click(rmg.getAuthorizeBtn());
	}
	
	
	/**
	 * 角色授权
	 * 
	 * @param 
	 * 
	 */
	public void Authorize() {
		logger.info("点击第一个功能---添加产品线");
		click(rmg.getAddRoleA());
		logger.info("点击第二功能---属性管理");
		click(rmg.getAddRoleB());
	}
	
	/**
	 * 删除角色
	 * 
	 * @param 
	 * 
	 */
	public void clickDelRoleBtn() {
		clickFirstRole();
		logger.info("删除角色");
		click(rmg.getDelRoleBtn());
		click(rmg.getQueryBtn());
		click(rmg.getQuery());
	}
	
}
