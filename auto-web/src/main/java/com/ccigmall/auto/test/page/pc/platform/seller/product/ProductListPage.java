/**
 * 
 */
package com.ccigmall.auto.test.page.pc.platform.seller.product;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao 商品列表
 */
public class ProductListPage extends SettingPage {

	/**
	 * 
	 * @param driver
	 */
	public ProductListPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 出售中的货品
	 */
	@FindBy(how = How.LINK_TEXT, using = "出售中的商品")
	private WebElement saleProduct;

	/**
	 * 新增的商品
	 */
	@FindBy(how = How.LINK_TEXT, using = "新增的商品")
	private WebElement addedProduct;

	/**
	 * 已保存商品
	 */
	@FindBy(how = How.LINK_TEXT, using = "已保存的商品")
	private WebElement savedProduct;

	/**
	 * 待审核的货品
	 */
	@FindBy(how = How.LINK_TEXT, using = "待审核的商品")
	private WebElement pendingReview;

	/**
	 * 审核未通过的货品
	 */
	@FindBy(how = How.LINK_TEXT, using = "审核未通过的商品")
	private WebElement reviewNotPass;
	
	/**
	 * 待出售的商品
	 */
	@FindBy(how = How.LINK_TEXT, using = "待出售的商品")
	private WebElement pendingSale;
	
	/**
	 * 下架的货品
	 */
	@FindBy(how = How.LINK_TEXT, using = "下架的商品")
	private WebElement soldOut;
	
	
	/**
	 * 上架button
	 */
	@FindBy(how = How.XPATH, using = "//tbody[@id='showListTbody']/tr[2]/td[6]/a[3]")
	private WebElement goodsShelves;
	
	
	/**
	 * 查看商品
	 */
	@FindBy(how = How.XPATH, using = "//tbody[@id='showListTbody']/tr[2]/td[6]/a[1]")
	private WebElement viewProduct;
	
	/**
	 * 修改商品
	 */
	@FindBy(how = How.XPATH, using = "//tbody[@id='showListTbody']/tr[2]/td[6]/a[2]")
	private WebElement editProduct;
	
	/**
	 * 现货预计到货天数
	 */
	@FindBy(how = How.ID, using = "spotArrvalDays")
	private WebElement spotArrvalDays;
	
	/**
	 * 期货预计到货天数
	 */
	@FindBy(how = How.ID, using = "futuresArrvalDays")
	private WebElement futuresArrvalDays;
	

	
	/**
	 * 预付比例
	 */
	@FindBy(how = How.ID, using = "retaiPrePayPercent")
	private WebElement prepaidProportion;
	
	/**
	 *按产品数量报价
	 */
	@FindBy(how = How.ID, using = "pic_count")
	private WebElement pic_count;
	
	/**
	 *按产品规格报价
	 */
	@FindBy(how = How.ID, using = "pic_sku")
	private WebElement pic_sku;
	
	/**
	 * 按产品数量报价   供应商价格:
	 */
	@FindBy(how = How.NAME, using = "start")
	private List<WebElement> supplierPrice;
	
	/**
	 * 按产品数量报价   供应商  期货  起批量
	 */
	@FindBy(how = How.NAME, using = "start")
	private List<WebElement> supplierSpotStart;
	
	/**
	 * 按产品数量报价  供应商  期货  起批量 价格
	 */
	@FindBy(how = How.NAME, using = "pic")
	private List<WebElement> supplierSpotPrice;
	
	/**
	 * 按产品数量报价   供应商  现货  起批量
	 */
	@FindBy(how = How.NAME, using = "supplierStart")
	private List<WebElement> supplierFuturesStart;
	
	/**
	 * 按产品数量报价  供应商 现货  起批量 价格
	 */
	@FindBy(how = How.NAME, using = "supplierPrice")
	private List<WebElement> supplierFuturesPrice;
	
	/**
	 * 按产品数量报价   建议零售价
	 */
	@FindBy(how = How.ID, using = "onlyPrice")
	private WebElement onlyPrice;
	
	/** 
	 * 现货增加数量区间                                                                  
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='spotNumPrace']/span[2]")
	private WebElement addNumLinkSpot;
	
	/** 
	 * 期货增加数量区间                                                                  
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='futuresNumPrace']/span[2]")
	private WebElement addNumLinkFutures;
	
	
	
	/**
	 * 按产品规格报价 现货价格 最小起订量
	 */
	@FindBy(how = How.NAME, using = "minNum")
	private WebElement minNum;
	
	/**
	 * 按产品规格报价 现货价格 单价
	 */
	@FindBy(how = How.NAME, using = "productPic")
	private List<WebElement> productPic;
	
	
	/**
	 * 按产品规格报价 现货价格    建议零售价
	 */
	@FindBy(how = How.NAME, using = "rPrice")
	private List<WebElement> rPrice;
	
	/**
	 * 按产品规格报价 期货价格 最小起订量
	 */
	@FindBy(how = How.NAME, using = "supplierMinNum")
	private WebElement supplierMinNum;
	
	/**
	 * 按产品规格报价 期货价格 单价
	 */
	@FindBy(how = How.NAME, using = "supplierPic")
	private List<WebElement> supplierPic;
	
	
	
	
	/**
	 * sku 重量
	 */
	@FindBy(how = How.NAME, using = "weight")
	private List<WebElement> weight;
	
	
	/**
	 * 物流描述：
	 */
	@FindBy(how = How.ID, using = "logisticsDescription")
	private WebElement logisticsDescription;
	
	/**
	 * 提交
	 */ 
	@FindBy(how = How.ID, using = "postTrade")
	private WebElement saveProd;

	
	/**
	 * 保存成功，是否返回到商品列表？
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div")
	private WebElement remindConfirmContent;
	
	/**
	 * 保存成功，是否返回到商品列表？  确认   
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[3]/td/div/input")
	private WebElement remindConfirmOk;
	
	
	/**
	 * 补录库存
	 */ 
	@FindBy(how = How.LINK_TEXT, using = "补录库存")
	private WebElement makeupStock;
	
	/**
	 * 选择仓库
	 */ 
	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/input")
	private WebElement selectWarehouse;
	
	/**
	 * 选择经销商
	 */ 
	@FindBy(how = How.ID, using = "getDealerName")
	private WebElement DealerName;
	
	/**
	 * 选择经销商搜索
	 */ 
	@FindBy(how = How.XPATH, using = "//div[2]/div[2]/button")
	private WebElement dealerNameButton;
	
	
	/**
	 * 经销商checkBox
	 */ 
	@FindBy(how = How.NAME, using = "dealerName")
	private WebElement dealerNameCheckBox;
	
	/**
	 * 选择经销商搜索确认按钮
	 */ 
	@FindBy(how = How.XPATH, using = "//button[@id='dealerclick']")
	private WebElement dealerNameOk;
	
	/**
	 * 补录库存提交按钮 
	 */
	@FindBy(how = How.XPATH, using = "//form[@id='despatch']/div/button")
	private WebElement makeupStockSubmit;

	/**
	 * 点击催缴平台 催缴按钮
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::a[2]")
	private WebElement xpathCliPlatformButton;

	/**
	 * 点击弹出框中的确定
	 */
	@FindBy(xpath="//input[@value='确定']")
	private WebElement xpathCliAlertConfirm;

	/**
	 * 获得商品名称
	 */
	@FindBy(xpath="//table[@id='J_BoughtTable']/descendant::i[1]")
	private WebElement xpathGetProductName;
	
	
	/**
	 * 点击选择仓库的确定按钮
	 */
	@FindBy(xpath="//button[@id='warehouseclick']")
	private WebElement warehouseConfirm;
	
	//*****************************************************add - 卖家中心 - 补录库存详情页 page----start*************************************
	
	/**
	 * 获得添加按钮的个数
	 */
	@FindBy(xpath="//form[@id='despatch']/div/div/button")
	private List<WebElement> xpathGetAddButtons;
	
	/**
	 * 判断是否有时间框：显示的是操作 or 过期时间
	 */
	@FindBy(xpath="//form[@id='despatch']/descendant::th[4]")
	private WebElement xpathBooleanExistTimeBox;
	
	//*****************************************************add - 卖家中心 - 补录库存详情页 page----end*************************************
	public WebElement getXpathCliAlertConfirm() {
		return xpathCliAlertConfirm;
	}

	public WebElement getXpathGetProductName() {
		return xpathGetProductName;
	}

	public List<WebElement> getXpathGetAddButtons() {
		return xpathGetAddButtons;
	}


	public WebElement getXpathBooleanExistTimeBox() {
		return xpathBooleanExistTimeBox;
	}

	public WebElement getXpathCliPlatformButton() {
		return xpathCliPlatformButton;
	}

	/**
	 * @return the saleProduct
	 */
	public WebElement getSaleProduct() {
		return saleProduct;
	}

	/**
	 * @return the addedProduct
	 */
	public WebElement getAddedProduct() {
		return addedProduct;
	}

	/**
	 * @return the savedProduct
	 */
	public WebElement getSavedProduct() {
		return savedProduct;
	}

	/**
	 * @return the pendingReview
	 */
	public WebElement getPendingReview() {
		return pendingReview;
	}

	/**
	 * @return the reviewNotPass
	 */
	public WebElement getReviewNotPass() {
		return reviewNotPass;
	}

	/**
	 * @return the pendingSale
	 */
	public WebElement getPendingSale() {
		return pendingSale;
	}

	/**
	 * @return the soldOut
	 */
	public WebElement getSoldOut() {
		return soldOut;
	}

	/**
	 * @return the goodsShelves
	 */
	public WebElement getGoodsShelves() {
		return goodsShelves;
	}

	/**
	 * @return the viewProduct
	 */
	public WebElement getViewProduct() {
		return viewProduct;
	}

	/**
	 * @return the editProduct
	 */
	public WebElement getEditProduct() {
		return editProduct;
	}

	/**
	 * @return the spotArrvalDays
	 */
	public WebElement getSpotArrvalDays() {
		return spotArrvalDays;
	}

	/**
	 * @return the futuresArrvalDays
	 */
	public WebElement getFuturesArrvalDays() {
		return futuresArrvalDays;
	}

	/**
	 * @return the prepaidProportion
	 */
	public WebElement getPrepaidProportion() {
		return prepaidProportion;
	}

	/**
	 * @return the pic_count
	 */
	public WebElement getPic_count() {
		return pic_count;
	}

	/**
	 * @return the pic_sku
	 */
	public WebElement getPic_sku() {
		return pic_sku;
	}

	/**
	 * @return the supplierPrice
	 */
	public List<WebElement> getSupplierPrice() {
		return supplierPrice;
	}

	/**
	 * @return the supplierSpotStart
	 */
	public List<WebElement> getSupplierSpotStart() {
		return supplierSpotStart;
	}

	/**
	 * @return the supplierSpotPrice
	 */
	public List<WebElement> getSupplierSpotPrice() {
		return supplierSpotPrice;
	}

	/**
	 * @return the supplierFuturesStart
	 */
	public List<WebElement> getSupplierFuturesStart() {
		return supplierFuturesStart;
	}

	/**
	 * @return the supplierFuturesPrice
	 */
	public List<WebElement> getSupplierFuturesPrice() {
		return supplierFuturesPrice;
	}

	/**
	 * @return the onlyPrice
	 */
	public WebElement getOnlyPrice() {
		return onlyPrice;
	}

	

	/**
	 * @return the addNumLinkSpot
	 */
	public WebElement getAddNumLinkSpot() {
		return addNumLinkSpot;
	}

	/**
	 * @return the addNumLinkFutures
	 */
	public WebElement getAddNumLinkFutures() {
		return addNumLinkFutures;
	}

	/**
	 * @return the minNum
	 */
	public WebElement getMinNum() {
		return minNum;
	}

	/**
	 * @return the productPic
	 */
	public List<WebElement> getProductPic() {
		return productPic;
	}

	/**
	 * @return the rPrice
	 */
	public List<WebElement> getrPrice() {
		return rPrice;
	}

	/**
	 * @return the supplierMinNum
	 */
	public WebElement getSupplierMinNum() {
		return supplierMinNum;
	}

	/**
	 * @return the supplierPic
	 */
	public List<WebElement> getSupplierPic() {
		return supplierPic;
	}

	/**
	 * @return the weight
	 */
	public List<WebElement> getWeight() {
		return weight;
	}

	/**
	 * @return the logisticsDescription
	 */
	public WebElement getLogisticsDescription() {
		return logisticsDescription;
	}

	/**
	 * @return the saveProd
	 */
	public WebElement getSaveProd() {
		return saveProd;
	}

	/**
	 * @return the remindConfirmContent
	 */
	public WebElement getRemindConfirmContent() {
		return remindConfirmContent;
	}

	/**
	 * @return the remindConfirmOk
	 */
	public WebElement getRemindConfirmOk() {
		return remindConfirmOk;
	}

	/**
	 * @return the makeupStock
	 */
	public WebElement getMakeupStock() {
		return makeupStock;
	}

	/**
	 * @return the selectWarehouse
	 */
	public WebElement getSelectWarehouse() {
		return selectWarehouse;
	}

	/**
	 * @return the dealerName
	 */
	public WebElement getDealerName() {
		return DealerName;
	}

	/**
	 * @return the dealerNameButton
	 */
	public WebElement getDealerNameButton() {
		return dealerNameButton;
	}

	/**
	 * @return the dealerNameCheckBox
	 */
	public WebElement getDealerNameCheckBox() {
		return dealerNameCheckBox;
	}

	/**
	 * @return the dealerNameOk
	 */
	public WebElement getDealerNameOk() {
		return dealerNameOk;
	}

	/**
	 * @return the makeupStockSubmit
	 */
	public WebElement getMakeupStockSubmit() {
		return makeupStockSubmit;
	}
	
	/**
	 * @return the WarehouseConfirm
	 */
	public WebElement getWarehouseConfirm() {
		return warehouseConfirm;
	}

}
