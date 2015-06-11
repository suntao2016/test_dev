/**
 * 
 */
package com.ccigmall.auto.test.act.pad.retailer.booking;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pad.retailer.booking.PayPage;

/**
 * @author jianping.gao
 *  支付
 */
public class PayAct extends SettingActiton{

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(PayAct.class);
	
	/**
	 * 
	 */
	private PayPage payPage;

	
	/**
	 * 支付页
	 * @param driver
	 */
	public PayAct(WebDriver driver) {
		super(driver);
		payPage=new PayPage(driver);
	}
	
	/**
	 * 选择中国银行个人版
	 */
	public void clickChinaBankPersonal() {
		logger.info("点击选择中国银行个人版");
		click(payPage.getPayType().get(1));
	}
	
	/**
	 * 获取支付号
	 * 
	 */
	public String getPayId() {
		return payPage.getPayId().getText();
	}
	
	/**
	 * 发送手机验证码
	 */
	public void clickSendMobileCode() {
		logger.info("点击发送手机验证码");
		click(payPage.getSendBtn());
	}
	
	/**
	 * 输入手机验证
	 */
	public void enterMobileCode(String code) {
		logger.info("输入手机验证码  = {}",code);
		if(code==null){
			throw new TestNGException("未能获取到手机验证码");
		}
		type(payPage.getMobileCode(), code);
	}
	
	/**
	 * 点击确认支付
	 */
	public void clickConfirmPay() {
		logger.info("点击确认支付");
		click(payPage.getSubmit());
	}
	
	/**
	 * 点击取消
	 */
	public void clickCancel() {
		logger.info("点击取消");
		click(payPage.getCancel());
	}
	
	
	
}
