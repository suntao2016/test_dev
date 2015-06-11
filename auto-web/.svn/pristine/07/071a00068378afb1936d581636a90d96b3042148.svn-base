package com.ccigmall.auto.test.step.pc.retailer.my.ordercenter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.retailer.my.ordercenter.CommentAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.retailer.RetailerStep;

/**
 * 
 * @author zhaixiaoyue
 * retailer 我的鑫网-我的订单-评价
 */
public class CommentStep extends RetailerStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CommentStep.class);
	protected CommentAct commentAct;
	@Test(description = " retailer 我的鑫网-我的订单-评价")
	public void ProductComment()  {
		try {
			/**
			 * 初始化对象
			 */
			logger.info("retailer 我的鑫网-我的订单-评价 测试用例执行开始，测试用例名称是：{}", getClass().getName());
			
			commentAct = new CommentAct(driver);
			// 点击我的鑫网
			commentAct.clickMyCcigmall();
		    // 点击我的订单
			commentAct.clickMyOrder();
			//获得订单编号
			//输入订单编号
			commentAct.typeSearchInput(orderId);
			logger.info("点击搜索按钮");
			commentAct.clickSearchButton();

			if(commentAct.isExistComment()){
				commentAct.clickComment();
				
			}else{
				throw new TestNGException("没有找到评价链接");
			}
			// 切换至当前页面
						logger.info("切换至当前页面");
						commentAct.switchToWindow(driver.getTitle());
			commentAct.clickCommstar();
			commentAct.enterItemcomment("商品质量好，物流速度快，赞一个！");
			commentAct.clickSubmitBtn();
			commentAct.pause(1);
			if(commentAct.isExistReplyBtn()){
				commentAct.clickReplyBtn();
				commentAct.enterReplyInput("说得好！");
				commentAct.pause(1);
				commentAct.clickReplySubmit();				
			}else{
				throw new TestNGException("发布评价失败");
			}
						
			logger.info("retailer我的鑫网-我的订单-取消订单测试用例执行结束！");
		} catch (AssertionError e) {
			logger.error("Constant.TEST_RETAILER_CANCEL_ORDER_FAIL ", e);
			Assert.fail(Constant.TEST_RETAILER_CANCEL_ORDER_FAIL + " >> "
					+ e.getMessage());
		} catch (TestNGException e) {
			logger.error(Constant.TEST_RETAILER_CANCEL_ORDER_FAIL, e);
			throw new TestNGException("Constant.TEST_RETAILER_CANCEL_ORDER_FAIL >> "
					+ e.getMessage(), e);
		}
	}
	
}
