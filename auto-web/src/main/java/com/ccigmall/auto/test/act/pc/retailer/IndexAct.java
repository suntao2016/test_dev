/**
 * 
 */
package com.ccigmall.auto.test.act.pc.retailer;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.page.pc.retailer.IndexPage;

/**
 * @author jianping.gao
 * 零售商首页
 */
public class IndexAct extends LoginAct{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(LoginAct.class);
	
	/**
	 * 
	 */
	private IndexPage indexPage;
	
	/**
	 * 
	 * @param driver
	 */
	public IndexAct(WebDriver driver) {
		super(driver);
		indexPage=new IndexPage(driver);
	}
	
	/**
	 * 判断登录link是否存在
	 * @return
	 */
	public boolean isExistLoginAct(){
		logger.info("判断登录链接是否存在");
		if("[登录]".equals(indexPage.getLogin().getText())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 点击登录
	 */
	public void clickLogin(){
		logger.info("点击登录链接");
		click(indexPage.getLogin());
	}
	
	/**
	 * 点击我的鑫网
	 */
	public void clickMyCcigmall(){
		logger.info("点击我的鑫网链接");
		click(indexPage.getMyCcigmall());
	}
	
	/**
	 * 输入商品名称进行搜索
	 */
	public void inputItem(String text){
		logger.info("输入商品名称:{}进行搜索" , text );
		this.type(indexPage.getTextField(), text);
	}
	
	/**
	 * 进行搜索
	 */
	public void clickSearchButton(){
		logger.info("点击进行搜索：{}" , indexPage.getSearchItemButton());
		click(indexPage.getSearchItemButton());
	}
	
	/**
	 * 选中搜索结果中的 第一个商品
	 */
	public void clickFirstItem(){
		logger.info("点击进行搜索：{}" , indexPage.getFirstItem());
		click(indexPage.getFirstItem());
	}
	/**
	 * 选择注册类型--零售商
	 */
	public void clickRetailer(){
		click(indexPage.getXpathCliRetailer());
	}
	/**
	 * 选择注册类型--经销商
	 */
	public void clickDealer(){
		click(indexPage.getXpathCliDealer());
	}
	/**
	 * 选择注册类型--供应商
	 */
	public void clickSupplier(){
		click(indexPage.getXpathCliSupplier());
	}
	

}
