package com.ccigmall.auto.test.step.pc.category.category.release;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.release.CategoryListAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * 
 * @author dengshuhai
 * <p>类目平台 编辑新类目
 *         2015-1-8
 * @version 1.0
 */
public class CategoryModifyStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CategoryModifyStep.class);
	// 类目列表动作
	private CategoryListAct categoryListAct;
	
	/**
	 * category 编辑新类目
	 * 
	 * @throws Exception
	 */
	@Test(description = "category 编辑新类目")
	public void testModifyCategory() throws Exception {
		try {
			categoryListAct = new CategoryListAct(driver);
			Date date = new Date();
			SimpleDateFormat sd =new SimpleDateFormat("yyMMddHHmm");
			String timeStamp = sd.format(date);
			String CategoryName = this.getMemVal(Constant.CATEGORY_NAME) ;
			logger.info("取得缓存中的类目名称：{},进行修改", CategoryName);
		
			logger.info("category 编辑 发布类目-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//点击类目管理
			categoryListAct.clickCategoryManage();
			//点击发布类目管理
			categoryListAct.clickPublishedCategoryManagement();
			//点击类目列表
			categoryListAct.clickCategoryList();
			//输入搜索框
			categoryListAct.inputSearchName(CategoryName);
			//点击搜索按钮
			categoryListAct.clickSearchButton();
			int i =1;
			while(categoryListAct.isSubCategory("进入子类目")){
				//点击查询出来的第一条记录
				categoryListAct.clickFirstRecord();
				//点击修改
				categoryListAct.clickModifyCategory();
				//输入类目中文名称
				categoryListAct.inputPubNameCn(CategoryName+i+"级");
				//输入类目英文名称
				categoryListAct.inputPubNameEn(timeStamp+"en"+i);
				//点击保存
				categoryListAct.clickSaveButton();
				//点击确定
				categoryListAct.clickConfirmButton();
				//输入搜索框
				categoryListAct.inputSearchName(CategoryName);
				//点击搜索按钮
				categoryListAct.clickSearchButton();
				//进入子类目
				categoryListAct.enterSubCategoey();
				i++;
			}
			
			//点击查询出来的第一条记录
			categoryListAct.clickFirstRecord();
			//点击修改
			categoryListAct.clickModifyCategory();
			//输入类目中文名称
			categoryListAct.inputPubNameCn(CategoryName+i);
			//输入类目英文名称
			categoryListAct.inputPubNameEn(timeStamp+"en"+i);
			//点击保存
			categoryListAct.clickSaveButton();
			//点击确定
			categoryListAct.clickConfirmButton();
			categoryListAct.pause(3);
			this.setMemVal(Constant.CATEGORY_NAME, CategoryName);
			
			logger.info("category 编辑 发布类目-测试用例执行结束！");

		} catch (AssertionError e) {
			logger.error("category modify failed ", e);
			categoryListAct.failScreenShot("category modify failed ");
			Assert.fail("category modify failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("category modify failed ", e);
			categoryListAct.failScreenShot("category modify failed ");
			throw new Exception("category modify failed  >> "
					+ e.getMessage(), e);
		}

	}

}
