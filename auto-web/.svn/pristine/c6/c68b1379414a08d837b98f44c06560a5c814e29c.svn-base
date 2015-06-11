package com.ccigmall.auto.test.step.pc.platform.user.info.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.platform.user.info.base.BaseInfoAct;
import com.ccigmall.auto.test.step.pc.platform.PlatformStep;
/**
 * 
 * @author dengshuhai 
 * <p>platform -wofe用户中心-信息管理-基本信息修改
 * @since 2015-02-02
 * @version 1.0
 */
public class BaseInfoModifyStep extends PlatformStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BaseInfoModifyStep.class);
	// platform注册动作
	private BaseInfoAct baseInfoAct;
	/**
	 * platform用户中心-修改基本信息
	 * 
	 * @throws Exception
	 */
	@Test(description = "wofe platform用户中心-信息管理-修改基本信息")
	public void testModifyBaseInfo() throws Exception {
		try {
			baseInfoAct = new BaseInfoAct(driver);
			/*****************************参数准备 start**********************************/
			// 设置输入注册参数 前缀
			String text = "修改";
			Date date = new Date();
			// 时间格式yyMMddHHmm
			SimpleDateFormat sd_yyMMddHHmm = new SimpleDateFormat("yyMMddHHmm");
			// 时间戳 后缀
			String timeStamp = sd_yyMMddHHmm.format(date);
			/*****************************参数准备 end**********************************/
			logger.info(" platform wofe用户中心-基本信息修改-测试用例执行开始，测试用例名称是：{}", getClass()
					.getName());
			//点击用户中心
			baseInfoAct.clickUserCenter();
			//基本信息管理
			baseInfoAct.clickBaseInfoManage();
			//点击修改按钮
			baseInfoAct.clickModifyButton();
			//编辑头像
			baseInfoAct.uploadImg(baseInfoAct.getPath());
			//修改公司名称
			baseInfoAct.inputCompanyName(text);
			// 详细地址
			baseInfoAct.inputCompanyAddr(text+timeStamp);
			// 联系人姓名
			baseInfoAct.inputContactName(text);
			// 手机
			baseInfoAct.inputMobileNo("181" + timeStamp.substring(2));
			// 邮箱
			baseInfoAct.inputMailbox(timeStamp + "@cigmall.cn");
			// 固定电话
			baseInfoAct.inputContactTele("010-99999999");
			//传真
			baseInfoAct.inputFax(timeStamp);
			// 邮政编码
			baseInfoAct.inputPostalCode("065500");
			// 保存
			baseInfoAct.clickSaveButton();
			baseInfoAct.pause(5);
			//
			baseInfoAct.switchToWindow(driver.getTitle());
			//判断注册信息是否提交成功
			if(!baseInfoAct.isModifySuccess("065500")){
				Assert.fail("基本信息修改失败，其中邮编保存前后不一致");
			}
			logger.info(" platform wofe用户中心-基本信息修改-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("platform baseInfo modify failed ", e);
			//失败时截图
			baseInfoAct.failScreenShot("platform baseInfo modify failed");
			Assert.fail("platform baseInfo modify failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("platform baseInfo modify failed ", e);
			//失败时截图
			baseInfoAct.failScreenShot("platform baseInfo modify failed");
			throw new Exception("platform baseInfo modify failed  >> " + e.getMessage(),
					e);
		}

	}

}
