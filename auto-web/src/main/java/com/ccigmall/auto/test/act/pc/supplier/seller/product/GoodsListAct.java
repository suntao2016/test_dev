/**
 * 
 */
package com.ccigmall.auto.test.act.pc.supplier.seller.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.product.GoodsListPage;

/**
 * @author jianping.gao
 * 货品列表
 */
public class GoodsListAct extends SellerIndexAct {
	

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SellerIndexAct.class);
	
	/**
	 * 货品列表货品列表
	 */
	private GoodsListPage goodsListPage;
	
	/**
	 * 
	 * @param driver
	 */
	public GoodsListAct(WebDriver driver) {
		super(driver);
		goodsListPage=new GoodsListPage(driver);
	}
	
	/**
	 * 点击待审核商品
	 */
	public void clickPendingReview() {
		logger.info("点击待审核商品");
		click(goodsListPage.getPendingReview());
	}
	
	/**
	 * 输入搜索商品名称
	 */
	public void enterPendingReview(String productName) {
		logger.info("输入搜索商品名称 = {}",productName);
		type(goodsListPage.getSearchProName(), productName);
	}
	
	/**
	 * 点击搜索
	 */
	public void clickSearch() {
		logger.info("点击搜索");
		click(goodsListPage.getSearchbutton());
	}
	
	/**
	 * 获取商品id
	 */
	public String getExitProduct() {
		logger.info("判断商品存在不");
		String id="不存在";
		if(isElementPresent(goodsListPage.getSearchResultProId())){
		    id=getText(goodsListPage.getSearchResultProId());
		    id=id.substring(5);			
		}
		logger.info("存在商品ID = {}",id);
		return id;
	}
	
	
	  
    /**
     * 订单管理--已卖出的货品列表 act
     * 
     * ***********************************************************************************************************
     *   click Classification
     */
	
	/**
	 * 点击--等待确认 text
	 */
	public void clickWaitingConfirm() {
		logger.info("点击--{等待确认}跳转文本 ");
		click(goodsListPage.getLinCliWaitingConfirm());
	}
	/**
	 * 点击--等待发货 text
	 */
	public void clickWaitingShip() {
		logger.info("点击--{等待发货}跳转文本 ");
		click(goodsListPage.getLinCliWaitingShip());
	}
	/**
	 * 点击--已发货 text
	 */
	public void clickShiped() {
		logger.info("点击--{已发货}跳转文本 ");
		click(goodsListPage.getLinCliShiped());
	}
	/**
	 * 点击--已完成text
	 */
	public void clickCompleted() {
		logger.info("点击--{已完成}跳转文本 ");
		click(goodsListPage.getLinCliCompleted());
	}
	
	
	 //type and select info  Classification
	/**
	 * 输入已卖出物品的商品名称
	 */
	public void typeGoodsName(String goodsName) {
		logger.info("输入已卖出物品的商品名称：{} ",goodsName);
		type(goodsListPage.getIdTypeGoodsName(),goodsName);
	}
	/**
	 * 输入已卖出物品的商品id
	 */
	public void typeOrderId(String goodsOrderId) {
		logger.info("输入已卖出物品的商品id：{} ",goodsOrderId);
		type(goodsListPage.getIdTypeGoodsOrderId(),goodsOrderId);
	}
	/**
	 * 输入已卖出物品的经销商名称
	 */
	public void typeDealerName(String dealerName) {
		logger.info("输入已卖出物品的经销商名称：{} ",dealerName);
		type(goodsListPage.getIdTypeDealerName(),dealerName);
	}
	/**
	 * 选择已卖出物品的订单状态
	 */
	public void selOrderStatu(String orderStatu) {
		logger.info("选择已卖出物品的订单状态：{} ",orderStatu);
		select(goodsListPage.getIdSelOrderStatu(),orderStatu);
	}

}
