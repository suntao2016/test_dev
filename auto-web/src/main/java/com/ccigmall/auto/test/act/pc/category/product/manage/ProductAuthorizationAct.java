/**
 * 
 */
package com.ccigmall.auto.test.act.pc.category.product.manage;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.category.product.ProductManageAct;
import com.ccigmall.auto.test.page.pc.category.product.manage.ProductAuthorizationPage;

/**
 * @author jianping.gao
 * 商品授权
 */
public class ProductAuthorizationAct extends ProductManageAct{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ProductAuthorizationAct.class);
	
	/**
	 * 
	 */
	private ProductAuthorizationPage productAuthorizationPage;

	/**
	 * 
	 * @param driver
	 */
	public ProductAuthorizationAct(WebDriver driver) {
		super(driver);
		productAuthorizationPage =new ProductAuthorizationPage(driver);
	}
	
	/**
	 * 点击选择经销商图标
	 */
	public void clickSelectDealer() {
		logger.info("点击选择经销商图标");
		click(productAuthorizationPage.getSelectDealer());
	}
	
	
	/**
	 * 输入经销商名称
	 */
	public void enterDealerName(String dealerName) {
		logger.info("输入经销商名称");
		type(productAuthorizationPage.getDealerName(), dealerName);
	}
	
	
	/**
	 * 点击经销商名称检索
	 */
	public void clickDealerSearchButton() {
		logger.info("点击经销商名称检索");
		click(productAuthorizationPage.getDealerSearchButton());
	}
	
	/**
	 * 点击选择经销商
	 */
	public void clickCheckeddealerName() {
		logger.info("点击选择经销商");
		this.pause(2);
		click(productAuthorizationPage.getCheckeddealerName());
	}
	
	
	/**
	 * 起始日期
	 */
	public void enterStartDate() {
		logger.info("输入起始日期");
		click(productAuthorizationPage.getStartDate());
		clickStartDateOk();
	}
	
	
	/**
	 * 起始日期确认
	 */
	public void clickStartDateOk() {
		click(productAuthorizationPage.getStartDateOk());		
	}
	
	
	/**
	 * 结束日期
	 */
	public void enterEndDate() {
		logger.info("输入结束日期");
		type(productAuthorizationPage.getEndDate(), "2099-12-26");
	}
	
	/**
	 * 点击全国代理
	 */
	public void clickNationalAgency() {
		logger.info("点击全国代理");
		click(productAuthorizationPage.getNationalAgency());		
	}
	
	
	/**
	 * 独家代理
	 */
	public void clickExclusiveAgent() {
		logger.info("点击独家代理");
		click(productAuthorizationPage.getExclusiveAgent());				
	}
	

	/**
	 * 保存
	 */
	public void clickSave() {
		logger.info("点击保存");
		click(productAuthorizationPage.getSave());				
	}
}
