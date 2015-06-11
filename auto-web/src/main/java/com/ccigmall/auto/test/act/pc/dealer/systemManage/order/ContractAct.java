package com.ccigmall.auto.test.act.pc.dealer.systemManage.order;

import org.openqa.selenium.WebDriver;

import com.ccigmall.auto.test.act.pc.supplier.seller.order.SoldGoodsAct;
import com.ccigmall.auto.test.page.pc.dealer.systemManage.order.ContractPage;
import com.ccigmall.auto.test.page.pc.dealer.systemManage.order.FuturesOrderPage;
import com.ccigmall.auto.test.page.pc.platform.buyer.order.ToMergeOrderPage;
import com.ccigmall.auto.test.page.pc.supplier.seller.order.SoldGoodsPage;
/**
 * 
 * @author chenjingli
 * 经销商填写合同act
 */
public class ContractAct extends FuturesOrderAct {

	protected ContractPage contractPage;
	protected FuturesOrderPage futuresOrderPage;
	protected ToMergeOrderPage mergeOrderPage;
	protected SoldGoodsAct soldGoodsAct;
	protected SoldGoodsPage soldGoodsPage;
	public ContractAct(WebDriver driver) {
		super(driver);
		contractPage = new ContractPage(driver);
		futuresOrderPage = new FuturesOrderPage(driver);
		mergeOrderPage = new ToMergeOrderPage(driver);
		soldGoodsAct = new SoldGoodsAct(driver);
		soldGoodsPage = new SoldGoodsPage(driver);
	}
	
	public SoldGoodsPage getSoldGoodsPage() {
		return soldGoodsPage;
	}

	public FuturesOrderPage getFuturesOrderPage() {
		return futuresOrderPage;
	}

	public ContractPage getContractPage() {
		return contractPage;
	}


	public SoldGoodsAct getSoldGoodsAct() {
		return soldGoodsAct;
	}

	/**
	 * 点击单选框 支付方式
	 */
	public void clickRadioPayment() {
		click(contractPage.getXpathRadioPayment());
	}
	public ToMergeOrderPage getMergeOrderPage() {
		return mergeOrderPage;
	}

	/**
	 * 输入生效日期
	 */
	public void typeEffectiveDate(String effectiveDate) {
		type(contractPage.getIdTypeEffectiveDate(),effectiveDate);
	}
	/**
	 * 输入目的地
	 */
	public void typeDestination(String destination) {
		type(contractPage.getIdTypeDestination(),destination);
	}
	/**
	 * 输入验收日
	 */
	public void typeAcceptanceDate(String acceptanceDate) {
		type(contractPage.getIdTypeAcceptanceDate(),acceptanceDate);
	}
	/**
	 * 输入保质期
	 */
	public void typeQualityDate(String qualityDate) {
		type(contractPage.getIdTypeQualityDate(),qualityDate);
	}
	/**
	 * 输入交货结束日
	 */
	public void typeDeliveryDate(String deliveryDate) {
		type(contractPage.getIdTypeDeliveryDate(),deliveryDate);
	}
	/**
	 * 点击合同 确认填写按钮
	 */
	public void clickDealerButton() {
		click(contractPage.getXpathCliDealerButton());
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * 点击单选填写包装类型选项货物运输包装
	 */
	public void clickCheckBoxOne() {
		click(contractPage.getIdCheckBoxOne());
	}
	/**
	 * 点击货物销售包装
	 */
	public void clickCheckBoxTwo( ) {
		click(contractPage.getIdCheckBoxTwo());
	}
	/**
	 * 开始填写合同四项必填项 装运港口
	 */
	public void typeSeaPort(String seaPort) {
		type(contractPage.getIdTypeSeaPort(),seaPort);
	}
	/**
	 * 输入机场信息
	 */
	public void typeAirPort(String airPort) {
		type(contractPage.getIdTypeAirPort(),airPort);
	}
	/**
	 * 输入英文状态下 海港信息
	 */
	public void typeSeaPort2(String seaPort2) {
		type(contractPage.getIdTypeSeaPort2(),seaPort2);
	}
	/**
	 * 输入英文状态下机场信息
	 */
	public void typeAirPort2(String airPort2) {
		type(contractPage.getIdTypeAirPort2(),airPort2);
	}
	/**
	 * 点击提交合同按钮
	 */
	public void clickSupplierButton() {
		click(contractPage.getIdCliSupplierButton());
	}
	
	
	
	
	
	
	
	
	
	

	//*******************************************************经销商确认合同*****************************
	/**
	 * 点击经销商确定合同
	 */
	public void clickConfirmContract() {
		click(contractPage.getIdCliConfirmContract());
	}
}
