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
 * <p>类目平台 发布新类目
 * @since     2015-1-8
 * @version 1.0
 */
public class CategoryReleaseStep extends CategoryStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CategoryReleaseStep.class);
	// 类目列表动作
	private CategoryListAct categoryListAct;
	
	/**
	 * category 发布新类目
	 * 
	 * @throws Exception
	 */
	@Test(description = "category 发布新类目")
	public void testReleaseCategory() throws Exception {
		try {
			categoryListAct = new CategoryListAct(driver);
			Date date = new Date();
			SimpleDateFormat sd =new SimpleDateFormat("yyMMddHHmm");
			String timeStamp = sd.format(date);
			String CategoryName = timeStamp+"类目";
			//类目名称 存入缓存中，取出来的时候记住要+一级  二级  三级
			this.setMemVal(Constant.CATEGORY_NAME, CategoryName);
			//String CategoryName = "有子类目"+timeStamp;
			logger.info("category 发布新类目-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			//点击类目管理
			categoryListAct.clickCategoryManage();
			//点击发布类目管理
			categoryListAct.clickPublishedCategoryManagement();
			//点击类目列表
			categoryListAct.clickCategoryList();
			/*********************************添加类目一级*************************************/
			//添加类目一级
			categoryListAct.clickAddCategory();
			//输入类目中文名称
			categoryListAct.inputPubNameCn(CategoryName+"一级");
			//输入类目英文名称
			categoryListAct.inputPubNameEn(timeStamp+"EN1");
			//输入类目说明
			categoryListAct.inputRemark("类目说明1"+timeStamp);
			//是否叶子类目 是or否
			categoryListAct.clickChildrenRadio_No();
			//点击保存
			categoryListAct.clickSaveButton();
			//点击确定
			categoryListAct.clickConfirmButton();
			//输入搜索框
			categoryListAct.inputSearchName(CategoryName);
			//点击搜索按钮
			//categoryListAct.clickSearchButton();
			//点击查询出来的第一条记录
			categoryListAct.clickFirstRecord();
			//进入子类目
			categoryListAct.enterSubCategoey();
			/*********************************添加类目二级*************************************/
			//添加类目二级
			categoryListAct.clickAddCategory();
			//输入类目中文名称
			categoryListAct.inputPubNameCn(CategoryName+"二级");
			//输入类目英文名称
			categoryListAct.inputPubNameEn(timeStamp+"EN2");
			//输入类目说明
			categoryListAct.inputRemark("类目说明2"+timeStamp);
			//是否叶子类目 是or否
			categoryListAct.clickChildrenRadio_No();
			//点击保存
			categoryListAct.clickSaveButton();
			//点击确定
			categoryListAct.clickConfirmButton();
			//点击查询出来的第一条记录
			categoryListAct.clickFirstRecord();
			//进入子类目
			categoryListAct.enterSubCategoey();
			
			/*********************************添加类目三级*************************************/
			//添加类目二级
			categoryListAct.clickAddCategory();
			//输入类目中文名称
			categoryListAct.inputPubNameCn(CategoryName+"三级");
			//输入类目英文名称
			categoryListAct.inputPubNameEn(timeStamp+"EN3");
			//输入类目说明
			categoryListAct.inputRemark("类目说明3"+timeStamp);
			//是否叶子类目 是or否
			categoryListAct.clickChildrenRadio_Yes();
			//点击保存
			categoryListAct.clickSaveButton();
			//点击确定
			categoryListAct.clickConfirmButton();
			/*********************************绑定产品线*************************************/
			//绑定产品线
			categoryListAct.clickBindProductLine();
			
			categoryListAct.clickSelectProductInput();
			productlineModle = this.getMemVal(Constant.PRODUCTLINEMODLE);
			//获取缓存中的产品线模板
			if(productlineModle==null||productlineModle.contains("过期")){
				logger.info("获取缓存中的产品线模板:{}，过期，流程不能再继续",productlineModle);
				Assert.fail("获取缓存中的产品线模板：过期，流程不能再继续");
			}
			//选择产品线模板
			categoryListAct.clickSeletItem(productlineModle);
			//点击下一步
			categoryListAct.clickNextButotn();
			//全选
			categoryListAct.clickSelectAll();
			//保存
			categoryListAct.clickSaveButton();
			//属性名：产地  必填属性1 规格属性2 展示属性3 文本形式 4
			categoryListAct.SetProperty_1_1("否");
			categoryListAct.SetProperty_1_2("否");
			categoryListAct.SetProperty_1_3("否");
			//包装属性   必填属性1 规格属性2 展示属性3 文本形式 4
			categoryListAct.SetProperty_2_1("是");
			categoryListAct.SetProperty_2_2("是");
			//口味属性   必填属性1 规格属性2 展示属性3 文本形式 4
			categoryListAct.SetProperty_3_1("是");
			categoryListAct.SetProperty_3_2("否");
			categoryListAct.SetProperty_3_3("是");
			//颜色属性   必填属性1 规格属性2 展示属性3 文本形式 4
			categoryListAct.SetProperty_4_1("是");
			categoryListAct.SetProperty_4_2("否");
			categoryListAct.SetProperty_4_3("否");
			categoryListAct.SetProperty_4_4("下拉框");
			//点击保存
			categoryListAct.clickSaveButton();
			//弹框确认
			categoryListAct.clickConfirmButton();
			/*********************************绑定品牌*************************************/
			categoryListAct.clickBindBrand();
			
			if(brandName.contains("过期")){
				logger.info("获取缓存中的主品牌名称：{}-过期，流程不能再继续" ,brandName);
			Assert.fail("获取缓存中的主品牌名称：过期，绑定品牌失败，流程不能再继续");
			}
			
			categoryListAct.selectBrand(brandName);
			//点击保存
			categoryListAct.clickSaveButton();
			//弹框确认
			categoryListAct.clickConfirmButton();
			categoryListAct.pause(2);
			//点击类目列表
			categoryListAct.clickCategoryList();
			logger.info("category 发布新类目-测试用例执行结束！");

		} catch (AssertionError e) {
			logger.error("category release failed ", e);
			categoryListAct.failScreenShot("category release failed ");
			Assert.fail("category release failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("category release failed ", e);
			categoryListAct.failScreenShot("category release failed ");
			throw new Exception("category release failed  >> "
					+ e.getMessage(), e);
		}

	}

}
