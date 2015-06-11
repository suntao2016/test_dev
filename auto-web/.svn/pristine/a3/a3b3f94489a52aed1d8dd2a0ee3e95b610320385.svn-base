package com.ccigmall.auto.test.page.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;
/**
 * 
 * @author chenjingli
 * 
 */
public class GiftManagementPage  extends SettingPage{
	/**
	 * 管理赠品
	 * @param driver
	 */
	public GiftManagementPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 点击查询添加赠品按钮
	 */
	@FindBy(id="queryButton")
	private WebElement IdCliQueryButton;
	/**
	 * 点击返回
	 */
	@FindBy(id="backButton")
	private WebElement IdCliBackButton;
	/**
	 * 都是按着时间排序的所以点击刚刚添加的第一个
	 */
	@FindBy(xpath="//table[@class='tb-promotion']/tbody/tr[1]//td/input[1]")
	private WebElement XpathCliSureButton;
	/**
	 * 输入赠品描述
	 */
	@FindBy(id="giftDesc")
	private WebElement IdTypeGiftDesc;
	/**
	 * 点击确定按钮
	 */
	@FindBy(id="confirmButton")
	private WebElement IdClickSubmit;
	/**
	 * 点击取消按钮
	 */
	@FindBy(id="backButton")
	private WebElement IdClickRemoveButton;
	
	
	
	/**
	 * 点击查询添加赠品按钮
	 */
	public WebElement getIdCliQueryButton() {
		return IdCliQueryButton;
	}
	/**
	 * 点击返回
	 */
	public WebElement getIdCliBackButton() {
		return IdCliBackButton;
	}
	/**
	 * 都是按着时间排序的所以点击刚刚添加的第一个
	 */
	public WebElement getXpathCliSureButton() {
		return XpathCliSureButton;
	}
	/**
	 * 输入赠品描述
	 */
	public WebElement getIdTypeGiftDesc() {
		return IdTypeGiftDesc;
	}
	/**
	 * 点击确定按钮
	 */
	public WebElement getIdClickSubmit() {
		return IdClickSubmit;
	}
	/**
	 * 点击取消按钮
	 */
	public WebElement getIdClickRemoveButton() {
		return IdClickRemoveButton;
	}
	
	
}
