/**
 * 
 */
package com.ccigmall.auto.test.step.pc.category.category.productline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.productline.ProductLineModleAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author zhaixiaoyue
 * 删除产品线模板
 *
 */
public class DelProductlineModleStep extends CategoryStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(DelProductlineModleStep.class);

	/**
	 * 创建产品线模板
	 */
	private ProductLineModleAct productLineModleAct;
	
	
	/**
	 * 创建产品线模板
	 * @throws Exception
	 */
	@Test(description = "删除产品线模板")
	public void review() throws Exception {
		try{
			productLineModleAct=new ProductLineModleAct(driver);
			//点击类目管理
			productLineModleAct.clickCategoryManage();
			//点击产品线模板管理
			productLineModleAct.clickProductLineModleManagement();
			String name = getMemVal(Constant.PRODUCTLINEMODLE);
			//搜索 输入产品线名称
			productLineModleAct.enterProductLineName(name);
			//点击搜索
			productLineModleAct.clickProductLineNameSearch();
			//判断搜索结果
			if(productLineModleAct.justSearchResult()){
				//点击选择
				productLineModleAct.clickProductLineSearchResultFirst();
				//点击删除按钮
				productLineModleAct.clickDelProductLine();
			}else{
				throw new TestNGException("没有找到要删除的产品线可能是添加失败了！");
			}
			
			
		
			
		} catch (AssertionError e) {
			logger.error("删除产品线模板  ", e);
			Assert.fail("删除产品线模板 》》"
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("删除产品线模板  ", e);
			throw new TestNGException("删除产品线模板  》》"
					+ e.getMessage(), e);
		}
	}
}
