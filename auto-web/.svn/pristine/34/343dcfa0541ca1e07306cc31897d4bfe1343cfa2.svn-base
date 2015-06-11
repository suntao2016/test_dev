package com.ccigmall.auto.test.act.pc.platform.buyer.order;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.OrderDetailsPage;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.ToMergeOrderPage;

/**
 * @author chenjingli
 *  待合并订单 动作
 */
public class toMergeOrderAct  extends IndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(toMergeOrderAct.class);
	/**
	 * 待合并订单 page
	 */
	private ToMergeOrderPage mergeOrderPage;
	/**
	 * 详细订单 page
	 */
	private OrderDetailsPage detailsPage;
	/**
	 * @param driver
	 */
	public toMergeOrderAct(WebDriver driver) {
		super(driver);
		mergeOrderPage=new ToMergeOrderPage(driver);
		detailsPage=new OrderDetailsPage(driver);
	}
	/**
	 * 点击 待合并 订单 按钮
	 */
	public void clickToMergeOrder() {
		logger.info("点击{ 待合并 订单} 按钮");
		click(mergeOrderPage.getXpathCliMergeOrder());
	}
	public ToMergeOrderPage getMergeOrderPage() {
		return mergeOrderPage;
	}
	public OrderDetailsPage getDetailsPage() {
		return detailsPage;
	}
	/**
	 * 输入商品名称
	 * @param ActiveName
	 */
	public void typeGoodsName(String goodsName) {
		logger.info("输入商品名称：{}",goodsName);
		type(mergeOrderPage.getIdTypeGoodsName(), goodsName);
	}
	/**
	 * 点击 搜索按钮
	 * @param ActiveName
	 */
	public void clickSearchButton() {
		logger.info("点击 {搜索} 按钮");
		click(mergeOrderPage.getIdCliSearchButton());
	}
	/**
	 * 点击 合并订单 按钮
	 */
	public void clickMergeOrder() {
		logger.info("点击 {合并订单} 按钮");
		click(mergeOrderPage.getIdCliQiHeOrderButton());
	}
	/**
	 * 点击 点击全选 单选框
	 */
	public void clickAllSelChekbox() {
		logger.info("点击{全选} 单选框");
		click(detailsPage.getIdCliAllSelChekbox());
	}
	/**
	 * 点击 合并 并提交订单
	 */
	public void clickSubmitButton() {
		logger.info("点击 {合并并提交订单} 按钮");
		click(detailsPage.getXpathCliSubmitButton());
	}
	/**
	 * 点击 弹出框中的确定按钮
	 */
	public void clickConfirmButton() {
		logger.info("点击 弹出框中{确定} 按钮");
		click(detailsPage.getXpathCliConfirmButton());
	}
	/**
	 * 获得搜索的结果
	 */
	public String getSearchProductName(){
		String proName = getText(mergeOrderPage.getXpathGetProductName());
		logger.info("获得产品列表产品名称:{}",proName);
		return proName;
	}
	
}
