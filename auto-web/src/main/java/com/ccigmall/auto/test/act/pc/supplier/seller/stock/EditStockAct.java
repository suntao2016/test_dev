/**
 * 
 */
package com.ccigmall.auto.test.act.pc.supplier.seller.stock;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.supplier.seller.SellerIndexAct;
import com.ccigmall.auto.test.page.pc.supplier.seller.stock.EditStockPage;

/**
 * @author jianping.gao 编辑库存
 */
public class EditStockAct extends SellerIndexAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SellerIndexAct.class);

	/**
	 * 编辑库存
	 */
	private EditStockPage editStockPage;

	/**
	 * 编辑库存
	 * 
	 * @param driver
	 */
	public EditStockAct(WebDriver driver) {
		super(driver);
		editStockPage = new EditStockPage(driver);
	}

	/**
	 * 输入商品名称
	 */
	public void enterProductName(String productName) {
		logger.info("输入商品名称 = {}",productName);
		type(editStockPage.getSearchProName(), productName);
	}

	/**
	 * 点击搜索按钮
	 */
	public void clickSearch() {
		logger.info("点击搜索按钮");
		click(editStockPage.getSearchbutton());
		if(!isElementPresent(editStockPage.getTable())){
			throw new TestNGException("未搜索到任何商品！");
		}
	}

	/**
	 * 输入现货库存
	 */
	public void enterSpotStock(int num) {
		logger.info("输入现货库存 = {}",num);
		type(editStockPage.getSpotNum(), String.valueOf(num));
	}

	/**
	 * 点击输入库存之后确认
	 */
	public void clickEditStockOk() {
		logger.info("点击确认");
		if(isElementPresent(editStockPage.getConfirmOk())){
			logger.debug("确认按钮存在");
		}
		click(editStockPage.getConfirmOk());
	}
	
	/**
	 * 点击提示确认
	 */
	public void clickRemindOk() {
		logger.info("库存修改成功");
		click(editStockPage.getRemindOk());
	}

	/**
	 * 点击修改
	 * @param spotNum 库存
	 * @param maxMadeNum 最大见单生量
	 */
	public void clickEdit(int spotNum,int maxMadeNum) {
		List<WebElement> webElements = editStockPage.getEdits();
		// 遍历点击
		for (int i = 0; i < webElements.size(); i++) {	
			webElements.get(i).click();
			this.pause(1);
			enterSpotStock(spotNum);
			//点击确认按钮
			clickEditStockOk();
			if(isElementPresent(editStockPage.getRemind(),"修改成功")){
				logger.info("修改第{}个规格商品库存成功", i + 1);
				clickRemindOk();
			}else{
				logger.info("修改第{}个规格商品库存失败", i + 1);
			}
			if(i==webElements.size()){
				logger.info("商品库存修改完毕");
			}			
		}
	}

}
