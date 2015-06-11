/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.user.info.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.platform.user.UserIndexAct;
import com.ccigmall.auto.test.page.pc.platform.user.info.base.BaseInfoPage;

/**
 * @author dengshuhai
 * 
 * @since 2015-02-07 经销商用户中心 信息管理
 */
public class BaseInfoAct extends UserIndexAct {

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
		this.type(baseInfoPage.getCompanyName(),  text);
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
		this.type(baseInfoPage.getMobile(), text);
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
	 * 输入传真
	 */
	public void inputFax(String text) {
		logger.info(" 输入传真：{}", text);
		this.type(baseInfoPage.getFax(), text);
	}
	
	/**
	 * 输入邮编
	 */
	public void inputPostalCode(String text) {
		logger.info("输入邮编：{}", text);
		this.type(baseInfoPage.getPost(), text);
	}
	/**
	 * 编辑头像
	 * 
	 * @param path
	 */
	public void uploadImg(String path) {
		click(baseInfoPage.getHeadImg());
		logger.info("上传头像:{}", path);
		robotUpload(path);
	}

	/**
	 * 点击保存按钮
	 */
	public void clickSaveButton() {
		logger.info("点击保存按钮:{}", baseInfoPage.getSaveInfoButton());
		click(baseInfoPage.getSaveInfoButton());
	}
	
	/**
	 * 点击修改按钮
	 */
	public void clickModifyButton() {
		logger.info("点击保存按钮:{}", baseInfoPage.getModifyInfoButton());
		click(baseInfoPage.getModifyInfoButton());
	}
/**
 * 判断保存前后 邮编是否一致
 * @param text 
 * @return
 */
	public boolean isModifySuccess(String text) {
		String modefiedPost =   this.getValue(baseInfoPage.getPost());
		if(text.equals(modefiedPost)){
			logger.info("获取保存后的邮编为：{}={}", modefiedPost , text);
			return true;
		}
		logger.info("获取保存后的邮编为：{}与保存前输入的{}不一致！", modefiedPost, text);
		return false;
	}

}
