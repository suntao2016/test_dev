package com.ccigmall.auto.test.page.pc.category.category.productline;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * 
 * @author jianping.gao
 * 产品线模板管理
 */
public class ProductLineModlePage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public ProductLineModlePage(WebDriver driver) {
		super(driver);
	}

	
	
	/**
	 * 添加产品线
	 */
	@FindBy(how = How.LINK_TEXT, using = "添加产品线")
	private WebElement addProductLine;
	
	/**
	 * 删除产品线
	 */
	@FindBy(how = How.LINK_TEXT, using = "删除产品线")
	private WebElement  delProductLine;
	
	/**
	 * 修改产品线
	 */
	@FindBy(how = How.LINK_TEXT, using = "修改产品线")
	private WebElement  mdfProductLine;
	
	/**
	 * 输入产品线的中文名字
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='lineNameCn'][@size='30']")
	private WebElement productLineNameCn;
	
	/**
	 * 输入产品线的英文名字
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='lineName'][@size='30']")
	private WebElement productLineNameEn;
	
	/**
	 * 输入产品线的描述
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='remark'][@size='30']")
	private WebElement productLineDesc;
	
	/**
	 * 产品线保存
	 */
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement productLineSubmit;
	
	/**
	 * 输入搜索产品线名称
	 */
	@FindBy(how = How.XPATH, using = "//input[@type='text'][@name='lineNameCn']")
	private WebElement productLineName;
	
	
	/**
	 * 产品线名称搜索 按钮
	 */
	@FindBy(how = How.XPATH, using = "//button[text()='搜索']")
	private WebElement productLineNameSearch;
	
	private WebElement productLine;
	
	/**
	 * 产品线名称搜索 结果
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/table/tbody/tr/td")
	private List<WebElement> productLineSearchResult;
	
	/**
	 * 产品线名称搜索 结果 第一个属性管理
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/table/tbody/tr/td[6]/a")
	private WebElement productLineSearchResultAttrManage;
	
	/**
	 * 产品线名称搜索 结果 第一条记录
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/table/tbody/tr[1]/td[1]")
	private WebElement productLineSearchResultFirst;
	
	
	/**
	 * 点击添加属性
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navTab']/div[2]/div[3]/div[2]/div[1]/ul/li[1]/a/span")
	private WebElement productLineAddAttr;
	
	/**
	 * 输入属性中文名称
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='lineAttrNameCn'][@size='30']")
	private WebElement productLineAddAttrCn;
	
	/**
	 * 输入属性英文名称
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='lineAttrName'][@size='30']")
	private WebElement productLineAddAttrEn;
	
	/**
	 * 输入属性描述
	 */
	@FindBy(how = How.XPATH, using = "//input[@name='remark'][@maxlength='50']")
	private WebElement productLineAddAttrDesc;
	
	
	/**
	 * 添加更多属性值
	 */
	@FindBy(how = How.XPATH, using = "//span[text()='添加更多属性值']")
	private WebElement productLineAddAttMore;
	
	/**
	 * 保存
	 */
	@FindBy(how = How.XPATH, using = "//button[@type='submit'][text()='保存']")
	private WebElement attrSave;
	
	
	/**
	 * 删除弹出框-确定按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li[1]/a/span")
	private WebElement delConfirm;
	
	/**
	 * 删除弹出框-取消按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li[2]/a/span")
	private WebElement delCancel;
	
	/**
	 * 操作成功确认按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[1]/div/div[2]/ul/li/a/span")
	private WebElement query;
	
	/**
	 * @return the delConfirm
	 */
	public WebElement getDelConfirm() {
		return delConfirm;
	}
	
	/**
	 * @return the delCancel
	 */
	public WebElement getDelCancele() {
		return delCancel;
	}
	
	/**
	 * @return the query
	 */
	public WebElement getQuery() {
		return query;
	}
	
	/**
	 * @return the attrSave
	 */
	public WebElement getAttrSave() {
		return attrSave;
	}

	/**
	 * @return the productLineAddAttMore
	 */
	public WebElement getProductLineAddAttMore() {
		return productLineAddAttMore;
	}

	/**
	 * @return the delProductLine
	 */
	public WebElement getDelProductLine() {
		return delProductLine;
	}
	
	
	/**
	 * @return the mdfProductLine
	 */
	public WebElement getMdfProductLine() {
		return mdfProductLine;
	}
	
	/**
	 * @return the mdfProductLine
	 */
	public WebElement getProductLineSearchResultFirst() {
		return productLineSearchResultFirst;
	}
	
	/**
	 * @return the addProductLine
	 */
	public WebElement getAddProductLine() {
		return addProductLine;
	}

	/**
	 * @return the productLineNameCn
	 */
	public WebElement getProductLineNameCn() {
		return productLineNameCn;
	}

	/**
	 * @return the productLineNameEn
	 */
	public WebElement getProductLineNameEn() {
		return productLineNameEn;
	}

	/**
	 * @return the productLineDesc
	 */
	public WebElement getProductLineDesc() {
		return productLineDesc;
	}

	/**
	 * @return the productLineSubmit
	 */
	public WebElement getProductLineSubmit() {
		return productLineSubmit;
	}

	/**
	 * @return the productLineName
	 */
	public WebElement getProductLineName() {
		return productLineName;
	}

	/**
	 * @return the productLineNameSearch
	 */
	public WebElement getProductLineNameSearch() {
		return productLineNameSearch;
	}



	/**
	 * @return the productLineSearchResult
	 */
	public List<WebElement> getProductLineSearchResult() {
		return productLineSearchResult;
	}

	/**
	 * @return the productLineSearchResultAttrManage
	 */
	public WebElement getProductLineSearchResultAttrManage() {
		return productLineSearchResultAttrManage;
	}

	/**
	 * @return the productLineAddAttr
	 */
	public WebElement getProductLineAddAttr() {
		return productLineAddAttr;
	}

	/**
	 * @return the productLineAddAttrCn
	 */
	public WebElement getProductLineAddAttrCn() {
		return productLineAddAttrCn;
	}

	/**
	 * @return the productLineAddAttrEn
	 */
	public WebElement getProductLineAddAttrEn() {
		return productLineAddAttrEn;
	}

	/**
	 * @return the productLineAddAttrDesc
	 */
	public WebElement getProductLineAddAttrDesc() {
		return productLineAddAttrDesc;
	}

	
		
}
