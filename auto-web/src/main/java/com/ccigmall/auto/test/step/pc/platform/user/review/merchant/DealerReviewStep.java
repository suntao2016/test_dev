/**
 * 
 */
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
 * @author jianping.gao
 *  经销商商户审核
 */
public class DealerReviewStep extends PlatformStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(DealerReviewStep.class);

	/**
	 * 经销商商户审核
	 */
	protected MerchantAct merchantAct;
	
	@Test(description = "经销商商户审核")
	public void retialerReview(){
		try {
			merchantAct=new MerchantAct(driver);
			//用户中心
			merchantAct.clickUserCenter();
			//商户审核
			merchantAct.clickMerchant();
			//经销商
			merchantAct.clickDealer();
			//输入经销商名称			
			merchantAct.enterMerhantName(getMemVal(Constant.DEALER_NAME));
			//选择未审核状态
			merchantAct.selectMerchantSatusType("未审核");
			//点击搜索
			merchantAct.clickMerchantSearchButton();
			//点击查看
			merchantAct.clickMerchantView();
			//点击通过
			merchantAct.clickPass();			
		} catch (AssertionError e) {
			logger.error("经销商商户审核 ", e);
			Assert.fail("经销商商户审核 >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("经销商商户审核 ", e);
			throw new TestNGException("经销商商户审核 >> " + e.getMessage(), e);
		}
	}
}
