/**
 * 
 */
package com.ccigmall.auto.test.act.pc.category.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.category.IndexAct;
import com.ccigmall.auto.test.page.pc.category.product.ProductManagePage;

/**
 * @author jianping.gao
 * 商品管理
 */
public class ProductManageAct extends IndexAct{
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ProductManageAct.class);
	
	/**
	 * 
	 */
	private ProductManagePage productManagePage;

	/**
	 * 
	 * @param driver
	 */
	public ProductManageAct(WebDriver driver) {
		super(driver);
		productManagePage=new ProductManagePage(driver);
	}
	
	/**
	 * 点击商品管理
	 */
	public void clickProductManagement() {
		logger.info("点击商品管理");
		click(productManagePage.getProductManagement());
	}
		
	/**
	 * 点击商品授权
	 */
	public void clickProductAuthorization() {
		logger.info("点击商品授权");
		click(productManagePage.getProductAuthorization());
	}
		
	/**
	 * 点击商品审核	
	 */
	public void clickProductReview() {
		logger.info("点击商品审核");
		click(productManagePage.getProductReview());
	}
	
	
	/**
	 * 点击供应商商品审核
	 */
	public void clickSupplierProductReview() {
		logger.info("点击供应商商品审核");
		click(productManagePage.getSupplierProductReview());
	}
	
	/**
	 * 点击WOFE商品审核
	 */
	public void clickWofeProductReview() {
		logger.info("点击WOFE商品审核");
		click(productManagePage.getWofeProductReview());
	}
	
	
	/**
	 * 输入商品名称
	 */
	public void enterProductName(String productName) {
		logger.info("输入商品名称 = {}",productName);
		type(productManagePage.getProductName(), productName);
	}
	
	
	/**
	 * 点击审核类型                                                                 
	 */
	public void clickReviewType() {
		logger.info("点击审核类型");
		click(productManagePage.getReviewType());
	}
	
	/**
	 * 点击待审核
	 */
	public void clickPendingReview() {
		logger.info("点击待审核");
		click(productManagePage.getPendingReview());
	}
	
	
	/**
	 * 点击审核未通过
	 */
	public void clickReviewNotPass() {
		logger.info("点击审核未通过");
		click(productManagePage.getReviewNotPass());
	}
	
	/**
	 * 点击审核已通过
	 */
	public void clickReviewPass() {
		logger.info("点击审核已通过");
		click(productManagePage.getReviewPass());
	}
	
	/**
	 * 商品管理  点击检索
	 */
	public void clickSearchButton() {
		logger.info("点击检索");
		click(productManagePage.getSearchButton());
	}
	
	/**
	 * 商品授权  点击检索
	 */
	public void clickAuthorizationSearchButton() {
		logger.info("点击检索");
		click(productManagePage.getAuthorizationSearchButton());
	}
	
	/**
	 * 判断授权之后，对应的经销商是否存在
	 * @throws Exception 
	 */
	public boolean isAuthoryDealerName(String dealerName) throws Exception{
		if(isElementPresent(productManagePage.getAuthoryDealerName(), dealerName)){
			logger.info("经销商  {} 存在",dealerName);
		}else{
			logger.info("经销商   {} 不存在",dealerName);
			throw new TestNGException("经销商     "+dealerName + "  不存在");
		}
		return true;
	}
	
	/**
	 * 点击审核商品名称
	 */
	public void clickProductName(){
		logger.info("点击商品名称");
		click(productManagePage.getSearchResult().get(0));
	}
	
	/**
	 * 点击授权商品名称
	 */
	public void clickAuthoryProductName(){
		logger.info("点击商品名称");
		click(productManagePage.getSearchResultAuthoryName());
	}
	
	/**
	 * 点击审核
	 * 
	 */
	public void clickReviewButton() {
		logger.info("点击审核");
		click(productManagePage.getReviewButton());
	}
	
	/**
	 * 点击授权
	 * 
	 */
	public void clickAuthorizationButton() {
		logger.info("点击授权");
		click(productManagePage.getAuthorizationButton());
	}
	
	
	/**
	 * 输入审核描述 
	 * 
	 */
	public void enterReviewDesction(String description) {
		logger.info("输入审核描述 ");
		type(productManagePage.getReviewDesction(), description);
	}
	
	
	
	/**
	 * 点击审核通过按钮
	 */
	public void clickReviewPassButton() {
		logger.info("点击审核通过按钮");
		click(productManagePage.getReviewPassButton());
	}
	
	/**
	 * 判断审核搜索结果
	 * @throws Exception 
	 */
	public void reviewSearchResult(String productName) throws Exception {	
		if(productManagePage.getSearchResult()==null || productManagePage.getSearchResult().size()==0){
			logger.info("搜索结果为空");
			throw new TestNGException("审核 商品不存在");
		}
//		if(isElementPresent(productManagePage.getSearchResult().get(0).findElement(By.xpath("//td/a")), productName)){
//			logger.info("审核商品  ‘{}’ 存在",productName);
//		}else{
//			logger.info("审核商品  ‘{}’ 不存在",productName);
//			throw new TestNGException("审核 商品不存在");
//		}
	}
	
	/**
	 * 判断授权搜索结果
	 * @throws Exception 
	 */
	public void reviewSearchResultAuthory(String productName) throws Exception {	
		if(productManagePage.getSearchResultAuthory()==null || productManagePage.getSearchResultAuthory().size()==0){
			logger.info("搜索结果为空");
			throw new TestNGException("授权 商品不存在");
		}
		this.pause(2);
		if(isElementPresent(productManagePage.getSearchResultAuthory().get(0).findElement(By.xpath("//table/tbody/tr[1]/td[2]/div/a")), productName)){
			logger.info("授权商品  ‘{}’ 存在",productName);
		}else{
			logger.info("授权商品  ‘{}’ 不存在",productName);
			throw new TestNGException("授权 商品不存在");
		}
	}
}
