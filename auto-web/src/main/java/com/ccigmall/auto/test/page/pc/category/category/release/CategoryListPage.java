/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category.category.release;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author dengshuhai
 * 类目列表页面
 */
public class CategoryListPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public CategoryListPage(WebDriver driver) {
		super(driver);
	}
	
	
	/**
	 *绑定品牌
	 */
	@FindBy(partialLinkText="绑定品牌")
	private WebElement bindBrand;
	
	/**
	 *绑定产品线
	 */
	@FindBy(linkText="绑定产品线")
	private WebElement bindProductLine;
	
	
	/**
	 *暂无数据
	 */
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/h2")
	private WebElement noData;
	
	/**
	 *类目列表
	 */
	@FindBy(linkText="类目列表")
	private WebElement categoryList;
	
	/**
	 *	选出来的第一条记录 
	 */
	@FindBy(xpath="//tr[@target='sid_user']")
	private List<WebElement> firstRecord;

	/**
	 *添加类目
	 */
	@FindBy(xpath="//span[text()='添加类目']")
	private WebElement addCategory;
	
	/**
	 *类目中文名称
	 */
	@FindBy(name="pubNameCn")
	private WebElement pubNameCn;
	
	/**
	 *类目英文名称
	 */
	@FindBy(name="pubName")
	private WebElement pubNameEn;
	
	/**
	 *类目说明
	 */
	@FindBy(name="remark")
	private WebElement remark;
	
	/**
	 *是否叶子类目- 是
	 */
	@FindBy(xpath="(//input[@name='leaf'])[1]")
	private WebElement isChildren;
	
	/**
	 *是否叶子类目-否
	 */
	@FindBy(xpath="(//input[@name='leaf'])[2]")
	private WebElement notChildren;
	
	/**
	 *保存按钮
	 */
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	
	/**
	 *取消按钮
	 */
	@FindBy(css="button.close")
	private WebElement cancelButton;
	
	/**
	 *修改类目
	 */
	@FindBy(xpath="//span[text()='修改类目']")
	private WebElement modifyCategory;
	
	
	/**
	 *删除类目
	 */
	@FindBy(xpath="//span[text()='删除类目']")
	private List<WebElement> deleteCategory;
	
	/**
	 *输入要搜索的 类目中文名
	 */
	@FindBy(xpath="//input[@type='text'][@name='searchname']")
	private WebElement searchName;
	
	/**
	 *类目-搜索按钮
	 */
	@FindBy(xpath="//button[text()='搜索']")
	private List<WebElement> searchButton;
	
	/**
	 *类目变更成功后-确认按钮
	 */
	@FindBy(xpath="//span[text()='确定']")
	private WebElement alertConfirmButton;
	
	/**
	 *进入子类目
	 */
	@FindBy(linkText="进入子类目")
	private WebElement enterSubCategoey;
	
	/**
	 *进入子类目 是否存在
	 */
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[4]")
	private WebElement SubCategoey;

	/**
	 *未绑定品牌 是否存在
	 */
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[3]")
	private WebElement isModifyBrand;
	
	
	/**
	 *返回上一级
	 */
	@FindBy(xpath="//a[@rel='w_panel']/span[text()='返回上一级']")
	private List<WebElement> backParent;

	
	/**
	 *选择产品线模板
	 */
	@FindBy(name="prodlineid")
	private WebElement selectProductInput;
	
	/**
	 *绑定产品线-下一步
	 */
	@FindBy(xpath="//input[@value='下一步']")
	private WebElement nextButton;

	/**
	 *绑定产品线-取消
	 */
	@FindBy(xpath="//input[@value='取消']")
	private WebElement bindProCancel;
	
	/**
	 *全选/反选
	 */
	@FindBy(linkText="全选/反选")
	private WebElement selectAll;
	
	/**
	 *产地属性 必填属性
	 */
	@FindBy(id="required0")
	private WebElement setProperty_1_1;
	
	/**
	 *产地属性 规格属
	 */
	@FindBy(id="saleAttr0")
	private WebElement setProperty_1_2;
	
	/**
	 *产地属性 展示属性
	 */
	@FindBy(id="buyAttr0")
	private WebElement setProperty_1_3;
	
	/**
	 *包装属性 必填属性
	 */
	@FindBy(id="required1")
	private WebElement setProperty_2_1;
	
	/**
	 *包装属性 规格属
	 */
	@FindBy(id="saleAttr1")
	private WebElement setProperty_2_2;
	
	/**
	 *口味属性 展示属性
	 */
	@FindBy(id="required2")
	private WebElement setProperty_3_1;

	/**
	 *口味属性 必填属性
	 */
	@FindBy(id="saleAttr2")
	private WebElement setProperty_3_2;
	
	/**
	 *口味属性 规格属
	 */
	@FindBy(id="buyAttr2")
	private WebElement setProperty_3_3;
	
	/**
	 *颜色属性 展示属性
	 */
	@FindBy(id="required3")
	private WebElement setProperty_4_1;
	
	/**
	 *颜色属性 必填属性
	 */
	@FindBy(id="saleAttr3")
	private WebElement setProperty_4_2;
	
	/**
	 *颜色属性 规格属
	 */
	@FindBy(id="buyAttr3")
	private WebElement setProperty_4_3;
	
	/**
	 *颜色属性 形式
	 */
	@FindBy(id="type3")
	private WebElement setProperty_4_4;
	
	/**
	 *编辑品牌
	 */
	@FindBy(linkText="编辑品牌")
	private WebElement modifyBrand;
	
	/**
	 *查看品牌
	 */
	@FindBy(linkText="查看品牌")
	private WebElement checkBrand;
	
	/**
	 *产品线解绑
	 */
	@FindBy(linkText="解绑")
	private WebElement removeBind;
	
	
	/**
	 *绑定产品线 是否存在 
	 */
	@FindBy(css=".list > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > a:nth-child(1)")
	private WebElement isRemoveBind;
	
	/**
	 *查看已绑定的-产品线
	 */
	@FindBy(xpath="//input[@checked='checked']")
	private List<WebElement> productChecked;
	
	
	
	
	

	public List<WebElement> getProductChecked() {
		return productChecked;
	}

	public WebElement getModifyBrand() {
		return modifyBrand;
	}

	public WebElement getCheckBrand() {
		return checkBrand;
	}

	public WebElement getRemoveBind() {
		return removeBind;
	}

	public WebElement getSetProperty_1_1() {
		return setProperty_1_1;
	}

	public WebElement getSetProperty_1_2() {
		return setProperty_1_2;
	}

	public WebElement getSetProperty_1_3() {
		return setProperty_1_3;
	}

	
	public WebElement getSetProperty_2_1() {
		return setProperty_2_1;
	}

	public WebElement getSetProperty_2_2() {
		return setProperty_2_2;
	}

	public WebElement getSetProperty_3_1() {
		return setProperty_3_1;
	}

	public WebElement getSetProperty_3_2() {
		return setProperty_3_2;
	}

	public WebElement getSetProperty_3_3() {
		return setProperty_3_3;
	}

	public WebElement getSetProperty_4_1() {
		return setProperty_4_1;
	}

	public WebElement getSetProperty_4_2() {
		return setProperty_4_2;
	}

	public WebElement getSetProperty_4_3() {
		return setProperty_4_3;
	}

	public WebElement getSetProperty_4_4() {
		return setProperty_4_4;
	}

	public WebElement getSelectAll() {
		return selectAll;
	}

	public WebElement getSelectProductInput() {
		return selectProductInput;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getBindProCancel() {
		return bindProCancel;
	}

	public List<WebElement> getBackParent() {
		return backParent;
	}

	public WebElement getEnterSubCategoey() {
		return enterSubCategoey;
	}

	public WebElement getCategoryList() {
		return categoryList;
	}

	public WebElement getAddCategory() {
		return addCategory;
	}

	public WebElement getPubNameCn() {
		return pubNameCn;
	}

	public WebElement getPubNameEn() {
		return pubNameEn;
	}

	public WebElement getRemark() {
		return remark;
	}

	public WebElement getIsChildren() {
		return isChildren;
	}

	public WebElement getNotChildren() {
		return notChildren;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getModifyCategory() {
		return modifyCategory;
	}

	public List<WebElement> getDeleteCategory() {
		return deleteCategory;
	}

	public WebElement getSearchName() {
		return searchName;
	}

	public List<WebElement> getSearchButton() {
		return searchButton;
	}

	public WebElement getAlertConfirmButton() {
		return alertConfirmButton;
	}

	public List<WebElement> getFirstRecord() {
		return firstRecord;
	}

	public WebElement getNoData() {
		return noData;
	}

	public WebElement getBindBrand() {
		return bindBrand;
	}

	public WebElement getBindProductLine() {
		return bindProductLine;
	}

	public WebElement getSubCategoey() {
		return SubCategoey;
	}

	public WebElement getIsModifyBrand() {
		return isModifyBrand;
	}

	public WebElement getIsRemoveBind() {
		return isRemoveBind;
	}
	
	
}
