/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.user.authority;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.dealer.user.UserCenterAct;
import com.ccigmall.auto.test.page.pc.dealer.user.authority.AuthorityManagePage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-23 经销商用户中心 权限管理
 */
public class AuthorityManageAct extends UserCenterAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(AuthorityManageAct.class);

	/**
	 * 用户中心页面
	 * 
	 */
	private AuthorityManagePage authorityManagePage;

	/**
	 * 
	 * @param driver
	 */
	public AuthorityManageAct(WebDriver driver) {
		super(driver);
		authorityManagePage = new AuthorityManagePage(driver);
	}

	
	public void clickAddNewRole(){
		logger.info("点击添加新角色:{}", authorityManagePage.getAddRole());
		click(authorityManagePage.getAddRole());
	}
	/**
	 * 输入角色名称
	 */
	public void inputRoleName(String text) {
		logger.info("输入角色名称：{}", text);
		this.type(authorityManagePage.getRoleName(), text);
	}
	/**
	 * 点击 确定
	 */
	public void clickAlertAddConfirm(){
		logger.info("点击添加新角色-确定:{}", authorityManagePage.getAlertAddConfirm());
		click(authorityManagePage.getAlertAddConfirm());
	}
	/**
	 * 点击 确定
	 */
	public void clickConfirm(){
		logger.info("点击-确定:{}", authorityManagePage.getConfirmButton());
		click(authorityManagePage.getConfirmButton());
	}
	/**
	 * 点击 取消
	 */
	public void clickAlertAddCancel(){
		logger.info("点击添加新角色-取消:{}", authorityManagePage.getAlertAddCancel());
		click(authorityManagePage.getAlertAddCancel());
	}
	/**
	 * 输入修改_角色名称
	 */
	public void inputModifyRole(String text) {
		logger.info("输入修改后的角色名称：{}", text);
		this.type(authorityManagePage.getModifyName(), text);
	}
	/**
	 * 点击确定 修改
	 */
	public void clicktModifyRoleConfirm(){
		logger.info("点击修改角色-确定:{}", authorityManagePage.getEditBtn());
		click(authorityManagePage.getEditBtn());
	}

	/**
	 * 点击 修改取消
	 */
	public void clicktModifyRoleCancel(){
		logger.info("点击修改角色-取消:{}", authorityManagePage.getEditBtnCancel());
		click(authorityManagePage.getEditBtnCancel());
	}
	/**
	 * 点击 删除 确定
	 */
	public void clickDelConfirm(){
		logger.info("点击删除 确定:{}", authorityManagePage.getAlertDelConfirm());
		click(authorityManagePage.getAlertDelConfirm());
	}
	/**
	 * 点击 删除 取消
	 */
	public void clicktDelCancel(){
		logger.info("点击添 删除 取消:{}", authorityManagePage.getAlertDelCancel());
		click(authorityManagePage.getAlertDelCancel());
	}
	/**
	 * 点击 全选
	 */
	public void clickCheckAll(){
		logger.info("点击角色全选:{}", authorityManagePage.getCheckAll());
		click(authorityManagePage.getCheckAll());
	}
	
	/**
	 * 点击 修改
	 */
	public void clickAddedRole(String roleName){
		List<WebElement> eles = driver.findElements(By.xpath("//a[@title='"+roleName+"']"));
		int size = eles.size();
		if(size>0){
			WebElement ele = eles.get(size-1);
			logger.info("点击第{}个-{}-的:{}",size, roleName, ele);
			click(ele);
		}else{
			logger.error("未找到新添加的角色名称:{}，无法修改！",roleName);
			Assert.fail("未找到新添加的角色名称，无法修改！");
		}
	}
	
	/**
	 * 点击 修改
	 */
	public void clickModify(String roleName){
		List<WebElement> eles = driver.findElements(By.xpath("//a[@title='"+roleName+"']/following::a[2]"));
		int size = eles.size();
		if(size>0){
			WebElement ele = eles.get(size-1);
			logger.info("点击第{}个-{}-的修改按钮:{}",size, roleName, ele);
			click(ele);
		}else{
			logger.error("未找到新添加的角色名称：{}，无法修改！",roleName);
			Assert.fail("未找到新添加的角色名称，无法修改！");
		}
	}
	/**
	 * 点击 角色删除
	 */
	public void clickDelButton(String roleName){
		List<WebElement> eles = driver.findElements(By.xpath("//a[@title='"+roleName+"']/following::a[1]"));
		int size = eles.size();
		if(size>0){
			WebElement ele = eles.get(size-1);
			logger.info("点击第{}个-{}-的删除按钮:{}",size, roleName, ele);
			click(ele);
		}else{
			logger.error("未找到新添加的角色名称：{}，无法删除！",roleName);
			Assert.fail("未找到新添加的角色名称，无法删除！");
		}
	}
	
}
