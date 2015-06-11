package com.ccigmall.auto.test.step.pc.supplier.seller.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.act.pc.platform.buyer.order.ConsolidatedOrderAct;
import com.ccigmall.auto.test.act.pc.platform.buyer.order.toMergeOrderAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.order.SoldGoodsAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * 供应商填写合同
 * 
 * @author chenjingli
 *         <p>
 * @since 2014-1-5
 *        </P>
 *        <p>
 * @version 1.0
 *          </P>
 */
public class SupplierFillContractStep extends SupplierStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierFillContractStep.class);
	protected ContractAct contractAct;
	protected SellerIndexAct indexAct;
	protected toMergeOrderAct mergeOrderAct;
	protected SoldGoodsAct soldGoodsAct;
	/**
	 * test 供应商填写合同
	 * @throws Exception 
	 */
	@Test(description = "供应商填写合同")
	public void testFillContractStep() {    		    	
		    try{
		    	logger.info("供应商填写合同测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	contractAct = new ContractAct(driver);
		    	indexAct = new SellerIndexAct(driver);
		    	mergeOrderAct = new toMergeOrderAct(driver);
		    	soldGoodsAct = new SoldGoodsAct(driver);
		    	//点击卖家中心");
		    	indexAct.clickSellerCenter();
		    	
		    	//点击已卖出的货品按钮");
		    	indexAct.clickSoldGoods();
		    	
		    	//("输入要下单填写合同的商品采购id");
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	
		    	if(productName.equals(soldGoodsAct.getSupplierProductName())){
					//击填写和同按钮
					soldGoodsAct.clickContractButton();
				}else{
					Assert.fail("点击搜索没有搜索到指定内容");
				}
		    	
		    	logger.info("开始填写合同信息.........start");
		    	
		    	/**
		    	 * 合同内容随便填符合硬性要求就好
		    	 */
		    	contractAct.clickCheckBoxOne();
		    	contractAct.pause(1);
		    	contractAct.clickCheckBoxTwo();
		    	contractAct.pause(1);
		    	contractAct.typeSeaPort("马来西亚测试机场1");
		    	contractAct.pause(1);
		    	contractAct.typeAirPort("马来西亚测试机场2");
		    	contractAct.pause(1);
		    	contractAct.typeSeaPort2("马来西亚测试机场3");
		    	contractAct.pause(1);
		    	contractAct.typeAirPort2("马来西亚测试机场4");
		    	logger.info("点击合同提交按钮");
		    	contractAct.clickSupplierButton();
		    	logger.info("开始填写合同信息.........end");
		    	
		    	//"返回首页判断一下是否下单成功");
		    	contractAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	contractAct.clickSearchButton();
		    	//=2s
		    	contractAct.pause(2);
		    	
		    	Assert.assertEquals("等待经销商确认合同".trim(),soldGoodsAct.getSupplierGoodsStatu());
		    	logger.info("供应商填写合同测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUPPLIER_PLACE_ORDER_FAIL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_PLACE_ORDER_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_PLACE_ORDER_FAIL, e);
				throw new TestNGException("Constant.TEST_SUPPLIER_PLACE_ORDER_FAIL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
