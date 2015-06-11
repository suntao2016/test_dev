package com.ccigmall.auto.test.step.pc.supplier.seller.brand;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
 * supplier--卖家中心--品牌管理--修改品牌
 */
public class UpdateBrandManagementStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierFillContractStep.class);
	protected BrandManagementAct managementAct;
	/**
	 * test test pc supplier 品牌管理修改品牌
	 * @throws Exception 
	 */
	@Test(description = "supplier--卖家中心--品牌管理修改品牌")
	public void testBrandManagement()  {    		    	
		    try{
		    	logger.info("test pc supplier 品牌管理修改品牌测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	managementAct = new BrandManagementAct(driver);
		    	//点击卖家中心
		    	managementAct.clickSellerCenter();
		    	//点击品牌管理
		    	managementAct.clickBrandManagement();
		    	int brandUpButtonNum = managementAct.getBrandUpdateList();
		    	
		    	//如果 修改按钮 列表不等于0  默认cli第一个 修改按钮
		    	if(0!=brandUpButtonNum){
		    		managementAct.pause(1);
		    		//点击修改按钮
		    		managementAct.clickFirstUpdateButton();
		    	}else{
		    		Assert.fail("品牌管理中没有可以修改的模板，可以修改的模板数量为0");
		    	}
		    	
		    	//判断模板中品牌名称是不是 其他 如果是其他就改为 正常模板名称
		    	if(true==managementAct.booleanOther()){
		    		managementAct.pause(1);
		    		//选择品牌名称 下拉框
			    	managementAct.selectBrandName(brandName);
		    	}
		    	
		    	//判断品牌类型是不是普通代理 如果是普通代理的话就直接修改品牌备注然后提交
		    	JavascriptExecutor jsScr = (JavascriptExecutor) driver;  
		    	String js = "var object = document.getElementsByTagName('option');" +
		    			"for (var i = 0; i<object.length;i++){" +
		    			"if('selected' == (object[i].getAttribute('selected'))){" +
		    			"var obj = document.getElementsByName('brandType');" +
		    			"for(var j = 0; j<obj.length;j++){" +
		    			"return obj[j].options[obj[j].selectedIndex].text;" +
		    			     "}" +
		    		      "}" +
		    	       "}";
		    	String returnResult = (String)jsScr.executeScript(js);
		    	logger.info("获得的返回值是：{}",returnResult);
		    	
		    	if("普通代理".equals(js.trim())){
		    		managementAct.pause(1);
		    		managementAct.type(managementAct.getManagementPage().getTypeBrandMark(), "supplier--卖家中心--品牌管理--【修改品牌】");
		    		//点击提交审核按钮
			    	managementAct.clickSubmit();
			    	//点击弹出框按钮
			    	managementAct.pause(1);
			    	managementAct.clickAlertConfirm();
		    	}
		    	
		    	managementAct.pause(1);
		    	managementAct.selectBrandType("独家代理");
		    	//输入品牌备注
		    	managementAct.enterBrandMark("supplier--卖家中心--品牌管理--【修改品牌】");	
		    	
		    	//获取当前页的 资质图片数量	
		    	int qualificationImgNum = managementAct.getBrandImgList();
		    	if(0!=qualificationImgNum){
		    		//循环遍历点击 图片然后删除 这个图片
		    		for (int i = 1; i <=qualificationImgNum; i++) {
		    			managementAct.pause(1);
		    			//点击图片
		    			managementAct.clickImg();
		    			managementAct.pause(1);
		    			//点击图片的删除
		    			managementAct.clickImgDel();
					}
		    	}
		    	
		    	//点击选择图片上传按钮
		    	managementAct.clickContinueUpload();
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
//		    	Assert.assertEquals(brandName.trim(),managementAct.getBrandName().trim());	
		    	logger.info("test pc supplier 品牌管理修改品牌测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_UPDATE_BRAND_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_UPDATE_BRAND_FAIL, e);
				throw new TestNGException("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
		    
	}
}


