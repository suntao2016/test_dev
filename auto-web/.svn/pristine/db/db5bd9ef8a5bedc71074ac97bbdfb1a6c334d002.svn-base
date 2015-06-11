package com.ccigmall.auto.test.page.pad.retailer.booking;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;
/**
 * 
 * @author dengshuhai  订单呢详情页 零售商
 *
 */
public class OrderPage extends SettingPage {
	/**
	 * 
	 * @param driver
	 */
	public OrderPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 进入收货人信息
	 */
	@FindBy(xpath="//div[@id='renxixi']/b")
	private WebElement enterReceiveInfo ;
	
	

	
	/**
	 * 添加收货人信息
	 */
	@FindBy(xpath="//*[@id='shr-all-info']/div[1]/div[2]/b")
	private WebElement addReceiverInfo ;
	
	/**
	 * 添加收货人姓名
	 */
	@FindBy(id="textfield")
	private WebElement receiverName ;
	
	
	/**
	 * 添加收货人电话
	 */
	@FindBy(id="textfield2")
	private WebElement mobile ;
	
	/**
	 * 省
	 */
	@FindBy(id="select5")
	private WebElement province ;
	
	/**
	 * 市
	 */
	@FindBy(id="select6")
	private WebElement city ;
	
	/**
	 * 区
	 */
	@FindBy(id="select7")
	private WebElement area ;
	
	/**
	 * 添加收货人详细地址
	 */
	@FindBy(id="textfield5")
	private WebElement addressDetailsInfo ;
	
	/**
	 * 邮政编码
	 */
	@FindBy(id="textfield4")
	private WebElement postalCode ;
	
	/**
	 * 删除收货人信息
	 */
	@FindBy(xpath="//div[@class='shr-e-d']/b[2]")
	private List<WebElement> delReceiverInfo ;
	
	/**
	 * 修改收货人信息
	 */
	@FindBy(xpath="//div[@class='shr-e-d']/b[1]")
	private List<WebElement> modifyReceiverInfo ;
	
	/**
	 * 邮政编码
	 */
	@FindBy(id="submit")
	private WebElement compelete ;
	
	
	/**
	 * 给卖家留言
	 */
	@FindBy(id="message")
	private WebElement leaveMessage ;
	
	/**
	 * 提交订单
	 */
	@FindBy(id="submit2")
	private WebElement submitOrder ;
	
	public WebElement getLeaveMessage() {
		return leaveMessage;
	}

	public WebElement getSubmitOrder() {
		return submitOrder;
	}

	public WebElement getEnterReceiveInfo() {
		return enterReceiveInfo;
	}

	public WebElement getAddReceiverInfo() {
		return addReceiverInfo;
	}

	public WebElement getReceiverName() {
		return receiverName;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getProvince() {
		return province;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getArea() {
		return area;
	}

	public WebElement getAddressDetailsInfo() {
		return addressDetailsInfo;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public List<WebElement> getDelReceiverInfo() {
		return delReceiverInfo;
	}

	public List<WebElement> getModifyReceiverInfo() {
		return modifyReceiverInfo;
	}

	public WebElement getCompelete() {
		return compelete;
	}
	
}
