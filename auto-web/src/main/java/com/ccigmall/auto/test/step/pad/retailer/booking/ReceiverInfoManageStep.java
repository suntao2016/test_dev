package com.ccigmall.auto.test.step.pad.retailer.booking;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pad.retailer.booking.OrderAct;
import com.ccigmall.auto.test.act.pad.retailer.booking.PayAct;
import com.ccigmall.auto.test.act.pad.retailer.my.MyOrderAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pad.retailer.RetailerStep;

/**
 * 
 * @author dengshuhai 
 * pad
 * 零售商收货人信息增改删
 * @version 1.0
 */
public class ReceiverInfoManageStep extends RetailerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ReceiverInfoManageStep.class);
	// 商品详情动作
	private OrderAct orderAct;
	// 我的订单
	private MyOrderAct myOrderAct;
	// 商品支付动作
	private PayAct payAct;
	/**
	 * pad 零售商收货人信息增改删
	 * @throws Exception
	 */
	@Test(description = "pad retailer 零售商收货人信息增改删")
	@Parameters({ "moblie", "useID" ,"padUserName","padPassword"})
	public void testReceiverInfoManage(String moblie, String useID,String padUserName,String padPassword) throws Exception {
		try {
			orderAct = new OrderAct(driver);
			payAct =new PayAct(driver);
			//获取产品id 
			String pid = this.getMemVal(Constant.PRODUCT_ID);
			if(pid.contains("过期")){
				Assert.fail("缓存中的产品号已过期！");
			}
			String host = "http://192.168.1.122:8080/ccigmall-web-retailer";
			if (getMemVal(Constant.ENV).equals("sit")) {
				host = "http://192.168.0.122:8080";
			}
			driver.get(host + "/itemController/toItemDetail.do?PID="
					+ pid);
			logger.info("pad 零售商收货人信息增改删-测试用例执行开始，测试用例名称是：{}", getClass().getName());
			String handleTitle = driver.getTitle();
			logger.info("获取当前的浏览器句柄是：{}", handleTitle);

			// 选择现货类型
			orderAct.clickSpotType();
			// 输入现货数量
			orderAct.inputSpotAmount();
			// 点击 加入进货单 连续暴击4次
			orderAct.pause(1);
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			// 点击 进入购物车
			orderAct.clickEnterShoppingCart();
			// 切换当前页面
			orderAct.switchToWindow(driver.getTitle());
			// 删除已选订单
			orderAct.clickDeleteButton();
			// 点击订单-删除按钮-弹窗确定
			orderAct.clickAlertConfirm();
			// 点击订单-删除按钮-弹窗确定
			orderAct.clickAlertConfirm();
			// 切换至商品详情页面-重新选择商品-加入购物车
			driver.get(host + "/itemController/toItemDetail.do?PID="
					+ pid);
			orderAct.switchToWindow(handleTitle);
			// 选择现货类型
			orderAct.clickSpotType();
			// 输入现货数量
			orderAct.inputSpotAmount();
			// 点击 加入进货单 连续暴击4次
			orderAct.pause(1);
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			orderAct.clickAddToOrderButton();
			// 点击 进入购物车
			orderAct.clickEnterShoppingCart();
			// 切换当前页面
			orderAct.switchToWindow(driver.getTitle());
			// 去结算
			orderAct.clickPayPriceButton();
			// 点击用户名
			orderAct.clickUserName(padUserName);
			// 输入用户密码
			orderAct.inputPassword(padPassword);
			orderAct.pause(3);
			// 点击登录
			orderAct.clickLogin();
			// 点击全选
			orderAct.clickCheckAll();
			orderAct.pause(1);
			// 点击第一个checkbox
			orderAct.clickFirstCheckbox();
			// 去结算
			orderAct.clickPayPriceButton();
			//
			orderAct.switchToWindow(driver.getTitle());
			/**********************************添加收货信息*****************************/
			//进入收货人信息
			orderAct.enterReceiverInfo();
			//添加收货人信息
			orderAct.addReceiverInfo();
			//输入收货人姓名
			orderAct.inputReceiverName("自动化"+new SimpleDateFormat("MMddHHmmss").format(new Date()));
			//输入收货人电话
			orderAct.inputReceiverMobile("181"+new SimpleDateFormat("yyyyMMdd").format(new Date()));
			//省 市 区
			orderAct.choseProvince("北京");
			orderAct.choseCity("北京市");
			orderAct.choseArea("朝阳区");
			//详细地址
			orderAct.inputAddressDetailsInfo("三元桥霄云中心A座12层");
			//邮政编码
			orderAct.inputPostalCode("100000");
			//收货人信息添加完成
			orderAct.Compelete();
			//确定
			orderAct.pause(3);
			orderAct.clickAlertConfirm();
			orderAct.pause(3);
			/**********************************修改收货信息*****************************/
			//修改收货信息
			orderAct.clickModify();
			/**********************************删除收货信息*****************************/
			//删除收货信息
			orderAct.clickDelReceiverInfo();
			// 给卖家留言
			orderAct.inputLeaveMessage("卖家留言");
				
			logger.info("pad 零售商收货人信息增改删-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("pad retailer ReceiverInfoManage failed ", e);
			orderAct.failScreenShot("pad retailer ReceiverInfoManage failed");
			Assert.fail("pad retailer ReceiverInfoManage failed >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("pad retailer ReceiverInfoManage failed ", e);
			orderAct.failScreenShot("pad retailer ReceiverInfoManage failed");
			throw new Exception("pad retailer ReceiverInfoManage failed >> "
					+ e.getMessage(), e);
		}

	}

}
