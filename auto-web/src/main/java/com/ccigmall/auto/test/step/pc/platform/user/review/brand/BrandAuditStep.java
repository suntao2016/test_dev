package com.ccigmall.auto.test.step.pc.platform.user.review.brand;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;
import com.ccigmall.auto.test.act.pc.platform.user.review.brand.BrandAuditAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.brand.BrandManagementAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;

/**
 * 
 * @author chenjingli
 * wofe -- 用户中心 -- 审核管理 -- 品牌审核step
 */
public class BrandAuditStep extends PlatformStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BrandAuditAct.class);
	
	protected BrandAuditAct auditAct;
	protected BrandManagementAct managementAct;

	@Test(description = "wofe -- 用户中心 -- 审核管理 -- 品牌审核")
	public void retialerReview() {
		try {
			logger.info("wofe -- 用户中心 -- 审核管理 -- 品牌审核step测试用例执行开始，测试用例名称是：{}",getClass().getName());
			/**
			 * 初始化审核 和 supplier 品牌的动作对象
			 */
			auditAct=new BrandAuditAct(driver);
			managementAct=new BrandManagementAct(driver);
			//用户中心
			auditAct.clickUserCenter();
			//点击品牌审核
			auditAct.clickBrand();
			
			this.publicSearchCondition("wsh");
			//判断搜索结果的个数 循环点击 查看按钮
			int number = auditAct.getViewNumber();
			
			if(0 != number){
				for (int i = 1; i <= number; i++) {
					auditAct.pause(1);
					auditAct.clickFirstView();
//					String brandType = auditAct.getBrandType();
//					if("普通代理".trim().equals(brandType)){
//						auditAct.pause(1);
//						//点击痛过按钮
//						auditAct.clickPassButton();
//						auditAct.pause(1);
//						auditAct.clickAlertSubmitButton();
//						auditAct.pause(1);
//						if(auditAct.getAlertInfo().contains("审核成功")){
//							//点击弹出框确定
//							auditAct.clickAlertConfirm();
//							auditAct.pause(1);
//						}else{
//							logger.error("审核报错，获得报错的内容是：{}",auditAct.getAlertInfo());
//							Assert.fail("审核报错");
//						}
//						//点击返回按钮
//						auditAct.clickRuturnButton();
//					}else{
//						auditAct.pause(1);
//						//点击痛过按钮
//						auditAct.clickPassButton();
//						auditAct.pause(1);
//						//点击弹出框确定
//						auditAct.clickAlertConfirm();
//						//点击返回按钮
//						auditAct.clickRuturnButton();
//					}
					//点击痛过按钮
					auditAct.clickPassButton();
					//点击提交
					auditAct.clickSubmitButton();
					if(auditAct.getAlertInfo().contains("审核成功")){
						
						//点击弹出框确定
						auditAct.clickAlertConfirm();
						auditAct.pause(1);
					}else{
						logger.error("审核报错，获得报错的内容是：{}",auditAct.getAlertInfo());
						Assert.fail("审核报错");
					}
					//点击返回按钮
					auditAct.clickRuturnButton();
				}
			}else{
				logger.error("没有查到对应结果,检查新建模板是否成功");
				Assert.fail("没有查到对应结果,检查新建模板是否成功");
			}
			this.publicSearchCondition("tg");
			
			auditAct.pause(1);
			Assert.assertEquals("审核通过".trim(),auditAct.getBrandStatus().trim());
			logger.info("wofe -- 用户中心 -- 审核管理 -- 品牌审核step测试用例执行结束 ！");
		}catch (AssertionError e) {
			logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
			Assert.fail(Constant.TEST_PLATFORM_BRAND_AUDIT__FIAL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error(Constant.TEST_PLATFORM_BRAND_AUDIT__FIAL, e);
			throw new TestNGException("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
					+ e.getMessage(), e);
		}
	}
	/**
	 * 公共的搜索方法 flag: wsh:未审核 tg:通过
	 */
	private void publicSearchCondition(String flag){
		//选择 审核状态
		if("wsh".equals(flag)){
			//输入品牌名称
			auditAct.typeBrandName(brandName);
			
			//输入供应商名称，从supplier BrandManagementAct对象中取得
			auditAct.typeSupplierName(dealerName);
			
			//输入开始创建时间 ，从supplier BrandManagementAct对象中取得
			String startTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			auditAct.typeStartTime(startTime);
			auditAct.selectStatus("未审核".trim());
		}else if("tg".equals(flag)){
			auditAct.selectStatus("通过".trim());
		}
		//点击搜索按钮
		auditAct.clickSearchButton();
	}
}
