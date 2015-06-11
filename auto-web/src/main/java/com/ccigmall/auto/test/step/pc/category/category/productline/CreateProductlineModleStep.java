/**
 * 
 */
package com.ccigmall.auto.test.step.pc.category.category.productline;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.productline.ProductLineModleAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * @author jianping.gao
 * 创建产品线模板
 *
 */
public class CreateProductlineModleStep extends CategoryStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CategoryStep.class);

	/**
	 * 创建产品线模板
	 */
	private ProductLineModleAct productLineModleAct;
	
	
	/**
	 * 创建产品线模板
	 * @throws Exception
	 */
	@Test(description = "创建产品线模板")
	public void review() throws Exception {
		try{
			productLineModleAct=new ProductLineModleAct(driver);
			//点击类目管理
			productLineModleAct.clickCategoryManage();
			//点击产品线模板管理
			productLineModleAct.clickProductLineModleManagement();
			//点击添加产品线
			productLineModleAct.clickAddProductLine();
			//输入产品线的中文名字
			String name=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			productLineModleAct.enterProductLineNameCn(name);
			//输入产品线的英文名字
			productLineModleAct.enterProductLineNameEn(name);
			//输入产品线的描述
			productLineModleAct.enterProductLineDesc(name);
			//产品线保存
			productLineModleAct.clickProductLineSubmit();
			//搜索 输入产品线名称
			productLineModleAct.enterProductLineName(name);
			//点击搜索
			productLineModleAct.clickProductLineNameSearch();
			//判断搜索结果
			productLineModleAct.justSearchResult();
			//点击属性管理
			productLineModleAct.clickProductLineSearchResultAttrManage();
			//点击添加属性
			productLineModleAct.addAttr();
			//将产品模板放入缓存
			setMemVal(Constant.PRODUCTLINEMODLE, name);
			
		} catch (AssertionError e) {
			logger.error("创建产品线模板  ", e);
			Assert.fail("创建产品线模板 》》"
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("创建产品线模板  ", e);
			throw new TestNGException("创建产品线模板  》》"
					+ e.getMessage(), e);
		}
	}
}
