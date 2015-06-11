/**
 * 
 */
package com.ccigmall.auto.test.page.pc.dealer.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;

/**
 * @author dengshuhai
 * @since 2015-01-29
 * <p>联系客服页面
 */
public class CustomerServicePage extends IndexPage{
	/**
	 * @param driver
	 */
	public CustomerServicePage(WebDriver driver) {
		super(driver);
	}
	/**
	 *已处理
	 */
	@FindBy(xpath="//li[@id='yichuli']/a")
	private WebElement handled;
	
	/**
	 *未处理
	 */
	@FindBy(xpath="//li[@id='weichuli']/a")
	private WebElement unhandled;
	/**
	 *我要反馈
	 */
	@FindBy(xpath="//button[text()='我要反馈']")
	private WebElement feedback;
	
	/**
	 *涉及订单
	 */
	@FindBy(name="complainfrom")
	private WebElement involvingOrder;

	/**
	 *投诉内容
	 */
	@FindBy(name="complaintContent")
	private WebElement complaintContent;

	/**
	 *联系方式
	 */
	@FindBy(name="contactWay")
	private WebElement contactWay;
	
	/**
	 *投诉级别
	 */
	@FindBy(id="complaintLevel")
	private WebElement complaintLevel;
	
	/**
	 *投诉类型
	 */
	@FindBy(name="complaintType")
	private WebElement complaintType;
	
	/**
	 *提交反馈
	 */
	@FindBy(id="addkefu")
	private WebElement submitComplaint;

	public WebElement getHandled() {
		return handled;
	}

	public WebElement getUnhandled() {
		return unhandled;
	}

	public WebElement getFeedback() {
		return feedback;
	}

	public WebElement getInvolvingOrder() {
		return involvingOrder;
	}

	public WebElement getComplaintContent() {
		return complaintContent;
	}

	public WebElement getContactWay() {
		return contactWay;
	}

	public WebElement getComplaintLevel() {
		return complaintLevel;
	}

	public WebElement getComplaintType() {
		return complaintType;
	}

	public WebElement getSubmitComplaint() {
		return submitComplaint;
	}
		
}
