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
 */
public class EditProductStep extends PlatformStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(EditProductStep.class);

	/**
	 * wofe修改新增商品
	 */
	protected ProductListAct productListAct;

	/**
	 * wofe修改新增商品
	 * 
	 * @throws Exception
	 */
	@Test(description = "wofe修改新增商品")
	public void testCouponAdd() throws Exception {

		try {
			productListAct = new ProductListAct(driver);
			// 点击卖家中心
			productListAct.clickSellerCenter();
			// 点击新增的商品
			productListAct.clickAddedProduct();
			// 输入上商品ID
			productListAct.enterProductId(productId);
			// 点击商品搜索按钮
			productListAct.clickSearch();
			productListAct.isSearchResultExsit(productName);
			// 点击商品修改按钮
			productListAct.clickEditProduct();
			// 输入现货预计到货天数
			productListAct.enterSpotArrvalDays(3);
			// 输入期货预计到货天数
			productListAct.enterFuturesArrvalDays(30);
			// 输入预付比例
			productListAct.enterPrepaidProportion(30);
			// 点击按产品数量报价
			productListAct.clickPic_count();
			// 输入按产品数量报价 现货价格 建议零售价
			productListAct.enterCountMSRP(2);
			// 输入按产品数量报价 现货价格 起批量： 件 及以上 元/件
			productListAct.enterSpotStartUnit(1, 3);
			// 输入按产品数量报价 期货价格 起批量： 件 及以上 元/件
			productListAct.enterFuturesStartUnit(1, 3);

			// 点击按产品规格报价
			productListAct.clickPic_sku();
			// 输入 按产品规格报价 现货价格 最小起订量
			productListAct.enterMinNum(2);
			// 输入 按产品规格报价 现货价格 单价 建议零售价
			productListAct.enterProductSpotUnit(1);
			// 输入 按产品规格报价 期货价格 最小起订量
			productListAct.enterFuturesMinNum(2);
			// 输入 按产品规格报价 期货价格 单价 建议零售价
			productListAct.enterProducFuturestUnit(1);

			// 输入 sku 重量
			productListAct.enterSkuWeight(1);
			// 输入 物流描述：
			productListAct.enterDescription("鑫网物流还不错");
			// 点击提交：
			productListAct.clickSubmit();

		} catch (AssertionError e) {
			logger.error("wofe修改新增商品 ", e);
			Assert.fail("wofe修改新增商品 >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("wofe修改新增商品 ", e);
			throw new TestNGException("wofe修改新增商品 >> " + e.getMessage(), e);
		}
	}
}
