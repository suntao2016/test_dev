/**
 * 
 */
package com.ccigmall.auto.test.page.pc.supplier.seller.product;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 创建商品
 */
public class CreateProductPage extends SettingPage {

	/**
	 * 创建商品
	 * @param driver
	 */
	public CreateProductPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 一级分类
	 */
	@FindBy(how = How.LINK_TEXT, using = "回归测试")
	private WebElement fisrt;

	/**
	 * 二级分类
	 */
	@FindBy(how = How.LINK_TEXT, using = "自动化测试-2级目录")
	private WebElement second;

	/**
	 * 三级分类
	 */
	@FindBy(how = How.LINK_TEXT, using = "自动化测试-3级目录")
	private WebElement third;

	/**
	 * 下一步,填写商品详细信息
	 */
	@FindBy(how = How.LINK_TEXT, using = "下一步,填写商品详细信息")
	private WebElement next;

	/**
	 * 商品标题
	 */
	@FindBy(how = How.ID, using = "productinfo")
	private WebElement productTitle;
	
	/**
	 * 品牌 - 1
	 */
	@FindBy(how = How.ID, using = "firstcategory")
	private WebElement firstcategory;
	
	/**
	 * 品牌 - 2
	 */
	@FindBy(how = How.ID, using = "secondcategory")
	private WebElement secondcategory;
	
	
	/**
	 * 产地
	 */
	@FindBy(how = How.NAME, using = "supplierProductAttrDTOs[0].supplierProductAttrvals[0].lineAttrvalNameCn")
	private WebElement origin;
	
	/**
	 * 颜色
	 */
	@FindBy(how = How.NAME, using = "supplierProductAttrDTOs[3].supplierProductAttrvals[0].lineAttrvalNameCn")
	private WebElement color;
	
	/**
	 * 原产地
	 */
	@FindBy(how = How.NAME, using = "supplierProduct.originplace")
	private WebElement originplace;
	
	/**
	 * 制造商：
	 */
	@FindBy(how = How.NAME, using = "supplierProduct.manufacturers")
	private WebElement manufacturers;
	
	
	/**
	 * 保质期：
	 */
	@FindBy(how = How.ID, using = "sheilLife")
	private WebElement sheilLife;
	
	/**
	 * 保质期单位
	 */
	@FindBy(how = How.NAME, using = "supplierProductDetail.sheilLifeType")
	private WebElement sheilLifeType;
	
	/**
	 * 商品备注
	 */
	@FindBy(how = How.ID, using = "remark")
	private WebElement remark;
	
	/**
	 * 证明资质的图片 点击选择图片 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_00']/div[1]/div/div/div[2]/label")
	private WebElement qualificationImgClick;
	
	
	/**
	 * 证明资质的图片 开始上传 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_00']/div[2]/div[3]/div[2]")
	private WebElement qualificationUpload;
	
	
	
	/**
	 * 产品规格 : 包装 :中袋
	 */
	@FindBy(how = How.NAME, using = "supplierProductAttrDTOs[1].supplierProductAttrvals[1].lineAttrvalNameCn")
	private WebElement packMiddle;
	
	/**
	 * 产品规格 : 包装 :小袋
	 */
	@FindBy(how = How.NAME, using = "supplierProductAttrDTOs[1].supplierProductAttrvals[2].lineAttrvalNameCn")
	private WebElement packSmall;
	
	
	/**
	 * 产品规格 : 口味 :咖啡
	 */
	@FindBy(how = How.NAME, using = "supplierProductAttrDTOs[2].supplierProductAttrvals[1].lineAttrvalNameCn")
	private WebElement tasteCoffee;
	
	/**
	 * 产品规格 : 口味 :奶油
	 */
	@FindBy(how = How.NAME, using = "supplierProductAttrDTOs[2].supplierProductAttrvals[2].lineAttrvalNameCn")
	private WebElement tasteCream;
	
	/**
	 * coffe 点击选择图片 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_1']/div[1]/div/div/div[2]/label")
	private WebElement coffeImgClick;
	
	
	/**
	 * coffe 继续添加图片 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_1']/div[2]/div[3]/div[1]/div[2]/label")
	private WebElement coffeImgGoOnClick;
	
	
	/**
	 * coffe 开始上传 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_1']/div[2]/div[3]/div[2]")
	private WebElement coffeUpload;
	
	/**
	 * cream 点击选择图片 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_2']/div[1]/div/div/div[2]/label")
	private WebElement creamImgClick;
	
	/**
	 * cream 继续添加图片 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_2']/div[2]/div[3]/div[1]/div[2]/label")
	private WebElement creamImgGoOnClick;
	
	
	/**
	 * cream 开始上传 
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='uploader_2']/div[2]/div[3]/div[2]")
	private WebElement creamUpload;
	
	/**
	 * 计量单位
	 */
	@FindBy(how = How.NAME, using = "supplierProductPackage.measureid")
	private WebElement measureUnit;
	
	/**
	 * 计价单位
	 */
	@FindBy(how = How.NAME, using = "supplierProductSaleSetting.moneyUnitId")
	private WebElement denominatedUnit;
	
	/**
	 * 价格类型
	 */
	@FindBy(how = How.ID, using = "priceType")
	private List<WebElement> priceType;
	
	
	/**
	 * 离岸港口名称
	 */
	@FindBy(how = How.ID, using = "priceType0text")
	private WebElement FOB_Port;
	
	/**
	 * 到岸港口名称
	 */
	@FindBy(how = How.ID, using = "priceType1text")
	private WebElement CIF_Port;

	
	/**
	 * 按产品数量报价
	 */
	@FindBy(how = How.ID, using = "pic_count")
	private WebElement numPriceRadio;
	
	/**
	 * 增加数量区间
	 */
	@FindBy(how = How.XPATH, using = "//img[@src='../images/img_+bg.jpg']")
	private WebElement addNumLink;
	
	
	/**
	 * 起批量
	 */
	@FindBy(how = How.NAME, using = "start")
	private List<WebElement> start;
	
	/**
	 * 价格
	 */
	@FindBy(how = How.NAME, using = "pic")
	private List<WebElement> price;
	
	/**
	 * 按产品规格报价
	 */
	@FindBy(how = How.ID, using = "pic_sku")
	private WebElement skuPriceRadio;
	
	
	/**
	 * 最小起订量
	 */
	@FindBy(how = How.ID, using = "minNum")
	private WebElement minNum;
	
	/**
	 * 单价
	 */
	@FindBy(how = How.NAME, using = "productPic")
	private List<WebElement> productPic;
	
	
	
	
	/**
	 * 订单收集类型
	 * 现货库存
	 */ 
	@FindBy(how = How.NAME, using = "supplierProductDetail.orderType")
	private List<WebElement> orderCollectionType;
	
	
	/**
	 * 预计发货日期
	 */ 
	@FindBy(how = How.ID, using = "delivery")
	private WebElement deliveryDate;
	
	/**
	 * 日期控件
	 */ 
	@FindBy(how = How.XPATH, using = "//iframe[@hidefocus='true']")
	private WebElement dateIframe;
	
	/**
	 * 日期控件确认按钮
	 */ 
	@FindBy(how = How.ID, using = "dpOkInput")
	private WebElement dateOk; 
	
	/**
	 * 生产能力
	 */
	@FindBy(how = How.NAME, using = "supplierProductDetail.produceNum")
	private WebElement madeNum;
	
	
	/**
	 * 生产能力 单位
	 */ 
	@FindBy(how = How.NAME, using = "supplierProductDetail.produceType")
	private WebElement madeNumType;
	
	
	/**
	 * 最后收单日期
	 */ 
	@FindBy(how = How.ID, using = "closing")
	private WebElement finalDeliveryDate;
	
	/**
	 * 最大收单量
	 */ 
	@FindBy(how = How.ID, using = "maxProdNum")
	private WebElement maxProdNum;
	
	
	
	/**
	 * 条形码信息 ： 自动生成
	 */ 
	@FindBy(how = How.XPATH, using = "//div[@id='skuCodeTable']/span[2]/input")
	private WebElement autoBarcode; 
	
	
	/**
	 * 包装清单
	 */ 
	@FindBy(how = How.ID, using = "packingList")
	private WebElement packingList; 
	
	/**
	 * 售后服务
	 */ 
	@FindBy(how = How.ID, using = "salesService")
	private WebElement salesService; 
	
	/**
	 * 区号
	 */ 
	@FindBy(how = How.ID, using = "area")
	private WebElement area; 
	
	/**
	 * 号码
	 */ 
	@FindBy(how = How.ID, using = "number")
	private WebElement number; 
	
	
	/**
	 * 编辑商品详细信息
	 */ 
	@FindBy(how = How.ID, using = "ueditor_0")
	private WebElement editProductInfoIframe; 
	
	/**
	 * 编辑商品详细信息
	 */ 
	@FindBy(how = How.XPATH, using = "/html/body/p[2]")
	private WebElement editProductInfoContent; 
	
	
	
	/**
	 * 提交
	 */ 
	@FindBy(how = How.ID, using = "saveProd")
	private WebElement saveProd;
	
	/**
	 * 商品信息不完整或不符合规范，请修改。 确认
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[3]/td/div/input")
	private WebElement remindOk;
	
	/**
	 * 商品信息不完整或不符合规范，请修改。
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div/span")
	private WebElement remindAlertContent;
	
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
	 * @return the fisrt
	 */
	public WebElement getFisrt() {
		return fisrt;
	}

	/**
	 * @return the second
	 */
	public WebElement getSecond() {
		return second;
	}

	/**
	 * @return the third
	 */
	public WebElement getThird() {
		return third;
	}

	/**
	 * @return the next
	 */
	public WebElement getNext() {
		return next;
	}

	/**
	 * @return the productTitle
	 */
	public WebElement getProductTitle() {
		return productTitle;
	}

	/**
	 * @return the firstcategory
	 */
	public WebElement getFirstcategory() {
		return firstcategory;
	}

	/**
	 * @return the secondcategory
	 */
	public WebElement getSecondcategory() {
		return secondcategory;
	}

	/**
	 * @return the origin
	 */
	public WebElement getOrigin() {
		return origin;
	}

	/**
	 * @return the color
	 */
	public WebElement getColor() {
		return color;
	}

	/**
	 * @return the originplace
	 */
	public WebElement getOriginplace() {
		return originplace;
	}

	/**
	 * @return the manufacturers
	 */
	public WebElement getManufacturers() {
		return manufacturers;
	}

	/**
	 * @return the sheilLife
	 */
	public WebElement getSheilLife() {
		return sheilLife;
	}

	/**
	 * @return the sheilLifeType
	 */
	public WebElement getSheilLifeType() {
		return sheilLifeType;
	}

	/**
	 * @return the remark
	 */
	public WebElement getRemark() {
		return remark;
	}

	/**
	 * @return the qualificationImgClick
	 */
	public WebElement getQualificationImgClick() {
		return qualificationImgClick;
	}

	/**
	 * @return the qualificationUpload
	 */
	public WebElement getQualificationUpload() {
		return qualificationUpload;
	}

	/**
	 * @return the packMiddle
	 */
	public WebElement getPackMiddle() {
		return packMiddle;
	}

	/**
	 * @return the packSmall
	 */
	public WebElement getPackSmall() {
		return packSmall;
	}

	/**
	 * @return the tasteCoffee
	 */
	public WebElement getTasteCoffee() {
		return tasteCoffee;
	}

	/**
	 * @return the tasteCream
	 */
	public WebElement getTasteCream() {
		return tasteCream;
	}

	/**
	 * @return the coffeImgClick
	 */
	public WebElement getCoffeImgClick() {
		return coffeImgClick;
	}

	/**
	 * @return the coffeImgGoOnClick
	 */
	public WebElement getCoffeImgGoOnClick() {
		return coffeImgGoOnClick;
	}

	/**
	 * @return the coffeUpload
	 */
	public WebElement getCoffeUpload() {
		return coffeUpload;
	}

	/**
	 * @return the creamImgClick
	 */
	public WebElement getCreamImgClick() {
		return creamImgClick;
	}

	/**
	 * @return the creamImgGoOnClick
	 */
	public WebElement getCreamImgGoOnClick() {
		return creamImgGoOnClick;
	}

	/**
	 * @return the creamUpload
	 */
	public WebElement getCreamUpload() {
		return creamUpload;
	}

	/**
	 * @return the measureUnit
	 */
	public WebElement getMeasureUnit() {
		return measureUnit;
	}

	/**
	 * @return the denominatedUnit
	 */
	public WebElement getDenominatedUnit() {
		return denominatedUnit;
	}

	/**
	 * @return the priceType
	 */
	public List<WebElement> getPriceType() {
		return priceType;
	}

	
	/**
	 * @return the fOB_Port
	 */
	public WebElement getFOB_Port() {
		return FOB_Port;
	}

	/**
	 * @return the cIF_Port
	 */
	public WebElement getCIF_Port() {
		return CIF_Port;
	}

	/**
	 * @return the numPriceRadio
	 */
	public WebElement getNumPriceRadio() {
		return numPriceRadio;
	}

	/**
	 * @return the addNumLink
	 */
	public WebElement getAddNumLink() {
		return addNumLink;
	}

	
	/**
	 * @return the start
	 */
	public List<WebElement> getStart() {
		return start;
	}

	/**
	 * @return the price
	 */
	public List<WebElement> getPrice() {
		return price;
	}

	/**
	 * @return the skuPriceRadio
	 */
	public WebElement getSkuPriceRadio() {
		return skuPriceRadio;
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
	 * @return the madeNum
	 */
	public WebElement getMadeNum() {
		return madeNum;
	}

	/**
	 * @return the madeNumType
	 */
	public WebElement getMadeNumType() {
		return madeNumType;
	}

	/**
	 * @return the orderCollectionType
	 */
	public List<WebElement> getOrderCollectionType() {
		return orderCollectionType;
	}

	/**
	 * @return the deliveryDate
	 */
	public WebElement getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * @return the dateIframe
	 */
	public WebElement getDateIframe() {
		return dateIframe;
	}

	/**
	 * @return the dateOk
	 */
	public WebElement getDateOk() {
		return dateOk;
	}

	/**
	 * @return the finalDeliveryDate
	 */
	public WebElement getFinalDeliveryDate() {
		return finalDeliveryDate;
	}

	/**
	 * @return the maxProdNum
	 */
	public WebElement getMaxProdNum() {
		return maxProdNum;
	}

	/**
	 * @return the autoBarcode
	 */
	public WebElement getAutoBarcode() {
		return autoBarcode;
	}

	/**
	 * @return the packingList
	 */
	public WebElement getPackingList() {
		return packingList;
	}

	/**
	 * @return the salesService
	 */
	public WebElement getSalesService() {
		return salesService;
	}

	/**
	 * @return the area
	 */
	public WebElement getArea() {
		return area;
	}

	/**
	 * @return the number
	 */
	public WebElement getNumber() {
		return number;
	}

	/**
	 * @return the editProductInfoIframe
	 */
	public WebElement getEditProductInfoIframe() {
		return editProductInfoIframe;
	}

	/**
	 * @return the editProductInfoContent
	 */
	public WebElement getEditProductInfoContent() {
		return editProductInfoContent;
	}

	/**
	 * @return the saveProd
	 */
	public WebElement getSaveProd() {
		return saveProd;
	}

	/**
	 * @return the remindOk
	 */
	public WebElement getRemindOk() {
		return remindOk;
	}

	/**
	 * @return the remindAlertContent
	 */
	public WebElement getRemindAlertContent() {
		return remindAlertContent;
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

	
}
