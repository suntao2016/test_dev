package com.ccigmall.auto.test.act.pc.category.category.brandmanager;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.category.category.CategoryManageAct;
import com.ccigmall.auto.test.page.pc.category.category.brandmanager.BrandManagePage;

/**
 * @author zhaixiaoyue 后台类目管理-品牌列表
 */
public class BrandManageAct extends CategoryManageAct {
	

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BrandManageAct.class);
	private BrandManagePage bmp;
	

	public BrandManageAct(WebDriver driver) {
		super(driver);
		bmp = new BrandManagePage(driver);		
	}	
	
	/**
	 * 点击添加品牌按钮
	 * 
	 * @param addButton
	 * 
	 */
	public void clickAddButton() {
		logger.info("输入登录名  {}");
		click(bmp.getAddButton());
	}
	
	/**
	 * 输入属性中文名
	 * 
	 * @param attributeChn
	 * 
	 */
	public String enterAttributeChn(String attributeChn) {
		logger.info("输入属性中文名  {}", attributeChn);
		attributeChn = attributeChn
				+ new SimpleDateFormat("mmss").format(new Date());
		type(bmp.getAttributeChn(), attributeChn);
		return attributeChn;
	}
	
	/**
	 * 输入属性英文名
	 * 
	 * @param attributeChn
	 * 
	 */
	public void enterAttributeEng(String attributeEng) {
		logger.info("输入属性英文名  {}", attributeEng);
		type(bmp.getAttributeEng(), attributeEng);
	}
	
	/**
	 * 点击添加属性确定按钮
	 * 
	 * @param addButton
	 * 
	 */
	public void clickAttributeSave() {
		logger.info("点击添加属性确定按钮 ");
		click(bmp.getAttributeSave());
		click(bmp.getQuery());
	}
	
	/**
	 * 输入搜索文字
	 * 
	 * @param searchName
	 * 
	 */
	public void enterSearchName(String searchName) {
		logger.info("输入搜索文字 {}", searchName);
		type(bmp.getSearchName(), searchName);
	}
	
	/**
	 * 点击搜索按钮
	 * 
	 * @param searchButton
	 * 
	 */
	public void clickSearchButton() {
		logger.info("点击搜索按钮 ");
		click(bmp.getSearchButton());
	}
	
	/**
	 * 点击状态变更
	 * 
	 * @param 
	 * 
	 */
	public void clickChangeButton() {
		logger.info("点击状态变更按钮 ");
		clickFirstRecord();
		click(bmp.getChangeButton());
		click(bmp.getChangeConfirm());
		click(bmp.getQuery());
	}
	
	/**
	 * 点击选择第一条结果记录
	 * 
	 * @param 
	 * 
	 */
	public void clickFirstRecord() {
		logger.info("点击选择第一条结果 ");
		click(bmp.getFirstRecord());
	}
	
	/**
	 * 点击修改品牌
	 * 
	 * @param 
	 * 
	 */
	public void clickModifyButton() {
		clickFirstRecord();
		logger.info("点击修改品牌按钮 ");
		click(bmp.getModifyButton());
	}
	
	/**
	 * 点击删除品牌
	 * 
	 * @param 
	 * 
	 */
	public void clickDeleteButton() {
		clickFirstRecord();
		if("是".equals(getBrabndStatus()) ){
			clickChangeButton();
		}
		
		logger.info("点击删除品牌按钮 ");
		clickFirstRecord();
		click(bmp.getDeleteButton());
		click(bmp.getChangeConfirm());
		click(bmp.getQuery());
	}
	
	/**
	 * 点击进入子品牌
	 * 
	 * @param 
	 * 
	 */
	public void clickToSubBrand() {
		clickFirstRecord();
		logger.info("点击进入子品牌按钮 ");
		click(bmp.getToSubBrand());
		//关闭品牌列表标签		
		click(bmp.getCloseBrandList());
	}
	
	/**
	 * 点击关闭品牌列表标签
	 * 
	 * @param 
	 * 
	 */
	public void clickCloseBrandList() {
		logger.info("点击关闭标签 ");
		click(bmp.getCloseBrandList());
	}
	
	/**
	 * 获取品牌状态
	 * 
	 * @param 
	 * 
	 */
	public String getBrabndStatus() {
		String status = this.getText(bmp.getbrandStatus());
		logger.info("获取品牌状态为 +{} ",status );
		return status;
	}
	
	/**
	 * 判断品牌是否添加成功-名称
	 * 
	 * @param uname
	 * 
	 */
	public boolean isExistBrand(String uname) {
		
		if(isElementPresent(bmp.getFirstRecord(), uname)){
			logger.info("查找品牌成功 + {}",uname);
			return true;
		}else{
			logger.info("查找品牌失败 + {}",uname);
			return false;
		}		
	}
	
		
	/**
	 * 判断品牌是否删除成功
	 * 
	 * @param 
	 * 
	 */
	public boolean isDelBrand() {
		
		if(isElementPresent(bmp.getSearchresult(),"暂无数据")){
			logger.info("删除品牌成功");
			return true;
		}else{
			logger.info("删除品牌失败");
			return false;
		}		
	}
	
}
