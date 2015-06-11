package com.ccigmall.auto.test.act.pc.supplier.seller.brand;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.brand.BrandManagementPage;
import com.ccigmall.auto.test.step.pc.supplier.seller.order.SupplierFillContractStep;
/**
 * @author chenjingli
 * supplier--卖家中心--品牌管理
 */
public class BrandManagementAct extends SellerIndexAct {

	private final static Logger logger = LoggerFactory
			.getLogger(SupplierFillContractStep.class);
	private String img = "\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg\"\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg\"\"";
	protected BrandManagementPage managementPage;
	public BrandManagementAct(WebDriver driver) {
		super(driver);
		managementPage = new BrandManagementPage(driver);
	}
	/**
	 * 点击 {新建品牌}按钮
	 */
	public void clickNewBrand() {
		logger.info("点击 {新建品牌}按钮");
		click(managementPage.getXpathCliNewBrand());
	}
	/**
	 * 选择 {品牌名称}下拉框
	 */
	public void selectBrandName(String brandName) {
		logger.info("选择 {品牌名称}下拉框内容:{}",brandName);
		select(managementPage.getSelBrandName(),brandName);
	}
	/**
	 * 输入品牌名称
	 */
	public String enterBrandName(String brandName) {
		brandName = brandName + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入品牌名称",brandName);
		type(managementPage.getBrandName(),brandName);
		return brandName;
	}
	
	/**
	 * 选择 {品牌类型}下拉框
	 */
	public void selectBrandType(String brandType) {
		logger.info("选择 {品牌类型}下拉框内容:{}",brandType);
		select(managementPage.getSelBrandType(),brandType);
	}
	/**
	 * 输入 {品牌备注}内容
	 */
	public void typeBrandMark(String brandMark) {
		logger.info("输入 {品牌备注}内容");
		type(managementPage.getTypeBrandMark(),brandMark);
	}
	/**
	 * 上传图片使用
	 * @param brandMark
	 */
	public void enterBrandMark(String brandMark) {
		logger.info("输入图片地址  = {}", img);
		type(managementPage.getTypeBrandMark(), img);
		pause(1);
		robotCopy();
		pause(1);
		this.typeBrandMark(brandMark);
	}

	/**
	 * 点击 {选择图片}按钮
	 */
	public void clickUploadPic() {
		logger.info("点击 {选择图片}按钮");
		click(managementPage.getLinkSelPicture());
	}
	/**
	 * 点击 {继续上传}按钮
	 */
	public void clickContinueUpload() {
		logger.info("点击 {继续上传}按钮");
		click(managementPage.getXpathCliContinueUpload());
	}
	
	/**
	 * 点击 {提交审核}按钮
	 */
	public void clickSubmit() {
		logger.info("点击 {提交审核}按钮");
		click(managementPage.getIdCliSubmit());
	}
	/**
	 * 点击 {开始上传}按钮
	 */
	public void clickStartUpload() {
		logger.info("点击 {开始上传}按钮");
		click(managementPage.getXpathCliStartUpload());
	}
	/**
	 * 获得品牌管理 序号为1 的品牌名称
	 */
	public String getFirstBrandName() {
		logger.info("获得品牌管理 序号为1 的品牌名称:{}",getText(managementPage.getXpathGetBrandName()));
		return getText(managementPage.getXpathGetBrandName());
	}
	
	
	/**
	 * 获得品牌管理ul的列表数量
	 */
	public int getBrandList() {
		logger.info("获得品牌管理ul的列表数量:{}",getElementsNum(managementPage.getXpathGetBrandList()));
		return getElementsNum(managementPage.getXpathGetBrandList());
	}
	
	/**
	 * 点击{删除}按钮
	 */
	public void clickDelButton() {
		logger.info("点击{删除}按钮");
		click(managementPage.getXpathCliDelButton());
	}
	
	/**
	 * 获得 新建品牌下的资质图片的列表ul
	 */
	public int getBrandImgList() {
		logger.info("获得 新建品牌下的资质图片的列表ul数量:{}",getElementsNum(managementPage.getXpathGetBrandImgList()));
		return getElementsNum(managementPage.getXpathGetBrandImgList());
	}
	
	/**
	 * 点击图片上的{删除} 按钮
	 */
	public void clickImgDelButton() {
		logger.info("点击图片上的{删除} 按钮");
		click(managementPage.getXpathCliimgDelButton());
	}
	
	
	/**
	 * 输入 品牌中的其他内容
	 */
	public boolean booleanOther() {
		logger.info("判断{其他}的输入框是否存在");
		return managementPage.getNameTypeOther().isDisplayed();
	}
	
	
	/**
	 * 获得 品牌管理 操作中修改按钮的a列表
	 */
	public int getBrandUpdateList() {
		logger.info("获得 品牌管理 操作中修改按钮的a列表:{}",getElementsNum(managementPage.getXpathGetBrandUpdateList()));
		return getElementsNum(managementPage.getXpathGetBrandUpdateList());
	}
	
	/**
	 * 默认点击 第一个修改按钮
	 */
	public void clickFirstUpdateButton() {
		logger.info("默认点击 第一个{修改}按钮");
		click(managementPage.getXpathCliFirstUpdate());
	}
	

	/**
	 *  点击资质图片
	 */
	public void clickImg() {
		logger.info(" 点击资质图片");
		click(managementPage.getXpathCliImg());
	}
	/**
	 *  点击图片上的删除按钮
	 */
	public void clickImgDel() {
		logger.info(" 点击图片上的{删除}按钮");
		click(managementPage.getXpathCliImgDel());
	}
	
	/**
	 *  获取 页面 供应商的名称
	 */
	public String getSupplierLoginName() {
		logger.info(" 获取 页面 供应商的名称:{}",getText(managementPage.getXpathGetSupplierName()));
		return getText(managementPage.getXpathGetSupplierName());
	}
	/**
	 *  获取 页面 供应商的名称
	 */
	public String getSupplierCurrentTime() {
		String currentTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		logger.info("输入创建时间为当前时间{yyyy-MM-dd}：{}",currentTime);
		return currentTime;
	}
	public BrandManagementPage getManagementPage() {
		return managementPage;
	}
}
