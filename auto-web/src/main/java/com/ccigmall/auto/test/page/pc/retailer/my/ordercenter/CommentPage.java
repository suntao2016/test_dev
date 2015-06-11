package com.ccigmall.auto.test.page.pc.retailer.my.ordercenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author zhaixiaoyue  商品评价
 *
 */
public class CommentPage extends MyOderFormPage{
	/**
	 * 
	 * @param driver
	 */
	public CommentPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 五星评分
	 */
	@FindBy(xpath="/html/body/div[5]/div[1]/div[3]/form/div[1]/div[1]/dl/dd/span[1]/a[5]")
	private WebElement commstar;
	
	/**
	 * 评论信息输入框
	 */
	@FindBy(xpath="//*[@id='textarea']")
	private WebElement itemcomment;
	
	/**
	 * 发表评论按钮
	 */
	@FindBy(id="button_comment_form")
	private WebElement submitBtn;
	
	/**
	 * 匿名评价单选框
	 */
	@FindBy(id="checkbox")
	private WebElement anonymous;
	
	/**
	 * 回复按钮
	 */
	@FindBy(xpath="//div/div[2]/div[3]/a")
	private WebElement replyBtn;
	
	/**
	 * 回复输入框
	 */
	@FindBy(xpath="//div[4]/div[1]/div/input[2]")
	private WebElement replyInput;
	
	/**
	 * 回复提交按钮
	 */
	@FindBy(xpath="//div[4]/div[1]/a")
	private WebElement replySubmit;
	
	public WebElement getCommstar() {
		return commstar;
	}
	
	public WebElement getItemcomment() {
		return itemcomment;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getAnonymous() {
		return anonymous;
	}
	
	public WebElement getReplyBtn() {
		return replyBtn;
	}
	
	public WebElement getReplyInput() {
		return replyInput;
	}
	
	public WebElement getReplySubmit() {
		return replySubmit;
	}
}	
