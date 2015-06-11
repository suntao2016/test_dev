package com.ccigmall.auto.test.act.pc.retailer.my.account;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.account.PrivilegeManagementPage;

/**
 * 
 * @author  chenjingli
 * 我的鑫网-我的订单-账户中心-权限管理act
 */
public class PrivilegeManagementAct extends MyIndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(PrivilegeManagementAct.class);
	protected PrivilegeManagementPage page;
	public PrivilegeManagementAct(WebDriver driver) {
		super(driver);
		page = new PrivilegeManagementPage(driver);
	}
	/**
	 * 点击{新建角色}按钮
	 */
	public void clickCreateRole(){
		logger.info("点击{新建角色}按钮");
		click(page.getIdCliCreateNewRole());
	}
	/**
	 * 点击{确定}按钮
	 */
	public void clickSureButton(){
		logger.info("点击{确定}按钮");
		click(page.getIdCliSureButton());
	}
	/**
	 * 点击{删除}第一个角色按钮
	 */
	public void clickDeleteFirst(){
		logger.info("点击{删除}第一个角色按钮");
		click(page.getXpathCliDelOne());
	}
	/**
	 * 点击{删除}最后一个角色按钮
	 */
	public void clickDeleteLast(){
		logger.info("点击{删除}最后一个角色按钮");
		click(page.getXpathCliDelLastOne());
	}
	/**
	 * 点击{修改}第一个角色按钮
	 */
	public void clickUpdateFirst(){
		logger.info("点击{修改}第一个角色按钮");
		click(page.getXpathCliUpdateOne());
	}
	/**
	 * 获得角色列表
	 */
	public int getRoleList(){
		logger.info("获得角色列表个数为：{}",getElementsNum(page.getXpathGetRoleList()));
		return getElementsNum(page.getXpathGetRoleList());
	}
	/**
	 * 获得最后一个角色名称
	 */
	public String getLastRole(){
		logger.info("获得最后一个角色名称为：{}",getText(page.getXpathGetLastRole()));
		return getText(page.getXpathGetLastRole());
	}
	/**
	 * 获得第一个角色名称
	 */
	public String getFirstRole(){
		logger.info("获得第一个角色名称为：{}",getText(page.getXpathGetFirstRole()));
		return getText(page.getXpathGetFirstRole());
	}
	/**
	 * 点击最后一个角色名称
	 */
	public void clickLastRole(){
		logger.info("点击最后一个角色名称");
		click(page.getXpathGetLastRole());
	}
	
	/**
	 * 输入新建角色名称
	 */
	public void typeRoleName(String newRoleName){
		logger.info("输入新建角色名称为：{}",newRoleName);
		type(page.getXpathTypeRoleName(),newRoleName);
	}
	
	
	/**
	 * 输入修改的角色名称
	 */
	public void typeUpdRoleName(String updRoleName){
		logger.info("输入修改的角色名称：{}",updRoleName);
		type(page.getXpathTypeUpdRoleName(),updRoleName);
	}
	
	/**
	 * 获得修改角色中 输入框的角色名称
	 */
	public String getUpdRoleName(){
		logger.info("获得角色名称为：{}",getText(page.getXpathTypeRoleName()));
		return getText(page.getXpathTypeRoleName());
	}
	
	/**
	 * 点击{提交}按钮
	 */
	public void clickSubmitButton(){
		logger.info("点击{提交}按钮");
		click(page.getIdCliSubmit());
	}
	
	/**
	 * 点击修改角色中的{提交}按钮
	 */
	public void clickUpdSubmitButton(){
		logger.info("点击修改角色中的{确定}按钮");
		click(page.getXpathCliUpdSureButton());
	}
	/**
	 * 点击{优惠券}checkbox
	 */
	public void clickTestCheckbox(){
		logger.info("点击{优惠券}checkbox");
		click(page.getXpathTestCheckbox());
	}
	/**
	 * 点击删除角色中的确定按钮
	 */
	public void clickDelSure(){
		logger.info(" 点击{删除角色中的确定}按钮");
		click(page.getIdCliDelSure());
	}
}
