package com.ccigmall.auto.test.page.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.page.SettingPage;
import com.ccigmall.auto.test.step.SettingStep;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;

/**
 * 
 * @author dengshuhai
 * 
 * @since 2014-12-25
 * 
 * 优惠券创建页面
 * 
 * @version 1.0
 */
public class CouponAddPage extends SettingPage {

	public CouponAddPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final static Logger logger = LoggerFactory.getLogger(CouponAddPage.class);

	/**
	 * 创建优惠券
	 */
	@FindBy(linkText = "创建优惠券")
	private  WebElement  addCoupon ;
	

	/**
	 *优惠券名称
	 */
	@FindBy(id = "couponname")
	private  WebElement  couponName ;
	
	/**
	 *优惠券金额
	 */
	@FindBy(id = "couponacount")
	private  WebElement  couponAcount ;
	
	/**
	 *优惠券有效开始时间
	 */
	@FindBy(id = "starttime")
	private  WebElement  startTime ;

	/**
	 *优惠券结束时间
	 */
	@FindBy(id = "endtime")
	private  WebElement  endTime ;
	
	
	/**
	 *优惠券用途说明
	 */
	@FindBy(id = "couponuse")
	private  WebElement  couponUse ;
	
	/**
	 *优惠券创建
	 */
	@FindBy(id = "createCoupon")
	private  WebElement  createCouponButton ;

	/**
	 *弹窗确定按钮
	 */
	@FindBy(xpath = "//input[@type='button'][@value='确定']")
	private  WebElement  confirmButton ;

	public static Logger getLogger() {
		return logger;
	}

	public WebElement getAddCoupon() {
		return addCoupon;
	}

	public WebElement getCouponName() {
		return couponName;
	}

	public WebElement getCouponAcount() {
		return couponAcount;
	}

	public WebElement getStartTime() {
		return startTime;
	}

	public WebElement getEndTime() {
		return endTime;
	}

	public WebElement getCouponUse() {
		return couponUse;
	}

	public WebElement getCreateCouponButton() {
		return createCouponButton;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	
	

}
