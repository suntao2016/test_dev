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
public class SubSupplierDelStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SubSupplierDelStep.class);
	protected SubSupplierAct ssa;
	
	@Test(description = "用户中心-子供应商管理")
	public void SubSupplierDel(){
		try {
			ssa=new SubSupplierAct(driver);
			//点击用户中心
			ssa.clickUserCenter();
			//点击子供应商管理
			ssa.clickSubSupplier();			
			//点击删除新供应商
			if(!ssa.deleteSub(getMemVal(Constant.SUBSUPPLIER_NAME))){
				throw new TestNGException("fail");
			}
			
			
		} catch (AssertionError e) {
			logger.error("用户中心-子供应商管理-删除 ", e);
			Assert.fail("用户中心-子供应商管理 -删除>> " + e.getMessage());
			ssa.failScreenShot("assert subsupplier delete fail");
		} catch (Exception e) {
			logger.error("用户中心-子供应商管理-删除", e);
			ssa.failScreenShot("subsupplier delete fail");
			throw new TestNGException("用户中心-子供应商管理-删除>> " + e.getMessage(), e);
		}
		
	}	

	
	
	
	
}
