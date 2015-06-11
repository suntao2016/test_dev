package com.ccigmall.auto.test.act.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pc.platform.promotion.ActivityListPage;
import com.ccigmall.auto.test.page.pc.platform.promotion.ActivityRuleManagementPage;
import com.ccigmall.auto.test.page.pc.platform.promotion.CreatPromotionActivityPage;
import com.ccigmall.auto.test.page.pc.platform.promotion.GiftManagementPage;

/**
 * @author chenjingli
 * 创建活动动作
 */
public class ActivityListAct  extends SettingActiton {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ActivityListAct.class);
	/**
	 * 活动列表
	 */
	private ActivityListPage listPage;
	private ActivityRuleManagementPage managementPage;
	private GiftManagementPage giftManagementPage;
	/**
	 * 
	 * @param driver
	 */
	public ActivityListAct(WebDriver driver) {
		super(driver);
		listPage=new ActivityListPage(driver);
		managementPage=new ActivityRuleManagementPage(driver);
		giftManagementPage = new GiftManagementPage(driver);
	}
	public ActivityListPage getListPage() {
		return listPage;
	}
	/**
	 * 输入活动名称
	 * @param ActiveName
	 */
	public void typeActiveName(String activeName) {
		logger.info("输入活动名称  {}", activeName);
		type(listPage.getIdTypeActivityName(), activeName);
	}
	/**
	 * 点击查询按钮
	 * @param ActiveName
	 */
	public void clickClickView() {
		logger.info("点击查询按钮");
		click(listPage.getIdIdClickView());
	}
	/**
	 * 点击创建管理规则
	 * @param ActiveName
	 */
	public void clickRuleButton() {
		logger.info("点击创建管理规则");
		click(managementPage.getIdCliRuleButton());
	}
	/**
	 * 输入活动名称
	 * @param ActiveName
	 */
	public void typeRuleName(String ruleName) {
		logger.info("输入规则名称  {}", ruleName);
		type(managementPage.getIdTypeRuleName(),ruleName);
	}
	/**
	 * 输入规则描述
	 * @param ActiveName
	 */
	public void typeRuleDescription(String ruleDescription) {
		logger.info("输入规则描述  {}", ruleDescription);
		type(managementPage.getIdTypeRuleDescription(),ruleDescription);
	}
	/**
	 * 点击管理赠品
	 * @param ActiveName
	 */
	public void clickMangerRule(String flag) {
		if(flag.equals("glgz")){
			logger.info("点击管理规则");
		}else if(flag.equals("glzp")){
			logger.info("点击管理赠品");
		}
		click(listPage.getXpathCliMangerRule());
	}
	/**
	 * 点击{查询添加赠品}按钮
	 * @param ActiveName
	 */
	public void clickQueryButton() {
		logger.info("点击查询添加赠品按钮");
		click(giftManagementPage.getIdCliQueryButton());
	}
	/**
	 * 点击新填加的优惠券规则
	 * @param ActiveName
	 */
	public void clickFirstButton() {
		logger.info("点击新填加的优惠券规则");
		click(giftManagementPage.getXpathCliSureButton());
	}
	/**
	 * 输入赠品描述
	 * @param giftDesc
	 */
	public void typeGiftDesc(String giftDesc) {
		logger.info("输入赠品描述：{}",giftDesc);
		type(giftManagementPage.getIdTypeGiftDesc(),giftDesc);
	}
	/**
	 * 点击确定
	 * @param giftDesc
	 */
	public void clickSubmit() {
		logger.info("点击确定按钮");
		click(giftManagementPage.getIdClickSubmit());
	}
	/**
	 * 点击返回按钮
	 * @param giftDesc
	 */
	public void clickRemoveButton() {
		logger.info("点击返回按钮");
		click(managementPage.getIdClickRemoveButton());
	}
	/**
	 * 选择赠品后点击启用这个规则按钮
	 * @param giftDesc
	 */
	public void clickStartUseing() {
		logger.info("选择赠品后点击启用这个规则按钮");
		click(listPage.getXpathCliStartUseing());
	}
	/**
	 * 点击活动列表
	 * @param giftDesc
	 */
	public void clickLinkCliActivityList() {
		logger.info("点击活动列表");
		click(listPage.getLinkCliActivityList());
	}
}
