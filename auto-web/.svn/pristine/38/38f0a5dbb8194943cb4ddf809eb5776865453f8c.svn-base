package com.ccigmall.auto.test.step.pc.category.category.release;

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
 * <p>类目平台 删除类目 2015-1-8
 * @version 1.0
 */
public class CategoryDeleteStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CategoryDeleteStep.class);
	// 类目列表动作
	private CategoryListAct categoryListAct;

	/**
	 * category 删除类目
	 * 需包含叶子类目
	 * @throws Exception
	 */
	@Test(description = "category 删除类目")
	public void testDeleteCategory() throws Exception {
		try {
			categoryListAct = new CategoryListAct(driver);

			String CategoryName = this.getMemVal(Constant.CATEGORY_NAME);
			logger.info("category 删除类目-测试用例执行开始，测试用例名称是：{}", getClass()
					.getName());
			// 点击类目管理
			categoryListAct.clickCategoryManage();
			// 点击发布类目管理
			categoryListAct.clickPublishedCategoryManagement();
			// 点击类目列表
			categoryListAct.clickCategoryList();

			// **********************删除类目***************************************//
			logger.info("category 删除类目-测试用例开始！");
			// 输入搜索框
			categoryListAct.inputSearchName(CategoryName);
			// 点击搜索按钮
			categoryListAct.clickSearchButton();
			categoryListAct.pause(1);
			// 点击查询出来的第一条记录
			categoryListAct.clickFirstRecord();
			int nodeNum = 0;
			// 判断元素【进入子类目】是否存在
			while (categoryListAct.isSubCategory("进入子类目")) {
				categoryListAct.enterSubCategoey();
				nodeNum++;
			}
			//判断是否包含 绑定产品线，不包含 即已绑定产品，点击解绑
			if (!categoryListAct.isRemoveBind("绑定产品线")) {
				categoryListAct.clickRemoveBind();
				// 点击确定
				categoryListAct.clickConfirmButton();
				categoryListAct.clickConfirmButton();
			}
			//判断是否包含 未绑定品牌 ，不包含 即已绑定品牌，点击编辑品牌
			if (!categoryListAct.isModifyBrand("未绑定品牌")) {
				// 编辑品牌
				categoryListAct.clickModifyBrand();
				// 取消 以选中的品牌
				categoryListAct.clickEachCheckedBrand();
				// 点击保存
				categoryListAct.clickSaveButton();
				// 点击确定
				categoryListAct.clickConfirmButton();
			}
			categoryListAct.clickSearchButton();
			// 点击第一条记录
			categoryListAct.clickFirstRecord();
			// 点击删除
			categoryListAct.clickDeleteCategory();
			// 点击确定
			categoryListAct.clickConfirmButton();
			categoryListAct.clickConfirmButton();
			for (int i = 1; i < nodeNum; i++) {
				// 返回上一级
				categoryListAct.BackParent();
				categoryListAct.pause(1);
				// 点击第一条记录
				categoryListAct.clickFirstRecord();
				// 点击删除
				categoryListAct.clickDeleteCategory();
				// 点击确定
				categoryListAct.clickConfirmButton();
				categoryListAct.clickConfirmButton();
			}
			categoryListAct.BackParent();
			// 点击类目列表
			categoryListAct.clickCategoryList();
			// 输入搜索框
			categoryListAct.inputSearchName(CategoryName);
			categoryListAct.clickSearchButton();
			categoryListAct.pause(3);
			// 点击第一条记录
			categoryListAct.clickFirstRecord();
			// 点击删除
			categoryListAct.clickDeleteCategory();
			// 点击确定
			categoryListAct.clickConfirmButton();
			categoryListAct.clickConfirmButton();
			// 输入搜索框
			categoryListAct.inputSearchName(CategoryName);
			// categoryListAct.pause(50);
			// 点击搜索按钮
			categoryListAct.clickSearchButton();
			// 获取查询 删除操作 后的 结果
			String actResult = "";
			actResult = categoryListAct.getDeleteResult();
			Assert.assertEquals(actResult, "暂无数据");
			logger.info("category 删除类目-测试用例结束！");

		} catch (AssertionError e) {
			logger.error("category delete failed ", e);
			categoryListAct.failScreenShot("category delete failed ");
			Assert.fail("category delete failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("category delete failed ", e);
			categoryListAct.failScreenShot("category delete failed ");
			throw new Exception(
					"category delete failed  >> " + e.getMessage(), e);
		}

	}

}
