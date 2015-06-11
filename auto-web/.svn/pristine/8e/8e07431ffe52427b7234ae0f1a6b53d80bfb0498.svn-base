package com.ccigmall.auto.test.page.pc.supplier.seller.brand;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.supplier.seller.SellerIndexPage;
/**
 * 
 * @author chenjingli 
 * supplier--卖家中心--商品管理--品牌管理
 *
 */
public class BrandManagementPage extends SellerIndexPage{

	public BrandManagementPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 点击新建品牌
	 */
	@FindBy(xpath="//button[contains(text(),'新建品牌')]")
	public WebElement xpathCliNewBrand;
	/**
	 * 选择品牌名称
	 */
	@FindBy(id="sysBrand")
	public WebElement selBrandName;
	/**
	 * 选择品牌类型
	 */
	@FindBy(name="brandType")
	public WebElement selBrandType;
	
	/**
	 * 输入品牌名称
	 */
	@FindBy(name="otherBrand")
	public WebElement BrandName;
	
	
	/**
	 * 选择品牌备注
	 */
	@FindBy(id="remark")
	public WebElement typeBrandMark;
	/**
	 * 点击选择图片
	 */
	@FindBy(xpath="//div[@id='uploader_00']/div[1]/div/div/div[2]/label")
	public WebElement linkSelPicture;
	/**
	 * 点击继续上传
	 */
	@FindBy(xpath="//div[@id='uploader_00']/descendant::div[12]")
	public WebElement xpathCliContinueUpload;
	
	public WebElement getXpathCliContinueUpload() {
		return xpathCliContinueUpload;
	}
	/**
	 * 点击开上传按钮
	 */
	@FindBy(xpath="//div[contains(text(),'开始上传')]")
	public WebElement xpathCliStartUpload;
	
	/**
	 * 点击提交审核
	 */
	@FindBy(id="saveBrand")
	public WebElement idCliSubmit;
	/**
	 * 获得 品牌管理 列表的 序列号 为1 的品牌名称
	 */
	@FindBy(xpath="//div[@id='modelCont']/descendant::p[10]")
	public WebElement xpathGetBrandName;
	/**
	 * 获得 品牌管理 列表ul
	 */
	@FindBy(xpath="//div[@id='modelCont']/div[1]/div/ul[2]/li")
	public List<WebElement> xpathGetBrandList;
	/**
	 * 点击删除按钮
	 */
	@FindBy(xpath="//div[@id='modelCont']/descendant::span[1]")  
	public WebElement xpathCliDelButton;
	/**
	 * 点击资质图片
	 */
	@FindBy(xpath="//div[@id='uploader_00']/div[1]/ul/li[1]")  
	public WebElement xpathCliImg;
	/**
	 * 点击图片上的删除按钮
	 */
	@FindBy(xpath="//div[@id='uploader_00']/div[1]/ul/li[1]/div/span")  
	public WebElement xpathCliImgDel;
	
	/**
	 * 获得 新建品牌下的自制图片的列表ul
	 */
	@FindBy(xpath="//div[@id='uploader_00']/div[1]/ul/li")
	public List<WebElement> xpathGetBrandImgList;
	/**
	 * 点击图片上的删除 按钮
	 */
	@FindBy(xpath="//div[@id='uploader_00']/div[1]/ul/li/div/span")
	public WebElement xpathCliimgDelButton;
	/**
	 * 输入 其他 input框内容
	 */
	@FindBy(name="otherBrand")  
	public WebElement nameTypeOther;
	/**
	 * 获得 品牌管理 操作中修改按钮的a列表
	 */
	@FindBy(xpath="//div[@id='modelCont']/div[1]/div/ul[2]/li/p[6]/a")
	public List<WebElement> xpathGetBrandUpdateList;
	/**
	 * 默认点击 第一个修改按钮
	 */
	@FindBy(xpath="//div[@id='modelCont']/descendant::a[1]")  
	public WebElement xpathCliFirstUpdate;
	
	/**
	 * 获取 页面 供应商的名称
	 */
	@FindBy(xpath="//div[@class='t_nav']/descendant::li[5]")  
	public WebElement xpathGetSupplierName;
	
	public WebElement getXpathGetSupplierName() {
		return xpathGetSupplierName;
	}
	public WebElement getXpathCliFirstUpdate() {
		return xpathCliFirstUpdate;
	}
	public List<WebElement> getXpathGetBrandUpdateList() {
		return xpathGetBrandUpdateList;
	}
	public WebElement getNameTypeOther() {
		return nameTypeOther;
	}
	public List<WebElement> getXpathGetBrandImgList() {
		return xpathGetBrandImgList;
	}
	public WebElement getXpathCliimgDelButton() {
		return xpathCliimgDelButton;
	}
	public List<WebElement> getXpathGetBrandList() {
		return xpathGetBrandList;
	}
	public WebElement getXpathCliDelButton() {
		return xpathCliDelButton;
	}
	public WebElement getXpathCliNewBrand() {
		return xpathCliNewBrand;
	}
	public WebElement getSelBrandName() {
		return selBrandName;
	}
	public WebElement getSelBrandType() {
		return selBrandType;
	}
	public WebElement getTypeBrandMark() {
		return typeBrandMark;
	}
	public WebElement getLinkSelPicture() {
		return linkSelPicture;
	}
	public WebElement getIdCliSubmit() {
		return idCliSubmit;
	}
	public WebElement getXpathCliStartUpload() {
		return xpathCliStartUpload;
	}
	public WebElement getXpathGetBrandName() {
		return xpathGetBrandName;
	}
	public WebElement getXpathCliImg() {
		return xpathCliImg;
	}
	public WebElement getXpathCliImgDel() {
		return xpathCliImgDel;
	}
	public WebElement getBrandName() {
		return BrandName;
	}
}
