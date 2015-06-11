/**
 * 
 */
package com.ccigmall.auto.test.step.pc.supplier.seller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.seller.product.GoodsListAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;

/**
 * @author jianping.gao
 * 搜索待审核商品
 */
public class SearchPendingReviewProStep extends SupplierStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SearchPendingReviewProStep.class);
	
	
	/**
	 * 
	 */
	private GoodsListAct goodsListAct;
	/**
	 * 供应商搜索待审核商品
	 * @throws Exception 
	 */
	@Test(description = "供应商搜索待审核商品")
	public void search() throws Exception {
		try {
			goodsListAct=new GoodsListAct(driver);		
			//点击卖家中心
			goodsListAct.clickSellerCenter();
			//点击货品列表
			goodsListAct.clickGoodsList();
			//待审核的货品
			goodsListAct.clickPendingReview();
			//输入搜索商品名称
			goodsListAct.enterPendingReview(productName);
			//点击搜索
			goodsListAct.clickSearch();
			//获取商品id
			productId=goodsListAct.getExitProduct();
			setMemVal(Constant.PRODUCT_ID, productId);		
		} catch (AssertionError e) {
			logger.error("supplier search product fail ", e);
			Assert.fail("supplier search product fail >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("supplier search product fail ", e);
			throw new TestNGException("supplier search product fail >> "
					+ e.getMessage(), e);
		}
	}

}
