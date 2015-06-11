package com.ccigmall.auto.test.act.pc.supplier.user.baseinfo;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.IndexAct;
import com.ccigmall.auto.test.act.pc.supplier.LoginAct;
import com.ccigmall.auto.test.page.pc.supplier.user.baseinfo.BaseInfoManagePage;

/**
 * 
 * @author chenjingli
 * 用户中心--信息管理--基本信息管理--修改基本信息act
 */
public class BaseInfoManageAct extends IndexAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(BaseInfoManageAct.class);
	private String img = "C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";
	protected BaseInfoManagePage infoManagePage;
	
	public BaseInfoManagePage getInfoManagePage() {
		return infoManagePage;
	}
	public BaseInfoManageAct(WebDriver driver) {
		super(driver);
		infoManagePage = new BaseInfoManagePage(driver);
	}
	/**
	 * 点击{修改}按钮
	 */
	public void clickUpdateButton() {
		logger.info("点击{修改}按钮");
		click(infoManagePage.getXpathCliUpdButton());
	}
	/**
	 * 点击{上传图像}按钮
	 */
	public void clickUploadPictues() {
		logger.info("点击{上传图像}按钮");
		click(infoManagePage.getXpathCliUploadPic());
	}
	/**
	 * 输入地址信息 作为上传图片的跳板
	 */
	public void uploadPicAndTypeAdd(String address) {
//		type(infoManagePage.getNameTypeAddr(), img);
//		logger.info("输入图片信息：{}",img);
//		pause(1);
//		robotCopy();
//		pause(1);
		logger.info("输入地址信息：{}",address);
		type(infoManagePage.getNameTypeAddr(), address);
	}
	/**
	 * 输入联系人信息
	 */
	public void typeContactInfo(String contactInfo) {
		logger.info("输入联系人信息：{}",contactInfo);
		type(infoManagePage.getNameTypeContact(), contactInfo);
	}
	/**
	 * 输入手机
	 */
	public void typeMobPhone(String mob) {
		logger.info("输入手机信息：{}",mob);
		type(infoManagePage.getNameTypeMobPhone(), mob);
	}
	/**
	 * 输入邮箱
	 */
	public void typeEmail(String email) {
		logger.info("输入邮箱信息：{}",email);
		type(infoManagePage.getNameTypeEmail(), email);
	}
	/**
	 * 输入固定电话
	 */
	public void typeFax(String fax) {
		logger.info("输入固定电话信息：{}",fax);
		type(infoManagePage.getNameTypeFax(), fax);
	}
	/**
	 * 输入邮政编码
	 */
	public void typePost(String post) {
		logger.info("输入邮政编码信息：{}",post);
		type(infoManagePage.getNameTypePost(), post);
	}
	/**
	 * 选择商品类别
	 */
	public void selectGoodsStyle(String styleInfo) {
		logger.info("选择商品类别：{}",styleInfo);
		select(infoManagePage.getIdSelGoodsStyle(), styleInfo);
	}
	/**
	 * 输入商品品牌
	 */
	public void typeGoodsBrand(String goodsBrand) {
		logger.info("输入商品品牌信息：{}",goodsBrand);
		type(infoManagePage.getIdTypeGoodsBrand(), goodsBrand);
	}
	/**
	 * 点击{变更1}按钮
	 */
	public void clickChangeOneButton() {
		logger.info("点击{变更1}按钮");
		click(infoManagePage.getXpathCliChangeOne());
	}
	/**
	 * 点击{变更2}按钮
	 */
	public void clickChangeTwoButton() {
		logger.info("点击{变更2}按钮");
		click(infoManagePage.getXpathCliChangeTwo());
	}
	/**
	 * 点击{提交}按钮
	 */
	public void clickSubmitButton() {
		logger.info("点击{提交}按钮");
		click(infoManagePage.getXpathCliSubmit());
	}
}
