package com.ccigmall.auto.test.step.pc.category.category.brandmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.brandmanager.BrandManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author zhaixiaoyue
 *   类目系统品牌管理
 */
public class BrandDelStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BrandDelStep.class);
	
	/**
	 * 品牌列表
	 */
	protected BrandManageAct brandManageAct;
	
	@Test(description = "品牌管理-删除品牌")
	public void BrandManage(){
		try {
			brandManageAct=new BrandManageAct(driver);
			//点击类目管理
			brandManageAct.clickCategoryManage();
			//点击品牌管理
			brandManageAct.clickBrandManagement();
			//点击品牌列表
			brandManageAct.clickBrandList();
			
			//在搜索框输入品牌中文名
			brandManageAct.enterSearchName(getMemVal(Constant.BRAND_NAME));
			//点击搜索按钮
			brandManageAct.clickSearchButton();						
			//点击进入子目录
			brandManageAct.clickToSubBrand();				
			//在搜索框输入子品牌中文名
			brandManageAct.enterSearchName(getMemVal(Constant.SUBBRAND_NAME));
			//点击搜索按钮
			brandManageAct.clickSearchButton();			
			//删除子品牌
			brandManageAct.clickDeleteButton();
			//判断子品牌是否删除成功
				//在搜索框输入子品牌中文名
				brandManageAct.enterSearchName(getMemVal(Constant.SUBBRAND_NAME));
				//点击搜索按钮
				brandManageAct.clickSearchButton();				
			if(!brandManageAct.isDelBrand()){
				throw new TestNGException("删除子品牌失败！");
			}
			brandManageAct.clickCloseBrandList();			
			
			//删除品牌
				//点击品牌列表
			brandManageAct.clickBrandList();
				//在搜索框输入品牌中文名
			brandManageAct.enterSearchName(getMemVal(Constant.BRAND_NAME));
				//点击搜索按钮
			brandManageAct.clickSearchButton();	
			brandManageAct.pause(1);
			brandManageAct.clickDeleteButton();
			//brandManageAct.pause(3);
			//判断是否删除成功
				//在搜索框输入品牌中文名
				brandManageAct.enterSearchName(getMemVal(Constant.BRAND_NAME));
				//点击搜索按钮
				brandManageAct.clickSearchButton();			
			if(!brandManageAct.isDelBrand()){
				throw new TestNGException("删除品牌失败！");
			}
			
		} catch (AssertionError e) {
			logger.error("品牌管理 ", e);
			Assert.fail("品牌管理 >> " + e.getMessage());
			brandManageAct.failScreenShot("assert brand delete fail ");
		} catch (Exception e) {
			logger.error("品牌管理", e);
			brandManageAct.failScreenShot("brand delete fail ");
			throw new TestNGException("品牌管理 >> " + e.getMessage(), e);
		}
		
		
		
		
	}
	
	
	
}
