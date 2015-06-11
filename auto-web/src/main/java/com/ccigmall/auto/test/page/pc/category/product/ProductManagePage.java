/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category.product;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 商品管理
 */
public class ProductManagePage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public ProductManagePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 商品管理
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='sidebar']/div[2]/div/div[1]/h2")
	private WebElement productManagement;
	
	/**
	 * 商品授权
	 */
	@FindBy(how = How.LINK_TEXT, using = "商品授权")
	private WebElement productAuthorization;
	
	/**
	 * 商品审核	
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='sidebar']/div[2]/div/div[3]/h2")
	private WebElement productReview;
	
	
	/**
	 * 供应商商品审核
	 */
	@FindBy(how = How.LINK_TEXT, using = "供应商商品审核")
	private WebElement supplierProductReview;
	
	/**
	 * WOFE商品审核
	 */
	@FindBy(how = How.LINK_TEXT, using = "WOFE商品审核")
	private WebElement wofeProductReview;
	
	/**
	 * 商品名称
	 */
	@FindBy(how = How.NAME, using = "productName")
	private WebElement productName;
	
	
	/**
	 * 审核类型                                                                 
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='pagerForm']/div/div/table/tbody/tr/td[3]/div/div/a")
	private WebElement reviewType;
	
	/**
	 * 待审核
	 */
	@FindBy(how = How.XPATH, using = "/html/body/ul/li[1]/a")
	private WebElement pendingReview;
	
	/**
	 * 审核未通过
	 */
	@FindBy(how = How.XPATH, using = "/html/body/ul/li[2]/a")
	private WebElement reviewNotPass;
	
	/**
	 * 审核已通过
	 */
	@FindBy(how = How.XPATH, using = "/html/body/ul/li[3]/a")
	private WebElement reviewPass;
	
	/**
	 * 商品管理    检索
	 */                                  //*[@id="pagerForm"]/div/div/table/tbody/tr/td[4]/div/div/button
	@FindBy(how = How.XPATH, using = "//form[@id='pagerForm']/div/div/table/tbody/tr/td[4]/div/div/button")
	private WebElement searchButton;
	
	/**
	 * 授权 检索
	 */                                  //*[@id="pagerForm"]/div/div/table/tbody/tr/td[3]/div/div/button
	@FindBy(how = How.XPATH, using = "//form[@id='pagerForm']/div/div/table/tbody/tr/td[3]/div/div/button")
	private WebElement authorizationSearchButton;
	
	/**
	 * 搜索结果的第一个商品       审核
	 *                                
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/table/tbody/tr/td[5]/a/span")
	private WebElement reviewButton;
	
	/**
	 *  搜索结果的第一个商品       授权
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/div[2]/div/table/tbody/tr/td[7]/div/a[1]/span")
	private WebElement authorizationButton;
	
	
	/**
	 * 商品授权之后，相关的经销商
	 */                     
	@FindBy(how=How.XPATH,using="//div[@id='w_list_print']/div/table/tbody/tr/td[2]" )
	private WebElement authoryDealerName;
	
	/**
	 * 审核描述 
	 * 
	 */
	@FindBy(how = How.NAME, using = "describe")
	private WebElement reviewDesction;
	
	
	/**
	 * 审核通过按钮                        
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navTab']/div[2]/div[3]/div/div[2]/div[2]/form/ul/li[1]/div/div/button")
	private WebElement reviewPassButton;
	
	/**
	 * 待审核 搜索结果                                                                           
	 */   
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/table/tbody/tr")
	private List<WebElement> searchResult;
	
	/**
	 * 授权 搜索结果                                                                           
	 */                                    
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/div[2]/div/table/tbody")
	private List<WebElement> searchResultAuthory;
	
	/**
	 * 授权 搜索结果                                                                           
	 */                                    
	@FindBy(how = How.XPATH, using = "//div[@id='w_list_print']/div/div[2]/div/table/tbody/tr/td[2]/div/a")
	private WebElement searchResultAuthoryName;

	/**
	 * @return the searchResultAuthoryName
	 */
	public WebElement getSearchResultAuthoryName() {
		return searchResultAuthoryName;
	}
	
	/**
	 * @return the searchResultAuthory
	 */
	public List<WebElement> getSearchResultAuthory() {
		return searchResultAuthory;
	}

	/**
	 * @return the reviewButton
	 */
	public WebElement getReviewButton() {
		return reviewButton;
	}

	/**
	 * @return the reviewDesction
	 */
	public WebElement getReviewDesction() {
		return reviewDesction;
	}

	/**
	 * @return the reviewPassButton
	 */
	public WebElement getReviewPassButton() {
		return reviewPassButton;
	}

	

	/**
	 * @return the searchResult
	 */
	public List<WebElement> getSearchResult() {
		return searchResult;
	}

	/**
	 * @return the productName
	 */
	public WebElement getProductName() {
		return productName;
	}

	/**
	 * @return the reviewType
	 */
	public WebElement getReviewType() {
		return reviewType;
	}

	/**
	 * @return the pendingReview
	 */
	public WebElement getPendingReview() {
		return pendingReview;
	}

	/**
	 * @return the reviewNotPass
	 */
	public WebElement getReviewNotPass() {
		return reviewNotPass;
	}

	/**
	 * @return the reviewPass
	 */
	public WebElement getReviewPass() {
		return reviewPass;
	}

	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}

	/**
	 * @return the productManagement
	 */
	public WebElement getProductManagement() {
		return productManagement;
	}

	/**
	 * @return the productAuthorization
	 */
	public WebElement getProductAuthorization() {
		return productAuthorization;
	}

	/**
	 * @return the productReview
	 */
	public WebElement getProductReview() {
		return productReview;
	}

	/**
	 * @return the supplierProductReview
	 */
	public WebElement getSupplierProductReview() {
		return supplierProductReview;
	}

	/**
	 * @return the wofeProductReview
	 */
	public WebElement getWofeProductReview() {
		return wofeProductReview;
	}

	/**
	 * @return the authoryDealerName
	 */
	public WebElement getAuthoryDealerName() {
		return authoryDealerName;
	}

	/**
	 * @return the authorizationSearchButton
	 */
	public WebElement getAuthorizationSearchButton() {
		return authorizationSearchButton;
	}

	/**
	 * @return the authorizationButton
	 */
	public WebElement getAuthorizationButton() {
		return authorizationButton;
	}	

}
