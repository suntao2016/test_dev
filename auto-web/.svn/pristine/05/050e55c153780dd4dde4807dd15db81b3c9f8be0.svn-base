/**
 * 
 */
package com.ccigmall.auto.test.page.pc.retailer.my.assets;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.SettingPage;

/**
 * @author jianping.gao
 * 优惠券
 */
public class CouponPage extends SettingPage{

	/**
	 * 
	 * @param driver
	 */
	public CouponPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 未使用优惠券
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "未使用优惠券")
	private WebElement unusedCoupon;
	
	/**
	 * 已使用优惠券
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "已使用优惠券")
	private WebElement usedCoupon;
	
	/**
	 * 已过期优惠券
	 *
	 */
	@FindBy(how = How.LINK_TEXT, using = "已过期优惠券")
	private WebElement expiredCoupon;
	
	/**
	 * 第一张优惠券
	 *//*[@id="ajaxApend"]/div[1]/table/tbody/tr[1]/td[1]
	 */
	@FindBy(how = How.XPATH, using = "//tr[@class='tr-td']")
	private List<WebElement> tr;
	

	/**
	 * @return the unusedCoupon
	 */
	public WebElement getUnusedCoupon() {
		return unusedCoupon;
	}

	/**
	 * @return the usedCoupon
	 */
	public WebElement getUsedCoupon() {
		return usedCoupon;
	}

	/**
	 * @return the expiredCoupon
	 */
	public WebElement getExpiredCoupon() {
		return expiredCoupon;
	}

	/**
	 * @return the tr
	 */
	public List<WebElement> getTr() {
		return tr;
	}

	
	
	

}
