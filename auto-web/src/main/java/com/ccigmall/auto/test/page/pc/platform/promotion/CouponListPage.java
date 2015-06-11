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
 * 优惠券列表页面
 * 
 * @version 1.0
 */
public class CouponListPage extends SettingPage {

	public CouponListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final static Logger logger = LoggerFactory.getLogger(CouponListPage.class);

	/**
	 * 优惠券列表
	 */
	@FindBy(linkText = "优惠券列表")
	private  WebElement  couponList ;
	
	/**
	 *优惠券列表-输入优惠券名称进行检索
	 */
	@FindBy(id = "couponname")
	private  WebElement  couponNameToSearch ;
	
	
	
	/**
	 *优惠券列表-输入优惠券名称进行检索
	 */
	@FindBy(id = "button")
	private  WebElement  searchButton ;
	
	
	/**
	 *规则查询按钮
	 */
	@FindBy(id = "find")
	private  WebElement  ruleFindButton ;
	
	
	/**
	 *查看使用规则
	 */
	@FindBy(linkText = "查看使用规则")
	private  WebElement  useRule ;
	
	/**
	 *创建使用规则
	 */
	@FindBy(id = "create")
	private  WebElement  createUseRule;
	
	/**
	 *优惠券使用规则名称
	 */
	@FindBy(id = "couponrulename")
	private  WebElement  couponRuleName;
	
	/**
	 *优惠券使用规则 满足金额
	 */
	@FindBy(id = "meetpiece")
	private  WebElement  meetPiece;
	
	/**
	 *创建使用规则
	 */
	@FindBy(id = "createRule")
	private  WebElement  createRule;
	
	/**
	 *启用使用规则
	 */
	@FindBy(xpath="//td[@class='tac']/a[1]")
	private  WebElement  startUseRule;
	
	/**
	 *获取优惠券编号
	 */
	@FindBy(css=".tb-coupon > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(1)")
	private  WebElement  couponId;
	


	public WebElement getCouponId() {
		return couponId;
	}



	public WebElement getCouponList() {
		return couponList;
	}



	public WebElement getCouponNameToSearch() {
		return couponNameToSearch;
	}



	public WebElement getSearchButton() {
		return searchButton;
	}



	public WebElement getRuleFindButton() {
		return ruleFindButton;
	}



	public WebElement getUseRule() {
		return useRule;
	}



	public WebElement getCreateUseRule() {
		return createUseRule;
	}



	public WebElement getCouponRuleName() {
		return couponRuleName;
	}



	public WebElement getMeetPiece() {
		return meetPiece;
	}



	public WebElement getCreateRule() {
		return createRule;
	}



	public WebElement getStartUseRule() {
		return startUseRule;
	}
	
	

}
