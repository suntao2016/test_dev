package com.ccigmall.auto.test.act.pc.retailer.my.ordercenter;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ccigmall.auto.test.page.pc.retailer.my.ordercenter.CommentPage;
/**
 * @author zhaixiaoyue
 * 商品评价
 */
public class CommentAct  extends MyOderFormAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CommentAct.class);
	/**
	 * 我的订单page
	 */
	private  CommentPage cp;
	
	/**
	 * 
	 * @param driver
	 */
	public CommentAct(WebDriver driver) {
		super(driver);
		cp=new CommentPage(driver);
	}
	

	/**
	 * 点击星星
	 */
	public void clickCommstar() {
		logger.info("点击五星");
		click(cp.getCommstar());
	}
	
	/**
	 * 输入评价内容
	 */
	public void enterItemcomment(String comments) {
		logger.info("输入评价内容+{}",comments);
		type(cp.getItemcomment(),comments);
	}
	
	/**
	 * 点击匿名评价
	 */
	public void clickAnonymous() {
		logger.info("点击匿名评价");
		click(cp.getAnonymous());
	}
	
	/**
	 * 点击提交评价
	 */
	public void clickSubmitBtn() {
		logger.info("点击提交评价");
		click(cp.getSubmitBtn());
	}
	/**
	 * 点击回复
	 */
	public void clickReplyBtn() {
		logger.info("点击提交回复");
		click(cp.getReplyBtn());
	}
	/**
	 * 输入回复内容
	 */
	public void enterReplyInput(String reply) {
		logger.info("输入回复内容+{}",reply);
		type(cp.getReplyInput(),reply);
	}
	
	/**
	 * 点击回复提交
	 */
	public void clickReplySubmit() {
		logger.info("点击回复提交");
		click(cp.getReplySubmit());
	}
	
	/**
	 * 判断是否有评价链接
	 */
	public boolean isExistComment() {
		logger.info("判断是否有评价链接");
		if(isElementPresent(cp.getComment())){
			logger.info("存在评价链接");
			return true;
		}
		return false;
	}
	
	/**
	 * 判断是否有回复按钮
	 */
	public boolean isExistReplyBtn() {
		logger.info("判断是否有回复按钮");
		if(isElementPresent(cp.getReplyBtn())){
			logger.info("存在回复按钮");
			return true;
		}
		return false;
	}
	
}
