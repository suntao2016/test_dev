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
 * <p>类目平台 添加展示类目
 *  @since   2015-1-8
 * @version 1.0
 */
public class ShowCategoryAddStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ShowCategoryAddStep.class);
	// 展示类目动作
	private ShowCategoryManageAct showCategoryManageAct;
	
	/**
	 * category  添加展示类目
	 * 
	 * @throws Exception
	 */
	
	@Test(description = "category 添加展示类目")
	@Parameters()
	public void testAddShowCategory( ) throws Exception {
		try {
			showCategoryManageAct = new ShowCategoryManageAct(driver);
			//图片路径
			//String path = "C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg";
			Date date = new Date();
			SimpleDateFormat sd =new SimpleDateFormat("yyMMddHHmm");
			String timeStamp = sd.format(date);
			String CategoryName = timeStamp;
			
			//String CategoryName = "有子类目"+timeStamp;
			logger.info("category  添加展示类目-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//点击类目管理
			showCategoryManageAct.clickCategoryManage();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagement();
			//点击展示类目管理
			showCategoryManageAct.clickShowCategoryManagementSub();
			/*********************************添加类目一级*************************************/
			//添加类目一级
			showCategoryManageAct.clickAddCategory();
			//输入类目中文名称
			showCategoryManageAct.inputDispNameCn(CategoryName+"一级");
			//输入类目英文名称
			showCategoryManageAct.inputDispNameEn(timeStamp+"EN1");
			//输入类目说明
			showCategoryManageAct.inputRemark("类目说明1"+timeStamp);
			//是否叶子类目 是or否
			showCategoryManageAct.clickChildrenRadio_No();
			//输入排序值
			showCategoryManageAct.inputSortVal("21");
			//上传图片
			showCategoryManageAct.uploadFlegalcerti(showCategoryManageAct.getPath());
			//点击保存
			showCategoryManageAct.clickSaveButton();
			//点击确定
			showCategoryManageAct.clickConfirmButton();
			//输入搜索框
			showCategoryManageAct.inputSearchName(CategoryName);
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			//点击查询出来的第一条记录
			showCategoryManageAct.clickFirstRecord();
			//进入子类目
			showCategoryManageAct.enterSubCategoey();
			//点击搜索按钮
			showCategoryManageAct.clickSearchButton();
			/*********************************添加类目二级*************************************/
			//添加类目二级
			showCategoryManageAct.clickAddCategory();
			//输入类目中文名称
			showCategoryManageAct.inputDispNameCn(timeStamp.substring(6));
			//输入类目英文名称
			showCategoryManageAct.inputDispNameEn(timeStamp+"EN2");
			//输入类目说明
			showCategoryManageAct.inputRemark("类目说明2"+timeStamp);
			//是否叶子类目 是or否
			showCategoryManageAct.clickChildrenRadio_No();
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
			
			/*********************************添加类目三级*************************************/
			//添加类目三级
			showCategoryManageAct.clickAddCategory();
			//输入类目中文名称
			showCategoryManageAct.inputDispNameCn(timeStamp.substring(4));
			//输入类目英文名称
			showCategoryManageAct.inputDispNameEn(timeStamp+"EN3");
			//输入类目说明
			showCategoryManageAct.inputRemark("类目说明3"+timeStamp);
			//是否叶子类目 是or否
			showCategoryManageAct.clickChildrenRadio_Yes();
			//输入排序值
			showCategoryManageAct.inputSortVal("0");
			//点击保存
			showCategoryManageAct.clickSaveButton();
			//点击确定
			showCategoryManageAct.clickConfirmButton();
	
			/*********************************绑定发布类目*************************************/
			//点击绑定发布类目
			showCategoryManageAct.clickBindPubCategory();
			//获取缓存中的 叶子发布类目名称
			String pubCategory = this.getMemVal(Constant.CATEGORY_NAME);
			//点击发布类目
			showCategoryManageAct.clickSelectPub();
			//选择发布类目
			showCategoryManageAct.clickSeletItem(pubCategory);
			//点击保存
			showCategoryManageAct.clickBindButton();
			//弹框确认
			showCategoryManageAct.clickConfirmButton();
			showCategoryManageAct.pause(3);
			//点击类目列表
			//showCategoryManageAct.clickCategoryList();
			//发布类目名称 存入缓存中，取出来的时候记住要+一级  二级  三级
			this.setMemVal(Constant.DISPLAY_CATEGORY_NAME, CategoryName);
			logger.info("category  添加展示类目-测试用例执行结束！");

		} catch (AssertionError e) {
			logger.error("dispcategory release failed ", e);
			showCategoryManageAct.failScreenShot("dispcategory release failed ");
			Assert.fail("dispcategory release failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dispcategory release failed ", e);
			showCategoryManageAct.failScreenShot("dispcategory release failed ");
			throw new Exception("dispcategory release failed  >> "
					+ e.getMessage(), e);
		}

	}

}
