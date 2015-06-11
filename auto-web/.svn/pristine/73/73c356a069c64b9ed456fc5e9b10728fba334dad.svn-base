package com.ccigmall.auto.test.act.pad.retailer.booking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.page.pad.retailer.booking.OrderPage;

/**
 * @author dengshuhai
 *订单信息页面 动作
 */
public class OrderAct  extends ShoppingCartAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(OrderAct.class);
	/**
	 *pad 购物车page
	 */
	private OrderPage orderPage;
	
	/**
	 * 
	 * @param driver
	 */
	public OrderAct(WebDriver driver) {
		super(driver);
		orderPage=new OrderPage(driver);
	}
	
	
	/**
	 *进入收货人信息
	 */
	public  void enterReceiverInfo() {
		logger.info("进入收货人信息：{}",orderPage.getEnterReceiveInfo());
		this.click(orderPage.getEnterReceiveInfo());
	}
	
	/**
	 *添加收货人信息
	 */
	public  void addReceiverInfo() {
		logger.info("添加收货人信息：{}",orderPage.getAddReceiverInfo());
		this.click(orderPage.getAddReceiverInfo());
	}
	
	/**
	 *输入收货人姓名
	 */
	public  void inputReceiverName(String text) {
		logger.info("输入收货人姓名：{}",text );
		this.type(orderPage.getReceiverName(),text);
	}
	/**
	 *输入收货人电话
	 */
	public  void inputReceiverMobile(String text) {
		logger.info("输入收货人电话：{}",text );
		this.type(orderPage.getMobile(),text);
	}
	
	/**
	 *输入省
	 */
	public  void choseProvince(String text) {
		logger.info("输入省：{}",text );
		new Select(orderPage.getProvince()).selectByVisibleText(text);
	}
	
	/**
	 *输入市
	 */
	public  void choseCity(String text) {
		logger.info("输入市：{}",text );
		new Select(orderPage.getCity()).selectByVisibleText(text);
	}
	
	/**
	 *输入区
	 */
	public  void choseArea(String text) {
		logger.info("输入区：{}",text );
		new Select(orderPage.getArea()).selectByVisibleText(text);
	}
	
	
	
	/**
	 *输入收货人详细地址
	 */
	public  void inputAddressDetailsInfo(String text) {
		logger.info("输入收货人详细地址：{}",text );
		this.type(orderPage.getAddressDetailsInfo(),text);
	}
	
	/**
	 *输入收货人邮政编码
	 */
	public  void inputPostalCode(String text) {
		logger.info("输入收货人邮政编码：{}",text );
		this.type(orderPage.getPostalCode(),text);
	}
	
	
	/**
	 *收货人信息添加/修改完成
	 */
	public  void Compelete() {
		logger.info("收货人信息添加/修改完成：{}",orderPage.getCompelete());
		this.click(orderPage.getCompelete());
	}
	
	/**
	 *收货人信息遍历修改
	 */
	public  void clickModify() {
		List<WebElement> eles = orderPage.getModifyReceiverInfo();
		int size = eles.size();
		try {
			if(size>0){
				for(int i =0; i<size; i++){
					//怕丢 每次都要重新获取一下
					eles  = orderPage.getModifyReceiverInfo();
					//选择第i个修改按钮
					click(eles.get(i));
					logger.info("第{}次修改收货人信息",i+1);
					//修改收货人名称
					this.pause(2);
					type(orderPage.getReceiverName(),"已修改"+new SimpleDateFormat("MMddHHmmss").format(new Date()));
					//电话
					this.pause(2);
					type(orderPage.getMobile(),"1812015010"+i);
					//省 市 区
					this.pause(2);
					choseProvince("河北省");
					choseCity("廊坊市");
					choseArea("固安县");
					//详细地址
					this.inputAddressDetailsInfo("中南海2号楼1单元");
					//邮编
					this.pause(1);
					this.inputPostalCode("065500");
					//完成
					this.pause(1);
					this.Compelete();
					//确认
					this.pause(1);
					this.clickAlertConfirm();
					this.pause(1);
				}
			}else{
				logger.error("未找到收货信息修改按钮");
				Assert.fail("收货信息-修改按钮-不存在！");
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			logger.error("未找到收货信息修改按钮"+e);
			Assert.fail("收货信息-修改按钮-不存在！");
		}
	}
	
	/**
	 *收货人删除按钮
	 */
	public  void clickDelReceiverInfo() {
		List<WebElement> eles = orderPage.getDelReceiverInfo();
		int size = eles.size();
		try {
			if(size>0){
				for(int i =0; i<size; i++){
					//怕丢 每次都要重新获取一下
					eles  = orderPage.getDelReceiverInfo();
					logger.info("第{}次修改收货人信息",i+1);
					//选择第i个删除按钮
					click(eles.get(i));
					//确认
					this.clickAlertConfirm();
					this.pause(2);
				}
			}else{
				logger.error("未找到收货信息删除按钮");
				Assert.fail("收货信息-删除按钮-不存在！");
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			logger.error("未找到收货信息删除按钮"+ e);
			Assert.fail("收货信息-删除按钮-不存在！");
		}
	}
	
	
	
	
	
	/**
	 *提交订单
	 */
	public  void clickSubmitOrder() {
		logger.info("提交订单：{}",orderPage.getSubmitOrder());
		this.click(orderPage.getSubmitOrder());
	}
	
	/**
	 *给卖家留言
	 */
	public  void inputLeaveMessage(String msg) {
		logger.info("给卖家留言的信息为：{}",  msg);
		this.type(orderPage.getLeaveMessage(), msg );
	}
	
	
}
