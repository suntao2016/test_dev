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
 *  零售商商户审核
 */
public class RetailerReviewStep extends PlatformStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(RetailerReviewStep.class);

	/**
	 * 零售商商户审核
	 */
	protected MerchantAct merchantAct;
	
	@Test(description = "零售商商户审核")
	public void retialerReview(){
		try {
			merchantAct=new MerchantAct(driver);
			//用户中心
			merchantAct.clickUserCenter();
			//商户审核
			merchantAct.clickMerchant();
			//零售商
			merchantAct.clickRetailer();
			//输入零售商名称	
			String name = getMemVal(Constant.RETAILER_MERCHANT);
			merchantAct.enterMerhantName(name);
			//选择未审核状态
			merchantAct.selectMerchantSatusType("未审核");
			//点击搜索
			merchantAct.clickMerchantSearchButton();
			//判断查询结果
			if(merchantAct.checkMerchantName(name)){
				//点击查看
				merchantAct.clickMerchantView();
				//点击通过
				merchantAct.clickPass();	
				
				//用户中心
				merchantAct.clickUserCenter();
				//商户审核
				merchantAct.clickMerchant();
				//零售商
				merchantAct.clickRetailer();
				//输入零售商名称			
				merchantAct.enterMerhantName(name);
				//选择审核通过状态
				merchantAct.selectMerchantSatusType("审核通过");
				//点击搜索
				merchantAct.clickMerchantSearchButton();
				//查看状态
				merchantAct.checkMerchantStatus("审核通过");;
			}else{
				throw new TestNGException("商户审核失败，可能是商户注册失败了");
			}
			
			
		} catch (AssertionError e) {
			logger.error("零售商商户审核 ", e);
			Assert.fail("零售商商户审核 >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("零售商商户审核 ", e);
			throw new TestNGException("零售商商户审核 >> " + e.getMessage(), e);
		}
	}
}
