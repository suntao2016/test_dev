/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.page.pc.platform.promotion.CouponListPage;

/**
 * @author dengshuhai
 * 
 * @since 2014-12-25
 * 
 *        优惠券创建动作
 */
public class CouponListAct extends IndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CouponListAct.class);
	/**
	 * 平台登录页
	 */
	private CouponListPage couponListPage;

	/**
	 * 
	 * @param driver
	 */
	public CouponListAct(WebDriver driver) {
		super(driver);
		couponListPage=new CouponListPage(driver);
	}

	
	
	/**
	 * 优惠券列表-输入优惠券名称-进行检索
	 * 
	 * @param couponName
	 */
	public void inputCouponNameToSearch(String couponName) {
		logger.info("优惠券列表-输入优惠券名称进行查询 {}", couponName);
		type(couponListPage.getCouponNameToSearch(), couponName);
		pause(1);
	}
	
	/**
	 * 优惠券列表-输入优惠券名称-点击检索
	 * 
	 */
	public void clickSearchButton() {
		logger.info("优惠券列表-输入优惠券名称进行查询 {}", couponListPage.getSearchButton());
		click(couponListPage.getSearchButton());
	}
	
	/**
	 * 优惠券列表-输入优惠券名称-点击检索
	 * 
	 */
	public void clickCouponList() {
		logger.info("点击-优惠券列表 {}", couponListPage.getCouponList());
		click(couponListPage.getCouponList());
	}


	/**
	 * 优惠券列表-输入优惠券名称-进行检索后-点击查看规则
	 * 
	 * 
	 */
	public void clickUseRule() {
		logger.info("优惠券列表-输入优惠券名称-进行检索后-点击查看规则 {}", couponListPage.getUseRule());
		click(couponListPage.getUseRule());
	}
	
	/**
	 * 点击创建规则按钮
	 */
	public void clickCreateUseRule() {
		logger.info("点击创建规则按钮 {}", couponListPage.getCreateUseRule());
		click(couponListPage.getCreateUseRule());
	}
	
	/**
	 * 输入规则名称
	 */
	public void inputUseRuleName(String ruleName ) {
		logger.info("输入规则名称 {}", ruleName);
		type(couponListPage.getCouponRuleName(), ruleName);
	}
	
	/**
	 * 输入规则消费满足金额
	 */
	public void inputMeetPiece(String meetPiece ) {
		logger.info("输入规则消费满足金额 {}", meetPiece);
		type(couponListPage.getMeetPiece(), meetPiece);
	}
	
	
	/**
	 * 最后一步-创建-按钮
	 */
	public void clickCreateRule() {
		logger.info("最后一步-创建-按钮 {}", couponListPage.getCreateRule());
		click(couponListPage.getCreateRule());
	}
	
	/**
	 * 点击规则查询按钮
	 * 
	 */
	public void clickRuleFindButton() {
		logger.info("点击规则查询按钮 {}", couponListPage.getRuleFindButton());
		click(couponListPage.getRuleFindButton());
	}
	
	/**
	 * 点击规则启用-按钮
	 */
	public void startUseRule() {
		logger.info("点击规则启用-按钮 ");
		click(couponListPage.getStartUseRule());
	}
	/**
	 * 获取优惠券编号
	 */
	public String getCouponId() {
		String couponId = this.getText(couponListPage.getCouponId()).trim();
		logger.info("获取优惠券编号:{} ",couponId);
		return couponId;
	}
	
	
	
}
