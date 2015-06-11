package com.ccigmall.auto.test.step.pc.supplier.seller.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.product.GoodsListAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * 
 * @author chenjingli
 * 搜索 已卖出物品--等待确认
 */
public class WaitingConfirmGoodsStep extends SupplierStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierFillContractStep.class);
	protected ContractAct contractAct;
	protected GoodsListAct listAct;
	/**
	 * test test pc supplier 已卖出的物品--等待确认
	 * @throws Exception 
	 */
	@Test(description = "test pc supplier 已卖出的物品--等待确认")
	public void testWaitingConfirm()   {    		    	
		    try{
		    	logger.info("test pc supplier 已卖出的物品--等待确认测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	contractAct = new ContractAct(driver);
		    	listAct = new GoodsListAct(driver);
		    	//点击卖家中心
		    	contractAct.getSoldGoodsAct().clickSellerCenter();
		    	//点击已卖出的货品
		    	contractAct.getSoldGoodsAct().clickSoldGoods();
		    	//点击等待确认
		    	listAct.clickWaitingConfirm();
		    	//输入要下单填写合同的商品采购id
		    	contractAct.inputOrderId(purchaseId);
		    	//输入经销商名称
		    	listAct.typeDealerName(dealerName);
		    	//输入商品名称
		    	listAct.typeGoodsName(productName);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	//=2秒
		    	contractAct.pause(2);
		    	
		    	String statu = contractAct.getText(contractAct.getSoldGoodsPage().getXpathGetGoodsStatu()).trim();
		    	if(statu.contains("等待经销商确认合同") || statu.contains("待填写合同")){
		    		Assert.assertFalse(false);
		    	}else{
		    		Assert.assertFalse(true);
		    	}
		    	logger.info("test pc supplier 已卖出的物品--等待确定订单测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUPPLIER_SEARCH_WAITING_CONFIRM_FAIL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_SEARCH_WAITING_CONFIRM_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_SEARCH_WAITING_CONFIRM_FAIL, e);
				throw new TestNGException("Constant.TEST_SUPPLIER_SEARCH_WAITING_CONFIRM_FAIL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
