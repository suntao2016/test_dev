package com.ccigmall.auto.test.step.pc.supplier.user.baseinfo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.user.baseinfo.BaseInfoManageAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * 
 * @author chenjingli
 * 用户中心--信息管理--基本信息管理--修改基本信息step
 */
public class UpdateBaseInfoManageStep extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(UpdateBaseInfoManageStep.class);
	protected BaseInfoManageAct infoManageAct;
	/**
	 * test test pc supplier 修改基本信息  上传的东西无需修改
	 * @throws Exception 
	 */
	@Test(description = "用户中心--信息管理--基本信息管理--修改基本信息")
	public void testDelBrandManagement()  {    		    	
		    try{
		    	logger.info("用户中心--信息管理--基本信息管理--修改基本信息测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	infoManageAct = new BaseInfoManageAct(driver);
		    	//点击用户中心
		    	infoManageAct.clickUserCenter();
		    	//点击修改按钮
		    	infoManageAct.clickUpdateButton();
		    	//输入地址信息
		    	infoManageAct.uploadPicAndTypeAdd("test update adress infomation!");
		    	//点击上传头像
//		    	Point pElement = infoManageAct.getInfoManagePage().getXpathCliUploadPic().getLocation();
//		    	
//		    	System.out.println(pElement.getX()+"sssssssssssssssssss"+pElement.getY());
//		    	Robot robot = new Robot();
//		    	robot.mouseMove(pElement.getX()+60,pElement.getY()+85);
//		        robot.delay(2000);  
//		        robot.mousePress(InputEvent.BUTTON1_MASK);  
//		        robot.delay(2000);  
//		        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    	infoManageAct.clickUploadPictues();
		    	//输入联系人
		    	infoManageAct.typeContactInfo("test联系人");
		    	//输入手机号
		    	infoManageAct.typeMobPhone("13264221172");
		    	//输入邮箱
		    	infoManageAct.typeEmail("1235@qq.com");
		    	//输入固定电话
		    	infoManageAct.typeFax("01081231234");
		    	//输入邮政编码
		    	infoManageAct.typePost("10000");
		    	//输入商品品牌
		    	infoManageAct.typeGoodsBrand("商品品牌test");
		    	//点击提交按钮
		    	infoManageAct.clickSubmitButton();
		    	if(true ==infoManageAct.getInfoManagePage().getXpathCliUploadPic().isDisplayed()){
		    		Assert.assertFalse(true);
		    	}else{
		    		Assert.assertFalse(false);
		    	}
		    	logger.info("用户中心--信息管理--基本信息管理--修改基本信息测试用例执行结束！");
		    }catch (AssertionError e) {
				logger.error("Constant.TEST_SUBMITORDER_SEARCH__FIAL ", e);
				Assert.fail(Constant.TEST_SUPPLIER_UPDATE_BASE_INFO_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				logger.error(Constant.TEST_SUPPLIER_UPDATE_BASE_INFO_FAIL, e);
				throw new TestNGException("Constant.TEST_SUBMITORDER_SEARCH__FIAL >> "
						+ e.getMessage(), e);
			}
		    
	}
}
