package com.ccigmall.auto.test.step.pc.dealer.systemManage.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
/**
 * 经销商-确认合同
 * 
 * @author chenjingli
 *         <p>
 * @since 2014-1-5
 *        </P>
 *        <p>
 * @version 1.0
 *          </P>
 */
public class ConfirmContractStep  extends DealerStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ConfirmContractStep.class);
	protected ContractAct contractAct;
	/**
	 * test 经销商-确认合同
	 * @throws Exception 
	 */
	@Test(description = "经销商-确认合同")
	public void testDealerPlaceOrder() throws Exception {    
		    try{
		    	logger.info("经销商-确认合同测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	contractAct = new ContractAct(driver);
		    	
		    	//点击系统管理
		    	contractAct.clickSystemManageBar();
		    	//点击期货订单
		    	contractAct.clickFuturesOrder();
		    	//输入要下单填写合同的商品采购id
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	
		    	logger.info("判断搜索到的商品是否是你想要的");
		    	if(productName.equals(contractAct.getText(contractAct.getMergeOrderPage().getXpathGetProductName()))){
					logger.info("点击确认合同");
					contractAct.clickLinkConfirmContract();
				}else{
					Assert.fail("点击搜索没有搜索到指定内容");
				}
		    	contractAct.switchToWindow(driver.getWindowHandle());
		    	
		    	logger.info("点击确认合同按钮");
		    	contractAct.clickConfirmContract();
		    	
		    	logger.info("返回首页判断一下是否下单成功");
		    	contractAct.inputOrderId(purchaseId);
		    	contractAct.clickSearchButton();
		    	
		    	contractAct.pause(2);
		    	Assert.assertEquals("等待供应商确认合同".trim(),contractAct.getText(contractAct.getFuturesOrderPage().getXpathGetFuturesStatu()));
		    	logger.info("经销商-确认合同测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_DEALER_CONFIRM_CONTRACT_ORDER_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_DEALER_CONFIRM_CONTRACT_ORDER_FAIL, e);
				throw new Exception("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
