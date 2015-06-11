package com.ccigmall.auto.test.act.pc.retailer.my.account;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.account.BusinessInfoPage;
import com.ccigmall.auto.test.step.pc.retailer.my.account.AddUserStep;
/**
 * 
 * @author chenjingli
 *  我的鑫网-我的订单-账户中心-修改商户信息
 */
public class BusinessInfoAct extends MyIndexAct {
	
	static BusinessInfoPage page;
	public BusinessInfoAct(WebDriver driver) {
		super(driver);
		page = new BusinessInfoPage(driver);
	}
	private final static Logger logger = LoggerFactory
			.getLogger(AddUserStep.class);
	
	/**
	 * 输入email
	 */
	public void typePhone(final String phone){
		logger.info("输入email：{}",phone);
		type(page.getIdTypePhone(), phone);
	}
	
	/**
	 * 输入email
	 */
	public void typeEmail(final String email){
		logger.info("输入email：{}",email);
		type(page.getIdTypeEmail(), email);
	}
	
	/**
	 * 输入fax
	 */
	public void typeFax(final String fax){
		logger.info("输入fax：{}",fax);
		type(page.getIdTypeFax(), fax);
	}
	
	/**
	 * 点击修改
	 */
	public void clickUpdButton(){
		logger.info("点击{修改}按钮");
		click(page.getIdCliUpdButton());
	}
	/**
	 * 获得value值
	 */
	public final String getPhoneValue(){
		logger.info("获得value值是：{}",getValue(page.getIdTypePhone()));
		return getValue(page.getIdTypePhone());
	}

}
