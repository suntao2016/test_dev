/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category.category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 类目管理
 */
public class CategoryManagePage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public CategoryManagePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 点击产品线管理
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='sel']/div/div[1]/h2")
	private WebElement productLineManagement;

	/**
	 * 点击产品线模板管理
	 */
	@FindBy(how = How.LINK_TEXT, using = "产品线模板管理")
	private WebElement productLineModleManagement;
	
	/**
	 * 点击发布类目管理
	 */
	@FindBy(how = How.XPATH, using = "//h2[text()='发布类目管理']")
	private WebElement publishedCategoryManagement;
	
	/**
	 * 点击类目列表
	 */
	@FindBy(how = How.LINK_TEXT, using = "类目列表")
	private WebElement categoryList;
	
	/**
	 * 点击类目树预览
	 */
	@FindBy(how = How.LINK_TEXT, using = "类目树预览")
	private WebElement categoryTressPreview;
	
	/**
	 * 点击展示类目管理
	 */
	@FindBy(how = How.XPATH, using = "//h2[text()='展示类目管理']")
	private WebElement showCategoryManagement;
	
	/**
	 * 点击展示类目管理
	 */
	@FindBy(how = How.LINK_TEXT, using = "展示类目管理")
	private WebElement showCategoryManagementSub;
	
	/**
	 * 点击品牌管理
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/div[7]/h2")
	private WebElement brandManagement;
	
	
	/**
	 * 点击品牌列表
	 */
	@FindBy(how = How.LINK_TEXT, using = "品牌列表")
	private WebElement brandList;


	/**
	 * @return the productLineManagement
	 */
	public WebElement getProductLineManagement() {
		return productLineManagement;
	}


	/**
	 * @return the productLineModleManagement
	 */
	public WebElement getProductLineModleManagement() {
		return productLineModleManagement;
	}


	/**
	 * @return the publishedCategoryManagement
	 */
	public WebElement getPublishedCategoryManagement() {
		return publishedCategoryManagement;
	}


	/**
	 * @return the categoryList
	 */
	public WebElement getCategoryList() {
		return categoryList;
	}


	/**
	 * @return the categoryTressPreview
	 */
	public WebElement getCategoryTressPreview() {
		return categoryTressPreview;
	}


	/**
	 * @return the showCategoryManagement
	 */
	public WebElement getShowCategoryManagement() {
		return showCategoryManagement;
	}


	/**
	 * @return the showCategoryManagementSub
	 */
	public WebElement getShowCategoryManagementSub() {
		return showCategoryManagementSub;
	}


	/**
	 * @return the brandManagement
	 */
	public WebElement getBrandManagement() {
		return brandManagement;
	}


	/**
	 * @return the brandList
	 */
	public WebElement getBrandList() {
		return brandList;
	}
	
	
	
}
