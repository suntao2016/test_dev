/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.page.pc.platform.promotion.CouponAddPage;

/**
 * @author dengshuhai
 * 
 * @since 2014-12-25
 * 
 *        优惠券创建动作
 */
public class CouponAddAct extends CouponListAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CouponAddAct.class);
	/**
	 * 平台登录页
	 */
	private CouponAddPage couponAddPage;

	/**
	 * 
	 * @param driver
	 */
	public CouponAddAct(WebDriver driver) {
		super(driver);
		couponAddPage=new CouponAddPage(driver);
	}

	/**
	 * 创建优惠券
	 */
	public void clickAddCoupon() {
		logger.info("点击创建优惠券：{}", couponAddPage.getAddCoupon());
		click(couponAddPage.getAddCoupon());
	}

	public CouponAddPage getCouponAddPage() {
		return couponAddPage;
	}

	/**
	 * 输入优惠券名称
	 * 
	 * @param couponName
	 * 
	 */
	public void inputCouponName(String couponName) {
		logger.info("输入优惠券名称  {}", couponName);
		type(couponAddPage.getCouponName(), couponName);
	}

	/**
	 * 输入优惠券金额
	 * 
	 * @param couponAcount
	 * 
	 */
	public void inputCouponAcount(String couponAcount) {
		logger.info("输入优惠券金额  {}", couponAcount);
		type(couponAddPage.getCouponAcount(), couponAcount);
	}

	/**
	 * 输入优惠券开始日期
	 * 
	 * @param startTime
	 * 
	 */
	public void inputStartTime(String startTime) {
		logger.info(" 输入优惠券开始日期  {}", startTime);
		type(couponAddPage.getStartTime(), startTime);
	}

	/**
	 * 输入优惠券结束日期
	 * 
	 * @param endTime
	 * 
	 */
	public void inputEndTime(String endTime) {
		logger.info(" 输入优惠券结束日期  {}", endTime);
		type(couponAddPage.getEndTime(), endTime);
	}

	/**
	 * 输入券用途说明
	 * 
	 * @param couponUse
	 * 
	 */
	public void inputCouponUse(String couponUse) {
		logger.info("输入券用途说明 {}", couponUse);
		type(couponAddPage.getCouponUse(), couponUse);
	}

	/**
	 * 点击创建优惠券-创建按钮
	 */
	public void clickCreate() {
		logger.info("点击创建优惠券-创建按钮：{}", couponAddPage.getCreateCouponButton());
		click(couponAddPage.getCreateCouponButton());
	}
	
	/**
	 * 点击弹窗确定
	 */
	public void clickConfirmButton() {
		logger.info("点击弹窗确定：{}", couponAddPage.getConfirmButton());
		click(couponAddPage.getConfirmButton());
	}
	
	
	
}
