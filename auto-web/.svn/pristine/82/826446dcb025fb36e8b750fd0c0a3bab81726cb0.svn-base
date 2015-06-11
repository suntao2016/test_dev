/**
 * 
 */
package com.ccigmall.auto.test.act.pc.category.category.release;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.category.category.CategoryManageAct;
import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.page.pc.category.category.release.CategoryListPage;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;
import com.ccigmall.auto.test.page.pc.dealer.LoginPage;
import com.ccigmall.auto.test.page.pc.dealer.user.RegisterPage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-08 类目平台-类目列表动作
 */
public class CategoryListAct extends CategoryManageAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(CategoryListAct.class);

	/**
	 * 供应商注册页
	 * 
	 */
	private CategoryListPage categoryListPage;

	/**
	 * 
	 * @param driver
	 */
	public CategoryListAct(WebDriver driver) {
		super(driver);
		categoryListPage = new CategoryListPage(driver);
	}

	/**
	 * 点击添加类目
	 */
	public void clickAddCategory() {
		logger.info("点击添加类目：{}", categoryListPage.getAddCategory());
		click(categoryListPage.getAddCategory());
	}

	/**
	 * 绑定品牌
	 */
	public void clickBindBrand() {
		logger.info(" 绑定品牌：{}", categoryListPage.getBindBrand());
		click(categoryListPage.getBindBrand());
	}

	/**
	 * 点击绑定产品线
	 */
	public void clickBindProductLine() {
		logger.info("点击绑定产品线：{}", categoryListPage.getBindProductLine());
		click(categoryListPage.getBindProductLine());
	}

	/**
	 * 选择产品线模板
	 */
	public void clickSelectProductInput() {
		logger.info(" 选择产品线模板：{}", categoryListPage.getSelectProductInput());
		click(categoryListPage.getSelectProductInput());
	}

	/**
	 * 选择产品线模板-下一步
	 */
	public void clickNextButotn() {
		logger.info("选择产品线模板-下一步：{}", categoryListPage.getNextButton());
		click(categoryListPage.getNextButton());
	}

	/**
	 * 选择产品线模板-取消
	 */
	public void clickBindProCancel() {
		logger.info(" 选择产品线模板-取消：{}", categoryListPage.getBindProCancel());
		click(categoryListPage.getBindProCancel());
	}

	/**
	 * 选择产品线模板
	 * 
	 * @param 传入的产品线名称
	 */

	public void clickSeletItem(String text) {
		logger.info(" 选择产品线模板：{}", text);
		click(driver.findElement(By.linkText(text)));
	}

	/**
	 * 点击全选
	 */
	public void clickSelectAll() {
		logger.info(" 点击全选：{}", categoryListPage.getSelectAll());
		click(categoryListPage.getSelectAll());
	}

	/**
	 * 进入子类目
	 */
	public void enterSubCategoey() {
		logger.info("进入子类目：{}", categoryListPage.getEnterSubCategoey());
		click(categoryListPage.getEnterSubCategoey());
	}

	/**
	 * 返回上一级
	 */
	public void BackParent() {
		for(WebElement ele :  categoryListPage.getBackParent()){
			if(ele.isDisplayed()){
				logger.info("点击 返回上一级：{}", ele);
				ele.click();
			}
		}
	}

	/**
	 * 点击删除类目
	 */
	public void clickDeleteCategory() {
		for(WebElement ele :  categoryListPage.getDeleteCategory()){
			if(ele.isDisplayed()){
				logger.info("点击删除类目：{}", ele);
				ele.click();
			}
		}
	}

	/**
	 * 点击修改类目
	 */
	public void clickModifyCategory() {
		logger.info("点击修改类目：{}", categoryListPage.getModifyCategory());
		click(categoryListPage.getModifyCategory());
	}

	/**
	 * 点击第一条记录
	 */
	public void clickFirstRecord() {
		
		for(WebElement ele :  categoryListPage.getFirstRecord()){
			if(ele.isDisplayed()){
				logger.info("点击第一条记录：{}", ele);
				ele.click();
				break;
			}
		}
	}

	/**
	 * 输入类目中文名称
	 */
	public void inputPubNameCn(String text) {
		logger.info("输入类目中文名称：{}", text);
		type(categoryListPage.getPubNameCn(), text);
	}

	/**
	 * 输入类目英文名称
	 */
	public void inputPubNameEn(String text) {
		logger.info("输入类目英文名称：{}", text);
		type(categoryListPage.getPubNameEn(), text);
	}

	/**
	 * 输入类目说明
	 */
	public void inputRemark(String text) {
		logger.info("输入类目说明：{}", text);
		type(categoryListPage.getRemark(), text);
	}

	/**
	 * 输入类目名称进行搜索
	 */
	public void inputSearchName(String text) {
	/*	for(WebElement ele :  categoryListPage.getSearchName()){
			if(ele.isDisplayed()){
				logger.info("输入类目名称:{}  进行搜索", text);
				type(ele , text);
				break;
			}
		}*/
		logger.info("输入类目名称:{}  进行搜索", text);
		type(categoryListPage.getSearchName(),text);
	}

	/**
	 * 是否叶子类目 是
	 */
	public void clickChildrenRadio_Yes() {
		logger.info("是否叶子类目 是：{}", categoryListPage.getIsChildren());
		click(categoryListPage.getIsChildren());
	}

	/**
	 * 是否叶子类目 否
	 */
	public void clickChildrenRadio_No() {
		logger.info("是否叶子类目 否：{}", categoryListPage.getNotChildren());
		click(categoryListPage.getNotChildren());
	}

	/**
	 * 点击保存按钮
	 */
	public void clickSaveButton() {
		logger.info("点击保存按钮：{}", categoryListPage.getSaveButton());
		click(categoryListPage.getSaveButton());
	}

	/**
	 * 点击取消按钮
	 */
	public void clickCancelButton() {
		logger.info("点击取消按钮：{}", categoryListPage.getCancelButton());
		click(categoryListPage.getCancelButton());
	}

	/**
	 * 点击搜索按钮
	 */
	public void clickSearchButton() {
		List<WebElement> eles = categoryListPage.getSearchButton();
		int size = eles.size();
		for (int i = 0; i < size; i++) {
			WebElement ele = categoryListPage.getSearchButton().get(i);
			if (ele.isDisplayed()) {
				logger.info("点击搜索按钮：{}", ele);
				click(ele);
				break;
			}
		}
	}

	/**
	 * 点击类目变更成功-确定按钮
	 */
	public void clickConfirmButton() {
		logger.info("点击类目变更成功-确定按钮：{}",
				categoryListPage.getAlertConfirmButton());
		click(categoryListPage.getAlertConfirmButton());
	}

	/**
	 * 点击类目变更成功-确定按钮
	 */
	public String getDeleteResult() {
		String text = this.getText(categoryListPage.getNoData());
		logger.info("获取删除后的结果：{}", text);
		return text;

	}

	/**
	 * 点击产地属性 必填属性
	 */
	public void SetProperty_1_1(String text) {
		logger.info("产地属性 必填属性：{}", text);
		new Select(categoryListPage.getSetProperty_1_1())
				.selectByVisibleText(text);
	}

	/**
	 * 点击产地属性 规格属性
	 */
	public void SetProperty_1_2(String text) {
		logger.info("产地属性 规格属性：{}", text);
		new Select(categoryListPage.getSetProperty_1_2())
				.selectByVisibleText(text);
	}

	/**
	 * 点击产地属性 展示属性
	 */
	public void SetProperty_1_3(String text) {
		logger.info("产地属性 展示属性：{}", text);
		new Select(categoryListPage.getSetProperty_1_3())
				.selectByVisibleText(text);
	}

	/**
	 * 点击包装属性 必填属性
	 */
	public void SetProperty_2_1(String text) {
		logger.info("包装属性 必填属性：{}", text);
		new Select(categoryListPage.getSetProperty_2_1())
				.selectByVisibleText(text);
	}

	/**
	 * 点击产包装属性 规格属性
	 */
	public void SetProperty_2_2(String text) {
		logger.info("包装属性 规格属性：{}", text);
		new Select(categoryListPage.getSetProperty_2_2())
				.selectByVisibleText(text);
	}

	/**
	 * 点击口味属性 必填属性
	 */
	public void SetProperty_3_1(String text) {
		logger.info("口味属性 必填属性：{}", text);
		new Select(categoryListPage.getSetProperty_3_1())
				.selectByVisibleText(text);
	}

	/**
	 * 点击口味属性 规格属性
	 */
	public void SetProperty_3_2(String text) {
		logger.info("口味属性 规格属性：{}", text);
		new Select(categoryListPage.getSetProperty_1_2())
				.selectByVisibleText(text);
	}

	/**
	 * 点击口味属性 展示属性
	 */
	public void SetProperty_3_3(String text) {
		logger.info("口味属性 展示属性：{}", text);
		new Select(categoryListPage.getSetProperty_3_3())
				.selectByVisibleText(text);
	}

	/**
	 * 点击口味属性 必填属性
	 */
	public void SetProperty_4_1(String text) {
		logger.info("口味属性 必填属性：{}", text);
		new Select(categoryListPage.getSetProperty_4_1())
				.selectByVisibleText(text);
	}

	/**
	 * 点击颜色属性 规格属性
	 */
	public void SetProperty_4_2(String text) {
		logger.info("颜色属性 规格属性：{}", text);
		new Select(categoryListPage.getSetProperty_4_2())
				.selectByVisibleText(text);
	}

	/**
	 * 点击颜色属性 展示属性
	 */
	public void SetProperty_4_3(String text) {
		logger.info("颜色属性 展示属性：{}", text);
		new Select(categoryListPage.getSetProperty_4_3())
				.selectByVisibleText(text);
	}

	/**
	 * 点击颜色属性 颜色属性
	 */
	public void SetProperty_4_4(String text) {
		logger.info("颜色属性 文本属性：{}", text);
		new Select(categoryListPage.getSetProperty_4_4())
				.selectByVisibleText(text);
	}

	/**
	 * 选择品牌
	 */
	public void selectBrand(String text) {
		text = "(//font[text()='" + text
				+ "']/preceding-sibling::input)[last()]";
		logger.info("选择品牌：{}", text);
		click(driver.findElement(By.xpath(text)));
	}

	/**
	 * 判断元素【进入子类目】是否存在
	 * 
	 * @return
	 */
	public boolean isSubCategory(String text) {
		 if(this.getText(categoryListPage.getSubCategoey()).contains(text)){
			 logger.info("【进入子类目】是否存在：存在");
			 return true;
		 }
		 logger.info("【进入子类目】是否存在：不存在");
		 return false;
	}
	
	/**
	 * 判断元素【未绑定品牌】是否存在
	 * 
	 * @return
	 */
	public boolean isModifyBrand(String text) {
		 if(this.getText(categoryListPage.getIsModifyBrand()).contains(text)){
			 logger.info("【未绑定品牌】是否存在：存在");
			 return true;
		 }
		 logger.info("【未绑定品牌】是否存在：不存在");
		 return false;
	}
	
	/**
	 * 判断元素【绑定产品线】是否存在
	 * 
	 * @return
	 */
	public boolean isRemoveBind(String text) {
		 if(this.getText(categoryListPage.getIsRemoveBind()).contains(text)){
			 logger.info("【绑定产品线】是否存在：存在");
			 return true;
		 }
		 logger.info("【绑定产品线】是否存在：不存在");
		 return false;
	}

	/**
	 * 点击 编辑品牌
	 */
	public void clickModifyBrand() {
		logger.info("点击 编辑品牌：{}", categoryListPage.getModifyBrand());
		click(categoryListPage.getModifyBrand());
	}
	
	/**
	 * 点击 选中的品牌 ,即取消
	 */
	public void clickEachCheckedBrand() {
		//获取 选中的品牌 集合
		List<WebElement> allTheChecked = categoryListPage.getProductChecked();
		//遍历点击
		for(WebElement checked : allTheChecked){
			//判断元素是否可见
			if(checked.isDisplayed()){
				logger.info("选中的品牌：{}", checked);
				  checked.click();
			}else{
				continue;
			}
		}
	}
	/**
	 * 点击 解绑
	 */
	public void clickRemoveBind() {
		logger.info("点击 解绑：{}", categoryListPage.getRemoveBind());
		click(categoryListPage.getRemoveBind());
	}

}
