/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category.product.manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 商品授权
 */
public class ProductAuthorizationPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public ProductAuthorizationPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 点击选择经销商图标
	 */
	@FindBy(how = How.LINK_TEXT, using = "选择经销商")
	private WebElement selectDealer;
	
	
	/**
	 * 输入经销商名称
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[2]/div[1]/form/div/ul/li[1]/input")
	private WebElement dealerName;
	
	/**
	 * 经销商名称检索
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[13]/div[2]/div[1]/form/div/div/ul/li/div/div/button")
	private WebElement dealerSearchButton;
	
	/**
	 * 选择经销商
	 */                              
	@FindBy(how = How.CLASS_NAME, using = "btnSelect")
	private WebElement checkeddealerName;
	
	
	/**
	 * 起始日期
	 */
	@FindBy(how = How.NAME, using = "startDateOn")
	private WebElement startDate;
	
	
	/**
	 * 起始日期确认
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='calendar']/div/div[3]/button[2]")
	private WebElement startDateOk;
	
	
	/**
	 * 结束日期
	 */
	@FindBy(how = How.NAME, using = "endDateOn")
	private WebElement endDate;
	
	
	/**
	 * 全国代理
	 */
	@FindBy(how = How.NAME, using = "isnationalAgency")
	private WebElement nationalAgency;
	
	
	/**
	 * 独家代理
	 */
	@FindBy(how = How.NAME, using = "isexclusiveagent")
	private WebElement exclusiveAgent;
	
	
	
	
	/**
	 * 保存
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navTab']/div[2]/div[3]/div/form/div[2]/ul/li[1]/div/div/button")
	private WebElement save;
	


	/**
	 * @return the save
	 */
	public WebElement getSave() {
		return save;
	}


	/**
	 * @return the selectDealer
	 */
	public WebElement getSelectDealer() {
		return selectDealer;
	}


	/**
	 * @return the dealerName
	 */
	public WebElement getDealerName() {
		return dealerName;
	}


	/**
	 * @return the dealerSearchButton
	 */
	public WebElement getDealerSearchButton() {
		return dealerSearchButton;
	}


	/**
	 * @return the checkeddealerName
	 */
	public WebElement getCheckeddealerName() {
		return checkeddealerName;
	}


	/**
	 * @return the startDate
	 */
	public WebElement getStartDate() {
		return startDate;
	}


	/**
	 * @return the startDateOk
	 */
	public WebElement getStartDateOk() {
		return startDateOk;
	}


	/**
	 * @return the endDate
	 */
	public WebElement getEndDate() {
		return endDate;
	}


	


	/**
	 * @return the nationalAgency
	 */
	public WebElement getNationalAgency() {
		return nationalAgency;
	}


	/**
	 * @return the exclusiveAgent
	 */
	public WebElement getExclusiveAgent() {
		return exclusiveAgent;
	}
	
	
	

}
