package com.ccigmall.auto.test.act.pad.retailer.booking;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.page.pad.retailer.booking.ProductDetailsPage;

/**
 * @author dengshuhai
 * 订单详情页 动作
 */
public class ProductDetailsAct  extends SettingActiton{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ProductDetailsAct.class);
	/**
	 * 商品详情page
	 */
	private ProductDetailsPage detailsPage;
	
	/**
	 * 
	 * @param driver
	 */
	public ProductDetailsAct(WebDriver driver) {
		super(driver);
		detailsPage=new ProductDetailsPage(driver);
	}
	/**
	 * 现货最小起订量
	 */
	public String getSpotMinNum() {
		String  num = this.getText(detailsPage.getMinWholesaleQty());
		logger.info("现货最小起订量 为：{}",num);
		return num;
	}
	
	/**
	 *期货最小起订量
	 */
	public String getFuturesMinNum() {
		String  num = this.getText(detailsPage.getMinSupplierQty());
		logger.info("期货最小起订量 为：{}",num);
		return num;
	}
	
	/**
	 *选择现货类型
	 */
	public  void clickSpotType() {
		logger.info("选择现货类型：{}",detailsPage.getSpotType());
		this.click(detailsPage.getSpotType());
	}
	
	/**
	 *选择预售类型
	 */
	public  void clickFuturesType() {
		logger.info("选择预售类型：{}",detailsPage.getFutureType());
		this.click(detailsPage.getFutureType());
	}
	
	/**
	 * 输入现货数量
	 */
	public  void inputSpotAmount() {
		List<WebElement> inputAmounts   = detailsPage.getAmountPurchased();
		int i = 1;
		for(WebElement input :inputAmounts){
			if(input.isDisplayed()){
			logger.info("第{}次输入现货数量:{}",i++,getSpotMinNum());
			input.sendKeys(getSpotMinNum());
		}
			}
	}
	
	/**
	 * 输入期货数量
	 */
	public  void inputFuturesAmount() {
		List<WebElement> inputAmounts   = detailsPage.getAmountPurchased();
		int i =0;
		for(WebElement input :inputAmounts){
			if(input.isDisplayed()){
			logger.info("第{}次输入期货数量:{}",i++,getFuturesMinNum());
			input.sendKeys(getFuturesMinNum());
			}
		}
	}
	
	/**
	 *点击【加入进货单】
	 */
	public  void clickAddToOrderButton() {
		logger.info("点击【加入进货单】：{}",detailsPage.getAddToOrderButton());
		this.click(detailsPage.getAddToOrderButton());
	}
	
	/**
	 *点击 进入购物车
	 */
	public  void clickEnterShoppingCart() {
		logger.info("点击【进入购物车】：{}",detailsPage.getEnterShoppingCart());
		this.click(detailsPage.getEnterShoppingCart());
	}
	
	/**
	 *点击 继续购物
	 */
	public  void clickContinueShopping() {
		logger.info("点击【继续购物】：{}",detailsPage.getContinueShopping());
		this.click(detailsPage.getContinueShopping());
	}
	
	
}
