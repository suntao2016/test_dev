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
public class BrandManageStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BrandManageStep.class);
	
	/**
	 * 品牌列表
	 */
	protected BrandManageAct brandManageAct;
	
	@Test(description = "品牌管理-创建品牌")
	public void BrandManage(){
		try {
			brandManageAct=new BrandManageAct(driver);
			//点击类目管理
			brandManageAct.clickCategoryManage();
			//点击品牌管理
			brandManageAct.clickBrandManagement();
			//点击品牌列表
			brandManageAct.clickBrandList();
			//点击添加品牌
			brandManageAct.clickAddButton();
			//输入属性中文名称
			setMemVal(Constant.BRAND_NAME,brandManageAct.enterAttributeChn("回归品牌"));
			//输入属性英文名称
			brandManageAct.enterAttributeEng("regressbrand");
			//点击保存按钮
			brandManageAct.clickAttributeSave();
			//brandManageAct.pause(5);
			//在搜索框输入品牌中文名
			String barandname = getMemVal(Constant.BRAND_NAME);
			brandManageAct.enterSearchName(barandname);
			//点击搜索按钮
			brandManageAct.clickSearchButton();	
			//判断是否添加成功
			if(!brandManageAct.isExistBrand(barandname)){
				throw new TestNGException("添加品牌失败！");
			}
			//修改状态变更
			brandManageAct.clickChangeButton();
			brandManageAct.getBrabndStatus();
			//点击进入子目录
			brandManageAct.clickToSubBrand();			
			//点击添加子品牌
			brandManageAct.clickAddButton();
			//添加子品牌
			setMemVal(Constant.SUBBRAND_NAME,brandManageAct.enterAttributeChn("回归子品牌"));
			//输入属性英文名称
			brandManageAct.enterAttributeEng("regresssunbrand");
			//点击保存按钮
			brandManageAct.clickAttributeSave();
			//brandManageAct.pause(5);			
			//在搜索框输入子品牌中文名
			String subbrandname = getMemVal(Constant.SUBBRAND_NAME);
			brandManageAct.enterSearchName(subbrandname);
			//点击搜索按钮
			brandManageAct.clickSearchButton();
			//判断子品牌添加是否成功
			if(!brandManageAct.isExistBrand(subbrandname)){
				throw new TestNGException("添加子品牌失败！");
			}
			//修改状态变更
			brandManageAct.clickChangeButton();	
			brandManageAct.getBrabndStatus();
			
		} catch (AssertionError e) {
			logger.error("品牌管理 ", e);
			Assert.fail("品牌管理 >> " + e.getMessage());
			brandManageAct.failScreenShot("assert brand manage fail");
		} catch (Exception e) {
			logger.error("品牌管理", e);
			brandManageAct.failScreenShot("brand manage fail");
			throw new TestNGException("品牌管理 >> " + e.getMessage(), e);
		}
		
		
		
		
	}
	
	
	
}
