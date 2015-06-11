package com.ccigmall.auto.test.step.pc.dealer.systemManage.order;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.act.pc.platform.buyer.order.ConsolidatedOrderAct;
import com.ccigmall.auto.test.act.pc.platform.buyer.order.toMergeOrderAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
/**
 * 经销商-经销商下单填写合同
 * 
 * @author chenjingli
 *         <p>
 * @since 2014-1-5
 *        </P>
 *        <p>
 * @version 1.0
 *          </P>
 */
public class DealerContractStep extends DealerStep {
	/*
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(DealerContractStep.class);
	protected ContractAct contractAct;
	protected toMergeOrderAct mergeOrderAct;
	protected ConsolidatedOrderAct orderAct;
	/**
	 * test 经销商下单填写合同
	 * @throws Exception 
	 */
	@Test(description = "经销商下单填写合同")
	public void testDealerPlaceOrder() throws Exception {    		    	
		    try{
		    	logger.info("经销商下单填写合同测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	contractAct = new ContractAct(driver);
		    	mergeOrderAct = new toMergeOrderAct(driver);
		    	orderAct = new ConsolidatedOrderAct(driver);
		    	//点击系统管理
		    	contractAct.clickSystemManageBar();
		    	//点击期货订单
		    	contractAct.clickFuturesOrder();
		    	//输入要下单填写合同的商品采购id
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	//判断搜索到的商品是否是你想要的
		    	if(productName.equals(mergeOrderAct.getSearchProductName())){
		    		//点击下单按钮
		    		contractAct.clickLinkPlaceOrder();
				}else{
					Assert.fail("点击搜索没有搜索到指定内容");
				}
		    	contractAct.switchToWindow(driver.getWindowHandle());
		    	
		    	logger.info("选择默认地址,点击提交订单按钮");
		    	driver.findElement(By.xpath("//input[@value='提交订单']")).click();
		    	
		    	logger.info("开始填写合同信息.........start");
		    	/**
		    	 * 合同内容随便填符合硬性要求就好
		    	 */
		    	contractAct.clickRadioPayment();
		    	contractAct.pause(1);
		    	contractAct.typeEffectiveDate("30");
		    	contractAct.pause(1);
		    	contractAct.typeDestination("test机场");
		    	contractAct.pause(1);
		    	contractAct.typeQualityDate("30");
		    	contractAct.pause(1);
		    	contractAct.typeAcceptanceDate("2");
		    	contractAct.pause(1);
		    	contractAct.typeDeliveryDate("30");
		    	logger.info("点击合同提交按钮");
		    	contractAct.clickDealerButton();
		    	logger.info("开始填写合同信息.........end");
		    	
		    	//输入要下单填写合同的商品采购id
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	//=2s
		    	contractAct.pause(2);
		    	String staString = contractAct.getText(contractAct.getFuturesOrderPage().getXpathGetFuturesStatu());
		    	Assert.assertEquals("等待供应商填写合同".trim(),staString);
		    	logger.info("经销商下单填写合同测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_DEALER_PLACE_ORDER__FIAL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_DEALER_PLACE_ORDER__FIAL, e);
				throw new Exception("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
