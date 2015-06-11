/**
 * 
 */
package com.ccigmall.auto.test.act.pc.platform.seller.product;

import java.util.List;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;

import com.ccigmall.auto.test.act.pc.platform.seller.SellerIndexAct;
import com.ccigmall.auto.test.page.pc.platform.seller.product.ProductListPage;

/**
 * @author jianping.gao 商品列表
 */
public class ProductListAct extends SellerIndexAct {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(ProductListAct.class);

	/**
	 * 
	 */
	private ProductListPage productListPage;

	/**
	 * 商品列表
	 * 
	 * @param driver
	 */
	public ProductListAct(WebDriver driver) {
		super(driver);
		productListPage = new ProductListPage(driver);
	}

	/**
	 * 点击出售中的商品
	 */
	public void clickSaleProduct() {
		logger.info("点击出售中的商品");
		click(productListPage.getSaleProduct());
	}

	/**
	 * 点击新增的商品
	 */
	public void clickAddedProduct() {
		logger.info("点击新增的商品");
		click(productListPage.getAddedProduct());
	}

	/**
	 * 点击已保存商品
	 */
	public void clickSavedProduct() {
		logger.info("点击已保存商品");
		click(productListPage.getSavedProduct());
	}

	/**
	 * 点击待审核的货品
	 */
	public void clickPendingReview() {
		logger.info("点击待审核的货品");
		click(productListPage.getPendingReview());
	}

	/**
	 * 点击审核未通过的货品
	 */
	public void clickReviewNotPass() {
		logger.info("点击审核未通过的货品");
		click(productListPage.getReviewNotPass());
	}

	/**
	 * 点击待出售的商品
	 */
	public void clickPendingSale() {
		logger.info("点击待出售的商品");
		click(productListPage.getPendingSale());
	}
	
	/**
	 * 点击下架的货品
	 */
	public void clickSoldOut() {
		logger.info("点击下架的货品");
		click(productListPage.getSoldOut());
	}
	
	
	/**
	 * 点击上架按钮
	 */
	public void clickGoodsShelves() {
		logger.info("点击上架按钮");
		click(productListPage.getGoodsShelves());
		this.pause(2);
		if(isElementPresent(productListPage.getRemindConfirmContent(),"确定要上架吗？")){
			productListPage.getRemindConfirmOk().click();
			logger.info("商品上架成功");
		}else{
			logger.info("商品上架失败");
			throw new TestNGException("wofe商品上架失败");			
		}
	}
	
	/**
	 * 点击补录库存
	 */
	public void clickMakeupStock() {
		logger.info("点击补录库存");
		click(productListPage.getMakeupStock());
        switchToWindow("WOFE-补录库存");
	}
	
	/**
	 * 点击选择仓库
	 */
	public void clickSelectWarehouse() {
		logger.info("点击选择仓库");
		click(productListPage.getSelectWarehouse());
		click(productListPage.getWarehouseConfirm());
        
	}
	

	/**
	 * 点击查看商品
	 */
	public void clickViewProduct() {
		logger.info("点击查看商品");
		click(productListPage.getPendingSale());
	}
	

	/**
	 * 点击修改商品
	 */
	public void clickEditProduct() {
		logger.info("正在等待10s");	
		this.pause(10);
		logger.info("点击修改商品");	
		click(productListPage.getEditProduct());
		this.pause(2);
		switchToWindow("WOFE-修改商品");
	}

	/**
	 * 输入现货预计到货天数
	 */
	public void enterSpotArrvalDays(int days) {
		logger.info("输入现货预计到货天数  = {}", days);
		type(productListPage.getSpotArrvalDays(), String.valueOf(days));
	}
	
	
	/**
	 * 输入期货预计到货天数
	 */
	public void enterFuturesArrvalDays(int days) {
		logger.info("输入期货预计到货天数  = {}", days);
		type(productListPage.getFuturesArrvalDays(), String.valueOf(days));
	}
	
	/**
	 * 输入预付比例
	 */
	public void enterPrepaidProportion(int percent) {
		logger.info("输入预付比例  = {}", percent);
		type(productListPage.getPrepaidProportion(), String.valueOf(percent));
	}

	/**
	 * 点击按产品数量报价
	 */
	public void clickPic_count() {
		logger.info("点击按产品数量报价");
		click(productListPage.getPic_count());
	}

	/**
	 * 点击按产品规格报价
	 */
	public void clickPic_sku() {
		logger.info("点击按产品规格报价");
		click(productListPage.getPic_sku());
	}

	/**
	 * 输入 按产品规格报价  现货价格 最小起订量
	 */
	public void enterMinNum(int minNum) {
		logger.info("输入 按产品规格报价  现货价格 最小起订量 = {}", minNum);
		type(productListPage.getMinNum(), String.valueOf(minNum));
	}

	/**
	 * 按产品规格报价  现货价格  单价  建议零售价
	 */
	public void enterProductSpotUnit(int unit) {
		List<WebElement> productPic = productListPage.getProductPic();
		List<WebElement> rPrice = productListPage.getrPrice();
		if (productPic == null || productPic.size() == 0) {
			logger.info("未能获取到单价元素");
			throw new WebDriverException("未能获取到单价元素");
		}
		if (rPrice == null || rPrice.size() == 0) {
			logger.info("未能获取到 建议零售价元素");
			throw new WebDriverException("未能获取到建议零售价元素");
		}
		for (int i = 0; i < productPic.size(); i++) {
			logger.info("输入第{}个规格商品单价{}", (i + 1), unit);
			type(productPic.get(i), String.valueOf(unit));
			logger.info("输入第{}个规格 建议零售价{}", (i + 1), (unit+1));
			type(rPrice.get(i), String.valueOf((unit+1)));
		}
	}
	
	/**
	 * 输入 按产品规格报价  期货价格 最小起订量
	 */
	public void enterFuturesMinNum(int minNum) {
		logger.info("输入 按产品规格报价  期货价格 最小起订量 = {}", minNum);
		type(productListPage.getSupplierMinNum(), String.valueOf(minNum));
	}
	
	/**
	 * 按产品规格报价  期货价格  单价  建议零售价
	 */
	public void enterProducFuturestUnit(int unit) {
		List<WebElement> productPic = productListPage.getSupplierPic();
		if (productPic == null || productPic.size() == 0) {
			logger.info("未能获取到单价元素");
			throw new WebDriverException("未能获取到单价元素");
		}
		for (int i = 0; i < productPic.size(); i++) {
			logger.info("输入第{}个规格商品单价{}", (i + 1), unit);
			type(productPic.get(i), String.valueOf(unit));
		}
	}

	/**
	 * 按产品数量报价 现货价格: 建议零售价
	 */
	public void enterCountMSRP(int unit) {
		logger.info("输入 建议零售价 = {}", unit);
		type(productListPage.getOnlyPrice(), String.valueOf(unit));
	}

	/**
	 * 现货价格: 起批量： 件 及以上 元/件
	 */
	public void enterSpotStartUnit(int start, int unit) {
		WebElement element;
		int i = 0;
		while (true) {
			List<WebElement> elements = productListPage.getSupplierSpotStart();
			if (elements == null || elements.size() == 0) {
				logger.info("未能获取到起批量元素");
				throw new WebDriverException("未能获取到起批量元素");
			}
			logger.info("现货价格: 起批量：{} 件及以上   {}人民币/件 ", start + i, unit - i);
			element = elements.get(elements.size() - 1);
			type(element, String.valueOf(start + i));
			
			
			elements = productListPage.getSupplierSpotPrice();
			if (elements == null || elements.size() == 0) {
				logger.info("未能获取到价格元素");
				throw new WebDriverException("未能获取到价格元素");
			}
			element = elements.get(elements.size() - 1);
			type(element, String.valueOf(unit - i));
			if (i == 2) {
				break;
			}
			clickAddNumLink(0);
			i++;
		}

	}
	
	/**
	 * 期货价格: 起批量： 件 及以上 元/件
	 */
	public void enterFuturesStartUnit(int start, int unit) {
		WebElement element;
		int i = 0;
		while (true) {
			List<WebElement> elements = productListPage.getSupplierFuturesStart();
			if (elements == null || elements.size() == 0) {
				logger.info("未能获取到起批量元素");
				throw new WebDriverException("未能获取到起批量元素");
			}
			logger.info("现货价格: 起批量：{} 件及以上   {}人民币/件 ", start + i, unit - i);
			element = elements.get(elements.size() - 1);
			type(element, String.valueOf(start + i));
			
			
			elements = productListPage.getSupplierFuturesPrice();
			if (elements == null || elements.size() == 0) {
				logger.info("未能获取到价格元素");
				throw new WebDriverException("未能获取到价格元素");
			}
			element = elements.get(elements.size() - 1);
			type(element, String.valueOf(unit - i));
			if (i == 2) {
				break;
			}
			clickAddNumLink(1);
			i++;
		}

	}

	/**
	 * 输入 sku 重量
	 */
	public void enterSkuWeight(int weight) {
		
		List<WebElement> elements = productListPage.getWeight();
		if (elements == null || elements.size() == 0) {
			logger.info("未能获取到起批量元素");
			throw new WebDriverException("未能获取到起批量元素");
		}
		for(int i=0;i<elements.size();i++){
			logger.info("输入 第{}个sku 重量 {}",(i+1),weight);
			type(elements.get(i), String.valueOf((weight)));
		}
	}
	
	/**
	 * 点击增加数量区间
	 */
	public void clickAddNumLink(int i) {
		
		logger.info("点击增加数量区间 ");
		if(i==0){
			click(productListPage.getAddNumLinkSpot());
		}
		if(i==1){
			click(productListPage.getAddNumLinkFutures());
		}
		
	}

	/**
	 * 物流描述：
	 */
	public void enterDescription(String description) {
		logger.info("输入 物流描述 = {}", description);
		type(productListPage.getLogisticsDescription(), description);
	}
	
	
	/**
	 * 点击提交
	 * @throws Exception 
	 */
	public void clickSubmit() throws Exception{
		logger.info("点击提交");
		click(productListPage.getSaveProd());
		this.pause(2);
		if(isElementPresent(productListPage.getRemindConfirmContent(),"提交审核成功，关闭当前页面！")){
			productListPage.getRemindConfirmOk().click();
			logger.info("修改商品成功");
		}else{
			logger.info("修改商品失败");
			throw new TestNGException("wofe修改商品失败");			
		}
	}
	
	
	/**
	 * 输入经销商
	 */
	public void enterMakeupStockDealerName(String dealerName) {
		logger.info("输入经销商   {}",dealerName);
		type(productListPage.getDealerName(), dealerName);
	}
	
	/**
	 * 点击经销商查询
	 */
	public void clickDealerNameButton() {
		logger.info("点击经销商查询");
		click(productListPage.getDealerNameButton());
	}
	
	
	/**
	 * 点击经销商checkBox
	 */
	public void clickDealerNameCheckBox() {
		logger.info("点击经销商checkBox");
		click(productListPage.getDealerNameCheckBox());
	}
	
	/**
	 * 点击经销商确认按钮
	 */
	public void clickDealerNameOk() {
		logger.info("点击经销商确认按钮");
		click(productListPage.getDealerNameOk());
	}
	/**
	 * 判断是否有时间框：显示的是操作 or 过期时间
	 */
	final String booleanExistTimeBox(){
		logger.info("获得判断是否有时间框的节点是：{}",getText(productListPage.getXpathBooleanExistTimeBox()));
		return getText(productListPage.getXpathBooleanExistTimeBox());
	}
	/**
	 * 输入补货商品数量
	 */
	public void enterMakeupStockDealerName(int num) {
		
		List<WebElement> list=driver.findElements(By.className("zengj"));
		if(list==null || list.size()==0){
			return ;
		}
		String booTimeBoxText = this.booleanExistTimeBox();
		if(booTimeBoxText!=null && booTimeBoxText.length()>0){
			if(booTimeBoxText.contains("操作")){
				for(int i =1;i<=list.size();i++){
					
					click(list.get(i-1));
					
					String sku="1111111111";
					logger.info("批次号 = {}",sku);
					type(driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[1]/input[3]")), sku);
					logger.info("输入补货商品数量   {}",num);
					
					type(driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[2]/input")), String.valueOf(num));
				}
			}else if(booTimeBoxText.contains("过期时间")){
				for(int i =1;i<=list.size();i++){
					
					click(list.get(i-1));
					
					String sku="1111111111";
					logger.info("批次号 = {}",sku);
					type(driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[1]/input[3]")), sku);
					logger.info("输入补货商品数量   {}",num);
					
					type(driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[2]/input")), String.valueOf(num));
					
					logger.info("生产时间 ");			
					click(driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[3]/input")));
					enterFrame(driver.findElement(By.xpath("//iframe[@hidefocus='true']")));
					click(driver.findElement(By.id("dpOkInput")));
					defaultContent();
					
					logger.info("过期时间");
					click(driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[4]/input")));
					enterFrame(driver.findElement(By.xpath("//iframe[@hidefocus='true']")));		
					click(driver.findElement(By.xpath("//div[@id='dpTitle']/div[5]/a")));
					click(driver.findElement(By.id("dpOkInput")));
				}
			}
		}else{
			fail("获得判断是否有时间框节点内容为null");
		}
		
		
		

		
	}
	
	/**
	 * 补录库存提交
	 */
	public void clickMakeupStockSubmit(){
		logger.info("点击提交");
		click(productListPage.getMakeupStockSubmit());
		this.pause(2);
		if(isElementPresent(productListPage.getRemindConfirmContent(),"分配完成.返回已卖出的商品页！")){
			productListPage.getRemindConfirmOk().click();
			logger.info("补录库存成功");
		}else{
			logger.info("补录库存失败");
			throw new TestNGException("wofe补录库存失败");			
		}
	}
	/**
	 * 点击催缴平台 催缴按钮
	 */
	public void clickPlatformButton() {
		logger.info("点击催缴平台 催缴按钮");
		click(productListPage.getXpathCliPlatformButton());
	}
	/**
	 *  点击弹出框中的确定
	 */
	public void clickAlertConfirm() {
		logger.info("点击弹出框中的确定");
		click(productListPage.getXpathCliAlertConfirm());
	}
	/**
	 *  判断搜索出的商品是不是想要的
	 */
	public void compareSearchResults(String productName) {
		logger.info("判断搜索出的商品是不是想要的");
		String getInformation = getText(productListPage.getXpathGetProductName()).trim();
		if(productName.equals(getInformation)){
			//点击催缴按钮
    		this.clickPlatformButton();
		}else{
			logger.error("点击搜索按钮后没有找到要催缴的商品，找到的商品名字是：{},而要确认的商品名字是：{}"
					,getInformation,productName);
    		Assert.assertEquals(getInformation,productName);
		}
	}
}
