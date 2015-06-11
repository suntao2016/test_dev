package com.ccigmall.auto.test.step.pc.dealer.user.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ccigmall.auto.test.act.pc.dealer.user.base.BaseInfoAct;
import com.ccigmall.auto.test.step.pc.dealer.DealerStep;
/**
 * 
 * @author dengshuhai 
 * <p>经销商基本信息修改
 * @since 2015-1-22
 * @version 1.0
 */
public class BaseInfoModifyStep extends DealerStep {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BaseInfoModifyStep.class);
	// 经销商注册动作
	private BaseInfoAct baseInfoAct;
	/**
	 * 经销商用户中心-修改基本信息
	 * 
	 * @throws Exception
	 */
	@Test(description = "dealer 经销商用户中心-修改基本信息")
	public void testModifyBaseInfo() throws Exception {
		try {
			baseInfoAct = new BaseInfoAct(driver);
			/*****************************参数准备 start**********************************/
			// 设置输入注册参数 前缀
			String text = "修改";
			Date date = new Date();
			// 时间格式yyMMddHHmm
			SimpleDateFormat sd_yyMMddHHmm = new SimpleDateFormat("yyMMddHHmm");
			// 时间格式yyyy-MM-dd
			SimpleDateFormat sd_yyyy_MM_dd = new SimpleDateFormat("yyyy-MM-dd");
			// 时间戳 后缀
			String timeStamp = sd_yyMMddHHmm.format(date);
			// 有效期开始时间
			String startDate = sd_yyyy_MM_dd.format(date);
			// +1年
			date.setYear(date.getYear() + 1);
			// 有效期截止时间
			String endDate = sd_yyyy_MM_dd.format(date);
			/*****************************参数准备 end**********************************/
			logger.info("dealer 经销商用户中心-基本信息修改-测试用例执行开始，测试用例名称是：{}", getClass()
					.getName());
			//点击用户中心
			baseInfoAct.UserCenter();
			//基本信息管理
			baseInfoAct.clickBaseInfoManage();
			//点击修改按钮
			baseInfoAct.clickModifyButton();
			//编辑头像
			baseInfoAct.uploadImg(baseInfoAct.getPath());
			// 输入公司名称
			//baseInfoAct.inputCompanyName(text + timeStamp);
			// 输入法人姓名
			baseInfoAct.inputLegalName(text);
			// 法人证件号码
			baseInfoAct.inputLegalIdNum("13102220" + timeStamp);
			// 详细地址
			baseInfoAct.inputCompanyAddr(text);
			// 联系人姓名
			baseInfoAct.inputContactName(text);
			// 手机
			baseInfoAct.inputMobileNo("181" + timeStamp.substring(2));
			// 邮箱
			baseInfoAct.inputMailbox(timeStamp + "@cigmall.cn");
			// 固定电话
			baseInfoAct.inputContactTele("010-99999999");
			// 邮政编码
			baseInfoAct.inputPostalCode("065500");
			//营业执照年检日期
			baseInfoAct.inputBisLicsCheckDate("2030");
			//货物收发货人报关注册登记证有效日期
			baseInfoAct.inputDate(endDate);
			// 食品流通许可证有效期限Start
			baseInfoAct.inputStartDate(startDate);
			// 食品流通许可证有效期限End
			baseInfoAct.inputEndDate(endDate);
			// 营业执照
			baseInfoAct.uploadBusinessLicense(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 税务登记证
			baseInfoAct.uploadTaxLicense(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 开户许可证
			baseInfoAct.uploadAccountLicenses(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 一般纳税人资格证明
			baseInfoAct.uploadTaxpayerCertificate(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 法人代表身份证明文件
			baseInfoAct.uploadLegalCertificate(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 对外贸易经营者备案登记表
			baseInfoAct.uploadExportRegistration(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 进出口货物收发货人报关注册登记证
			baseInfoAct.uploadGoodsRegistration(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 食品流通许可证
			baseInfoAct.uploadFoodCirculation(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 进口食品/化妆品收货人检验检疫备案登记证
			baseInfoAct.uploadImportRegistration(baseInfoAct.getPath());
			baseInfoAct.pause(1);
			// 酒类经营许可证/酒类流通备案登记表
			 baseInfoAct.uploadLiquorLicense(baseInfoAct.getPath());
			 baseInfoAct.pause(1);
			// 保健食品卫生许可证（经营许可证)
			 baseInfoAct.uploadFoodLicense(baseInfoAct.getPath());
			 baseInfoAct.pause(1);
			// 保存
			baseInfoAct.clickSaveButton();
			baseInfoAct.pause(5);
			//
			baseInfoAct.switchToWindow(driver.getTitle());
			//判断注册信息是否提交成功
			Assert.assertTrue(baseInfoAct.getModifiedLegalPerson().contains("修改"), "修改成功！");
			logger.info("dealer 经销商用户中心-基本信息修改-测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("dealer baseInfo modify failed ", e);
			//失败时截图
			baseInfoAct.failScreenShot("dealer baseInfo modify failed");
			Assert.fail("dealer baseInfo modify failed  >> " + e.getMessage());
		} catch (Exception e) {
			logger.error("dealer baseInfo modify failed ", e);
			//失败时截图
			baseInfoAct.failScreenShot("dealer baseInfo modify failed");
			throw new Exception("dealer baseInfo modify failed  >> " + e.getMessage(),
					e);
		}

	}

}
