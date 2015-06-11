package com.ccigmall.auto.test.step.pc.category.category.show;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.category.category.release.CategoryListAct;
import com.ccigmall.auto.test.act.pc.category.category.show.ShowCategoryManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.category.CategoryStep;

/**
 * 
 * @author dengshuhai
 * <p>类目平台 修改展示类目
 * @since 2015-1-8
 * @version 1.0
 */
public class ShowCategoryModifyStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ShowCategoryModifyStep.class);
	// 展示类目动作
	private ShowCategoryManageAct showCategoryManageAct;
	
	/**
	 * category  修改展示类目
	 * 
	 * @throws Exception
	 */
	
	@Test(description = "category 修改展示类目")
	public void testMpdifyShowCategory() throws Exception {
		try {
			showCategoryManageAct = new ShowCategoryManageAct(driver);
			//图片路径
			//String path = "C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg";
			Date date = new Date();
			SimpleDateFormat sd =new SimpleDateFormat("yyMMddHHmm");
			String timeStamp = sd.format(date);
			String dispCategoryName = this.getMemVal(Constant.DISPLAY_CATEGORY_NAME);
			logger.info("获取缓存中的名称为:{},",dispCategoryName);
			
			//String CategoryName = "有子类目"+timeStamp;
			logger.info("category 修改展示类目-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//点击类目管理
			showCategoryManageAct.clickCategoryManage();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagement();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagementSub();
			//输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			/*********************************修改类目一级*************************************/
			//修改类目一级
			showCategoryManageAct.clickModifyCategory();
			//输入类目中文名称
			showCategoryManageAct.inputDispNameCn(dispCategoryName+"cn1");
			//发布类目名称 存入缓存中，取出来的时候记住要+cn1  cn2  cn3
			this.setMemVal(Constant.DISPLAY_CATEGORY_NAME, dispCategoryName);
			//输入类目英文名称
			showCategoryManageAct.inputDispNameEn(timeStamp+"en1");
		
			//输入排序值
			showCategoryManageAct.inputSortVal("21");
			//上传图片
			showCategoryManageAct.uploadFlegalcerti(showCategoryManageAct.getPath());
			//点击保存
			showCategoryManageAct.clickSaveButton();
			//点击确定
			showCategoryManageAct.clickConfirmButton();
			//输入搜索框
			showCategoryManageAct.inputSearchName(dispCategoryName);
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			showCategoryManageAct.clickFirstRecord();
			
			
			//进入子类目
			showCategoryManageAct.enterSubCategoey();
			
			showCategoryManageAct.titleClose();
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			/*********************************修改类目二级*************************************/
			//修改类目二级
			showCategoryManageAct.clickModifyCategory();
			//输入类目中文名称
			showCategoryManageAct.inputDispNameCn(timeStamp.substring(6));
			//输入类目英文名称
			showCategoryManageAct.inputDispNameEn(timeStamp+"en2");
			//输入排序值
			showCategoryManageAct.inputSortVal("0");
			//点击保存
			showCategoryManageAct.clickSaveButton();
			//点击确定
			showCategoryManageAct.clickConfirmButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			//进入子类目
			showCategoryManageAct.enterSubCategoey();
			
			/*********************************修改目三级*************************************/
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			//添加类目三级
			showCategoryManageAct.clickModifyCategory();
			//输入类目中文名称
			showCategoryManageAct.inputDispNameCn(timeStamp.substring(4));
			//输入类目英文名称
			showCategoryManageAct.inputDispNameEn(timeStamp+"EN3");
			//输入排序值
			showCategoryManageAct.inputSortVal("0");
			//点击保存
			showCategoryManageAct.clickSaveButton();
			//点击确定
			showCategoryManageAct.clickConfirmButton();
			//
			//showCategoryManageAct.pause(0);
		
			logger.info("category 修改展示类目-测试用例执行结束！");

		} catch (AssertionError e) {
			logger.error("showCategory modify failed ", e);
			showCategoryManageAct.failScreenShot("showCategory modify failed");
			Assert.fail("showCategory modify failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("showCategory modify failed ", e);
			showCategoryManageAct.failScreenShot("showCategory modify failed");
			throw new Exception("showCategory modify failed  >> "
					+ e.getMessage(), e);
		}

	}

}
