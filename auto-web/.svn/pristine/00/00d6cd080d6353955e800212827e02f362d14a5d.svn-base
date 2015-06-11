/**
 * 
 */
package com.ccigmall.auto.test.page.pc.supplier.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 卖家中心
 */
public class SellerIndexPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public SellerIndexPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 货品列表
	 */
    @FindBy(how = How.LINK_TEXT, using = "货品列表")
	private WebElement goodsList;
    
    /**
	 * 发布商品
	 */
    @FindBy(how = How.LINK_TEXT, using = "发布商品")
	private WebElement createProduct;
    
    
    /**
	 * 库存管理
	 */
    @FindBy(how = How.LINK_TEXT, using = "库存管理")
	private WebElement stockManage;
    
    /**
   	 * 已卖出的货品
   	 */
       @FindBy(how = How.LINK_TEXT, using = "已卖出的货品")
   	private WebElement soldGoods;
     /**
      * 已卖出的货品
     */
    @FindBy(how = How.LINK_TEXT, using = "品牌管理")
    private WebElement linkBrandManagement;
	public WebElement getLinkBrandManagement() {
		return linkBrandManagement;
	}
	  /**
     * 点击弹出框确定
     */
   @FindBy(xpath="//input[@value='确定']")
    public WebElement xpathCliAlertConfirm;
	/**
    * 点击搜索按钮
    */
  @FindBy(xpath="//button[contains(text(),'搜索')]")
   public WebElement xpathCliSearchButton;
   
   	
   	public WebElement getXpathCliSearchButton() {
		return xpathCliSearchButton;
	}
	public WebElement getXpathCliAlertConfirm() {
   		return xpathCliAlertConfirm;
   	}
	/**
	 * @return the goodsList
	 */
	public WebElement getGoodsList() {
		return goodsList;
	}

	/**
	 * @return the createProduct
	 */
	public WebElement getCreateProduct() {
		return createProduct;
	}

	/**
	 * @return the stockManage
	 */
	public WebElement getStockManage() {
		return stockManage;
	}

	/**
	 * @return the soldGoods
	 */
	public WebElement getSoldGoods() {
		return soldGoods;
	}
       
       
    
    
}
