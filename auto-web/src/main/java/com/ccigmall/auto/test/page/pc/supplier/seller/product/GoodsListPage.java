/**
 * 
 */
package com.ccigmall.auto.test.page.pc.supplier.seller.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 货品列表
 *
 */
public class GoodsListPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public GoodsListPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 出售中的货品
	 */
    @FindBy(how = How.LINK_TEXT, using = "出售中的货品")
	private WebElement saleGoods;
    
    /**
	 * 待审核的货品
	 */
    @FindBy(how = How.LINK_TEXT, using = "待审核的货品")
	private WebElement pendingReview;
    
    /**
	 * 审核未通过的货品
	 */
    @FindBy(how = How.LINK_TEXT, using = "审核未通过的货品")
	private WebElement reviewNotPass;
    
    
    /**
	 * 下架的货品
	 */
    @FindBy(how = How.LINK_TEXT, using = "下架的货品")
	private WebElement soldOut;
    
    /**
	 * 搜索商品名称
	 */
    @FindBy(how = How.ID, using = "findProductName")
	private WebElement searchProName;
    
    /**
	 * 搜索商品Id
	 */
    @FindBy(how = How.ID, using = "selectProdId")
	private WebElement searchProId;
    
  
    
    /**
	 * 搜索按钮
	 */
    @FindBy(how = How.XPATH, using = "//div[@id='cp3']/div[1]/form/p[3]/button")
	private WebElement searchbutton;
    
  
    
    /**
   	 * 被搜索商品Id
   	 */
    @FindBy(how = How.XPATH, using = "//tbody[@id='showListTbody']/tr[1]/td[2]")
   	private WebElement searchResultProId;



	
    
    
    
    
    
    /**
     * 订单管理--已卖出的货品列表page
     * 
     * ***********************************************************************************************************
     *   click Classification
     */
	
	 /**
      * 点击--等待确认 text
	  */
	 @FindBy(linkText="等待确认")
	 private WebElement linCliWaitingConfirm;
	 /**
      * 点击--等待发货 text
	  */
	 @FindBy(linkText="等待发货")
	 private WebElement linCliWaitingShip;
	 /**
      * 点击--已发货 text
	  */
	 @FindBy(linkText="已发货")
	 private WebElement linCliShiped;
	 /**
      * 点击--已完成 text
	  */
	 @FindBy(linkText="已完成")
	 private WebElement linCliCompleted;
	
	 
	 //type and select info  Classification
	 /**
      * 输入商品名称
	  */
	 @FindBy(id="pName")
	 private WebElement idTypeGoodsName;
	 /**
      * 输入商品id
	  */
	 @FindBy(id="orderId")
	 private WebElement idTypeGoodsOrderId;
	 /**
      * 输入经销商名称
	  */
	 @FindBy(id="dealerName")
	 private WebElement idTypeDealerName;
	 /**
      * 订单状态
	  */
	 @FindBy(id="state")
	 private WebElement idSelOrderStatu;


//************************************************************************************************
	 
	 /**
		 * @return the saleGoods
		 */
		public WebElement getSaleGoods() {
			return saleGoods;
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
		 * @return the soldOut
		 */
		public WebElement getSoldOut() {
			return soldOut;
		}



		/**
		 * @return the searchProName
		 */
		public WebElement getSearchProName() {
			return searchProName;
		}



		/**
		 * @return the searchProId
		 */
		public WebElement getSearchProId() {
			return searchProId;
		}



		/**
		 * @return the searchbutton
		 */
		public WebElement getSearchbutton() {
			return searchbutton;
		}



		/**
		 * @return the searchResultProId
		 */
		public WebElement getSearchResultProId() {
			return searchResultProId;
		}
	 
	public WebElement getLinCliWaitingConfirm() {
		return linCliWaitingConfirm;
	}



	public WebElement getLinCliWaitingShip() {
		return linCliWaitingShip;
	}


	
	public WebElement getLinCliShiped() {
		return linCliShiped;
	}



	public WebElement getLinCliCompleted() {
		return linCliCompleted;
	}



	public WebElement getIdTypeGoodsName() {
		return idTypeGoodsName;
	}



	public WebElement getIdTypeGoodsOrderId() {
		return idTypeGoodsOrderId;
	}



	public WebElement getIdTypeDealerName() {
		return idTypeDealerName;
	}



	public WebElement getIdSelOrderStatu() {
		return idSelOrderStatu;
	}
	 
	 
}
