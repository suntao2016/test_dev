/**
 * 
 */
package com.ccigmall.auto.test.page.pc.platform.user.review.merchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.pc.platform.IndexPage;

/**
 * @author jianping.gao
 * 商户审核 公共部分
 */
public class MerchantPage extends IndexPage{

	/**
	 * 
	 * @param driver
	 */
	public MerchantPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 供应商
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "供应商")
	private WebElement supplier;
	
	/**
	 * 经销商
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "经销商")
	private WebElement dealer;
	
	/**
	 * 零售商
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "零售商")
	private WebElement retailer;
	
	
	/**
	 * 商户名称
	 *
	 */
	@FindBy(how = How.ID, using = "productName")
	private WebElement merchantName;
	
	
	/**
	 * 商户状态类型
	 *
	 */
	@FindBy(how = How.XPATH, using = "//form[@id='SearchFrom']/p[2]/select")
	private WebElement merchantSatusType;

	
	
	/**
	 * 商户搜索
	 *
	 */
	@FindBy(how = How.XPATH, using = "//form[@id='SearchFrom']/p[2]/button")
	private WebElement merchantSearchButton;
	
	
	/**
	 * 第一个搜索状态
	 *
	 */
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td[5]")
	private WebElement merchantStatus;
	
	/**
	 * 第一个搜索商户名
	 *
	 */
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td[1]/p")
	private WebElement merchantRecordName;
	
	
	/**
	 * 商户查看  
	 *
	 */
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td[6]/span")
	private WebElement merchantView;
	
	/**
	 * 通过                                                                      
	 *                                
	 */                               
	@FindBy(how = How.XPATH, using = "//button[@class='tong1']")
	private WebElement pass;
	
		
	/**
	 * 不通过  
	 *
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[2]/div[3]/div/div[3]/button")
	private WebElement noPass;
	
	
	/**
	 * 提示
	 *
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div")
	private WebElement remind;
	
	/**
	 * 提示OK
	 *
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[3]/td/div/input")
	private WebElement remindOk;

	/**
	 * @return the supplier
	 */
	public WebElement getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(WebElement supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the dealer
	 */
	public WebElement getDealer() {
		return dealer;
	}

	/**
	 * @param dealer the dealer to set
	 */
	public void setDealer(WebElement dealer) {
		this.dealer = dealer;
	}

	/**
	 * @return the retailer
	 */
	public WebElement getRetailer() {
		return retailer;
	}

	/**
	 * @param retailer the retailer to set
	 */
	public void setRetailer(WebElement retailer) {
		this.retailer = retailer;
	}

	/**
	 * @return the merchantName
	 */
	public WebElement getMerchantName() {
		return merchantName;
	}

	/**
	 * @param merchantName the merchantName to set
	 */
	public void setMerchantName(WebElement merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * @return the merchantSatusType
	 */
	public WebElement getMerchantSatusType() {
		return merchantSatusType;
	}

	/**
	 * @param merchantSatusType the merchantSatusType to set
	 */
	public void setMerchantSatusType(WebElement merchantSatusType) {
		this.merchantSatusType = merchantSatusType;
	}

	/**
	 * @return the merchantSearchButton
	 */
	public WebElement getMerchantSearchButton() {
		return merchantSearchButton;
	}

	/**
	 * @param merchantSearchButton the merchantSearchButton to set
	 */
	public void setMerchantSearchButton(WebElement merchantSearchButton) {
		this.merchantSearchButton = merchantSearchButton;
	}

	/**
	 * @return the merchantStatus
	 */
	public WebElement getMerchantStatus() {
		return merchantStatus;
	}

	/**
	 * @return the merchantStatus
	 */
	public WebElement getMerchantRecordName() {
		return merchantRecordName;
	}


	/**
	 * @param merchantStatus the merchantStatus to set
	 */
	public void setMerchantStatus(WebElement merchantStatus) {
		this.merchantStatus = merchantStatus;
	}

	/**
	 * @return the merchantView
	 */
	public WebElement getMerchantView() {
		return merchantView;
	}

	/**
	 * @param merchantView the merchantView to set
	 */
	public void setMerchantView(WebElement merchantView) {
		this.merchantView = merchantView;
	}

	
	/**
	 * @return the pass
	 */
	public WebElement getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	/**
	 * @return the noPass
	 */
	public WebElement getNoPass() {
		return noPass;
	}

	/**
	 * @param noPass the noPass to set
	 */
	public void setNoPass(WebElement noPass) {
		this.noPass = noPass;
	}

	/**
	 * @return the remind
	 */
	public WebElement getRemind() {
		return remind;
	}

	/**
	 * @param remind the remind to set
	 */
	public void setRemind(WebElement remind) {
		this.remind = remind;
	}

	/**
	 * @return the remindOk
	 */
	public WebElement getRemindOk() {
		return remindOk;
	}

	/**
	 * @param remindOk the remindOk to set
	 */
	public void setRemindOk(WebElement remindOk) {
		this.remindOk = remindOk;
	}
	
	
}
