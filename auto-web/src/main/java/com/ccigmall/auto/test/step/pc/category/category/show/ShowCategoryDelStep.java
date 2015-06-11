package com.ccigmall.auto.test.step.pc.category.category.show;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.show.ShowCategoryManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * 
 * @author dengshuhai
 * <p>类目平台 删除展示类目
 * @since   2015-1-8
 * @version 1.0
 */
public class ShowCategoryDelStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ShowCategoryDelStep.class);
	// 展示类目动作
	private ShowCategoryManageAct showCategoryManageAct;
	
	/**
	 * category  删除展示类目
	 * 
	 * @throws Exception
	 */
	
	@Test(description = "category 删除展示类目")
	public void testDelShowCategory() throws Exception {
		try {
			showCategoryManageAct = new ShowCategoryManageAct(driver);
			
			String dispCategoryName = this.getMemVal(Constant.DISPLAY_CATEGORY_NAME);
			//String dispCategoryName = "1501201806cn1";
			logger.info("获取缓存中的名称为:{},",dispCategoryName);
			//String CategoryName = "有子类目"+timeStamp;
			logger.info("category 删除展示-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//点击类目管理
			showCategoryManageAct.clickCategoryManage();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagement();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagementSub();
			/*********************************删除类目一级*************************************/
			//输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			//删除类目一级
/*			showCategoryManageAct.clickDeleteCategory();
			showCategoryManageAct.clickConfirmButton();*/
			//输入搜索框
			//showCategoryManageAct.inputSearchName(dispCategoryName);
			//点击搜索按钮
			//showCategoryManageAct.clickSearchButton();
			//点击查询出来的第一条记录
			//showCategoryManageAct.clickFirstRecord();
			//进入二级
			showCategoryManageAct.enterSubCategoey();
			//关闭无用title
			showCategoryManageAct.titleClose();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			//进入三级
			showCategoryManageAct.enterSubCategoey();
			//解绑;
			showCategoryManageAct.clickRemoveBind();
			//确定
			showCategoryManageAct.clickConfirmButton();
			showCategoryManageAct.clickConfirmButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			//删除类目3级
			showCategoryManageAct.clickDeleteCategory();
			//删除类目3级 ok
			showCategoryManageAct.clickConfirmButton();
			showCategoryManageAct.clickConfirmButton();
			//返回上级
			showCategoryManageAct.BackParent();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			//删除类目2级 
			showCategoryManageAct.clickDeleteCategory();
			//删除类目2级 ok
			showCategoryManageAct.clickConfirmButton();
			showCategoryManageAct.clickConfirmButton();

			showCategoryManageAct.titleClose("返回上一级");
			//点击展示类目管理
			//showCategoryManageAct.BackParent();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagementSub();
			
			/*********************************删除类目一级*************************************/
			//输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			showCategoryManageAct.clickSearchButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			//删除类目一级
			showCategoryManageAct.clickDeleteCategory();
			//确认
			showCategoryManageAct.clickConfirmButton();
			showCategoryManageAct.clickConfirmButton();
			//输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
						
			logger.info("category 删除展示-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("dispcategory delete failed ", e);
			showCategoryManageAct.failScreenShot("dispcategory delete failed");
			Assert.fail("dispcategory delete failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dispcategory delete failed ", e);
			showCategoryManageAct.failScreenShot("dispcategory delete failed");
			throw new Exception("dispcategory delete failed  >> "
					+ e.getMessage(), e);
		}
	}
}
