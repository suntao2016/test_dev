/**
 * 
 */
package com.ccigmall.auto.test.act.pc.retailer.my.assets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.retailer.my.MyIndexAct;
import com.ccigmall.auto.test.page.pc.retailer.my.assets.CouponPage;

/**
 * @author jianping.gao 优惠券
 */
public class CouponAct extends SettingActiton {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(MyIndexAct.class);

	/**
	 * 优惠券
	 */
	private CouponPage couponPage;

	/**
	 * 
	 * @param driver
	 */
	public CouponAct(WebDriver driver) {
		super(driver);
		couponPage = new CouponPage(driver);
	}

	/**
	 * 点击未使用优惠券
	 * 
	 */
	public void clickUnusedCoupon() {
		logger.info("点击未使用优惠券");
		click(couponPage.getUnusedCoupon());
	}

	/**
	 * 点击已使用优惠券
	 * 
	 */
	public void clickUsedCoupon() {
		logger.info("点击已使用优惠券");
		click(couponPage.getUnusedCoupon());
	}

	/**
	 * 已过期优惠券
	 * 
	 */
	public void clickExpiredCoupon() {
		logger.info("已过期优惠券");
		click(couponPage.getUnusedCoupon());
	}

	/**
	 * 判断第一张优惠券是否正确
	 * 
	 * @param couponId
	 * @return
	 */
	public boolean isExistCoupon(String ruleName) {
		for (int i = 0; i < couponPage.getTr().size(); i++) {
			if (isElementPresent(
					driver.findElement(By.xpath("//div[@id='ajaxApend']/div[1]/table/tbody/tr["+(i+1)+"]/td[7]")),
					ruleName)) {
				logger.info("页面优惠券来源描述 = {} , 新建的优惠券规则 = {}", driver.findElement(By.xpath("//div[@id='ajaxApend']/div[1]/table/tbody/tr["+(i+1)+"]/td[7]")).getText(),
						ruleName);
				return true;
			}
		}
		return false;
	}

}
