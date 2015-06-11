/**
 * 
 */
package com.ccigmall.auto.test.step.pc.platform.promotion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.platform.promotion.CouponAddAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;

/**
 * @author dengshuhai 
 * <p>优惠券添加平台
 */
public class CouponAddStep extends PlatformStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CouponAddStep.class);

	/**
	 * 优惠券添加动作
	 */
	protected CouponAddAct couponAddAct;

	/**
	 * wofe创建优惠券
	 * 
	 * @throws Exception
	 */
	@Test(description = "wofe创建优惠券")
	public void testCouponAdd() throws Exception {

		try {
			// 初始化页面动作
			couponAddAct = new CouponAddAct(driver);

			Date date = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// 时间戳 加在优惠券名称后面 用以区分识别
			String timeStmp = new SimpleDateFormat("yyMMddHHmmss").format(date);
			// 优惠券名称
			String couponName = "自动化优惠券" + timeStmp;
			// 自动化优惠券用途说明
			String couponUse = "自动化优惠券用途说明" + timeStmp;
			// 自动化优惠券规则名
			String ruleName = "自动化优惠券规则名" + timeStmp;
			// 获取当前时间并且+1分钟，设置优惠券开始时间
			date.setMinutes(date.getMinutes() + 1);
			String startTime = sd.format(date);
			// 获取当前时间并且+1天，设置优惠券结束时间
			date.setDate(date.getDate() + 7);
			String endTime = sd.format(date);
			// 将优惠券名称存入缓存
			this.setMemVal(Constant.COUPON_NAME, couponName);
			// 点击促销管理
			couponAddAct.clickPromotionManage();
			// 点击创建优惠券
			couponAddAct.clickAddCoupon();
			// 输入优惠券名
			couponAddAct.inputCouponName(couponName);
			// 输入优惠券金额
			couponAddAct.inputCouponAcount("100");
			// 输入优惠券开始时间
			couponAddAct.inputStartTime(startTime);
			// 输入优惠券结束时间
			couponAddAct.inputEndTime(endTime);
			// 输入优惠券用途说明
			couponAddAct.inputCouponUse(couponUse);
			// 点击创建优惠券-创建按钮
			couponAddAct.clickCreate();
			// 点击弹窗确定
			couponAddAct.clickConfirmButton();
			// 优惠券列表-输入优惠券名称-进行检索
			couponAddAct.inputCouponNameToSearch(couponName);
			// 优惠券列表-输入优惠券名称-点击检索
			couponAddAct.clickSearchButton();
			// 优惠券列表-输入优惠券名称-进行检索后-点击查看规则
			couponAddAct.clickUseRule();
			// 切换 WOFE-优惠券规则列表
			couponAddAct.switchToWindow("WOFE-优惠券规则列表");
			// 点击创建规则按钮
			couponAddAct.clickCreateUseRule();
			// 输入规则名称
			couponAddAct.inputUseRuleName(ruleName);			
			// 输入规则消费满足金额
			couponAddAct.inputMeetPiece("200");
			// 最后一步-创建-按钮
			couponAddAct.clickCreateRule();
			// 点击弹窗确定
			couponAddAct.clickConfirmButton();
			// 输入规则名称
			couponAddAct.inputUseRuleName(ruleName);
			// couponAddAct.clickRuleFindButton();
			// 点击规则启用-按钮
			couponAddAct.startUseRule();
			// 点击弹窗确定
			couponAddAct.clickConfirmButton();
			// 点击优惠券列表
			couponAddAct.clickCouponList();
			// 优惠券列表-输入优惠券名称-进行检索
			couponAddAct.inputCouponNameToSearch(couponName);
			// 优惠券列表-输入优惠券名称-点击检索
			couponAddAct.clickSearchButton();
			// 获取优惠券编号并存入缓存
			String couponID = couponAddAct.getCouponId();
			this.setMemVal(Constant.COUPON_ID, couponID);

		} catch (AssertionError e) {
			logger.error("pc platform addCoupon fail ", e);
			couponAddAct.failScreenShot("pc platform addCoupon fail ");
			Assert.fail("pc platform addCoupon fail >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("pc platform addCoupon fail ", e);
			couponAddAct.failScreenShot("pc platform addCoupon fail ");
			throw new TestNGException("pc platform addCoupon fail >> "
					+ e.getMessage(), e);
		}
	}

}
