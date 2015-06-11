package com.ccigmall.auto.test.step.pc.category.category.show;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.show.ShowCategoryManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * 
 * @author dengshuhai 
 * <p>类目平台 展示类目管理 修改展示状态 
 * @since 2015-1-15
 * @version 1.0
 */
public class UpdateDispStatuStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UpdateDispStatuStep.class);
	// 展示类目动作
	private ShowCategoryManageAct showCategoryManageAct;

	/**
	 * category 展示类目管理 修改展示状态
	 * 
	 * @throws Exception
	 */
	@Test(description = "category 展示类目管理 修改展示状态")
	public void testUpdateDispStatu() throws Exception {
		try {
			showCategoryManageAct = new ShowCategoryManageAct(driver);
			String dispCategoryName = this.getMemVal(Constant.DISPLAY_CATEGORY_NAME);
			logger.info("获取缓存中的名称为:{},",dispCategoryName);
			logger.info("category 展示类目管理 修改展示状态-测试用例执行开始，测试用例名称是：{}",
					getClass().getName());
			// 点击类目管理
			showCategoryManageAct.clickCategoryManage();
			// 点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagement();
			// 点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagementSub();
			// 输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			// 点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			/************************** 第一级*******修改展示状态 *************************************/
			// 点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			// 修改展示状态
			showCategoryManageAct.clickUpdateDispStatu();
			// 点击确定
			showCategoryManageAct.clickConfirmButton();
			
			// 输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			// 点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			// 点击第一条
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			// 获取已绑定的Crosslink
			//List<String> ss = showCategoryManageAct.getCrosslinkText();
			// 进入子类目
			showCategoryManageAct.enterSubCategoey();
			/************************** 第二级*******修改展示状态 *************************************/
			showCategoryManageAct.titleClose();
			// 点击查询出来的第一条记录
			
			showCategoryManageAct.clickFirstRecord();
			// 修改展示状态
			showCategoryManageAct.clickUpdateDispStatu();
			// 点击确定
			showCategoryManageAct.clickConfirmButton();
			
			// 点击第一条
			showCategoryManageAct.clickFirstRecord();
			// 进入子类目
			showCategoryManageAct.enterSubCategoey();
			// 点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			// 修改展示状态
			showCategoryManageAct.clickUpdateDispStatu();
			// 点击确定
			showCategoryManageAct.clickConfirmButton();
			logger.info("category 展示类目管理 修改展示状态-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("category update displayStatu failed ", e);
			showCategoryManageAct.failScreenShot("category update displayStatu failed ");
			Assert.fail("category update displayStatu failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("category update displayStatu failed ", e);
			showCategoryManageAct.failScreenShot("category update displayStatu failed ");
			throw new Exception("crosslink update displayStatu failed  >> "
					+ e.getMessage(), e);
		}

	}

}
