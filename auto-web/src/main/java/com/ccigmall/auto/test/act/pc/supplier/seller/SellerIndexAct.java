/**
 * 
 */
package com.ccigmall.auto.test.act.pc.supplier.seller;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.IndexAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.SellerIndexPage;

/**
 * @author jianping.gao
 * 卖家中心首页
 *
 */
public class SellerIndexAct extends IndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SellerIndexAct.class);
	/**
	 * 卖家中心首页
	 */
	private SellerIndexPage sellerIndexPage;
	/**
	 * 
	 * @param driver
	 */
	public SellerIndexAct(WebDriver driver) {
		super(driver);
		sellerIndexPage=new SellerIndexPage(driver);
	}
	
	/**
	 * 点击发布商品
	 */
	public void clickCreateProduct(){
		logger.info("点击发布商品  ");
		click(sellerIndexPage.getCreateProduct());
	}
	
	/**
	 * 点击货品列表
	 */
	public void clickGoodsList(){
		logger.info("点击货品列表  ");
		click(sellerIndexPage.getGoodsList());
	}
	
	/**
	 * 点击库存管理
	 */
	public void clickStockManage(){
		logger.info("点击库存管理 ");
		click(sellerIndexPage.getStockManage());
	}
	/**
	 * 点击已卖出的货品
	 */
	public void clickSoldGoods(){
		logger.info("点击已卖出的货品按钮");
		click(sellerIndexPage.getSoldGoods());
	}
	/**
	 * 点击{品牌管理}按钮
	 */
	public void clickBrandManagement(){
		logger.info("点击{品牌管理}按钮");
		click(sellerIndexPage.getLinkBrandManagement());
	}
	/**
	 * 点击弹出框 确定
	 */
	public void clickAlertConfirm(){
		logger.info("点击 提交审核--{弹出框确定}");
		click(sellerIndexPage.getXpathCliAlertConfirm());
	}
	/**
	 * 点击{搜索}按钮
	 */
	public void clickSearchButton(){
		logger.info("点击{搜索}按钮");
		click(sellerIndexPage.getXpathCliSearchButton());
	}
}
