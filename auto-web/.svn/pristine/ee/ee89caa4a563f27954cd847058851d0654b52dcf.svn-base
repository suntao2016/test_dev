package com.ccigmall.auto.test.step.pc.supplier.seller.brand;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
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
 * supplier--卖家中心--品牌管理
 */
public class BrandManagementStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BrandManagementStep.class);
	protected BrandManagementAct managementAct;
	/**
	 * test test pc supplier 品牌管理新建品牌
	 * @throws Exception 
	 */
	@Test(description = "supplier--卖家中心--品牌管理新建品牌")
	public void testBrandManagement(){    		    	
		    try{
		    	logger.info("test pc supplier 品牌管理新建品牌测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	managementAct = new BrandManagementAct(driver);
		    	//点击卖家中心
		    	managementAct.clickSellerCenter();
		    	//点击品牌管理
		    	managementAct.clickBrandManagement();
		    	//点击新建品牌按钮
		    	managementAct.clickNewBrand();
		    	//选择品牌名称 下拉框		    	
		    	managementAct.selectBrandName("其它");
		    	//输入品牌名称
		    	String strName =  managementAct.enterBrandName("供应商品牌");
		    	setMemVal(Constant.BRAND_NAME,strName);
		    	//输入品牌备注
		    	managementAct.enterBrandMark("supplier--卖家中心--品牌管理--【品牌备注】");
		    	//点击选择图片上传按钮
		    	managementAct.pause(1);
		    	managementAct.clickUploadPic();
		    	managementAct.pause(1);
		    	//开始上传图片
		    	managementAct.robotUpload();
		    	//点击开始上传
		    	managementAct.jsExecutor("$(arguments[0]).click();",
		    			managementAct.getManagementPage().getXpathCliStartUpload());
		    	managementAct.pause(2);
		    	//点击提交审核按钮
		    	managementAct.clickSubmit();
		    	//点击弹出框按钮
		    	managementAct.pause(1);
		    	managementAct.clickAlertConfirm();
		    	
		    	managementAct.pause(2);
		    	
		    	Assert.assertEquals(strName.trim(),managementAct.getFirstBrandName().trim());
		    	logger.info("test pc supplier 品牌管理新建品牌测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_NEW_BRAND_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_CONFIRM_CONTRACT_ORDER_FAIL, e);
				throw new TestNGException("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
