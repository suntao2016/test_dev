/**
 * 
 */
package com.ccigmall.auto.test.step.pc.supplier.seller.stock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.seller.stock.EditStockAct;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;

/**
 * @author jianping.gao
 * 修改库存
 */
public class EditStockStep extends SupplierStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(EditStockStep.class);
	
	private EditStockAct editStockAct;
	/**
	 * 修改库存
	 * @throws Exception 
	 */
	@Test(description = "供应商修改库存")
	public void search() throws Exception {
		try {
			editStockAct=new EditStockAct(driver);		
			//点击卖家中心
			editStockAct.clickSellerCenter();
			//点击库存管理
			editStockAct.clickStockManage();
			//输入商品名称
			editStockAct.enterProductName(productName);
			//点击搜索
			editStockAct.clickSearch();
			//点击修改
			editStockAct.clickEdit(20000,10000);
			
		} catch (AssertionError e) {
			logger.error("供应商修改库存失败 ", e);
			Assert.fail("供应商修改库存失败 >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("供应商修改库存失败 ", e);
			throw new TestNGException("供应商修改库存失败 >> "
					+ e.getMessage(), e);
		}
	}

}
