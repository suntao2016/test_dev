package com.ccigmall.auto.test.act.pc.supplier.seller.order;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.order.SoldGoodsPage;
/**
 * 
 * @author chenjingli
 * 已售出货品 act
 */
public class SoldGoodsAct extends SellerIndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SoldGoodsAct.class);
	protected SoldGoodsPage page;
	public SoldGoodsAct(WebDriver driver) {
		super(driver);
		page = new SoldGoodsPage(driver);
	}
	/**
	 * 点击填写合同 按钮
	 */
	public void clickContractButton(){
		logger.info("点击填写和同按钮");
		click(page.getLinkCliContractButton());
	}
	public SoldGoodsPage getPage() {
		return page;
	}
	/**
	 * 点击确认发货按钮
	 */
	public void clickShipingButton(){
		logger.info("点击确认发货按钮");
		click(page.getLinkCliShipingButton());
	}
	/**
	 * 获得supplier产品列表的产品名称
	 */
	public String getSupplierProductName(){
		logger.info("获得supplier产品列表的产品名称:{}",getText((page.getXpathGetProductName())));
		return this.getText((page.getXpathGetProductName()));
	}
	
	/**
	 * 获得supplier产品列表的产品名称
	 */
	public String getSupplierGoodsStatu(){
		logger.info("获得supplier产品列表的产品名称:{}",getText((page.getXpathGetGoodsStatu())));
		return this.getText((page.getXpathGetGoodsStatu()));
	}
}
