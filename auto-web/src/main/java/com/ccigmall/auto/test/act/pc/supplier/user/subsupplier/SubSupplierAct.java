package com.ccigmall.auto.test.act.pc.supplier.user.subsupplier;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.pc.supplier.user.UserCenterAct;
import com.ccigmall.auto.test.page.pc.supplier.user.subsupplier.SubSupplierPage;
/**
 * @author zhaixiaoyue
 * 供应商-供应商管理-子供应商管理
 */
public class SubSupplierAct extends UserCenterAct {
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SubSupplierAct.class);
	/**
	 * 
	 */
	private SubSupplierPage ssp;
	
	/**
	 * img url
	 */
	private String img = "\"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg\"\"";

	
	public SubSupplierAct(WebDriver driver) {
		super(driver);
		ssp = new SubSupplierPage(driver);
	}
	
	/**
	 * 点击创建新供应商按钮
	 */
	public void clickAddBtn() {
		logger.info("点击创建新供应商按钮");
		click(ssp.getAddBtn());
	}	
	
	/**
	 * 输入新供应商名
	 */
	public String typeSupplierName(String supname) {
		logger.info("输入图片地址  = {}", img);
		type(ssp.getCompanyname(), img);
		robotCopy();
		supname = supname + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入新供应商名称 + {}",supname);
		type(ssp.getCompanyname(),supname);
		return supname;
	}	
	
	/**
	 * 选择国家地区
	 */
	public void selectCompanyAarea(String area) {
		logger.info("选择国家地区 + {}",area);
		select(ssp.getCompanyarea(), area);
	}	
	
	/**
	 * 输入公司地址
	 */
	public void typeCompanyAddr(String addr) {
		logger.info("输入公司地址 + {}",addr);
		type(ssp.getCompanyaddr(), addr);
	}	
	
	/**
	 * 输入联系人姓名
	 */
	public void typeContactName(String name) {
		logger.info("输入联系人姓名 + {}",name);
		type(ssp.getContactname(), name);
	}	
	
	/**
	 * 输入手机
	 */
	public void typeTel(String tel) {
		logger.info("输入手机 + {}",tel);
		type(ssp.getTele(), tel);
	}	
	
	/**
	 * 输入邮箱
	 */
	public void typeMailbox(String mailbox) {
		logger.info("输入邮箱 + {}",mailbox);
		type(ssp.getMailbox(), mailbox);
	}	
	
	/**
	 * 输入固定电话
	 */
	public void typeContacttele(String contacttele) {
		logger.info("输入固定电话 + {}",contacttele);
		type(ssp.getContacttele(), contacttele);
	}	
	
	/**
	 * 输入邮政编码
	 */
	public void typePostalcode(String postalcode) {
		logger.info("输入邮政编码+ {}",postalcode);
		type(ssp.getPostalcode(), postalcode);
	}	
	
	/**
	 * 上传企业合法证明文件
	 */
	public void enterProveFile() {
		logger.info("上传企业合法证明文件");
		click(ssp.getProveFile());
		robotUpload();
	}
	
	/**
	 * 上传公司详情文件
	 */
	public void enterDetailFile() {
		logger.info("上传公司详情文件");
		click(ssp.getDetailFile());
		robotUpload();
	}
	
	/**
	 * 点击商品类别按钮
	 */
	public void clickProductCategory() {
		logger.info("点击商品类别按钮");
		click(ssp.getProductcategory());
		clickPcategoryS();
		clickPcategoryQ();
	}	
	
	/**
	 * 点击商品类别选择食品
	 */
	public void clickPcategoryS() {
		logger.info("点击商品类别确定按钮");
		click(ssp.getPcategoryS());
	}
	
	/**
	 * 点击商品类别确定按钮
	 */
	public void clickPcategoryQ() {
		logger.info("点击商品类别确定按钮");
		click(ssp.getPcategoryQ());
	}
	
	/**
	 * 输入用户名
	 */
	public void typeLoginName(String loginName) {
		loginName = loginName + new SimpleDateFormat("mmss").format(new Date());
		logger.info("输入用户名 + {}",loginName);
		type(ssp.getLoginName(), loginName);
	}	
	
	/**
	 * 输入密码
	 */
	public void typePassword(String password) {
		logger.info("输入密码及确认密码 + {}",password);
		type(ssp.getPwd(), password);
		type(ssp.getPwdRepeat(), password);
	}	
	
	/**
	 * 点击添加按钮
	 */
	public void clickAddSubmmit() {
		logger.info("点击确定按钮提交");
		click(ssp.getaddSubmmit());
	}	
	
	/**
	 * 点击返回按钮
	 */
	public void clickAddCancel() {
		logger.info("点击返回按钮");
		click(ssp.getAddCancel());
	}	
	
		
	/**
	 * 点击修改
	 */
	public void clickRecordmodify() {
		logger.info("点击修改供应商按钮");
		click(ssp.getMdfBtn());
	}	
	
	/**
	 * 点击删除
	 */
	public void clickDelBtn() {
		logger.info("点击删除供应商按钮");
		click(ssp.getDelBtn());
	}	
	
	
	/**
	 * 点击删除供应商提示框确认按钮
	 */
	public void clickDelQuery() {
		logger.info("点击创删除供应商提示框确认按钮");
		click(ssp.getDelQuery());
		clickQuery();
	}	
	
	/**
	 * 点击创删除供应商提示框取消按钮
	 */
	public void clickDelCancel() {
		logger.info("点击创删除供应商提示框取消按钮");
		click(ssp.getDelCancel());
	}	
	
	/**
	 * 点击提示框确认按钮
	 */
	public void clickQuery() {
		logger.info("点击提示框确认按钮");
		click(ssp.getQuery());
	}	
	
	/**
	 * 获取当前记录个数
	 */
	public int getRecordNum() {
		logger.info("点击提示框确认按钮");
		int num = getElementsNum(ssp.getTr());
		return num;
	}	
	
	
	
	/**
	 * 删除内存中的供应商
	 */
	public boolean deleteSub(String name) {
	int	num = getRecordNum();
		for (int i = 0; i < num; i++) {
			if (name.equals(driver.findElement(By.xpath("//div/ul[2]/li["+(i+1)+"]/p[2]")).getText().trim()))
					 {
				logger.info("删除供应商 + {}", name);
				click(driver.findElement(By.xpath("//div/ul[2]/li["+(i+1)+"]/p[7]/span[2]")));
				clickDelQuery();
				return true;
			}
		}
		logger.info("没有找到供应商 + {}", name);
		return false;
	}	
	

}
