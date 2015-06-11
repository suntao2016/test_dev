package com.ccigmall.auto.test.page.pc.dealer.systemManage.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * 
 * @author chenjingli
 * 经销商填写合同page
 */
public class ContractPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public ContractPage(WebDriver driver) {
		super(driver);
	}
	//*******************************************************经销商填写合同*****************************
	/**
	 * 点击单选框 支付方式
	 */
	@FindBy(xpath="//input[@type='radio'][1]")
	private WebElement xpathRadioPayment;
	/**
	 * 输入生效日期
	 */
	@FindBy(id="shengxiaori")
	private WebElement idTypeEffectiveDate;
	/**
	 * 输入目的地
	 */
	@FindBy(id="portAirportCn")
	private WebElement idTypeDestination;
	/**
	 * 输入保质期
	 */
	@FindBy(id="qualityDate")
	private WebElement idTypeQualityDate;
	/**
	 * 输入验收日
	 */
	@FindBy(id="waitDate")
	private WebElement idTypeAcceptanceDate;
	/**
	 * 输入交货结束日
	 */
	@FindBy(id="mixDate")
	private WebElement idTypeDeliveryDate;
	/**
	 *合同 确认填写按钮
	 */
	@FindBy(xpath="//input[@value='确认填写']")
	private WebElement xpathCliDealerButton;
	
	//*******************************************************供应商填写合同*****************************
	/**
	 * 填写包装类型选项货物运输包装
	 */
	@FindBy(id="checkbox1")
	private WebElement idCheckBoxOne;
	/**
	 * 货物销售包装
	 */
	@FindBy(id="checkbox9")
	private WebElement idCheckBoxTwo;
	/**
	 * 开始填写合同四项必填项 装运港口
	 */
	@FindBy(id="portOfShipmentCn")
	private WebElement idTypeSeaPort;
	/**
	 * 机场
	 */
	@FindBy(id="airPortOfShipmentCn")
	private WebElement idTypeAirPort;
	/**
	 * 海港2
	 */
	@FindBy(id="seaPortOfShipmentEn")
	private WebElement idTypeSeaPort2;
	/**
	 * 机场2
	 */
	@FindBy(id="airPortOfShipmentEn")
	private WebElement idTypeAirPort2;
	/**
	 * 提交合同按钮
	 */
	@FindBy(id="editContract")
	private WebElement idCliSupplierButton;
	
	
	
	//*******************************************************经销商确认合同*****************************
	@FindBy(id="qiandingBtn")
	private WebElement idCliConfirmContract;
	
	
	
	
	
	
	public WebElement getIdCliConfirmContract() {
		return idCliConfirmContract;
	}
	public WebElement getXpathRadioPayment() {
		return xpathRadioPayment;
	}
	public WebElement getIdTypeEffectiveDate() {
		return idTypeEffectiveDate;
	}
	public WebElement getIdTypeDestination() {
		return idTypeDestination;
	}
	public WebElement getIdTypeQualityDate() {
		return idTypeQualityDate;
	}
	public WebElement getIdTypeAcceptanceDate() {
		return idTypeAcceptanceDate;
	}
	public WebElement getIdTypeDeliveryDate() {
		return idTypeDeliveryDate;
	}
	public WebElement getXpathCliDealerButton() {
		return xpathCliDealerButton;
	}
	public WebElement getIdCheckBoxOne() {
		return idCheckBoxOne;
	}
	public WebElement getIdCheckBoxTwo() {
		return idCheckBoxTwo;
	}
	public WebElement getIdTypeSeaPort() {
		return idTypeSeaPort;
	}
	public WebElement getIdTypeAirPort() {
		return idTypeAirPort;
	}
	public WebElement getIdTypeSeaPort2() {
		return idTypeSeaPort2;
	}
	public WebElement getIdTypeAirPort2() {
		return idTypeAirPort2;
	}
	public WebElement getIdCliSupplierButton() {
		return idCliSupplierButton;
	}
	
}
