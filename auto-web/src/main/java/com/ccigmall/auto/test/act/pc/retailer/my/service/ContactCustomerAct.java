package com.ccigmall.auto.test.act.pc.retailer.my.service;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.service.ContactCustomerPage;
import com.ccigmall.auto.test.step.pc.retailer.my.ordercenter.PayFinalPaymentStep;

/**
 * 
 * @author chenjingli
 * 我的鑫网-客户服务-联系客服
 */
public class ContactCustomerAct extends MyIndexAct {
	protected ContactCustomerPage customerPage;
	
	public ContactCustomerAct(WebDriver driver) {
		super(driver);
		customerPage = new ContactCustomerPage(driver);
	}
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(PayFinalPaymentStep.class);
	/**
	 * 选择反馈类型按钮
	 */
	public void selectFeedbackType(String info){
		logger.info("选择反馈类型：",info);
		select(customerPage.getIdSelFeedbackType(),info);
	}
	/**
	 * 选择反馈类型按钮2
	 */
	public void selectFeedbackType2(String info2){
		logger.info("选择反馈类型2：",info2);
		select(customerPage.getIdSelFeedbackType2(),info2);
	}
	/**
	 * 输入反馈内容
	 */
	public void typeFeedbackInfo(String feedbaceInfo){
		logger.info("输入反馈内容：",feedbaceInfo);
		type(customerPage.getIdTypeFeedbackInfo(),feedbaceInfo);
	}
	/**
	 * 点击提交反馈按钮
	 */
	public void clickSubmit(){
		logger.info("点击{提交反馈}按钮");
		click(customerPage.getIdCliSubmit());
	}
	/**
	 * 输入联系方式
	 */
	public void typeContentWay(String contentWay){
		logger.info("输入联系方式：",contentWay);
		type(customerPage.getIdTypeContentWay(),contentWay);
	}
	/**
	 * 点击我的反馈记录
	 */
	public void clickMyFeedback(){
		logger.info("点击{我的反馈记录}按钮");
		click(customerPage.getLinCliFeedback());
	}
	/**
	 * 获取联系方式内容
	 */
	public String  getContentInfo() {
		String text = this.getText(customerPage.getXpathGetContent());
		logger.info(" 获取联系方式内容:{}",text);
		return text;
	}
}
