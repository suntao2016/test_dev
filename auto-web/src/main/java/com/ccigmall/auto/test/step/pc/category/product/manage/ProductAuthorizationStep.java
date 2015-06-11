/**
 * 
 */
package com.ccigmall.auto.test.step.pc.category.product.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.product.manage.ProductAuthorizationAct;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author jianping.gao
 * 商品授权
 */
public class ProductAuthorizationStep extends CategoryStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ProductAuthorizationStep.class);
	
	/**
	 * 商品授权
	 */
	private ProductAuthorizationAct productAuthorizationAct;
	
	/**
	 * 商品授权
	 * @throws Exception
	 */
	@Test(description = "商品授权")
	public void review() throws Exception {
		try{
			productAuthorizationAct=new ProductAuthorizationAct(driver);
			//点击商品管理
			productAuthorizationAct.clickProductManage();
			//点击商品授权
			productAuthorizationAct.clickProductAuthorization();
			//输入商品名称
			productAuthorizationAct.enterProductName(productName);
			//点击检索
			productAuthorizationAct.clickAuthorizationSearchButton();
			//判断搜索结果
			productAuthorizationAct.reviewSearchResultAuthory(productName);
			//点击授权
			productAuthorizationAct.clickAuthorizationButton();
			//点击选择经销商图标 
			productAuthorizationAct.clickSelectDealer();
			//输入经销商名称
			productAuthorizationAct.enterDealerName(dealerName);			
			//点击经销商名称检索
			productAuthorizationAct.clickDealerSearchButton();
			//点击选择经销商
			productAuthorizationAct.clickCheckeddealerName();
			//起始日期
			productAuthorizationAct.enterStartDate();
			//结束日期
			productAuthorizationAct.enterEndDate();
			//点击全国代理                                                        
			productAuthorizationAct.clickNationalAgency();
			//独家代理
			productAuthorizationAct.clickExclusiveAgent();
			//保存
			productAuthorizationAct.clickSave();
			//刷新
			productAuthorizationAct.refresh();
			//点击商品管理
			productAuthorizationAct.clickProductManage();
			//点击商品授权
			productAuthorizationAct.clickProductAuthorization();
			//输入商品名称
			productAuthorizationAct.enterProductName(productName);
			//点击检索
			productAuthorizationAct.clickAuthorizationSearchButton();
			//判断搜索结果
			productAuthorizationAct.reviewSearchResultAuthory(productName);
			//点击授权商品
			productAuthorizationAct.clickAuthoryProductName();
			//判断授权之后，对应的经销商是否存在
			productAuthorizationAct.isAuthoryDealerName(dealerName);
			
		} catch (AssertionError e) {
			logger.error("商品授权  ", e);
			Assert.fail("商品授权  >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("商品授权 ", e);
			throw new TestNGException("商品授权   >> "
					+ e.getMessage(), e);
		}
	}
}
