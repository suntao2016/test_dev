/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.service;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.page.pc.dealer.service.CustomerServicePage;
import com.ccigmall.auto.test.page.pc.dealer.user.UserCenterPage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-07 
 * <p>经销商-联系客服-act
 */
public class CustomerServiceAct extends IndexAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(CustomerServiceAct.class);
	/**
	 * 联系客服页面
	 */
	private CustomerServicePage customerServicePage;
	/**
	 * @param driver
	 */
	public CustomerServiceAct(WebDriver driver) {
		super(driver);
		customerServicePage = new CustomerServicePage(driver);
	}
	/**
	 * 点击已处理
	 */
	public void clickHandled() {
		logger.info("点击已处理: {}", customerServicePage.getHandled());
		click(customerServicePage.getHandled());	
	}
	/**
	 * 点击未处理
	 */
	public void clickUnhandled() {
		logger.info("点击未处理: {}", customerServicePage.getUnhandled());
		click(customerServicePage.getUnhandled());	
	}
	/**
	 * 点击我要反馈
	 */
	public void clickFeedback() {
		logger.info("点击我要反馈: {}", customerServicePage.getFeedback());
		click(customerServicePage.getFeedback());	
	}
	/**
	 * 填写涉及订单
	 */
	public void inputInvolvingOrder(String text) {
		logger.info("填写涉及订单: {}", text);
		type(customerServicePage.getInvolvingOrder(),text);	
	}
	/**
	 * 投诉内容
	 */
	public void inputComplaintContent(String text) {
		logger.info("填写投诉内容: {}", text);
		type(customerServicePage.getComplaintContent(),text);	
	}
	/**
	 * 联系方式
	 */
	public void inputContactWay(String text) {
		logger.info("填写联系方式: {}", text);
		type(customerServicePage.getContactWay(),text);	
	}
	/**
	 * 投诉级别
	 */
	public void selectComplaintLevel(int option) {
		logger.info("投诉级别: {}", option);
		selectByIndex(customerServicePage.getComplaintLevel(),option);
	}
	/**
	 * 投诉类型
	 */
	public void selectComplaintType(int option) {
		logger.info("投诉类型: {}", option);
		selectByIndex(customerServicePage.getComplaintType(),option);
	}
	/**
	 * 点击提交反馈
	 */
	public void clickSubmitComplaint() {
		logger.info("点击提交反馈: {}", customerServicePage.getSubmitComplaint());
		click(customerServicePage.getSubmitComplaint());	
	}

}
