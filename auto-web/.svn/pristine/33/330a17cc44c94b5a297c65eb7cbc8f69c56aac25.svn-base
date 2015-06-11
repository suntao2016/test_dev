/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category.category.show;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author dengshuhai
 * <p>
 * 展示类目管理page 
 * @since 2015-01-14
 */
public class ShowCategoryManagePage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public ShowCategoryManagePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 *排序值
	 */
	@FindBy(xpath="//input[@name='sortvalnum']")
	private WebElement sortvalnum;
		
	/**
	 *导航图片
	 */
	@FindBy(id="imgFile")
	private WebElement uploadImg;
	
	
	/**
	 *暂无数据
	 */
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/h2")
	private WebElement noData;
	
	/**
	 *展示类目管理
	 */
	@FindBy(linkText="展示类目管理")
	private WebElement showCategoryManage;
	
	/**
	 *	选出来的第一条记录 
	 */
	@FindBy(xpath="//tr[@target='sid_user']")
	private List<WebElement> firstRecord;
	
	/**
	 *添加crosslink
	 */
	@FindBy(xpath="//span[text()='添加crosslink']")
	private List<WebElement> addCrosslink;
	
	/**
	 *删除crosslink
	 */
	@FindBy(xpath="//span[text()='删除crosslink']")
	private WebElement delCrosslink;

	/**
	 *修改展示状态
	 */
	@FindBy(xpath="//span[text()='修改展示状态']")
	private List<WebElement> updateDispStatu;
	
	/**
	 *选择crosslink 集合
	 */
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkboxs;
	
	/**
	 *添加类目
	 */
	@FindBy(xpath="//span[text()='添加类目']")
	private List<WebElement> addCategory;
	
	/**
	 *类目中文名称
	 */
	@FindBy(name="dispNameCn")
	private WebElement dispNameCn;
	
	/**
	 *类目英文名称
	 */
	@FindBy(name="dispName")
	private WebElement dispNameEN;
	
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
	 *绑定按钮
	 */
	@FindBy(xpath="//input[@value='绑定']")
	private WebElement bindButton;
	
	/**
	 *取消按钮
	 */
	@FindBy(css="button.close")
	private WebElement cancelButton;
	
	/**
	 *绑定发布类目
	 */
	@FindBy(linkText="绑定发布类目")
	private WebElement bindPubCategory;
	
	/**
	 *绑定发布类目
	 */
	@FindBy(name="catePubId")
	private WebElement clickCatePubSelect;
	
	
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
	 *返回上一级
	 */
	@FindBy(xpath="//a[@rel='w_panel']/span[text()='返回上一级']")
	private List<WebElement> backParent;
	
	/**
	 *解绑
	 */
	@FindBy(linkText="解绑")
	private WebElement removeBind;
	
	/**
	 *crosslinkText集合
	 */
	@FindBy(xpath="//tr[@target='sid_user']/td[2]/select/option")
	private List< WebElement> crosslinkText;
	
	
	/**
	 *弹框 close
	 */
	@FindBy(xpath="(//a[@href='#close'])[1]")
	private WebElement closeButton;
	
	/**
	 *title close
	 */
	@FindBy(xpath="//a[@title='展示类目管理']/following::a[1]")
	private WebElement titleClose;
	
	

	public WebElement getTitleClose() {
		return titleClose;
	}

	public WebElement getNoData() {
		return noData;
	}

	public WebElement getShowCategoryManage() {
		return showCategoryManage;
	}

	public List<WebElement> getFirstRecord() {
		return firstRecord;
	}

	public List<WebElement> getAddCategory() {
		return addCategory;
	}

	public WebElement getDispNameCn() {
		return dispNameCn;
	}

	public WebElement getDispNameEN() {
		return dispNameEN;
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

	public WebElement getEnterSubCategoey() {
		return enterSubCategoey;
	}

	public WebElement getSubCategoey() {
		return SubCategoey;
	}

	public List<WebElement> getBackParent() {
		return backParent;
	}

	public WebElement getRemoveBind() {
		return removeBind;
	}

	public WebElement getSortvalnum() {
		return sortvalnum;
	}

	public WebElement getUploadImg() {
		return uploadImg;
	}

	public WebElement getBindPubCategory() {
		return bindPubCategory;
	}

	public WebElement getClickCatePubSelect() {
		return clickCatePubSelect;
	}

	public WebElement getBindButton() {
		return bindButton;
	}

	public List<WebElement> getAddCrosslink() {
		return addCrosslink;
	}

	public WebElement getDelCrosslink() {
		return delCrosslink;
	}

	public List<WebElement> getUpdateDispStatu() {
		return updateDispStatu;
	}

	public List<WebElement> getCheckboxs() {
		return checkboxs;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public List<WebElement> getCrosslinkText() {
		return crosslinkText;
	}
	
	

}
