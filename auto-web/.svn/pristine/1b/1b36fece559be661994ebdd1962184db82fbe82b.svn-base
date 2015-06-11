/**
 * 
 */
package com.ccigmall.auto.test.page.pc.supplier.seller.stock;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao 修改库存
 */
public class EditStockPage extends SettingPage {

	/**
	 * 修改库存
	 * 
	 * @param driver
	 */
	public EditStockPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 搜索商品名称
	 */
	@FindBy(how = How.ID, using = "productName")
	private WebElement searchProName;

	/**
	 * 搜索按钮
	 */
	@FindBy(how = How.ID, using = "toGetConList")
	private WebElement searchbutton;
	
	/**
	 * 搜索按钮
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[4]/div/table/tbody[1]")
	private WebElement table;
	
	
	/**
	 * 获取所有的修改元素
	 */
	@FindBy(how = How.XPATH, using = "//span[text()='修改']")
	private List<WebElement> edits;

	/**
	 * @return the edits
	 */
	public List<WebElement> getEdits() {
		return edits;
	}

	/**
	 * 现货库存
	 */
	@FindBy(how = How.ID, using = "supplyQty")
	private WebElement spotNum;
	
	
	/**
	 * 确认按钮
	 */
	@FindBy(how = How.XPATH, using = "//button[text()='确定']")
	private WebElement confirmOk;
	
	/**
	 * 提示ok按钮
	 * 
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[3]/td/div/input")
	private WebElement remindOk;
	
	/**
	 * 
	 */
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div/span")
	private WebElement remind;
	
	/**
	 * @return the remindOk
	 */
	public WebElement getRemindOk() {
		return remindOk;
	}

	/**
	 * @return the remind
	 */
	public WebElement getRemind() {
		return remind;
	}

	/**
	 * @return the spotNum
	 */
	public WebElement getSpotNum() {
		return spotNum;
	}


	/**
	 * @return the confirmOk
	 */
	public WebElement getConfirmOk() {
		return confirmOk;
	}

	/**
	 * @return the searchProName
	 */
	public WebElement getSearchProName() {
		return searchProName;
	}

	/**
	 * @return the searchbutton
	 */
	public WebElement getSearchbutton() {
		return searchbutton;
	}

	/**
	 * @return the table
	 */
	public WebElement getTable() {
		return table;
	}
	
	
}
