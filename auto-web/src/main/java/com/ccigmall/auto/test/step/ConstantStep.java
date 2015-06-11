/**
 * 
 */
package com.ccigmall.auto.test.step;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.utils.DataProvider;
import com.ccigmall.auto.test.utils.Selenium;

/**
 * @author jianping
 *
 */
public class ConstantStep {
	
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ConstantStep.class);
	
	/**
	 * WebDriver
	 */
	protected WebDriver driver;

	/**
	 * auto test ccimgall Selenium
	 */
	protected Selenium selenium;

	/**
	 * init properties
	 */
	protected ResourceBundle bundle;

	/**
	 * 
	 */
	public Map<String, Map<String, Object>> autoMap;

	/**
	 * base url
	 */
	protected static String baseUrl = "";

	/**
	 * login name
	 */
	protected static String loginName = "";

	/**
	 * password
	 */
	protected static String password = "";

	/**
	 * 商品id
	 */
	protected String productId = "";

	/**
	 * 商品名称
	 */
	protected String productName = "";

	/**
	 * 订单编号
	 */
	protected String orderId = "";
	/**
	 * 支付号
	 */
	protected String payId = "";
	/**
	 * 采购订单号
	 */
	protected String purchaseId = "";

	/**
	 * 优惠券号
	 */
	protected String couponId = "";
	
	/**
	 * 优惠券名称
	 */
	protected String couponName = "";
	/**
	 * 活动规则名称
	 */
	protected String actruleName = "";
	
	/**
	 * 经销商名称
	 */
	protected String dealerName = "";
	
	/**
	 * 经销商注册用户
	 */
	protected String dealerUser = "";
	/**
	 * 经销商用户角色
	 */
	protected String dealerRole = "";
	
	
	/**
	 * 
	 * 主品牌
	 */
	protected String brandName="";
	
	/**
	 * 
	 * 主品牌
	 */
	protected String subBrandName="";
	
	/**
	 * 
	 * 产品线模板
	 */
	protected String productlineModle="";
	
	/**
	 * 
	 *发布类目名称
	 */
	protected String categoryName="";
	/**
	 * 
	 *展示类目名称
	 */
	protected String dispCategoryName="";
	
	/**
	 * 
	 *类目系统用户名称
	 */
	protected String categoryuserName="";
	
	/**
	 * 
	 *供应商系统新增用户
	 */
	protected String supplieruserName="";
	
	/**
	 * 
	 *供应商系统新增子供应商
	 */
	protected String subSupplier="";
	
	/**
	 * 
	 *供应商系统新增角色
	 */
	protected String supplierRole="";
	
	/**
	 * 
	 *类目系统用户名称
	 */
	protected String categoryroleName="";
	
	/**
	 * 加载共同的信息
	 */
	protected void initCommon() {
		productId = getMemVal(Constant.PRODUCT_ID);
		if (productId == null) {
			productId = "商品ID过期";
		}

		productName = getMemVal(Constant.PRODUCT_NAME);
		if (productName == null) {
			productName = "商品名称过期";
		}
		orderId = getMemVal(Constant.ORDERID);
		if (orderId == null) {
			orderId = "订单编号过期";
		}
		payId = getMemVal(Constant.PAYID);
		if (payId == null) {
			payId = "支付号过期";
		}
		purchaseId = getMemVal(Constant.PURCHASE_ID);
		if (purchaseId == null) {
			purchaseId = "采购编号过期";
		}
		dealerName = getMemVal(Constant.DEALER_NAME);
		if (dealerName == null) {
			dealerName = "经销商名称过期";
		}
		
		dealerRole = getMemVal(Constant.DEALER_ROLE);
		if (dealerRole == null) {
			dealerRole = "经销商用户角色过期";
		}
		
		dealerUser = getMemVal(Constant.DEALER_USER);
		if (dealerUser == null) {
			dealerUser = "经销商用户过期";
		}
		couponId = getMemVal(Constant.COUPON_ID);
		if (couponId == null) {
			couponId = "优惠券ID过期";
		}
		
		couponName = getMemVal(Constant.COUPON_NAME);
		if (couponName == null) {
			couponName = "优惠券名称过期";
		}
		couponName = getMemVal(Constant.ACTRULE_NAME);
		if (actruleName == null) {
			actruleName = "活动规则名称过期";
		}
		
		productlineModle = getMemVal(Constant.PRODUCTLINEMODLE);
		if (productlineModle == null) {
			productlineModle = "产品线模板过期";
		}
		
		brandName = getMemVal(Constant.BRAND_NAME);
		if (brandName == null) {
			brandName = "主品牌名称过期";
		}
		
		subBrandName = getMemVal(Constant.SUBBRAND_NAME);
		if (subBrandName == null) {
			subBrandName = "子品牌名称过期";
		}
		
		
		categoryName = getMemVal(Constant.CATEGORY_NAME);
		if (categoryName == null) {
			categoryName = "发布类目名称过期";
		}
		
		dispCategoryName = getMemVal(Constant.DISPLAY_CATEGORY_NAME);
		if (dispCategoryName == null) {
			dispCategoryName = "展示类目名称过期";
		}
		
		categoryuserName = getMemVal(Constant.CATEGORYUSER_NAME);
		if (categoryuserName == null) {
			categoryuserName = "类目名称过期";
		}
		
		categoryroleName = getMemVal(Constant.CATEGORYUSER_NAME);
		if (categoryroleName == null) {
			categoryroleName = "类目角色过期";
		}
		
		supplieruserName = getMemVal(Constant.SUPPLIERUSER_NAME);
		if (supplieruserName == null) {
			supplieruserName = "供应商用户过期";
		}
		
		subSupplier = getMemVal(Constant.SUBSUPPLIER_NAME);
		if (subSupplier == null) {
			subSupplier = "子供应商过期";
		}
		
		supplierRole = getMemVal(Constant.SUPPLIERROLE_NAME);
		if (supplierRole == null) {
			supplierRole = "供应商角色过期";
		}
		
	}

	/**
	 * 打印case的基本信息
	 */
	protected void printCaseInfo() {
		Method[] methods = this.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			Test test = methods[i].getAnnotation(Test.class);
			if (test == null) {
				continue;
			}
			StringBuilder sb = new StringBuilder("");
			if (test.description() != null) {
				sb.append("\n\ndescription = ");
				sb.append(test.description());
				String[] dependsOnMethods = test.dependsOnMethods();
				if (dependsOnMethods == null || dependsOnMethods.length == 0) {

				} else {
					for (int j = 0; j < dependsOnMethods.length; j++) {
						sb.append("\t\t dependsOnMethods = "
								+ dependsOnMethods[i]);
					}
				}
			}
			sb.append("\n");
			logger.info(sb.toString());
		}
	}
	
	
	/**
	 * get 本系统 memcahe value
	 */

	public String getMemVal(String key) {
		return (String) DataProvider.getMemcacheVal(Constant.memcachedClient,
				key, false);
	}

	/**
	 * get 被测试系统 memcahe value
	 * 
	 * @param key
	 * @param isCaptcha
	 * @return
	 */
	public String getMemVal(String key, String notIp) {
		Object o=DataProvider.getMemcacheVal(Constant.memcachedClient,
				key, true);
		if(o instanceof Integer){
			return String.valueOf(((Integer) o).intValue());
		}else{
			return (String) o;
		}
		
	}

	/**
	 * set memcahe value
	 */

	public void setMemVal(String key, String value) {
		DataProvider.setMemcacheVal(Constant.memcachedClient, key, value);
	}

}
