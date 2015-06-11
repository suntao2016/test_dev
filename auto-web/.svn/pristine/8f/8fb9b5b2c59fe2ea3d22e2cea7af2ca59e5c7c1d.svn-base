package com.ccigmall.auto.test.step.pc.supplier.seller.brand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.seller.brand.BrandManagementAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
import com.ccigmall.auto.test.step.pc.supplier.seller.order.SupplierFillContractStep;
/**
 * 
 * @author chenjingli
 * supplier--卖家中心--品牌管理--删除品牌
 */
public class DelBrandManagementStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierFillContractStep.class);
	protected BrandManagementAct managementAct;
	/**
	 * test test pc supplier 删除品牌
	 * @throws Exception 
	 */
	@Test(description = "supplier--卖家中心--品牌管理删除品牌")
	public void testDelBrandManagement()  {    		    	
		    try{
		    	logger.info("test pc supplier 品牌管理删除品牌测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	managementAct = new BrandManagementAct(driver);
		    	//点击卖家中心
		    	managementAct.clickSellerCenter();
		    	//点击品牌管理
		    	managementAct.clickBrandManagement();
		    	int number = managementAct.getBrandList();
		    	if(number!=0){
		    		//点击第一行的删除按钮
		    		managementAct.clickDelButton();
		    	}else{
		    		Assert.fail("品牌管理中没有模板，模板数量为0");
		    	}
		    	//点击弹出框按钮
		    	managementAct.pause(1);
		    	managementAct.clickAlertConfirm();
		    	//点击弹出框按钮
		    	managementAct.pause(1);
		    	managementAct.clickAlertConfirm();
		    	//再次获得删除后的列表数量
		    	int deletedNum = managementAct.getBrandList();
		    	
		    	managementAct.pause(1);
//		    	Assert.assertEquals(number-1,deletedNum);
		    	logger.info("test pc supplier 品牌管理删除品牌测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_DEL_BRAND_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_DEL_BRAND_FAIL, e);
				throw new TestNGException("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
