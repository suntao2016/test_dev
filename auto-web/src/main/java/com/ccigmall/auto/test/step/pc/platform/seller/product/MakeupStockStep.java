/**
 * 
 */
package com.ccigmall.auto.test.step.pc.platform.seller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.platform.seller.product.ProductListAct;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;

/**
 * @author jianping.gao
 * 
 *         补录库存
 */
public class MakeupStockStep extends PlatformStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MakeupStockStep.class);

	/**
	 * 补录库存
	 */
	protected ProductListAct productListAct;

	/**
	 * 补录库存
	 * 
	 * @throws Exception
	 */
	@Test(description = "wofe补录库存")
	public void goodsShelves() throws Exception {

		try {
			productListAct = new ProductListAct(driver);
			// 点击卖家中心
			productListAct.clickSellerCenter();
			// 输入上商品ID
			productListAct.enterProductId(productId);
			// 点击商品搜索按钮
			productListAct.clickSearch();
			productListAct.isSearchResultExsit(productName);
			// 点击补录库存
			productListAct.clickMakeupStock();
			//点击选择仓库
			productListAct.clickSelectWarehouse();
			// 输入经销商
			productListAct.enterMakeupStockDealerName(dealerName);
			// 点击经销商查询
			productListAct.clickDealerNameButton();
			// 点击经销商checkBox
			productListAct.clickDealerNameCheckBox();
			// 点击经销商确认按钮
			productListAct.clickDealerNameOk();
			productListAct.pause(5);
			// 输入补货商品数量
			productListAct.enterMakeupStockDealerName(10000);
			//补录库存提交
			productListAct.clickMakeupStockSubmit();

		} catch (AssertionError e) {
			logger.error("wofe补录库存 ", e);
			Assert.fail("wofe补录库存 >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("wofe补录库存 ", e);
			throw new TestNGException("wofe补录库存 >> " + e.getMessage(), e);
		}
	}

}
