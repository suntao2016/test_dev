package com.ccigmall.auto.test.step.pc.category.category.show;

import java.util.List;

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
 * <p>类目平台 展示类目管理 添加crosslink 
 * @since 2015-1-8
 * @version 1.0
 */
public class CrosslinkAddStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CrosslinkAddStep.class);
	// 展示类目动作
	private ShowCategoryManageAct showCategoryManageAct;

	/**
	 * category 展示类目管理 添加crosslink
	 * 
	 * @throws Exception
	 */
	@Test(description = "category 展示类目管理 添加crosslink")
	public void testAddCrosslink() throws Exception {
		try {
			showCategoryManageAct = new ShowCategoryManageAct(driver);
			String dispCategoryName = this.getMemVal(Constant.DISPLAY_CATEGORY_NAME);
			logger.info("获取缓存中的名称为:{},",dispCategoryName);
			logger.info("category 展示类目管理 添加crosslink-测试用例执行开始，测试用例名称是：{}",
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
			/************************** 第一级*******添加crosslink *************************************/
			// 点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			// 添加crosslink
			showCategoryManageAct.clickAddCrosslink();
			// 选择第 i 个crosslink
			showCategoryManageAct.choseCrosslink(1);
			// 点击保存
			showCategoryManageAct.clickSaveButton();
			// 点击确定
			showCategoryManageAct.clickConfirmButton();
			// 点击第一条
			showCategoryManageAct.clickFirstRecord();
			// 获取已绑定的Crosslink
			List<String> ss = showCategoryManageAct.getCrosslinkText();
			// 进入子类目
			showCategoryManageAct.enterSubCategoey();
			/************************** 第二级*******添加crosslink *************************************/
			showCategoryManageAct.titleClose();
			// 点击查询出来的第一条记录
			
			showCategoryManageAct.clickFirstRecord();
			// 添加crosslink
			showCategoryManageAct.clickAddCrosslink();
			// 选择第 i 个crosslink
			showCategoryManageAct.choseCrosslink(2);
			// 点击保存
			showCategoryManageAct.clickSaveButton();
			// 点击确定
			showCategoryManageAct.clickConfirmButton();
			// 点击第一条
			showCategoryManageAct.clickFirstRecord();
			// 获取已绑定的Crosslink
			showCategoryManageAct.getCrosslinkText();
			// 点击第一条
			showCategoryManageAct.clickFirstRecord();
			// 进入子类目
			showCategoryManageAct.enterSubCategoey();
			// 点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			// 添加crosslink
			showCategoryManageAct.clickAddCrosslink();
			// 点击确定
			showCategoryManageAct.clickConfirmButton();
			// 点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			// 关闭按钮
			showCategoryManageAct.close();
			logger.info("category 展示类目管理 添加crosslink-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("dispCategory crosslink add failed ", e);
			showCategoryManageAct.failScreenShot("dispCategory crosslink add failed ");
			Assert.fail("dispCategory crosslink add failed  >> " + e.getMessage());
		} catch (Exception e) {
			showCategoryManageAct.failScreenShot("dispCategory crosslink add failed ");
			logger.error("dispCategory crosslink add failed ", e);
			throw new Exception("dispCategory add release failed  >> "
					+ e.getMessage(), e);
		}

	}

}
