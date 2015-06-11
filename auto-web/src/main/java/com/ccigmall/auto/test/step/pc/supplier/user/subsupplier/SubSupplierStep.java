package com.ccigmall.auto.test.step.pc.supplier.user.subsupplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.user.subsupplier.SubSupplierAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * @author zhaixiaoyue
 * 供应商-用户中心-子供应商管理
 */
public class SubSupplierStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SubSupplierStep.class);
	protected SubSupplierAct ssa;
	
	@Test(description = "用户中心-子供应商管理")
	public void SubSupplier(){
		try {
			ssa=new SubSupplierAct(driver);
			//点击用户中心
			ssa.clickUserCenter();
			//点击用户管理
			ssa.clickSubSupplier();			
			//点击创建新供应商
			ssa.clickAddBtn();
			//输入公司名称
			setMemVal(Constant.SUBSUPPLIER_NAME, ssa.typeSupplierName("supname"));			
			//选择国家地区
			ssa.selectCompanyAarea("德国");
			//输入公司地址
			ssa.typeCompanyAddr("米兰大街111号");
			//输入联系人姓名
			ssa.typeContactName("testusr");
			//输入手机
			ssa.typeTel("13377777777");
			//输入邮箱
			ssa.typeMailbox("test@qq.com");
			//上传企业合法证明文件
			ssa.enterProveFile();
			//选择商品类别
			ssa.clickProductCategory();
			//输入用户名
			ssa.typeLoginName("subu");
			//输入密码
			ssa.typePassword("123aaa");
			//点击添加按钮
			ssa.clickAddSubmmit();			
			
			
		} catch (AssertionError e) {
			logger.error("用户中心-子供应商管理 ", e);
			Assert.fail("用户中心-子供应商管理 >> " + e.getMessage());
			ssa.failScreenShot("assert subsupplier manage fail");
		} catch (Exception e) {
			logger.error("用户中心-子供应商管理", e);
			ssa.failScreenShot("assert subsupplier manage fail");
			throw new TestNGException("用户中心-子供应商管理 >> " + e.getMessage(), e);
		}
		
	}	

	
	
	
	
}
