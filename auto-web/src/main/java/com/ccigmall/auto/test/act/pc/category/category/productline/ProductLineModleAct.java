/**
 * 
 */
package com.ccigmall.auto.test.act.pc.category.category.productline;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.category.category.CategoryManageAct;
import com.ccigmall.auto.test.page.pc.category.category.productline.ProductLineModlePage;

/**
 * @author jianping.gao 产品线模板
 */
public class ProductLineModleAct extends CategoryManageAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CategoryManageAct.class);

	/**
	 * 产品线模板
	 */
	private ProductLineModlePage productLineModlePage;
	/**
	 * 
	 * @param driver
	 */
	public ProductLineModleAct(WebDriver driver) {
		super(driver);
		productLineModlePage = new ProductLineModlePage(driver);
	}
	/**
	 * 点击添加产品线
	 */
	public void clickAddProductLine() {
		logger.info("点击添加产品线");
		click(productLineModlePage.getAddProductLine());
	}
	
	/**
	 * 点击第一条记录
	 */
	public void clickProductLineSearchResultFirst() {
		logger.info("点击选择产品线记录");
		click(productLineModlePage.getProductLineSearchResultFirst());
	}
	
	/**
	 * 点击删除产品线
	 */
	public void clickDelProductLine() {
		logger.info("点击删除产品线");
		click(productLineModlePage.getDelProductLine());
		click(productLineModlePage.getDelConfirm());
		click(productLineModlePage.getQuery());
	}
	
	/**
	 * 点击修改产品线
	 */
	public void clickMdfProductLine() {
		logger.info("点击修改产品线");
		click(productLineModlePage.getMdfProductLine());
	}

	/**
	 * 输入产品线的中文名字
	 */
	public void enterProductLineNameCn(String nameCn) {
		logger.info("输入产品线的中文名字 ={}", nameCn);
		type(productLineModlePage.getProductLineNameCn(), nameCn);
	}

	/**
	 * 输入产品线的英文名字
	 */
	public void enterProductLineNameEn(String nameEn) {
		logger.info("输入产品线的英文名字 ={}", nameEn);
		type(productLineModlePage.getProductLineNameEn(), nameEn);
	}

	/**
	 * 输入产品线的描述
	 */
	public void enterProductLineDesc(String desc) {
		logger.info("输入产品线的描述 ={}", desc);
		type(productLineModlePage.getProductLineDesc(), desc);
	}

	/**
	 * 产品线保存
	 */
	public void clickProductLineSubmit() {
		logger.info("点击产品线保存");
		click(productLineModlePage.getProductLineSubmit());
		this.pause(5);
	}

	/**
	 * 输入搜索产品线名称
	 */
	public void enterProductLineName(String name) {
		logger.info("输入搜索产品线名称 ={}", name);
		type(productLineModlePage.getProductLineName(), name);
	}

	/**
	 * 产品线名称搜索 按钮
	 */
	public void clickProductLineNameSearch() {
		logger.info("产品线名称搜索 按钮");
		click(productLineModlePage.getProductLineNameSearch());
	}

	/**
	 * 产品线名称搜索 结果
	 */
	public boolean justSearchResult() {
		List<WebElement> elements =productLineModlePage.getProductLineSearchResult();
		if (elements == null || elements.size() == 0) {
			throw new TestNGException("未搜素到任何产品线");
		}
		return true;
	}

	/**
	 * 产品线名称搜索 结果 第一个属性管理
	 */
	public void clickProductLineSearchResultAttrManage() {
		logger.info("点击产品线名称搜索 结果 第一个属性管理");
		click(productLineModlePage.getProductLineSearchResultAttrManage());
	}

	/**
	 * 点击添加属性
	 */
	public void clickAddProductLineAddAttr() {
		logger.info("点击添加属性");
		click(productLineModlePage.getProductLineAddAttr());
	}

	/**
	 * 输入属性中文名称
	 */
	public void enterProductLineAddAttrCn(String attrCn) {
		logger.info("输入属性中文名称  ={}", attrCn);
		type(productLineModlePage.getProductLineAddAttrCn(), attrCn);
	}

	/**
	 * 输入属性英文名称
	 */
	public void enterProductLineAddAttrEn(String attrEn) {
		logger.info("输入属性中文名称  ={}", attrEn);
		type(productLineModlePage.getProductLineAddAttrEn(), attrEn);
	}

	/**
	 * 输入属性描述
	 */
	public void enterProductLineAddAttrDesc(String desc) {
		logger.info("输入属性描述  ={}", desc);
		type(productLineModlePage.getProductLineAddAttrDesc(), desc);
	}

	/**
	 * 点击添加更多属性值
	 */
	public void clickProductLineAddAttMore() {
		logger.info("点击添加更多属性值  ");
		click(productLineModlePage.getProductLineAddAttMore());
	}
	
	
	/**
	 * 点击添加更多属性值保存
	 */
	public void clickAttrSave() {
		logger.info("点击添加更多属性值保存");
		click(productLineModlePage.getAttrSave());
	}
	
	
	
	

	/**
	 * 添加属性
	 */
	public void addAttr() {
		for (int i = 0; i < 4; i++) {
			clickAddProductLineAddAttr();
			addAttrList(i);	
		}
	}
	
	/**
	 * 添加包装属性
	 */
	public void addPackingAttr(int j){
		String attrCn = null;
		String attrEn = null;
		for (int i = 0; i < j; i++) {
			if (i != 0) {
				clickProductLineAddAttMore();
			}
			switch (i) {
			case 0: {
				attrCn = "超大袋";
				attrEn = "Large";
				break;
			}
			case 1: {
				attrCn = "大袋";
				attrEn = "Big";
				break;
			}
			case 2: {
				attrCn = "中袋";
				attrEn = "Middle";
				break;
			}
			case 3: {
				attrCn = "小袋";
				attrEn = "Small";
				break;
			}
			}
			enterAttr(attrCn, attrEn, i);
		}
	}
	
	/**
	 * 添加颜色属性
	 * @param j
	 */
	public void addColorAttr(int j) {
		String attrCn = null;
		String attrEn = null;
		for (int i = 0; i < j; i++) {
			if (i != 0) {
				clickProductLineAddAttMore();
			}
			switch (i) {
			case 0: {
				attrCn = "黑色";
				attrEn = "Black";
				break;
			}
			case 1: {
				attrCn = "黄色";
				attrEn = "Yellow";
				break;
			}
			case 2: {
				attrCn = "咖啡色";
				attrEn = "Coffee";
				break;
			}
			case 3: {
				attrCn = "白色";
				attrEn = "White";
				break;
			}
			case 4: {
				attrCn = "红色";
				attrEn = "RED";
				break;
			}
			}
			enterAttr(attrCn, attrEn, i);
		}
	}
	
	/**
	 * 添加产地
	 * @param j
	 */
	public void addOriginAttr(int j){
		String attrCn = null;
		String attrEn = null;
		for (int i = 0; i < j; i++) {
			if (i != 0) {
				clickProductLineAddAttMore();
			}
			switch (i) {
			case 0: {
				attrCn = "中国";
				attrEn = "China";
				break;
			}
			case 1: {
				attrCn = "美国";
				attrEn = "USA";
				break;
			}
			case 2: {
				attrCn = "英国";
				attrEn = "UK";
				break;
			}
			case 3: {
				attrCn = "法国";
				attrEn = "France";
				break;
			}
			case 4: {
				attrCn = "意大利";
				attrEn = "Italy";
				break;
			}
			case 5: {
				attrCn = "小日本";
				attrEn = "Japan";
				break;
			}
			case 6: {
				attrCn = "韩国";
				attrEn = "Korea";
				break;
			}
			}
			enterAttr(attrCn, attrEn, i);
		}
	}
	

	/**
	 * 添加口味属性
	 * @param j
	 */
	public void addTasteAttr(int j) {
		String attrCn = null;
		String attrEn = null;
		for (int i = 0; i < j; i++) {
			if (i != 0) {
				clickProductLineAddAttMore();
			}
			switch (i) {
			case 0: {
				attrCn = "五香";
				attrEn = "Spiced";
				break;
			}
			case 1: {
				attrCn = "奶油";
				attrEn = "Cream";
				break;
			}
			case 2: {
				attrCn = "咖啡";
				attrEn = "Coffee";
				break;
			}
			case 3: {
				attrCn = "牛肉";
				attrEn = "Beef flavor";
				break;
			}
			case 4: {
				attrCn = "泡椒";
				attrEn = "Pickled pepper flavo";
				break;
			}
			}
			enterAttr(attrCn, attrEn, i);
		}
	}
	
	/**
	 * 输入属性
	 * @param attrCn
	 * @param attrEn
	 * @param i
	 */
	public void enterAttr(String attrCn,String attrEn,int i){
		List<WebElement> attrCnList=driver.findElements(By.name("prodLineAttrValueList["+i+"].lineAttrvalNameCn"));
		List<WebElement> attrEnList=driver.findElements(By.name("prodLineAttrValueList["+i+"].lineAttrvalName"));
		logger.info("输入属性中文  ={}", attrCn);
		type(attrCnList.get(attrCnList.size()-1), attrCn);
		logger.info("输入属性 英文 ={}", attrEn);
		type(attrEnList.get(attrEnList.size()-1), attrEn);
	}

	/**
	 * 添加产品线的属性
	 * 
	 * @param i
	 */
	public void addAttrList(int i) {
		String attrCn = null;
		String attrEn = null;
		String desc = null;
		switch (i) {
		case 0: {
			attrCn = "口味";
			attrEn = "Taste";
			desc = "Taste desc";
			addTasteAttr(5);
			break;
		}
		case 1: {
			attrCn = "产地";
			attrEn = "Place of Origin";
			desc = "Place of Origin desc";
			addOriginAttr(7);
			break;
		}
		case 2: {
			attrCn = "包装";
			attrEn = "Packing";
			desc = "Packing desc";
			addPackingAttr(4);
			break;
		}
		case 3: {
			attrCn = "颜色";
			attrEn = "Color";
			desc = "Color desc";
			addColorAttr(5);
			break;
		}
		}
		enterProductLineAddAttrCn(attrCn);
		enterProductLineAddAttrEn(attrEn);
		enterProductLineAddAttrDesc(desc);	
		clickAttrSave();
		this.pause(5);
	}

}
