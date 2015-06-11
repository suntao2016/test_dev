package com.ccigmall.auto.test.step.pc.platform.user.review.merchant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.platform.user.review.merchant.MerchantAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;

/**
 * @author zhaixiaoyue
 *  供应商商户审核
 */
public class SupplierReviewStep extends PlatformStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierReviewStep.class);

	/**
	 * 供应商商户审核
	 */
	protected MerchantAct merchantAct;
	
	@Test(description = "供应商商户审核")
	public void SupplierReview(){
		try {
			merchantAct=new MerchantAct(driver);
			//用户中心
			merchantAct.clickUserCenter();
			//商户审核
			merchantAct.clickMerchant();
			//供应商
			merchantAct.clickSupplier();
			//输入供应商名称			
			merchantAct.enterMerhantName(getMemVal(Constant.SUPPLIER_MERCHANT));
			//选择未审核状态
			merchantAct.selectMerchantSatusType("未审核");
			//点击搜索
			merchantAct.clickMerchantSearchButton();
			//点击查看
			merchantAct.clickMerchantView();
			//点击通过
			merchantAct.clickPass();
			//点击确定按钮
			
		} catch (AssertionError e) {
			logger.error("供应商商户审核 ", e);
			Assert.fail("供应商商户审核 >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("供应商商户审核 ", e);
			throw new TestNGException("供应商商户审核 >> " + e.getMessage(), e);
		}
	}
}
