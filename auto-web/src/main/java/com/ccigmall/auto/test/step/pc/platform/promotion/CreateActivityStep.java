package com.ccigmall.auto.test.step.pc.platform.promotion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.platform.IndexAct;
import com.ccigmall.auto.test.act.pc.platform.promotion.ActivityListAct;
import com.ccigmall.auto.test.act.pc.platform.promotion.CreatPromotionActivityAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;
/**
 * @author chenjingli
 * 创建促销活动测试用例
 */
public class CreateActivityStep extends PlatformStep {
	/**
	 * slf4j
	 */
	public static final String actDesc = "今年二十 ******明年十八";
	public static final String actMsg = "我们广告做的好，但是不如不我们产品好";
	public static final String actName = new SimpleDateFormat("yyMMddHHmmss").format(new Date())+"活动名称";
	private final static Logger logger = LoggerFactory
			.getLogger(PlatformStep.class);
	/**
	 * 创建和列表相关动作
	 */
	protected CreatPromotionActivityAct activityAct;
	protected ActivityListAct listAct;

	/**
	 * 创建促销活动测试用例
	 * 
	 * @throws Exception
	 */
	@Test(description = "wofe创建促销活动测试用例")
	public void testCreateActivity()   {
		String ruleName = "";
		try {
			logger.info("wofe创建促销活动测试用例执行开始 ，用例名称是：{}",getClass().getName());
			activityAct = new CreatPromotionActivityAct(driver);
			listAct = new ActivityListAct(driver);
			//点击促销管理
			activityAct.clickPromotionManage();
			//点击创建活动菜单
			activityAct.clickCreateActive();
			
			//输入活动名称
			activityAct.typeActiveName(actName);
			//输入开始日期
			activityAct.typeStartTime(this.randowStringTime("start"));
			//输入结束日期
			activityAct.typeEndTime(this.randowStringTime("end"));
			//输入活动描述
			activityAct.typeDescription(actDesc);
			//输入活动广告语
			activityAct.typeActiveMsg(actMsg);
			//点击确定按钮
			activityAct.clickClickSubmit();
			//点击弹框确定
			activityAct.clickConfirm();
			//输入活动名称
			listAct.typeActiveName(actName);
			//点击查询按钮
			listAct.clickClickView();
			//点击管理规则
			listAct.clickMangerRule("glgz");
			//点击创建管理规则按钮
			listAct.clickRuleButton();
			
			ruleName = new SimpleDateFormat("yyMMddHHmmss").format(new Date())+"规则名称";
			//输入规则名称
			listAct.typeRuleName(ruleName);
			//规则名称存入缓存
			logger.info("存入缓存的规则名称是 + {}",ruleName);
			this.setMemVal(Constant.ACTRULE_NAME, ruleName);
			//输入规则描述
			listAct.typeRuleDescription(actDesc);
			listAct.clickSubmit();
			listAct.pause(1);
			activityAct.clickConfirm();
			//点击管理规则
			listAct.clickMangerRule("glzp");
			//点击{查询添加赠品}按钮
			listAct.clickQueryButton();
			
			logger.info("判断是否存在优惠券,列表优惠券个数是：{}"
					,driver.findElements(By.xpath("//table[@class='tb-promotion']/tbody/tr/td/input")).size());
			if(driver.findElements(By.xpath("//table[@class='tb-promotion']/tbody/tr/td/input")).size()!=0){
				listAct.clickFirstButton();
			}else{
				logger.error("没有优惠券，请到创建优惠券菜单中添加优惠券");
				Assert.fail("没有优惠券，请到创建优惠券菜单中添加优惠券");
			}
			//输入赠品描述
			listAct.pause(1);
			listAct.typeGiftDesc(actDesc);
			//点击确定按钮
			listAct.clickSubmit();
			//点击弹出框确定
			activityAct.clickConfirm();
			//点击返回按钮
			listAct.pause(1);
			listAct.clickRemoveButton();
			//点击启用按钮
			listAct.pause(1);
			listAct.clickStartUseing();
			//点击确定按钮
			listAct.pause(1);
			activityAct.clickConfirm();
			listAct.pause(1);
			this.publicSearchVoid();
			//点击启用这个活动
			listAct.clickStartUseing();
			//点击弹框中确定
			listAct.pause(1);
			activityAct.clickConfirm();
			this.publicSearchVoid();
			Assert.assertEquals("停用".trim(),listAct.getText(listAct.getListPage().getXpathCliStartUseing()));
			logger.info("wofe创建促销活动测试用例执行结束 ！");
		} catch (AssertionError e) {
			logger.error(Constant.TEST_PLARFORM_CREATE_ACTIVITY_FAIL, e);
			Assert.fail(Constant.TEST_PLARFORM_CREATE_ACTIVITY_FAIL + " >> "
					+ e.getMessage());
		} catch (Exception e) {
			throw new TestNGException(Constant.TEST_PLARFORM_CREATE_ACTIVITY_FAIL +">> "
					+ e.getMessage(), e);
		}
	}
	private String randowStringTime(String flag){
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		if(flag.equals("start")){
		date.setMinutes(date.getMinutes()+1);
		return sd.format(date);
		}else if(flag.equals("end")){
		date.setDate(date.getDate()+7);
		return sd.format(date);
		}
		return null;
	}
	
	private void publicSearchVoid(){
		//点击活动列表
		listAct.clickLinkCliActivityList();
		//输入活动名称
		listAct.typeActiveName(actName);
		//点击查询按钮
		listAct.clickClickView();
		listAct.pause(1);
	}
	
}
