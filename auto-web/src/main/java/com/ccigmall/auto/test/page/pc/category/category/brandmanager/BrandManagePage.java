package com.ccigmall.auto.test.page.pc.category.category.brandmanager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * 
 * @author zhaixiaoyue
 * 品牌列表页面
 */
import com.ccigmall.auto.test.page.pc.category.category.CategoryManagePage;

public class BrandManagePage extends CategoryManagePage {
	/**
	 * 
	 * @param driver
	 */
	public BrandManagePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 品牌中文名搜索框
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='searchname']")
	private WebElement searchName;
	
	/**
	 * 品牌中文名搜索按钮
	 */
	@FindBy(how = How.XPATH, using = "//form/div/div/ul/li/div/div/button")
	private WebElement searchButton;
	
	/**
	 * 点击选择第一条品牌记录
	 */
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[1]")
	private WebElement firstRecord;
	
	/**
	 * 添加品牌按钮
	 */
	@FindBy(how = How.XPATH, using = "//a[@class='user_add']")
	private WebElement addButton;
	
	/**
	 * 状态变更按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[1]/ul/li[2]/a/span")
	private WebElement changeButton;
	
	/**
	 * 修改品牌按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[1]/ul/li[3]/a/span")
	private WebElement modifyButton;

	/**
	 * 删除品牌按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[1]/ul/li[4]/a/span")
	private WebElement deleteButton;
	
	/**
	 * 添加品牌页面-属性中文名称
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[2]/div/form/div[1]/p[1]/input")
	private WebElement attributeChn;
	
	/**
	 * 添加品牌页面-属性英文名称
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[2]/div/form/div[1]/p[2]/input")
	private WebElement attributeEng;
	
	/**
	 * 添加品牌页面-保存按钮
	 */
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement attributeSave;
	
	/**
	 * 添加品牌页面-取消按钮
	 */
	@FindBy(how = How.XPATH, using = "//button[@class='close']")
	private WebElement attributeClose;
	
	/**
	 * 状态变更弹出框-确定按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li[1]/a/span")
	private WebElement changeConfirm;
	
	/**
	 * 状态变更弹出框-取消按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li[2]/a/span")
	private WebElement changeCancel;
	
	/**
	 * 操作成功确认按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li/a/span")
	private WebElement query;
	
	
	/**
	 * 品牌状态
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr/td[3]")
	private WebElement brandStatus;
	
	/**
	 * 进入子品牌按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[4]/a")
	private WebElement toSubBrand;
	
	/**
	 * 品牌列表标签关闭按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[1]/div[1]/ul/li[2]/a[2]")
	private WebElement closeBrandList;
	
	/**
	 * 子品牌标签关闭按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[1]/div[1]/ul/li[3]/a[2]")
	private WebElement closeSubBrand;
	
	/**
	 * 搜索结果为空
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/h2")
	private WebElement searchresult;
	
	
	
	/**
	 * @return the searchName
	 */
	public WebElement getSearchName() {
		return searchName;
	}

	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}

	/**
	 * @return the addButton
	 */
	public WebElement getAddButton() {
		return addButton;
	}
	
	/**
	 * @return the changeButton
	 */
	public WebElement getChangeButton() {
		return changeButton;
	}
	
	/**
	 * @return the modifyButton
	 */
	public WebElement getModifyButton() {
		return modifyButton;
	}
	
	/**
	 * @return the deleteButton
	 */
	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	/**
	 * @return the attributeChn
	 */
	public WebElement getAttributeChn() {
		return attributeChn;
	}
	
	/**
	 * @return the attributeEng
	 */
	public WebElement getAttributeEng() {
		return attributeEng;
	}
	
	/**
	 * @return the attributeSave
	 */
	public WebElement getAttributeSave() {
		return attributeSave;
	}
	
	/**
	 * @return the attributeClose
	 */
	public WebElement getAttributeClose() {
		return attributeClose;
	}
	
	/**
	 * @return the changeConfirm
	 */
	public WebElement getChangeConfirm() {
		return changeConfirm;
	}
	
	/**
	 * @return the changeCancel
	 */
	public WebElement getChangeCancel() {
		return changeCancel;
	}
	
	/**
	 * @return the toSubBrand
	 */
	public WebElement getToSubBrand() {
		return toSubBrand;
	}
	
	/**
	 * @return the closeBrandList
	 */
	public WebElement getCloseBrandList() {
		return closeBrandList;
	}
	
	/**
	 * @return the closeSubBrand
	 */
	public WebElement getCloseSubBrand() {
		return closeSubBrand;
	}
	
	
	
	/**
	 * @return the firstRecord
	 */
	public WebElement getFirstRecord() {
		return firstRecord;
	}
	
	/**
	 * @return the brandStatus
	 */
	public WebElement getbrandStatus() {
		return brandStatus;
	}
	
	/**
	 * @return the searchresult
	 */
	public WebElement getSearchresult() {
		return searchresult;
	}
	
	/**
	 * @return the query
	 */
	public WebElement getQuery() {
		return query;
	}
	
}
