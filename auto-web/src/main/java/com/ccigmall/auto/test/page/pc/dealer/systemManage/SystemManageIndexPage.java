/**
 * 
 */
package com.ccigmall.auto.test.page.pc.dealer.systemManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;

/**
 * @author dengshuhai
 * 经销商-系统管理页面-首页
 */
public class SystemManageIndexPage extends IndexPage{

	/**
	 * 
	 * @param driver
	 */
	public SystemManageIndexPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 现货订单
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "现货订单")
	private WebElement spotOrder;
	
	/**
	 * 期货订单
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "期货订单")
	private WebElement futuresOrder;
	
	/**
	 * 库存查询
	 * 
	 */
	@FindBy(how = How.LINK_TEXT, using = "库存查询")
	private WebElement StockQuery;

	public WebElement getSpotOrder() {
		return spotOrder;
	}

	public WebElement getFuturesOrder() {
		return futuresOrder;
	}

	public WebElement getStockQuery() {
		return StockQuery;
	}
	
	
	
	
}
