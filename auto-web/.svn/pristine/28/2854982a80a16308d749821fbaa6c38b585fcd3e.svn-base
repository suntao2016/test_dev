/**
 * 
 */
package com.ccigmall.auto.test.page.pc.category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 *  后台类目管理平台首页
 */
public class IndexPage extends SettingPage{

	/**
	 * @return the categoryManage
	 */
	public WebElement getCategoryManage() {
		return categoryManage;
	}

	/**
	 * @return the userManage
	 */
	public WebElement getUserManage() {
		return userManage;
	}

	/**
	 * @return the baseDataManage
	 */
	public WebElement getBaseDataManage() {
		return baseDataManage;
	}

	/**
	 * @return the systemManage
	 */
	public WebElement getSystemManage() {
		return systemManage;
	}

	/**
	 * @return the productManage
	 */
	public WebElement getProductManage() {
		return productManage;
	}

	/**
	 * @return the index
	 */
	public WebElement getIndex() {
		return index;
	}

	/**
	 * @return the quit
	 */
	public WebElement getQuit() {
		return quit;
	}

	/**
	 * 
	 * @param driver
	 */
	public IndexPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 类目管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navMenu']/ul/li[1]/a/span")
	private WebElement categoryManage;
	
	/**
	 * 用户管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navMenu']/ul/li[2]/a/span")
	private WebElement userManage;
	
	/**
	 * 基础数据管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navMenu']/ul/li[3]/a/span")
	private WebElement baseDataManage;
	
	/**
	 * 系统管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navMenu']/ul/li[4]/a/span")
	private WebElement systemManage;
	
	/**
	 * 商品管理
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='navMenu']/ul/li[5]/a/span")
	private WebElement productManage;
	
	
	/**
	 * 主页
	  */
	@FindBy(how = How.LINK_TEXT, using = "主页")
	private WebElement index;
	
	/**
	 * 退出
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "退出")
	private WebElement quit;

}
