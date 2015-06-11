package com.ccigmall.auto.test.step.pc.dealer.systemManage.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.FuturesOrderAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
/**
 * 
 * @author chenjingli
 * dealer receiving
 */
public class ConfirmReceivingStep extends DealerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ConfirmContractStep.class);
	protected FuturesOrderAct futuresOrderAct;
	/**
	 * test dealer receiving
	 * @throws Exception 
	 */
	@Test(description = "dealer receiving")
	public void testConfirmReceiving() throws Exception {    
		    try{
		    	logger.info("dealer receiving测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	//初始化所需对象
		    	futuresOrderAct = new FuturesOrderAct(driver);
		    	
		    	//点击系统管理
		    	futuresOrderAct.clickSystemManageBar();
		    	//点击期货订单
		    	futuresOrderAct.clickFuturesOrder();
		    	this.inputOrderIdOperate();
		    	
		    	//判断搜索到的商品是否是你想要的
		    	if(productName.equals(futuresOrderAct.getText(futuresOrderAct.getMergeOrderPage().getXpathGetProductName()))){
		    		//点击确认收货按钮
		    		futuresOrderAct.clickLinkConfirmReceiving();
				}else{
					Assert.fail("点击搜索没有搜索到指定内容");
				}
		    	
		    	//点击弹出框中的确定
		    	futuresOrderAct.clickAlertConfirmButton();
		    	//获取弹框中的异常信息
		    	String exceptionInfo = futuresOrderAct.getText(futuresOrderAct.getFuturesOrderPage().getXpathGetException());
		    	//判断提交时候是否存在异常
		    	if(exceptionInfo.contains("网络异常收货失败！")){
		    		logger.error("提交报网络异常，通过xpat获得弹出div框中的内容是：{}",exceptionInfo);
		    		Assert.fail("提交报错");
		    	}else{
		    		//点击弹出框中的确定
			    	futuresOrderAct.clickAlertConfirmButton();
			    	this.inputOrderIdOperate();
		    	}
		    	
		    	//=2s
		    	futuresOrderAct.pause(2);
		    	Assert.assertEquals("已收货".trim(),futuresOrderAct.getDealerProductStatu());
		    	logger.info("dealer receiving 合同测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_DEALER_RECEIPT__FIAL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_DEALER_RECEIPT__FIAL, e);
				throw new Exception("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
	}
	/**
	 * 把输入订单信息点击确定按钮提出来为了方便公共使用
	 */
	private void inputOrderIdOperate(){
		//=1s
    	futuresOrderAct.pause(1);
    	//输入订单id
    	futuresOrderAct.inputOrderId(purchaseId);
    	//点击搜索按钮
    	futuresOrderAct.clickSearchButton();
	}
}
