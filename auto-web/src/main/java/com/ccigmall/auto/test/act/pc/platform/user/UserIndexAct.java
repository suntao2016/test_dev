/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.user;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.act.pc.platform.LoginAct;
import com.ccigmall.auto.test.page.pc.platform.user.UserIndexPage;

/**
 * @author jianping.gao
 *  用户首页
 */
public class UserIndexAct extends IndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(LoginAct.class);
	
	/**
	 * 用户首页
	 */
	private UserIndexPage userIndexPage;

	/**
	 * 用户首页
	 * @param driver
	 */
	public UserIndexAct(WebDriver driver) {
		super(driver);
		userIndexPage=new UserIndexPage(driver);
	}
	
	/**
	 * 商户审核
	 *
	 */
	public void clickMerchant(){
		logger.info("点击商户审核");
		click(userIndexPage.getMerchant());
	}
	
	
	/**
	 * 设备审核
	 *
	 */
	public void clickDevice(){
		logger.info("点击设备审核");
		click(userIndexPage.getDevice());
	}
	
	/**
	 * 品牌审核
	 *
	 */
	public void clickBrand(){
		logger.info("点击品牌审核");
		click(userIndexPage.getBrand());
	}
	
	
	/**
	 * 零售商问题反馈
	 *
	 */
	public void clickRetailerProblem(){
		logger.info("点击零售商问题反馈");
		click(userIndexPage.getRetailerProblem());
	}
	
	/**
	 * 经销商问题反馈
	 *
	 */
	public void clickDealerProblem(){
		logger.info("点击经销商问题反馈");
		click(userIndexPage.getDealerProblem());
	}
	
	/**
	 * 基本信息管理
	 *
	 */
	public void clickBaseInfoManage(){
		logger.info("点击基本信息管理");
		click(userIndexPage.getBaseInfoManage());
	}
	/**
	 * 用户管理
	 *
	 */
	public void clickUserManage(){
		logger.info("点击用户管理");
		click(userIndexPage.getUserManage());
	}
	
	/**
	 * 权限管理
	 *
	 */
	public void clickAuthoriyManage(){
		logger.info("点击权限管理");
		click(userIndexPage.getAuthoriyManage());
	}
	/**
	 * 点击搜索按钮
	 *
	 */
	public void clickSearchButton(){
		logger.info("点击{搜索}按钮");
		click(userIndexPage.getXpathCliSearchButton());
	}
	/**
	 * 点击弹出框 确定
	 */
	public void clickAlertConfirm(){
		logger.info("点击 提交审核--{弹出框确定}");
		click(userIndexPage.getXpathCliAlertConfirm());
	}
}
