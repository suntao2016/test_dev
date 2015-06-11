/**
 * 
 */
package com.ccigmall.auto.test.page.pad.retailer.booking;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 *  支付
 */
public class PayPage extends SettingPage{

	/**
	 * 支付页
	 * @param driver
	 */
	public PayPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 支付方式
	 */
	@FindBy(how = How.NAME, using = "bank")
	private List<WebElement> payType;
	
	/**
	 * 支付号
	 * 
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[1]/span[1]")
	private WebElement payId;
	


	/**
	 * 验证码
	 */
	@FindBy(how = How.NAME, using = "mobileCode")
	private WebElement mobileCode;

	/**
	 * 发送验证码
	 */
	@FindBy(how = How.ID, using = "sendBtn")
	private WebElement sendBtn;
	
	/**
	 * 确认支付
	 */
	@FindBy(how = How.XPATH, using = "//button[text()='确认支付']")
	private WebElement submit;
	
	/**
	 * 取消
	 */
	@FindBy(how = How.XPATH, using = "//button[text()='取消']")
	private WebElement cancel;

	

	/**
	 * @return the payType
	 */
	public List<WebElement> getPayType() {
		return payType;
	}

	/**
	 * @return the mobileCode
	 */
	public WebElement getMobileCode() {
		return mobileCode;
	}

	/**
	 * @return the sendBtn
	 */
	public WebElement getSendBtn() {
		return sendBtn;
	}

	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}

	/**
	 * @return the cancel
	 */
	public WebElement getCancel() {
		return cancel;
	}

	/**
	 * @return the payId
	 */
	public WebElement getPayId() {
		return payId;
	}
	
	
}
