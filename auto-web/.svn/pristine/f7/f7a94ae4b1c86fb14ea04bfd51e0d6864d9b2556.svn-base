package com.ccigmall.auto.test.act.pc.supplier.seller.order;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.order.ShippingPage;
/**
 * 
 * @author chenjingli
 *	supplier 确认发货
 */
public class ShippingAct extends ContractAct{
	
	private final static Logger logger = LoggerFactory
			.getLogger(ShippingAct.class);
	protected ShippingPage shippingPage;
	public ShippingAct(WebDriver driver) {
		super(driver);
		shippingPage = new ShippingPage(driver);
	}
	
	public ShippingPage getShippingPage() {
		return shippingPage;
	}

	/**
	 * 输入批次号
	 */
	public void typeBatchNum(String bathNum){
		logger.info("输入批次号:{}",bathNum);
		type(shippingPage.getNameTypeBatchNum(),bathNum);
	}
	/**
	 * 获得并输入批次数量
	 */
	public void typeNumber(){
		String number = getText(shippingPage.getGetTypeNumber());
		logger.info("输入批次号数量：{}",number);
		type(shippingPage.getNameTypeNumber(),number);
	}
	
	
	/**
	 * 获得页面批次号
	 */
	public String getBatchNumber(){
		logger.info("获得页面批次号：{}",getText(shippingPage.getGetTypeNumber()));
		return getText(shippingPage.getGetTypeNumber());
	}
	
	/**
	 * 获得提交后的弹出框内容
	 */
	public String getAlertText(){
		logger.info("获得提交后的弹出框内容：{}",getText(shippingPage.getXpathGetAlertText()));
		return getText(shippingPage.getXpathGetAlertText());
	}
	/**
	 * 获得提交后的弹出框正确时内容
	 */
	public String getAlertRightText(){
		logger.info("获得提交后的弹出框正确时内容：{}",getText(shippingPage.getXpathGetAlertRightText()));
		return getText(shippingPage.getXpathGetAlertRightText());
	}
	/**
	 * 获得判断是否有时间框的内容
	 */
	public String getText(){
		logger.info("获得判断是否有时间框的内容：{}",getText(shippingPage.getXpathGetText()));
		return getText(shippingPage.getXpathGetText());
	}

	/**
	 * 确认页面 div 订单数量
	 */
	public int getDivsNumber(){
		logger.info("确认页面 div 订单数量：{}",getElementsNum(shippingPage.getXpathGetDivNumber()));
		return getElementsNum(shippingPage.getXpathGetDivNumber());
	}
	/**
	 * 点击提交按钮
	 */
	public void clickSubmitBuitton(){
		logger.info("点击提交按钮");
		click(shippingPage.getLinkCliSubmit());
	}
	/**
	 * 点击弹框中确定
	 */
	public void clickConfirmButton(){
		logger.info("点击弹框中确定");
		click(shippingPage.getXpathCliConfirm());
	}
	/**
	 * 点击时间框输入生成时间
	 */
	public void typeCreateTime(String createTime){
		logger.info("点击时间框输入生成时间：{}",createTime);
		this.jsExecutor("document.getElementById(\"createTime\").readOnly=false;", shippingPage.getIdCliCreateTime());
		type(shippingPage.getIdCliCreateTime(), createTime);
	}
	/**
	 * 点击时间框输入结束时间
	 */
	public void typeEndTime(String endTime){
		logger.info("点击时间框输入结束时间：{}",endTime);
		this.jsExecutor("document.getElementById(\"endTime\").readOnly=false;", shippingPage.getIdCliEndTime());
		type(shippingPage.getIdCliEndTime(), endTime);
	}
}
