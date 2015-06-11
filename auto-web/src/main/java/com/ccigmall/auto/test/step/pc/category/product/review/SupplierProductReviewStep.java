/**
 * 
 */
package com.ccigmall.auto.test.step.pc.category.product.review;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.product.ProductManageAct;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author jianping.gao
 * 供应商商品审核
 */
public class SupplierProductReviewStep extends CategoryStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierProductReviewStep.class);
	
	/**
	 * 商品管理
	 */
	private ProductManageAct productManageAct;
	
	/**
	 * 供应商商品审核
	 * @throws Exception
	 */
	@Test(description = "供应商商品审核")
	public void review() throws Exception {
		try{
			productManageAct=new ProductManageAct(driver);
			//点击商品管理
			productManageAct.clickProductManage();
			//点击商品审核
			productManageAct.clickProductReview();
			//点击供应商商品审核
			productManageAct.clickSupplierProductReview();
			//输入商品名称
			productManageAct.enterProductName(productName);
			//点击审核类型                                                                 
			productManageAct.clickReviewType();
			//点击待审核
			productManageAct.clickPendingReview();
			//点击检索
			productManageAct.clickSearchButton();
			//判断搜索结果
			productManageAct.reviewSearchResult(productName);
			//点击审核
			productManageAct.clickReviewButton();
			//输入审核描述 
			productManageAct.enterReviewDesction("审核通过");
			//点击审核通过按钮
			productManageAct.clickReviewPassButton();			
			//check
			
			productManageAct.refresh();
			//点击商品管理
			productManageAct.clickProductManage();
			//点击商品审核
			productManageAct.clickProductReview();
			//点击供应商商品审核
			productManageAct.clickSupplierProductReview();
			//输入商品名称
			productManageAct.enterProductName(productName);
			//点击审核类型                                                                 
			productManageAct.clickReviewType();
			//点击审核已通过
			productManageAct.clickReviewPass();
			//点击检索
			productManageAct.clickSearchButton();
			//判断搜索结果
			productManageAct.reviewSearchResult(productName);
			
		} catch (AssertionError e) {
			logger.error("供应商商品审核  ", e);
			Assert.fail("供应商商品审核  >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("供应商商品审核 ", e);
			throw new TestNGException("供应商商品审核   >> "
					+ e.getMessage(), e);
		}
	}
}
