package com.ccigmall.auto.test.act.pc.platform.user.review.brand;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.platform.user.UserIndexAct;
import com.ccigmall.auto.test.page.pc.platform.user.review.brand.BrandAuditPage;
/**
 * 
 * @author chenjingli
 * wofe -- 用户中心 -- 审核管理 -- 品牌审核act
 */
public class BrandAuditAct extends UserIndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BrandAuditAct.class);
	
	protected BrandAuditPage auditPage;
	public BrandAuditAct(WebDriver driver) {
		super(driver);
		auditPage = new BrandAuditPage(driver);
	}
	
	public BrandAuditPage getAuditPage() {
		return auditPage;
	}

	/**
	 * 输入品牌名称
	 */
	public void typeBrandName(final String brandName){
		logger.info("输入品牌名称：{}",brandName);
		type(auditPage.getIdTypeBrandName(),brandName);
	}
	/**
	 * 输入供应商名称
	 */
	public void typeSupplierName(final String supplierName){
		logger.info("输入供应商名称：{}",supplierName);
		type(auditPage.getIdTypeSupplierName(),supplierName);
	}
	/**
	 * 输入创建时间
	 */
	public void typeStartTime(final String currentTime){
		logger.info("输入供应商创建的时间为：{}",currentTime);
		type(auditPage.getIdTypeStartTime(),currentTime);
	}
	/**
	 * 选择审核状态
	 */
	public void selectStatus(final String status){
		logger.info("选择审核状态：{}",status);
		select(auditPage.getIdSelStatus(),status);
	}
	/**
	 * 获得搜索后结果 查看按钮的个数
	 */
	public int getViewNumber(){
		logger.info("获得搜索后结果 {查看}按钮的个数:{}",getElementsNum((auditPage.getXpathGettrNumber())));
		return getElementsNum((auditPage.getXpathGettrNumber()));
	}
	/**
	 * 循环点击每行的{查看}的按钮
	 */
	public void clickFirstView(){
		logger.info("循环点击每行的{查看}的按钮");
		click(auditPage.getXpathCliFirstView());
	}
	/**
	 * 点击审核通过按钮
	 */
	public void clickPassButton(){
		logger.info("点击审核{通过}按钮");
		click(auditPage.getXpathCliPassButton());
	}
	/**
	 * 点击提交审核通过按钮
	 */
	public void clickSubmitButton(){
		logger.info("点击审核{提交}按钮");
		click(auditPage.getXpathCliSubmitButton());
	}
	/**
	 * 获得 品牌类型 的value
	 */
	public String getBrandType(){
		logger.info("获得 品牌类型 的value:{}",auditPage.getNameGetBrandType().getAttribute("value"));
		return auditPage.getNameGetBrandType().getAttribute("value");
	}
	/**
	 * 如果弹窗直接点击提交按钮什么也不改
	 */
	public void clickAlertSubmitButton(){
		logger.info("点击{提交}按钮");
		click(auditPage.getXpathCliSubmitButton());
	}
	
	/**
	 * 点击返回按钮
	 */
	public void clickRuturnButton(){
		logger.info("点击{返回}按钮");
		click(auditPage.getXpathCliRuturnButton());
	}
	/**
	 * 获取 审核弹框后的内容
	 */
	public String getAlertInfo(){
		logger.info("获取 审核弹框后的内容：{}",getText(auditPage.getXpathGetAlertInfo()));
		return getText(auditPage.getXpathGetAlertInfo());
	}
	/**
	 * 获取 品牌审核管理列表的{当前状态} 
	 */
	public String getBrandStatus(){
		logger.info("获取 品牌审核管理列表的{当前状态}：{}",getText(auditPage.getXpathGetBrandStatus()) );
		return getText(auditPage.getXpathGetBrandStatus());
	}
}
