/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.seller;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.page.pc.platform.seller.SellerIndexPage;

/**
 * @author jianping.gao
 * 卖家中心
 */
public class SellerIndexAct extends IndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SellerIndexAct.class);

	/**
	 * 
	 */
	private SellerIndexPage sellerIndexPage;
	
	/**
	 * 卖家中心
	 * @param driver
	 */
	public SellerIndexAct(WebDriver driver) {
		super(driver);
		sellerIndexPage=new SellerIndexPage(driver);
	}
	
	/**
	 * 点击商品列表
	 */
	public void clickProductList(){
		logger.info("点击商品列表");
		click(sellerIndexPage.getProductList());
	}
	
	/**
	 * 点击库存管理
	 */
	public void clickStockManage(){
		logger.info("点击库存管理");
		click(sellerIndexPage.getStockManage());
	}
	
	/**
	 * 点击期货订单
	 */
	public void clickFuturesOrder(){
		logger.info("点击期货订单");
		click(sellerIndexPage.getFuturesOrder());
	}
	
	/**
	 * 点击现货订单
	 */
	public void clickSpotOrder(){
		logger.info("点击现货订单");
		click(sellerIndexPage.getSpotOrder());
	}
	
	/**
	 * 点击交易账务
	 */
	public void clickTradingAccount(){
		logger.info("点击交易账务");
		click(sellerIndexPage.getTradingAccount());
	}
	
	/**
	 * 输入商品Id
	 */
	public void enterProductId(String productId) {
		logger.info("输入商品Id = {}", productId);
		type(sellerIndexPage.getProductId(), productId);
	}
	
	/**
	 * 商品名称
	 */
	public void enterProductName(String productName) {
		logger.info("输入商品名称 = {}", productName);
		type(sellerIndexPage.getProductName(), productName);
	}
	
	
	/**
	 * 点击商品搜索按钮  
	 */
	public void clickSearch(){
		logger.info("商品搜索按钮  ");
		click(sellerIndexPage.getProductSearchButton());
	}
	
	/**
	 * 
	 * 判断商品搜索结果
	 */
	public boolean isSearchResultExsit(String productName){
		if(isElementPresent(sellerIndexPage.getSearchResult(), productName)){
			logger.info("搜索商品    {}  存在",productName);		
			return true;
		}else{
			logger.info("搜索商品    {}  不存在",productName);
			throw new TestNGException("商品      " + productName + "   不存在");
		}	
	}

}
