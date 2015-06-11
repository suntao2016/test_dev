package com.ccigmall.auto.test.act.pc.platform.buyer.order;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.ConsolidatedOrderPage;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.OrderDetailsPage;

/**
 * @author chenjingli
 *  wofe 买家中心>已合并订单 act
 */
public class ConsolidatedOrderAct  extends IndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ConsolidatedOrderAct.class);
	/**
	 * 已合并订单 page
	 */
	private ConsolidatedOrderPage orderPage;
	public ConsolidatedOrderPage getOrderPage() {
		return orderPage;
	}
	public OrderDetailsPage getDetailsPage() {
		return detailsPage;
	}
	/**
	 * 订单详情 page
	 */
	private OrderDetailsPage detailsPage;
	/**
	 * @param driver
	 */
	public ConsolidatedOrderAct(WebDriver driver) {
		super(driver);
		orderPage=new ConsolidatedOrderPage(driver);
	}
	/**
	 * 点击 已合并 订单 按钮
	 */
	public void clickConsolidatedOrder() {
		logger.info("点击 {已合并} 订单 按钮");
		click(orderPage.getXpathCliConsolidatedOrder());
	}
	/**
	 * 点击 下拉框
	 */
	public void selOrderStatus(String optionText) {
		logger.info("点击 选择 下拉框");
		select(orderPage.getIdSelOrderStatus(),optionText);
	}
	/**
	 * 点击 搜索 按钮
	 */
	public void clickSearchButton() {
		logger.info("点击 {搜索} 按钮");
		click(orderPage.getXpathCliSearchButton());
	}
	/**
	 * 点击 期货 分单 按钮
	 */
	public void clickQiFenButton() {
		logger.info("点击点击 期货 {分单} 按钮");
		click(orderPage.getXpathCliQiFenButton());
	}
	/**
	 * 点选择 分销商 单选框
	 */
	public void clickDistributorRadio() {
		logger.info("点击 选择分销商 单选框 按钮");
		click(orderPage.getXpathCliDistributorRadio());
	}
	/**
	 * 点击 分销商后 确定 按钮
	 */
	public void clickSureButton() {
		logger.info("点击 分销商后 {确定} 按钮");
		click(orderPage.getXpathCliSureButton());
	}
	/**
	 * 点击 弹出框 按钮
	 */
	public void clickConfirmButton() {
		logger.info("点击 弹出框 按钮");
		click(orderPage.getXpathCliConfirmButton());
	}
	/**
	 * 输入订单编号
	 */
	public void typePurchaseId(String purchaseId) {
		logger.info("输入订单编号：{}",purchaseId);
		type(orderPage.getIdTypePurchaseId(),purchaseId);
	}
	/**
	 * 获得产品列表的 交易状态
	 */
	public String getOrderStatus() {
		logger.info("获得产品列表的 交易状态:{}",this.getText(orderPage.getXpathGetOrderStatus()));
		return this.getText(orderPage.getXpathGetOrderStatus());
	}
	/**
	 * 获得产品获取采购订单 编号
	 */
	public String getOrderNum() {
		logger.info("获得产品获取采购订单 编号:{}",this.getText(orderPage.getXpathGetOrderNum()));
		return this.getText(orderPage.getXpathGetOrderNum());
	}
}
