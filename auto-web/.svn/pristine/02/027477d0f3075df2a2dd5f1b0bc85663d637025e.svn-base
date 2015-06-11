/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.user.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.act.pc.dealer.user.UserCenterAct;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;
import com.ccigmall.auto.test.page.pc.dealer.LoginPage;
import com.ccigmall.auto.test.page.pc.dealer.user.RegisterPage;
import com.ccigmall.auto.test.page.pc.dealer.user.UserCenterPage;
import com.ccigmall.auto.test.page.pc.dealer.user.base.BaseInfoPage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-07 经销商用户中心 信息管理
 */
public class BaseInfoAct extends UserCenterAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(BaseInfoAct.class);

	/**
	 * 用户中心页面
	 * 
	 */
	private BaseInfoPage baseInfoPage;

	/**
	 * 
	 * @param driver
	 */
	public BaseInfoAct(WebDriver driver) {
		super(driver);
		baseInfoPage = new BaseInfoPage(driver);
	}

	/**
	 * 输入公司名称
	 */
	public void inputCompanyName(String text) {
		logger.info("输入公司名称：{}", text);
		this.type(baseInfoPage.getCompanyName(), baseInfoPage.getCompanyName()
				.getText() + text);
	}

	/**
	 * 输入法人姓名
	 */
	public void inputLegalName(String text) {
		logger.info("输入法人姓名：{}", text);
		this.type(baseInfoPage.getLegalPerson(), text);
	}

	/**
	 * 输入法人证件号
	 */
	public void inputLegalIdNum(String text) {
		logger.info("输入法人证件号：{}", text);
		this.type(baseInfoPage.getLegalPersonNo(), text);
	}

	/**
	 * 输入地址
	 */
	public void inputCompanyAddr(String text) {
		logger.info("输入地址：{}", text);
		this.type(baseInfoPage.getAddress(), text);
	}

	/**
	 * 输入联系人
	 */
	public void inputContactName(String text) {
		logger.info("输入联系人：{}", text);
		this.type(baseInfoPage.getContactor(), text);
	}

	/**
	 * 输入手机
	 */
	public void inputMobileNo(String text) {
		logger.info("输入手机：{}", text);
		this.type(baseInfoPage.getMobileNo(), text);
	}

	/**
	 * 输入邮箱
	 */
	public void inputMailbox(String text) {
		logger.info("输入邮箱：{}", text);
		this.type(baseInfoPage.getEmail(), text);
	}

	/**
	 * 输入电话
	 */
	public void inputContactTele(String text) {
		logger.info("输入座机电话：{}", text);
		this.type(baseInfoPage.getPhone(), text);
	}

	/**
	 * 输入邮编
	 */
	public void inputPostalCode(String text) {
		logger.info("输入邮编：{}", text);
		this.type(baseInfoPage.getPostalCode(), text);

	}

	/**
	 * 编辑头像
	 * 
	 * @param path
	 */
	public void uploadImg(String path) {
		click(baseInfoPage.getUploadImg());
		logger.info("上传头像:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑营业执照
	 * 
	 * @param path
	 */
	public void uploadBusinessLicense(String path) {
		click(baseInfoPage.getBusinessLicenseUrl1());
		logger.info("上传营业执照:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑税务登记证
	 * 
	 * @param path
	 */
	public void uploadTaxLicense(String path) {
		click(baseInfoPage.getTaxLicenseUrl1());
		logger.info("上传税务登记证:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑开户许可证
	 * 
	 * @param path
	 */
	public void uploadAccountLicenses(String path) {
		click(baseInfoPage.getAccountLicensesUrl1());
		logger.info("上传开户许可证:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑一般纳税人资格证明
	 * 
	 * @param path
	 */
	public void uploadTaxpayerCertificate(String path) {
		click(baseInfoPage.getTaxpayerCertificateUrl1());
		logger.info("上传一般纳税人资格证明:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑法人代表身份证明文件
	 * 
	 * @param path
	 */
	public void uploadLegalCertificate(String path) {
		click(baseInfoPage.getLegalCertificateUrl1());
		logger.info("上传法人代表身份证明文件:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑 对外贸易经营者备案登记表
	 * 
	 * @param path
	 */
	public void uploadExportRegistration(String path) {
		click(baseInfoPage.getExportRegistrationUrl1());
		logger.info("上传对外贸易经营者备案登记表:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑 进出口货物收发货人报关注册登记证
	 * 
	 * @param path
	 */
	public void uploadGoodsRegistration(String path) {
		click(baseInfoPage.getGoodsRegistrationUrl1());
		logger.info("上传进出口货物收发货人报关注册登记证:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑 食品流通许可证
	 * 
	 * @param path
	 */
	public void uploadFoodCirculation(String path) {
		click(baseInfoPage.getFoodCirculationUrl1());
		logger.info("上传食品流通许可证:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑 进口食品/化妆品收货人检验检疫备案登记证
	 * 
	 * @param path
	 */
	public void uploadImportRegistration(String path) {
		click(baseInfoPage.getImportRegistrationUrl1());
		logger.info("上传进口食品/化妆品收货人检验检疫备案登记证:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑 酒类经营许可证/酒类流通备案登记表
	 * 
	 * @param path
	 */
	public void uploadLiquorLicense(String path) {
		click(baseInfoPage.getLiquorLicenseUrl1());
		logger.info("上传酒类经营许可证/酒类流通备案登记表:{}", path);
		robotUpload(path);
	}

	/**
	 * 编辑 保健食品卫生许可证（经营许可证）
	 * 
	 * @param path
	 */
	public void uploadFoodLicense(String path) {
		click(baseInfoPage.getFoodLicenseUrl1());
		logger.info("上传保健食品卫生许可证（经营许可证）:{}", path);
		robotUpload(path);
	}

	/**
	 * 点击保存按钮
	 */
	public void clickSaveButton() {
		logger.info("点击保存按钮:{}", baseInfoPage.getSaveButton());
		click(baseInfoPage.getSaveButton());
	}

	/**
	 * 点击保存按钮
	 */
	public void clickModifyButton() {
		logger.info("点击修改按钮:{}", baseInfoPage.getModifyButton());
		click(baseInfoPage.getModifyButton());
	}

	/**
	 * 获取修改后的公司名称
	 * 
	 * @return
	 */
	public String getModifiedCompanyName() {
		String modifiedName = baseInfoPage.getCompanyName().getAttribute("value");
		logger.info("获取修改后的公司名称:{}", modifiedName);
		return modifiedName;
	}
	/**
	 * 获取修改后的法人名称
	 * 
	 * @return
	 */
	public String getModifiedLegalPerson() {
		String modifiedName = baseInfoPage.getLegalPerson().getAttribute("value");
		logger.info("获取修改后的法人名称:{}", modifiedName);
		return modifiedName;
	}

	/**
	 * 输入食品流通许可证有效期限 开始
	 * 
	 * @param startDate
	 */
	public void inputStartDate(String startDate) {
		logger.info("输入食品流通许可证有效期限 开始:{}", startDate);
		type(baseInfoPage.getStartDate(), startDate);
	}

	/**
	 * 输入食品流通许可证有效期限 结束
	 * 
	 * @param startDate
	 */
	public void inputEndDate(String endDate) {
		logger.info("输入食品流通许可证有效期限 结束:{}", endDate);
		type(baseInfoPage.getEndDate(), endDate);
	}

	/**
	 * 货物收发货人报关注册登记证有效日期
	 * 
	 * @param Date
	 */
	public void inputDate(String Date) {
		logger.info(" 货物收发货人报关注册登记证有效日期:{}", Date);
		type(baseInfoPage.getGoodsRegistrationTime(), Date);
	}

	/**
	 * 输入营业执照年检日期
	 * 
	 * @param Date
	 */
	public void inputBisLicsCheckDate(String Date) {
		logger.info(" 输入营业执照年检日期:{}", Date);
		new Select(baseInfoPage.getBusnessLicenseTime())
				.selectByVisibleText(Date);
	}

}
