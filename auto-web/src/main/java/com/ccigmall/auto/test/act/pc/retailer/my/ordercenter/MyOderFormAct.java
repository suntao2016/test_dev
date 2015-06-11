package com.ccigmall.auto.test.act.pc.retailer.my.ordercenter;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.ordercenter.MyOderFormPage;
/**
 * @author chenjingli
 * 我的购物车 动作
 */
public class MyOderFormAct  extends MyIndexAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MyOderFormAct.class);
	/**
	 * 我的订单page
	 */
	private MyOderFormPage oderFormPage;
	
	/**
	 * 
	 * @param driver
	 */
	public MyOderFormAct(WebDriver driver) {
		super(driver);
		oderFormPage=new MyOderFormPage(driver);
	}
	
	public MyOderFormPage getOderFormPage() {
		return oderFormPage;
	}

	/**
	 * 向搜索框输入信息
	 */
	public void typeSearchInput(String searchInfo) {
		logger.info("搜索框输入信息:{}",searchInfo);
		type(oderFormPage.getIdTypeSearchInput(),searchInfo);
	}
	/**
	 * 点击查询按钮
	 */
	public void clickSearchButton() {
		logger.info("点击查询按钮");
		click(oderFormPage.getIdCliSearchButton());
	}
	
	/**
	 * 点击订单——查看
	 */
	public void clickOrderView() {
		logger.info("点击订单——查看");
		click(oderFormPage.getOrderView());
	}
	
	/**
	 * 点击待收现货
	 */
	public void clickWaitToReceive() {
		logger.info("点击待收现货");
		click(oderFormPage.getWaitToReceive());
	}
	/**
	 * 点击代付款
	 */
	public void clickToPay() {
		click(oderFormPage.getLinkCilToPay());
	}
	/**
	 * 点击待付余款
	 */
	public void clickToPayBalance() {
		click(oderFormPage.getLinkCilToPayBalance());
	}
	/**
	 * 点击已完成
	 */
	public void clickCompleted() {
		click(oderFormPage.getLinkCilCompleted());
	}
	/**
	 * 点击已取消
	 */
	public void clickDisabled() {
		click(oderFormPage.getLinkCilToDisabled());
	}
	/**
	 * 点击待收期货
	 */
	public void clickWaitToReceiveFutures() {
		logger.info("点击待收期货");
		click(oderFormPage.getWaitToReceiveFutures());
	}
	
	/**
	 * 点击订单状态为：经销商已发货的查看
	 */
	public void clickOrderCheck() {
		logger.info(" 点击订单状态为：经销商已发货的查看");
		click(oderFormPage.getReceiveCheck());
	}
	
	/**
	 * 现货 确认收货
	 */
	public void clickConfirmReceipt() {
		List<WebElement> eles = oderFormPage.getConfirmReceipt();
		int size = eles.size();
		logger.info(" 现货 确认收货共有{}个",size);
		for(int i=0;i<size;i++){
			 eles = oderFormPage.getConfirmReceipt();
			 logger.info(" 点击第{}个确认收货",i+1);
			 click(eles.get(0));
			// 点击 确认收货 - 确定
			logger.info("点击 确认收货 - 确定");
			clickAlertConfirm();
			pause(1);
		}
	}
	
	/**
	 * 现货确认收货-弹框-确定
	 */
	public void clickAlertConfirm() {
		logger.info(" 点击-现货确认收货-弹框-确定");
		click(oderFormPage.getAlertConfirm());
	}
	
	/**
	 * 订单状态
	 */
	public String  getOrderStatu() {
		String text = this.getText(oderFormPage.getXpathgetOrderStatu());
		logger.info(" 获取 订单状态为:{}",text);
		return text;
	}
	
	/**
	 * 获取现货 订单状态
	 */
	public String  getOrderStatu_() {
		String text = this.getText(oderFormPage.getOrderStatu());
		logger.info(" 获取现货 订单状态为:{}",text);
		return text;
	}
	
	/**
	 * 获取 支付号
	 */
	public String  getPayId() {
		String text = this.getText(oderFormPage.getPayId());
		logger.info(" 获取支付号为:{}",text);
		return text;
	}
	
	/**
	 * 获取 订单编号
	 */
	public String  getOrderId() {
		String text = this.getText(oderFormPage.getXpathgetOrderNum());
		logger.info(" 获取订单编号为:{}",text);
		return text;
	}
	
	/**
	 * 点击去付余款 按钮  当操作栏中 按钮为三个的时候  就可以用作 取消订单使用
	 */
	public void  clickPayFinalButton() {
		logger.info(" 点击{去付余款}按钮");
		click(oderFormPage.getXpathCliPayFinal());
	}
	/**
	 * 订单列表支付待支付订单个数
	 */
	public  int  getPayOrders() {
		int number = this.getElementsNum(oderFormPage.getXpathGetPayOrders());
		logger.info(" 订单列表支付待支付订单个数:{}",number);
		return number;
	}
	/**
	 * 点击 却小订单弹框中的{确定}按钮
	 */
	public void  clickSureButton() {
		logger.info("点击 却小订单弹框中的{确定}按钮");
		click(oderFormPage.getXpathCliSureButton());
	}
	
	/**
	 * 获得 取消订单 弹框中的 订单号
	 */
	public String  getOrderNumber() {
		String text = this.getText(oderFormPage.getXpathGetOrderNumber());
		logger.info(" 获得 取消订单 弹框中的 订单号:{}",text);
		return text;
	}
	
	/**
	 * 点击 评价按钮
	 */
	public void  clickComment() {
		logger.info("点击 已完成订单的{评价}按钮");
		click(oderFormPage.getComment());
	}
	
}
