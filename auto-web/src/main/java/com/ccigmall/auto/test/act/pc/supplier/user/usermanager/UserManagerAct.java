package com.ccigmall.auto.test.act.pc.supplier.user.usermanager;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.user.UserCenterAct;
import com.ccigmall.auto.test.page.pc.supplier.user.usermanage.UserManagerPage;
/**
 * @author zhaixiaoyue
 * 供应商-用户管理
 */
public class UserManagerAct extends UserCenterAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UserCenterAct.class);
	/**
	 * 
	 */
	private UserManagerPage ump;
	
	
	public UserManagerAct(WebDriver driver) {
		super(driver);
		ump = new UserManagerPage(driver);
	}
	
	/**
	 * 点击创建新用户按钮
	 */
	public void clickAddUserBtn() {
		logger.info("点击创建新用户按钮");
		click(ump.getAddUserBtn());
	}	
	
	/**
	 * 输入新用户名
	 */
	public String typeAddUserName(String username) {
		username = username + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入新用户名称 + {}",username);
		type(ump.getAddUserName(),username);
		return username;
	}	
	
	/**
	 * 输入密码
	 */
	public void typeAddUserPwd(String password) {
		logger.info("输入密码 + {}",password);
		type(ump.getAddUserPwd(),password);
		type(ump.getAddUserPwdR(),password);
	}	
	
	/**
	 * 选中角色
	 */
	public void selectAddUserRole(String role) {
		logger.info("选中角色 + {}",role);
		select(ump.getAddUserRole(), role);
	}	
	
	/**
	 * 点击确定按钮提交
	 */
	public void clickAddSubmmit() {
		logger.info("点击确定按钮提交");
		click(ump.getAddSubmmit());
		clickQuery();
	}	
	
	/**
	 * 点击取消按钮
	 */
	public void clickAddCancel() {
		logger.info("点击确定按钮提交");
		click(ump.getAddCancel());
	}	
	
	/**
	 * 点击选中第一条记录
	 */
	public void clickRecordsel() {
		logger.info("点击选中第一条记录");
		click(ump.getRecordselA());
		if(isElementPresent(ump.getRecordselB())){
			logger.info("点击选中第二条记录");
			click(ump.getRecordselB());
		}
		
	}	
	
	/**
	 * 点击修改
	 */
	public boolean clickRecordmodify(String name) {
		int i = searchUser(name);
		if(i>0){
			logger.info("点击修改用户按钮");
			click(driver.findElement(By.xpath("//div/div[3]/div/ul[2]/li["+(i+1)+"]/p[4]/span[2]")));
			return true;
		}else{
		return false;
		}
	}	
	
	/**
	 * 输入修改密码
	 */
	public void typeModifyPwd(String password) {
		logger.info("输入修改密码 + {}",password);
		type(ump.getModifypwd(),password);
		type(ump.getModifypwdre(),password);
	}	
	
	/**
	 * 点击确定按钮提交
	 */
	public void clickModifySubmit() {
		logger.info("点击确定按钮提交");
		click(ump.getModifySubmit());
		clickQuery();
	}	
	
	/**
	 * 点击单条删除按钮
	 */
	public void clickRecorddel() {
		
		if(isElementPresent(ump.getRecordselA())){
			logger.info("存在用户可以删除");
			click(ump.getRecorddel());
			clickDelQuery();
		}else{
			logger.info("没有用户可以删除");
		}
			
	}	
	
	
	/**
	 * 点击批量删除用户按钮
	 */
	public void clickDelUser() {
		logger.info("点击创建新用户按钮");
		click(ump.getDelUserBtn());
	}	
	
	/**
	 * 点击删除用户提示框确认按钮
	 */
	public void clickDelQuery() {
		logger.info("点击创删除用户提示框确认按钮");
		click(ump.getDelQuery());		
	}	
	
	/**
	 * 点击创删除用户提示框取消按钮
	 */
	public void clickDelCancel() {
		logger.info("点击创删除用户提示框取消按钮");
		click(ump.getDelCancel());
	}	
	
	/**
	 * 点击提示框确认按钮
	 */
	public void clickQuery() {
		logger.info("点击提示框确认按钮");
		click(ump.getQuery());
	}	
	
	/**
	 * 获取当前记录个数
	 */
	public int getRecordNum() {
		logger.info("点击提示框确认按钮");
		int num = getElementsNum(ump.getTr());
		return num;
	}	
	
	/**
	 * 查询内存中的用户所在位置
	 */
	public int searchUser(String name) {
	int	num = getRecordNum();
		for (int i = 0; i < num; i++) {
			if (name.equals(driver.findElement(By.xpath("//div/div[3]/div/ul[2]/li["+(i+1)+"]/p[2]")).getText().trim()))
					 {
				logger.info("返回用户+{}+所在行数 + {}",name, i);			
				return i;
			}
		}
		logger.info("没有找到用户 + {}", name);
		return 0;
	}	
	
	/**
	 * 删除内存中的用户
	 */
	public boolean deleteUser(String name) {
		int i = searchUser(name);
		if(i>0){
			logger.info("点击修改用户按钮");
			click(driver.findElement(By.xpath("//div/div[3]/div/ul[2]/li["+(i+1)+"]/p[4]/span[1]")));
			clickDelQuery();
			if(isDeleteSucess()){
				logger.error("用户管理-删除成功 ");
				clickQuery();
				return true;
			}else{
				logger.error("用户管理-删除失败 ");				
			}			
		}	
		return false;
	}	
	
	public boolean isDeleteSucess() {
		if("操作成功!".equals(ump.getSuccess().getText().trim())){
			return true;
		}
		return false;
	}
}
