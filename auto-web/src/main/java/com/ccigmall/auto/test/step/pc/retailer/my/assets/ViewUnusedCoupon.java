/**
 * 
 */
package com.ccigmall.auto.test.step.pc.retailer.my.assets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.act.pc.retailer.my.assets.CouponAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;

/**
 * @author jianping.gao
 * 
 * 看未使用的是优惠券
 */
public class ViewUnusedCoupon extends RetailerStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ViewUnusedCoupon.class);
	
	/**
	 * 我的鑫网
	 */
	private MyIndexAct myIndexAct;
	
	/**
	 * 查看未使用的优惠券
	 */
	@Test(description = "查看未使用的优惠券")
	public void viewCoupon(){
		//点击我的鑫网
		indexAct.clickMyCcigmall();
		
		//点击我的资产 -- > 优惠券
		myIndexAct=new MyIndexAct(driver);
		myIndexAct.clickCoupon();
		
		//查看优惠券是否存在
		CouponAct couponAct=new CouponAct(driver);
		actruleName=getMemVal(Constant.ACTRULE_NAME);
		if(couponAct.isExistCoupon(actruleName)){
			logger.info("查看未使用的优惠券 -- 成功");
		}else{
			logger.info("查看未使用的优惠券 -- 失败");
		}		
	}
}
