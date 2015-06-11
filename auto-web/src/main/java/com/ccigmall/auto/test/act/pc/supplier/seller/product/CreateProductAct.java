/**
 * 
 */
package com.ccigmall.auto.test.act.pc.supplier.seller.product;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.product.CreateProductPage;

/**
 * @author jianping.gao
 * 
 *         创建商品
 * 
 */
public class CreateProductAct extends SellerIndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SellerIndexAct.class);
	/**
	 * img url
	 */
	// private String img =
	// "Http://image01.ccigmall.com/p1/group1/M00/00/6E/wKgBnVSGXgiAEo61AAzodQCbVVc129.jpg";
	private String img = "\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg\"\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg\"\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg\"";

	/**
	 * 创建商品
	 */
	private CreateProductPage createProductPage;

	/**
	 * 
	 * @param driver
	 */
	public CreateProductAct(WebDriver driver) {
		super(driver);
		createProductPage = new CreateProductPage(driver);
	}

	/**
	 * 点击一级分类
	 */
	public void clickFisrtClassify() {
		logger.info("点击一级分类");
		click(createProductPage.getFisrt());
	}

	/**
	 * 点击二级分类
	 */
	public void clickSecondClassify() {
		logger.info("点击二级分类");
		click(createProductPage.getSecond());
	}

	/**
	 * 点击三级分类
	 */
	public void clickThirdClassify() {
		logger.info("点击三级分类");
		click(createProductPage.getThird());
	}

	/**
	 * 点击下一步,填写商品详细信息
	 */
	public void clickNext() {
		logger.info("点击下一步,填写商品详细信息");
		click(createProductPage.getNext());
	}

	/**
	 * 输入商品标题
	 */
	public String enterProductTitle(String title) {
		logger.info("输入图片地址  = {}", img);
		type(createProductPage.getProductTitle(), img);
		robotCopy();
		title = title + new SimpleDateFormat("yyMMddHHmmss").format(new Date());
		logger.info("输入商品标题  = {}", title);
		type(createProductPage.getProductTitle(), title);
		return title;
	}

	/**
	 * 选择主品牌
	 */
	public void selectFirstBrand(String fisrtBrand) {
		logger.info("选择主品牌  = {}", fisrtBrand);
		select(createProductPage.getFirstcategory(), fisrtBrand);
	}

	/**
	 * 选择子品牌
	 */
	public void selectSecondBrand(String secondBrand) {
		logger.info("选择子品牌  = {}", secondBrand);
		select(createProductPage.getSecondcategory(), secondBrand);
	}

	/**
	 * 输入产地
	 */
	public void enterOrigin(String origin) {
		logger.info("输入产地  = {}", origin);
		type(createProductPage.getOrigin(), origin);
	}

	/**
	 * 选择颜色
	 */
	public void selectColor(String color) {
		logger.info("选择颜色  = {}", color);
		select(createProductPage.getColor(), color);
	}

	/**
	 * 选择原产地
	 */
	public void selectOriginplace(String originplace) {
		logger.info("选择原产地  = {}", originplace);
		select(createProductPage.getOriginplace(), originplace);
	}

	/**
	 * 输入制造商
	 */
	public void enterManufacturers(String address) {
		logger.info("输入制造商  = {}", address);
		type(createProductPage.getManufacturers(), address);
	}

	/**
	 * 输入保质期
	 */
	public void enterSheilLife(int sheilLife) {
		logger.info("输入保质期  = {}", sheilLife);
		type(createProductPage.getSheilLife(), String.valueOf(sheilLife));
	}

	/**
	 * 选择保质期单位
	 */
	public void selectSheilLifeType(String sheilLifeType) {
		logger.info("选择保质期单位  = {}", sheilLifeType);
		select(createProductPage.getSheilLifeType(), sheilLifeType);
	}

	/**
	 * 输入商品备注
	 */
	public void enterRemark(String remark) {
		logger.info("输入商品备注  = {}", remark);
		type(createProductPage.getRemark(), remark);
	}

	/**
	 * 上传证明资质的图片
	 */
	public void uploadQualificationImg() {
		logger.info("上传证明资质的图片");
		click(createProductPage.getQualificationImgClick());
		robotUpload();
		click(createProductPage.getQualificationUpload());
		this.pause(3);
	}

	/**
	 * 产品规格 : 包装 :中袋
	 */
	public void clickPackMiddle() {
		logger.info("产品规格 : 包装 :中袋");
		click(createProductPage.getPackMiddle());
	}

	/**
	 * 产品规格 : 包装 :小袋
	 */
	public void clickPackSmall() {
		logger.info("产品规格 : 包装 :小袋");
		click(createProductPage.getPackSmall());
	}

	/**
	 * 产品规格 : 口味 :咖啡
	 */
	public void clickTasteCoffee() {
		logger.info("产品规格 : 口味 :咖啡");
		click(createProductPage.getTasteCoffee());
	}

	/**
	 * 产品规格 : 口味 :奶油
	 */
	public void clickTasteCream() {
		logger.info("产品规格 : 口味 :奶油");
		click(createProductPage.getTasteCream());
	}

	/**
	 * 上传口味图片
	 */
	public void uploadTasteImg(String productName) {
		logger.info("上传咖啡图片");
		for (int i = 0; i < 1; i++) {
			logger.info("上传第{}张咖啡图片", i);
			if (i == 0) {
				click(createProductPage.getCoffeImgClick());
			} else {
				click(createProductPage.getCoffeImgGoOnClick());
			}
			robotUpload();
			click(createProductPage.getCoffeUpload());
			this.pause(3);
			logger.info("上传第{}张咖啡图片成功！", i);
		}

		logger.info("上传奶油图片");
		for (int i = 0; i < 1; i++) {		
			logger.info("上传第{}张奶油图片", i);
			if (i == 0) {
				click(createProductPage.getCreamImgClick());
			} else {
				click(createProductPage.getCreamImgGoOnClick());
			}
			robotUpload();
			click(createProductPage.getCreamUpload());
			this.pause(3);
			logger.info("上传第{}张奶油图片成功！", i);
		}
	}

	/**
	 * 选择计量单位
	 */
	public void selectMeasureUnit(String measureUnit) {
		logger.info("选择计量单位  = {}", measureUnit);
		select(createProductPage.getMeasureUnit(), measureUnit);
	}

	/**
	 * 选择计价单位
	 */
	public void selectDenominatedUnit(String denominatedUnit) {
		logger.info("选择计量单位  = {}", denominatedUnit);
		select(createProductPage.getDenominatedUnit(), denominatedUnit);
	}

	/**
	 * 输入 离岸港口名称
	 */
	public void enterFOB_Port(String FOBName) {
		logger.info("输入离岸港口名称  = {}", FOBName);
		type(createProductPage.getFOB_Port(), FOBName);
	}

	/**
	 * 选择CIF价格
	 */
	public void clickCIFPrice() {
		logger.info("选择CIF价格 ");
		click(createProductPage.getPriceType().get(1));
	}

	/**
	 * 输入到岸港口名称
	 */
	public void enterCIF_Port(String CIFName) {
		logger.info("输入到岸港口名称  = {}", CIFName);
		type(createProductPage.getCIF_Port(), CIFName);
	}

	/**
	 * 起批量： 件及以上 人民币/件
	 */
	public void enterStartUnit(int start, int unit) {
		for (int i = 0; i < 3; i++) {
			List<WebElement> elements = createProductPage.getStart();
			logger.info("起批量：{} 件及以上   {}人民币/件 ", start + i, unit - i);
			type(elements.get(i), String.valueOf(start + i));
			elements = createProductPage.getPrice();
			type(elements.get(i), String.valueOf(unit - i));
			if (i == 2) {
				break;
			}
			clickaddNumLink();
		}
	}

	/**
	 * 增加数量区间
	 */
	public void clickaddNumLink() {
		logger.info("增加数量区间");
		click(createProductPage.getAddNumLink());
	}

	/**
	 * 按产品规格报价
	 */
	public void clickSkuPriceRadio() {
		logger.info("按产品规格报价");
		click(createProductPage.getSkuPriceRadio());
	}

	/**
	 * 输入最小起订量
	 */
	public void enterMinNum(int minNum) {
		logger.info("最小起订量  = {}", minNum);
		type(createProductPage.getMinNum(), String.valueOf(minNum));
	}

	/**
	 * 输入规格产品单价
	 */
	public void enterSkuUnit(int unit) {
		logger.info("输入规格产品单价  = {}", unit);
		List<WebElement> elements = createProductPage.getProductPic();
		for (int i = 0; i < 4; i++) {
			type(elements.get(i), String.valueOf(unit));
		}
	}

	/**
	 * 收集订单
	 */
	public void clickOrderCollectionType() {
		logger.info("点击订单收集类型");
		click(createProductPage.getOrderCollectionType().get(1));
	}

	/**
	 * 输入生产能力
	 */
	public void enterMadeNum(int madeNum) {
		logger.info("生产能力  = {}", madeNum);
		type(createProductPage.getMadeNum(), String.valueOf(madeNum));
	}

	/**
	 * 选择生产能力 单位
	 */
	public void selectMadeNumType(String madeNumType) {
		logger.info("选择生产能力 单位  = {}", madeNumType);
		select(createProductPage.getMadeNumType(), madeNumType);
	}

	/**
	 * 输入交货日期
	 */
	public void enterDeliveryDate() {
		logger.info("输入交货日期");
		click(createProductPage.getDeliveryDate());
		enterFrame(createProductPage.getDateIframe());
		click(createProductPage.getDateOk());
		defaultContent();
	}

	/**
	 * 输入最后收单日期
	 */
	public void enterFinalDeliveryDate() {
		logger.info("输入最后收单日期");
		click(createProductPage.getFinalDeliveryDate());
		enterFrame(createProductPage.getDateIframe());
		click(createProductPage.getDateOk());
		defaultContent();
	}

	/**
	 * 输入最大收单量
	 */
	public void enterMaxProdNum(int maxNum) {
		logger.info("输入最大收单量 = {}", maxNum);
		type(createProductPage.getMaxProdNum(), String.valueOf(maxNum));
	}

	/**
	 * 条形码信息 ： 自动生成
	 */
	public void clickAutoBarcode() {
		logger.info("点击条形码信息 ： 自动生成");
		click(createProductPage.getAutoBarcode());
	}

	/**
	 * 输入包装清单
	 */
	public void enterPackingList(String content) {
		logger.info("输入包装清单  = {}", content);
		type(createProductPage.getPackingList(), content);
	}

	/**
	 * 输入售后服务
	 */
	public void enterSalesService(String content) {
		logger.info("输入售后服务  = {}", content);
		type(createProductPage.getSalesService(), content);
	}

	/**
	 * 输入区号
	 */
	public void enterAreaCode(int areaCode) {
		logger.info("输入区号  = {}", areaCode);
		type(createProductPage.getArea(), String.valueOf(areaCode));
	}

	/**
	 * 输入号码
	 */
	public void enterMobile(int mobile) {
		logger.info("输入号码  = {}", mobile);
		type(createProductPage.getNumber(), String.valueOf(mobile));
	}

	/**
	 * 编辑商品详细信息
	 */
	public void editProductInfo(String content) {
		logger.info("编辑商品详细信息 = {}", content);
		enterFrame(createProductPage.getEditProductInfoIframe());
		type(createProductPage.getEditProductInfoContent(), content);
		defaultContent();
	}

	/**
	 * 点击提交
	 * 
	 * @throws Exception
	 */
	public void clickSubmit() throws Exception {
		logger.info("点击提交");
		click(createProductPage.getSaveProd());
		this.pause(2);
		if (isElementPresent(createProductPage.getRemindConfirmContent(),
				"保存成功，是否返回到商品列表？")) {
			click(createProductPage.getRemindConfirmOk());
			logger.info("发布商品成功");
		} else {
			logger.info("发布商品失败");
			throw new TestNGException("供应商发布商品失败");
		}
	}
}
