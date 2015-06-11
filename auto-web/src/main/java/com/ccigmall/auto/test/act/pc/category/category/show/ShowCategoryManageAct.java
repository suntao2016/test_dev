/**
 * 
 */
package com.ccigmall.auto.test.act.pc.category.category.show;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.category.category.CategoryManageAct;
import com.ccigmall.auto.test.page.pc.category.category.show.ShowCategoryManagePage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-14 类目平台-展示类目管理动作
 */
public class ShowCategoryManageAct extends CategoryManageAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(ShowCategoryManageAct.class);

	/**
	 * 展示类目管理页
	 * 
	 */
	private ShowCategoryManagePage showCategoryManagePage;

	/**
	 * 
	 * @param driver
	 */
	public ShowCategoryManageAct(WebDriver driver) {
		super(driver);
		showCategoryManagePage = new ShowCategoryManagePage(driver);
	}

	/**
	 * 点击添加类目
	 */
	public void clickAddCategory() {
		
		for(WebElement ele : showCategoryManagePage.getAddCategory()){
			if(ele.isDisplayed()){
				logger.info("点击添加类目：{}", ele);
				ele.click();
				break;
			}
		}
	}
	/**
	 * 点击绑定发布类目
	 */
	public void clickBindPubCategory() {
		logger.info("点击绑定发布类目：{}", showCategoryManagePage.getBindPubCategory());
		click(showCategoryManagePage.getBindPubCategory());
	}

	/**
	 * 点击选择叶子类目 选择框
	 */
	public void clickSelectPub() {
		logger.info("点击选择叶子类目 选择框：{}", showCategoryManagePage.getClickCatePubSelect());
		click(showCategoryManagePage.getClickCatePubSelect());
	}
	
	/**
	 * 选择叶子发布类目
	 * 
	 * @param 传入的 叶子发布类目 名称
	 */

	public void clickSeletItem(String text) {
		logger.info(" 选择叶子发布类目：{}", text);
		click(driver.findElement(By.partialLinkText(text)));
	}



	/**
	 * 进入子类目
	 */
	public void enterSubCategoey() {
		logger.info("进入子类目：{}", showCategoryManagePage.getEnterSubCategoey());
		click(showCategoryManagePage.getEnterSubCategoey());
	}

	/**
	 * 返回上一级
	 */
	public void BackParent() {
		for(WebElement ele :  showCategoryManagePage.getBackParent()){
			if(ele.isDisplayed()&&ele!=null){
				logger.info("点击 返回上一级：{}", ele);
				ele.click();
				break;
			}
		}
	}

	/**
	 * 点击删除类目
	 */
	public void clickDeleteCategory() {
		for(WebElement ele :  showCategoryManagePage.getDeleteCategory()){
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
		logger.info("点击修改类目：{}", showCategoryManagePage.getModifyCategory());
		click(showCategoryManagePage.getModifyCategory());
	}

	/**
	 * 点击第一条记录
	 */
	public void clickFirstRecord() {
		List<WebElement> eles = showCategoryManagePage.getFirstRecord();
		for(int i = 0 ; i<eles.size() ; i++){
			 eles = showCategoryManagePage.getFirstRecord();
			if(eles.get(i).isDisplayed()&&eles.get(i)!=null){
				logger.info("点击第一条记录：{}", eles.get(i));
				click(eles.get(i));
				break;
			}
		}
	}

	/**
	 * 输入类目中文名称
	 */
	public void inputDispNameCn(String text) {
		logger.info("输入类目中文名称：{}", text);
		type(showCategoryManagePage.getDispNameCn(), text);
	}

	/**
	 * 输入类目英文名称
	 */
	public void inputDispNameEn(String text) {
		logger.info("输入类目英文名称：{}", text);
		type(showCategoryManagePage.getDispNameEN(), text);
	}

	/**
	 * 输入类目说明
	 */
	public void inputRemark(String text) {
		logger.info("输入类目说明：{}", text);
		type(showCategoryManagePage.getRemark(), text);
	}

	/**
	 * 输入排序值
	 */
	public void inputSortVal(String text) {
		logger.info("输入排序值：{}", text);
		type(showCategoryManagePage.getSortvalnum(), text);
	}
	
	/**
	 * 上传导航图片
	 * 
	 * @param path
	 */
	public void uploadFlegalcerti(String path) {
		click(showCategoryManagePage.getUploadImg());
		logger.info("上传法人代表身份证明文件:{}", path);
		robotUpload(path);
	}

	
	/**
	 * 输入类目名称进行搜索
	 */
	public void inputSearchName(String text) {
		logger.info("输入类目名称:{}  进行搜索", text);
		type(showCategoryManagePage.getSearchName(),text);
	}

	/**
	 * 是否叶子类目 是
	 */
	public void clickChildrenRadio_Yes() {
		logger.info("是否叶子类目 是：{}", showCategoryManagePage.getIsChildren());
		click(showCategoryManagePage.getIsChildren());
	}

	/**
	 * 是否叶子类目 否
	 */
	public void clickChildrenRadio_No() {
		logger.info("是否叶子类目 否：{}", showCategoryManagePage.getNotChildren());
		click(showCategoryManagePage.getNotChildren());
	}

	/**
	 * 点击保存按钮
	 */
	public void clickSaveButton() {
		logger.info("点击保存按钮：{}", showCategoryManagePage.getSaveButton());
		click(showCategoryManagePage.getSaveButton());
	}

	/**
	 * 点击保存按钮
	 */
	public void clickBindButton() {
		logger.info("点击绑定按钮：{}", showCategoryManagePage.getBindButton());
		click(showCategoryManagePage.getBindButton());
	}
	
	/**
	 * 点击取消按钮
	 */
	public void clickCancelButton() {
		logger.info("点击取消按钮：{}", showCategoryManagePage.getCancelButton());
		click(showCategoryManagePage.getCancelButton());
	}

	/**
	 * 点击搜索按钮
	 */
	public void clickSearchButton() {
		List<WebElement> eles =  showCategoryManagePage.getSearchButton();
		int size = eles.size();
		for(int i=0;i<size;i++){
			WebElement  ele =  showCategoryManagePage.getSearchButton().get(i);
			if(ele.isDisplayed()){
				logger.info("点击搜索按钮：{}", ele);
				 click(ele);
				 break;
			}
			
			 
		}
		/*for(WebElement ele: showCategoryManagePage.getSearchButton()){
			if(ele.isDisplayed()&&ele!=null){
				logger.info("点击搜索按钮：{}", ele);
				ele.click();
				break;
			}
		}*/
	}

	/**
	 * 点击类目变更成功-确定按钮
	 */
	public void clickConfirmButton() {
		logger.info("点击类目变更成功-确定按钮：{}",
				showCategoryManagePage.getAlertConfirmButton());
		click(showCategoryManagePage.getAlertConfirmButton());
	}

	/**
	 * 点击类目变更成功-确定按钮
	 */
	public String getDeleteResult() {
		String text = this.getText(showCategoryManagePage.getNoData());
		logger.info("获取删除后的结果：{}", text);
		return text;

	}


	/**
	 * 判断元素【进入子类目】是否存在
	 * 
	 * @return
	 */
	public boolean isSubCategory(String text) {
		 if(this.getText(showCategoryManagePage.getSubCategoey()).contains(text)){
			 logger.info("【进入子类目】是否存在：存在");
			 return true;
		 }
		 logger.info("【进入子类目】是否存在：不存在");
		 return false;
	}
	
	/**
	 * 点击 解绑
	 */
	public void clickRemoveBind() {
		logger.info("点击 解绑：{}", showCategoryManagePage.getRemoveBind());
		click(showCategoryManagePage.getRemoveBind());
	}

	
	/**
	 * 点击 add Crosslink
	 */
	public void clickAddCrosslink() {
	
		for(WebElement ele: showCategoryManagePage.getAddCrosslink())	{
			if(ele.isDisplayed()){
				logger.info("点击 add Crosslink：{}", ele);
				click(ele);
				break;
			}
		
		}
		
	}
	
	/**
	 * 点击 del Crosslink
	 */
	public void clickDelCrosslink() {
		logger.info("点击 del Crosslink：{}", showCategoryManagePage.getDelCrosslink());
		click(showCategoryManagePage.getDelCrosslink());
	}

	/**
	 * 点击 修改展示状态
	 */
	public void clickUpdateDispStatu() {
		for(WebElement ele : showCategoryManagePage.getUpdateDispStatu()){
			if(ele.isDisplayed()){
				logger.info("修改展示状态：{}", ele);
				click(ele);
				break;
			}
		}
	}
	
/**
 * 选择 crosslink[i]
 * @param i
 */
	public void choseCrosslink(int i) {
		List<WebElement> Checkboxs =  showCategoryManagePage.getCheckboxs();
		if(i>0&&i<Checkboxs.size()){
			logger.info(" 选择 crosslink[{}]：{}", i,Checkboxs.get(i-1).getText());
			Checkboxs.get(i-1).click();
		}else{
			logger.error("选择 crosslink[{}]失败！", i);
			Assert.fail("选择 crosslink 失败！没有可选择的crosslink");
		}
	}
	/**
	 * 选择所有crosslink -取消
	 */
	public void choseCrosslink() {
		List<WebElement> Checkboxs =  showCategoryManagePage.getCheckboxs();
		if(Checkboxs.size()!=0){
			for(WebElement ele :Checkboxs){
				if(ele.isDisplayed()){
					logger.info(" 选择 crosslink：{},", ele.getText());
					click(ele);
				}
			}
		}else{
			logger.error(" 该类目没有绑定crosslink");
			Assert.fail("该类目没有绑定crosslink，无法删除");
		}
		
	}
	
	/**
	 * 点击关闭按钮
	 */
	public void close(){
		logger.info("点击关闭按钮，{}",showCategoryManagePage.getCloseButton());
		click(showCategoryManagePage.getCloseButton());
	}
	
	
	
	/**
	 * 点击标签 关闭按钮
	 */
	public void titleClose(){
		logger.info("点击标签【展示类目管理】关闭按钮，{}",showCategoryManagePage.getTitleClose());
		click(showCategoryManagePage.getTitleClose());
	}
	
	/**
	 * 点击标签 关闭按钮
	 */
	public void titleClose(String text ){
		logger.info("点击标签{},关闭按钮",text);
		driver.findElement(By.xpath("//a[@title='"+text+"']/following::a[1]")).click();
	}
	
	/**
	 * 获取选中的crosslink
	 * @return
	 */
	public List<String> getCrosslinkText(){
		List<String>  texts = new ArrayList<String>();
		List<WebElement> eles = showCategoryManagePage.getCrosslinkText();
		for(WebElement ele : eles){
			if(ele.isDisplayed()){
				texts.add(ele.getText()) ;
				logger.info("已经绑定的crosslink为：{}",ele.getText());
			}
		}
		return texts;
	}
	
}
