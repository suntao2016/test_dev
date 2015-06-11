package com.ccigmall.auto.test.act.pc.retailer.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.retailer.IndexAct;
import com.ccigmall.auto.test.page.pc.retailer.booking.ProductDetailsPage;
/**
 * @author chenjingli
 * 订单详情页 动作
 */
public class ProductDetailsAct  extends IndexAct{
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
	 * 获得最小起订量现货
	 */
	public String getMinNum(){
		logger.info("获得最小起订量：{}",getText(detailsPage.getXpathgetMinNum()));
		return getText(detailsPage.getXpathgetMinNum()); 
	}
	/**
	 * 获得最小起订量期货
	 */
	public String getFutureMinNum(){
		logger.info("获得最小起订量期货：{}",getText(detailsPage.getXpathGetFutureMinNum()));
		return getText(detailsPage.getXpathGetFutureMinNum()); 
	}
	/**
	 * 输入获得 友情提示中 最小数量
	 */
	public void typeFutureMinNum(String getMinNum) {
		logger.info("输入友情提示中的最小数量：{}",getMinNum);
		type(driver.findElement(By.xpath("html/body/div[5]/div[2]/div[2]/div[2]/div[4]/ul[2]/li[4]/div/input")),getMinNum);
	}
	
	/**
	 * 输入获得 友情提示中 最小数量
	 */
	public void typeSpotMinNum() {
		logger.info("输入友情提示中的最小数量：{}",getMinNum());
		type(detailsPage.getXpathTypeFuturesNum(),getMinNum());
	}
	/**
	 * 点击预售期货
	 */
	public void clickFutureButton() {
		logger.info("点击{预售期货}按钮");
		click(detailsPage.getIdCliFutureButton());
	}
	/**
	 * 点击 加入进货单 按钮
	 */
	public void clickJoinStock() {
		logger.info("点击 {加入进货单} 按钮");
		click(detailsPage.getIdCliJoinStock());
	}
	/**
	 * 点击继续购物按钮
	 */
	public void clickGoOnShopping() {
		logger.info("点击 {继续购物} 按钮");
		click(detailsPage.getIdCliGoOnShopping());
	}
	/**
	 * 点击进入购物车按钮
	 */
	public void clickLoginShoppingCart() {
		logger.info("点击 {进入购物车} 按钮");
		click(detailsPage.getIdCliLoginShoppingCart());
	}
	
	/**
	* @Title: getPromptInfo 
	* @Description: 获得提示框的内容
	* @param @return    
	* @return String 
	* @throws
	 */
	public String getPromptInfo(){
		logger.info("获得提示框的内容：{}",getText(detailsPage.getIdGetPromptInfo()));
		return getText(detailsPage.getIdGetPromptInfo()); 
	}
}
