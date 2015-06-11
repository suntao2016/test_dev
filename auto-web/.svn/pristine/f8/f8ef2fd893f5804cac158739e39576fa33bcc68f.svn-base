/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.page.pc.platform.LoginPage;
import com.ccigmall.auto.test.page.pc.platform.promotion.CreatPromotionActivityPage;

/**
 * @author chenjingli
 * 创建活动动作
 */
public class CreatPromotionActivityAct extends IndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CreatPromotionActivityAct.class);
	/**
	 * 平台登录页
	 */
	private CreatPromotionActivityPage activityPage;
	/**
	 * 
	 * @param driver
	 */
	public CreatPromotionActivityAct(WebDriver driver) {
		super(driver);
		activityPage=new CreatPromotionActivityPage(driver);
	}
	
	
	/**
	 * 点击创建活动菜单
	 */
	public void clickCreateActive() {
		logger.info("点击创建活动菜单");
		click(activityPage.getXpathCreateActive());
	}
	/**
	 * 输入活动名称
	 * @param ActiveName
	 */
	public void typeActiveName(String activeName) {
		logger.info("输入活动名称  {}", activeName);
		type(activityPage.getIdTypeActiveName(), activeName);
	}
	/**
	 * 输入开始时间
	 * @param StartTime
	 */
	public void typeStartTime(String startTime) {
		logger.info("输入开始时间  {}", startTime);
		type(activityPage.getIdTypeStartTime(), startTime);
	}
	/**
	 * 输入结束时间
	 */
	public void typeEndTime(String endTime) {
		logger.info("输入结束时间  {}", endTime);
		type(activityPage.getIdTypeEndTime(), endTime);
	}
	/**
	 * 活动描述
	 */
	public void typeDescription(String description) {
		logger.info("输入活动描述  {}", description);
		type(activityPage.getIdTypeDescription(), description);
	}
	/**
	 * 活动广告语
	 */
	public void typeActiveMsg(String activeMsg) {
		logger.info("输入活动广告语  {}", activeMsg);
		type(activityPage.getIdTypeActiveMsg(), activeMsg);
	}
	/**
	 * 点击确定按钮
	 */
	public void clickClickSubmit() {
		logger.info("点击确定按钮");
		click(activityPage.getIdClickSubmit());
	}
	
	/**
	 * 点击弹出框中确定
	 */
	public void clickConfirm() {
		logger.info("点击弹出框中确定");
		click(activityPage.getXpathClickConfirm());
	}

}
