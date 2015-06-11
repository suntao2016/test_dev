/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.user.review.merchant;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.platform.user.UserIndexAct;
import com.ccigmall.auto.test.page.pc.platform.user.review.merchant.MerchantPage;

/**
 * @author jianping.gao
 * 商户审核 公共部分
 */
public class MerchantAct extends UserIndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MerchantAct.class);
	
	/**
	 * 
	 */
	private MerchantPage merchantPage;

	/**
	 * 
	 * @param driver
	 */
	public MerchantAct(WebDriver driver) {
		super(driver);
		merchantPage=new MerchantPage(driver);
	}
	
	/**
	 * 供应商
	 *
	 */
	public void clickSupplier(){
		logger.info("点击供应商");
		click(merchantPage.getSupplier());
	}
	
	
	/**
	 * 经销商
	 *
	 */
	public void clickDealer(){
		logger.info("点击经销商");
		click(merchantPage.getDealer());
	}
	
	/**
	 * 零售商
	 *
	 */
	public void clickRetailer(){
		logger.info("点击零售商");
		click(merchantPage.getRetailer());
	}
	
	
	/**
	 * 商户名称
	 *
	 */
	public void enterMerhantName(String name){
		logger.info("输入商户名称 = {}",name);
		type(merchantPage.getMerchantName(), name);
	}
	
	
	/**
	 * 商户状态类型
	 *
	 */
	public void selectMerchantSatusType(String status){
		logger.info("选择商户状态 = {}",status);
		select(merchantPage.getMerchantSatusType(), status);
	}
	
	
	/**
	 * 商户搜索
	 *
	 */
	public void clickMerchantSearchButton(){
		logger.info("点击商户搜索");
		click(merchantPage.getMerchantSearchButton());
	}
	
	/**
	 * 第一个搜索状态
	 *
	 */
	public void checkMerchantStatus(String status){
		if(isElementPresent(merchantPage.getMerchantStatus(), status)){
			logger.info("商户状态正确");
		}else{
			logger.info("商户状态错误");
		}	
		logger.info("期望状态{},实际状态{}",status,merchantPage.getMerchantStatus());
	}
	
	
	/**
	 * 商户查看  
	 *
	 */
	public void clickMerchantView(){
		logger.info("点击商户查看");
		if(isElementPresent(merchantPage.getMerchantView())){
			click(merchantPage.getMerchantView());
		}else{
			throw new TestNGException("商户不存在");
		}
		
	}
	
	
	/**
	 * 通过
	 *
	 */
	public void clickPass(){
		logger.info("点击通过按钮");
		click(merchantPage.getPass());
		remind();
	}
	
	
	
	/**
	 * 不通过  
	 *
	 */
	public void clickNoPass(){
		logger.info("点击不通过按钮");
		click(merchantPage.getNoPass());
		remind();
	}
	
	
	/**
	 * 提示
	 *
	 */	
	public void remind(){	
	    click(merchantPage.getRemindOk());
	}
	
	/**
	 * 第一个搜索商户名称
	 *
	 */
	public boolean checkMerchantName(String name){
		if(name.equals(merchantPage.getMerchantRecordName().getText())){
			logger.info("商户一致");
			return true;
		}else{
			logger.info("商户查询错误");
			return false;
		}	
		
	}
	
	
}
