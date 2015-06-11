package com.ccigmall.auto.test.constant;

import net.rubyeye.xmemcached.MemcachedClient;

public class Constant {
	/**
	 * memcached google
	 */
	public static MemcachedClient memcachedClient;

	/**
	 * login
	 */
	public static String BASEURL = "baseurl";
	public static String LOGINNAME = "loginname";
	public static String PASSWWORD = "password";
	public static String DRIVER="auto_driver";
	

	/**
	 * system
	 */
	public static String SUPPLIER = "supplier";
	public static String RETAILER = "retailer";
	public static String DEALER = "dealer";
	public static String PLATFORM = "platform";
	public static String CATEGORY = "category";
	/**
	 * regress param
	 */
	public static String PRODUCT_ID = "auto_product_id";
	public static String PRODUCT_NAME = "auto_product_name";
	public static String ORDERID = "auto_order_id";
	public static String PAYID = "auto_pay_id";
	public static String PURCHASE_ID = "auto_purchase_id";
	public static String DEALER_NAME = "auto_dealer_name";//经销商注册名称
	public static String DEALER_USER = "auto_dealer_user";//经销商新增用户
	public static String DEALER_ROLE = "auto_dealer_role";//经销商新增角色
	public static String COUPON_ID = "auto_coupon_id";
	public static String COUPON_NAME ="auto_coupon_name";
	public static String ACTRULE_NAME ="auto_actrule_name";
	public static String SUPPLIER_MERCHANT = "auto_supplier_merchant";
	public static String RETAILER_MERCHANT="auto_retailer_merchant";
	public static String BRAND_NAME="auto_category_brand";
	public static String SUBBRAND_NAME="auto_category_subbrand";
	public static String PRODUCTLINEMODLE="auto_productline";
	public static String CATEGORYUSER_NAME="auto_categoryuser"; //类目系统新增用户
	public static String CATEGORYROLE_NAME="auto_categoryrole";  //类目系统新增角色
	public static String SUPPLIERUSER_NAME="auto_supplieruser"; //供应商系统新增用户
	public static String SUBSUPPLIER_NAME="auto_subsupplier"; //供应商系统新增子供应商
	public static String SUPPLIERROLE_NAME="auto_supplierrole"; //供应商系统新增角色
	public static String CATEGORY_NAME="auto_categoryName";	//发布类目名称
	public static String DISPLAY_CATEGORY_NAME="auto_dispCategoryName";	//展示类目名称
	/**
	 * jdbc
	 */
	public static String JDBC_URL = "auto_jdbc_url";
	public static String JDBC_NAME = "auto_jdbc_name";
	public static String JDBC_PASSWORD = "auto_jdbc_password";
	/**
	 * switch true： 默认取memched中的值 false：默认的值
	 */
	public static String SWITCH = "auto_switch";
	public static String ENV="auto_env";
	public static String BROWSER="auto_browser";
	public static String SINGLETON="auto_singleton";


	
	
	/**
	 * wofe
	 */
	public static final String TEST_PLARFORM_CREATE_ACTIVITY_FAIL ="wofe创建活动测试用例失败";
	public static final String TEST_PLATFORM_SINGLEHE__FIAL = "wofo合单的测试用例执行 失败 ！";
	public static final String TEST_PLATFORM_SINGLE__FIAL = "wofo分单的测试用例执行 失败 ！";
	public static final String TEST_PLARFORM_PLATFORM_TEST_FAIL = "wofe催缴余款测试用例失败！";
	public static final String TEST_PLATFORM_BRAND_AUDIT__FIAL = "wofe -- 用户中心 -- 审核管理 -- 品牌审核测试用例失败！";
	
	
	/**
	 * retailer
	 */
	public static final String TEST_SUBMITORDER_SEARCH__FIAL = "搜索商品正常下单并提交到收银台失败";
	public static final String TEST_RETAILER_REGIST_RETAILER__FIAL = "零售商注册用户失败！";
	public static final String TEST_RETAILER_BLANCE_PAYMENT_TEST_FAIL = "pc retailer 零售商支付余款用例失败！";
	public static final String TEST_RETAILER_CANCEL_ORDER_FAIL = "pc retailer 我的鑫网-我的订单-取消订单用例失败！";
	public static final String TEST_RETAILER_CONTACT_CUSTOMER_FAIL = "pc 我的鑫网-客户服务-联系客服用例失败！";
	public static final String TEST_RETAILER_ADD_NEW_ROLE_FAIL = "我的鑫网-我的订单-账户中心-新增角色用例失败！";
	public static final String TEST_RETAILER_DEL_ROLE_FAIL = "我的鑫网-我的订单-账户中心-删除角色用例失败！";
	public static final String TEST_RETAILER_UPDATE_ROLE_FAIL = "我的鑫网-我的订单-账户中心-修改角色用例失败！";
	public static final String TEST_RETAILER_ADD_PRIVILEGE_FOR_ROLE_FAIL = "我的鑫网-我的订单-账户中心-为角色分配权限用例失败！";
	public static final String TEST_RETAILER_ADD_USER_FAIL = "我的鑫网-我的订单-账户中心-用户管理-新增用户用例失败！";
	public static final String TEST_RETAILER_DEL_USER_FAIL = "我的鑫网-我的订单-账户中心-用户管理-删除用户用例失败！";
	public static final String TEST_RETAILER_UPDATE_USER_FAIL = "我的鑫网-我的订单-账户中心-用户管理-修改用户用例失败！";
	public static final String TEST_RETAILER_UPDATE_BUSINESS_INFO_FAIL = "我的鑫网-我的订单-账户中心-修改商户信息用例失败！";
	public static final String TEST_RETAILER_ADD_SHOPPING_CART_FAIL = "零售商--下单-加入购物车测试用例执行失败！";
	public static final String TEST_RETAILER_ADD_FUTURE_SHOPPING_CART_FAIL = "零售商--期货下单-加入购物车测试用例执行失败！";
	/**
	 * dealer
	 */
	public static final String TEST_DEALER_PLACE_ORDER__FIAL = "经销商下单填写合同测试失败 ！";
	public static final String TEST_DEALER_CONFIRM_CONTRACT_ORDER_FAIL = "经销商确认合同测试失败！";
	public static final String TEST_DEALER_RECEIPT__FIAL = "dealer reveiving 测试用例执行失败 ！";
	
	/**
	 * supplier
	 */
	public static final String TEST_SUPPLIER_PLACE_ORDER_FAIL =	"pc supplier 填写合同测试失败！";
	public static final String TEST_SUPPLIER_CONFIRM_CONTRACT_ORDER_FAIL =	"pc supplier 确认合同测试失败！";
	public static final String TEST_DEALER_SEND_GOODS_ORDER_FAIL =	"供应商发货测试失败！";
	public static final String TEST_SUPPLIER_NEW_BRAND_FAIL =	"supplier 品牌管理-新建品牌测试用例失败！";
	public static final String TEST_SUPPLIER_DEL_BRAND_FAIL =	"supplier 品牌管理-删除品牌测试用例失败！";
	public static final String TEST_SUPPLIER_UPDATE_BRAND_FAIL =	"supplier 品牌管理-修改测试用例失败！";
	public static final String TEST_SUPPLIER_SEARCH_WAITING_CONFIRM_FAIL =	"test pc supplier 已卖出的物品--所有订单测试用例执行失败！";
	public static final String TEST_SUPPLIER_WAITING_SHIP_FAIL =	"test pc supplier 已卖出的物品--等待发货测试用例执行失败！";
	public static final String TEST_SUPPLIER_SHIPED_GOODS_FAIL =	"test pc supplier 已卖出的物品--已发货测试用例执行失败！";
	public static final String TEST_SUPPLIER_COMPLETED_GOODS_FAIL =	"test pc supplier 已卖出的物品--已完成测试用例执行失败！";
	public static final String TEST_SUPPLIER_UPDATE_BASE_INFO_FAIL = "test pc supplier 用户中心--信息管理--基本信息管理--修改基本信息测试用例执行失败！";
}
