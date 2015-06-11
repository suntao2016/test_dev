package com.ccigmall.auto.test.page.pc.retailer.my.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.pc.retailer.my.MyIndexPage;

/**
 * 
 * @author chenjingli
 * 我的鑫网-客户服务-联系客服
 */
public class ContactCustomerPage extends MyIndexPage{
	public ContactCustomerPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 选择反馈类型
	 */
	@FindBy(id="typeValue")
	public WebElement idSelFeedbackType;
	/**
	 * 选择反馈类型2
	 */
	@FindBy(id="typeLevel")
	public WebElement idSelFeedbackType2;
	/**
	 * 输入反馈内容
	 */
	@FindBy(id="feedbackContent")
	public WebElement idTypeFeedbackInfo;
	/**
	 * 输入联系方式
	 */
	@FindBy(id="feedbackPhone")
	public WebElement idTypeContentWay;
	/**
	 * 点击提交按钮
	 */
	@FindBy(id="commit_complaint")
	public WebElement idCliSubmit;
	/**
	 * 点击我的反馈记录
	 */
	@FindBy(linkText="我的反馈记录")
	public WebElement linCliFeedback;
	/**
	 * 获得联系方式内容
	 */
	@FindBy(xpath="//div[@id='my_complaint']/descendant::dd[4]")
	public WebElement xpathGetContent;
	
	
	
	
	
	
	public WebElement getIdSelFeedbackType() {
		return idSelFeedbackType;
	}
	public WebElement getIdSelFeedbackType2() {
		return idSelFeedbackType2;
	}
	public WebElement getIdTypeFeedbackInfo() {
		return idTypeFeedbackInfo;
	}
	public WebElement getIdTypeContentWay() {
		return idTypeContentWay;
	}
	public WebElement getIdCliSubmit() {
		return idCliSubmit;
	}
	public WebElement getLinCliFeedback() {
		return linCliFeedback;
	}
	public WebElement getXpathGetContent() {
		return xpathGetContent;
	}
	
	
	
}
