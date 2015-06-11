package com.ccigmall.auto.test.step.pc.supplier.seller.order;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.SpotOrderAct;
import com.ccigmall.auto.test.act.pc.supplier.IndexAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.order.SoldGoodsAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.page.pc.supplier.seller.order.SoldGoodsPage;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * 
 * @author chenjingli
 * 供应商确认合同
 */
public class ConfirmContractStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierFillContractStep.class);
	protected ContractAct contractAct;
	/**
	 * test test pc supplier 确认合同
	 * @throws Exception 
	 */
	@Test(description = "test pc supplier 确认合同")
	public void testFillContractStep()  {    		    	
		    try{
		    	logger.info("test pc supplier 确认合同测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	contractAct = new ContractAct(driver);
		    	//点击卖家中心
		    	contractAct.getSoldGoodsAct().clickSellerCenter();
		    	//点击已卖出的货品
		    	contractAct.getSoldGoodsAct().clickSoldGoods();
		    	//输入要下单填写合同的商品采购id
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	logger.info("判断搜索到的商品是否是你想要的");
		    	if(productName.equals(contractAct.getText(contractAct.getSoldGoodsPage().getXpathGetProductName()))){
		    		//点击确认合同按钮
		    		contractAct.clickLinkConfirmContract();
				}else{
					Assert.fail("点击搜索没有搜索到指定内容");
				}
		    	//切换窗口
		    	contractAct.switchToWindow(driver.getWindowHandle());
		    	//点击确认合同按钮
		    	contractAct.clickConfirmContract();
		    	//点击弹出框中的确定
		    	contractAct.clickAlertConfirmButton();
		    	//返回首页判断一下是否下单成功
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	//=2秒
		    	contractAct.pause(2);
		    	Assert.assertEquals("待发货".trim(),contractAct.getText(contractAct.getSoldGoodsPage().getXpathGetGoodsStatu()));
		    	logger.info("test pc supplier 确认合同测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUPPLIER_CONFIRM_CONTRACT_ORDER_FAIL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_CONFIRM_CONTRACT_ORDER_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_CONFIRM_CONTRACT_ORDER_FAIL, e);
				throw new TestNGException("Constant.TTEST_SUPPLIER_CONFIRM_CONTRACT_ORDER_FAIL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
