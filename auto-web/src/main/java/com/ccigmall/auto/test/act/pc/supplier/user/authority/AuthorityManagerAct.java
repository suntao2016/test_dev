package com.ccigmall.auto.test.act.pc.supplier.user.authority;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.user.UserCenterAct;
import com.ccigmall.auto.test.page.pc.supplier.user.authority.AuthorityManagerPage;
/**
 * @author zhaixiaoyue
 * 角色-角色管理-权限管理
 */
public class AuthorityManagerAct extends UserCenterAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(AuthorityManagerAct.class);
	/**
	 * 
	 */
	private AuthorityManagerPage amp;
	
	
	public AuthorityManagerAct(WebDriver driver) {
		super(driver);
		amp = new AuthorityManagerPage(driver);
	}
	
	/**
	 * 点击创建新角色按钮
	 */
	public void clickAddBtn() {
		logger.info("点击创建新角色按钮");
		click(amp.getAddBtn());
	}	
	
	/**
	 * 输入新角色名
	 */
	public String typeSupplierName(String rolename) {
		rolename = rolename + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入新角色名称 + {}",rolename);
		type(amp.getAuName(),rolename);
		return rolename;
	}	
	
	/**
	 * 输入修改角色名
	 */
	public String typeMdSupplierName(String rolename) {
		rolename = rolename + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入修改角色名称 + {}",rolename);
		type(amp.getAuNameMd(),rolename);
		return rolename;
	}	
	
	
	/**
	 * 点击确定按钮
	 */
	public void clickAddSubmmit() {
		logger.info("点击确定按钮");
		click(amp.getaddSubmmit());
		clickQuery();
	}	
	
	/**
	 * 点击返回按钮
	 */
	public void clickAddCancel() {
		logger.info("点击返回按钮");
		click(amp.getAddCancel());
	}	
	
	/**
	 * 点击修改按钮
	 */
	public void clickEditBtn() {
		logger.info("点击修改按钮");
		click(amp.getEditBtn());
		clickQuery();
	}	
	
	/**
	 * 点击修改返回按钮
	 */
	public void clickEditBtnCancel() {
		logger.info("点击修改返回按钮");
		click(amp.getEditBtnCancel());
	}	
	
	/**
	 * 点击选择
	 */
	public boolean clickRecordSel(String rolename) {		
		int num = searchRecord(rolename);
		if(num>0){
			logger.info("点击修改按钮");
			click(driver.findElement(By.xpath("//div/li["+(num+1)+"]/a")));
			return true;
		}else{
			logger.info("没有找到角色 + {}",rolename);
			return false;
		}
	}	
	
	/**
	 * 点击修改
	 */
	public void clickRecordmodify(String rolename) {		
		int num = searchRecord(rolename);
		if(num>0){
			logger.info("点击修改按钮");
			click(driver.findElement(By.xpath("//li["+(num+1)+"]/div/a[2]")));			
		}else{
			logger.info("没有找到角色 + {}",rolename);
		}		
	}	
	
	/**
	 * 点击删除
	 */
	public void clickDelBtn(String rolename) {		
		int num = searchRecord(rolename);
		if(num>0){
			logger.info("点击删除角色按钮");
			click(driver.findElement(By.xpath("//li["+(num+1)+"]/div/a[1]")));
			clickDelQuery();
			if(isDeleteSucess()){
				logger.error("权限管理-删除成功 ");
				
			}else{
				logger.error("权限管理-删除失败 ");
			}
			clickQuery();
		}
	}	
	
	
	/**
	 * 点击删除角色提示框确认按钮
	 */
	public void clickDelQuery() {
		logger.info("点击创删除角色提示框确认按钮");
		click(amp.getDelQuery());
		
	}	
	
	/**
	 * 点击删除角色提示框取消按钮
	 */
	public void clickDelCancel() {
		logger.info("点击创删除角色提示框取消按钮");
		click(amp.getDelCancel());
	}	
	
	/**
	 * 点击提示框确认按钮
	 */
	public void clickQuery() {
		logger.info("点击提示框确认按钮");
		click(amp.getQuery());
	}	
	
	/**
	 * 获取当前记录个数
	 */
	public int getRecordNum() {
		logger.info("获取当前记录个数");
		int num = getElementsNum(amp.getTr());
		return num;
	}	
	
	
	
	/**
	 * 查询内存中的角色序号 //div/li[2]/a
	 */
	public int searchRecord(String name) {
	int	num = getRecordNum();
		for (int i = 0; i < num; i++) {
			if (name.equals(driver.findElement(By.xpath("//div/li["+(i+1)+"]/a")).getText().trim()))
					 {
				logger.info("找到角色名称 + {}", name);				
				return i;
			}
		}
		logger.info("没有找到角色 + {}", name);
		return 0;
	}	
	
	/**
	 * 点击菜单权限的选择按钮
	 */
	public void clickCheck() {
		logger.info("点击选中权限");
		click(amp.getMenuSel());
		clickSaveBtn();
	}	

	/**
	 * 点击菜单权限的保存按钮
	 */
	public void clickSaveBtn() {
		logger.info("点击菜单权限的保存按钮");
		click(amp.getSaveBtn());
		clickQuery();
	}	
	
	public boolean isDeleteSucess() {
		if("操作成功!".equals(amp.getSuccess().getText().trim())){
			return true;
		}
		return false;
	}
	
}
