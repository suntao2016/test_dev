package com.ccigmall.auto.test.step.pc.supplier.seller.order;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.dealer.systemManage.order.ContractAct;
import com.ccigmall.auto.test.act.pc.supplier.seller.order.ShippingAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;
/**
 * 
 * @author chenjingli
 * 供应商发货
 */
public class SupplierShippingStep  extends SupplierStep{
	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(SupplierShippingStep.class);
	protected ShippingAct shippingAct;
	/**
	 * test test pc supplier 供应商发货
	 * @throws Exception 
	 */
	@Test(description = "test pc supplier 供应商发货")
	public void testSupplierShipping() {    		    	
		    try{
		    	logger.info("test pc supplier 供应商发货测试用例执行开始，测试用例名称是：{}",getClass().getName());
		    	/**
		    	 * 初始化所需对象
		    	 */
		    	shippingAct = new ShippingAct(driver);
		    	//点击卖家中心
		    	shippingAct.getSoldGoodsAct().clickSellerCenter();
		    	//点击已卖出的货品
		    	shippingAct.getSoldGoodsAct().clickSoldGoods();
		    	//输入要下单填写合同的商品采购id
		    	shippingAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	shippingAct.clickSearchButton();
		    	//处理搜索商品
		    	this.booleanGoodsIfEquals();
		    	//切换窗口
		    	shippingAct.switchToWindow(driver.getWindowHandle());
		    	//今天确认发货页面开始处理信息
		    	this.confirmPageInfo();
		    	//返回首页判断一下是否下单成功
		    	shippingAct.inputOrderId(purchaseId);
		    	//点击搜索按钮
		    	shippingAct.clickSearchButton();
		    	//=2秒
		    	shippingAct.pause(2);
		    	Assert.assertEquals("已发货".trim(),shippingAct.getText(shippingAct.getSoldGoodsPage().getXpathGetGoodsStatu()));
		    	logger.info("test pc supplier 供应商发货测试用例执行结束！");
		    }catch (AssertionError e) {
		    	shippingAct.failScreenShot(Constant.TEST_DEALER_SEND_GOODS_ORDER_FAIL);
				logger.error("Constant.TEST_DEALER_SEND_GOODS_ORDER_FAIL ", e);
				Assert.fail(Constant.TEST_DEALER_SEND_GOODS_ORDER_FAIL + " >> "
						+ e.getMessage());
			} catch (Exception e) {
				shippingAct.failScreenShot(Constant.TEST_DEALER_SEND_GOODS_ORDER_FAIL);
				logger.error(Constant.TEST_DEALER_SEND_GOODS_ORDER_FAIL, e);
				throw new TestNGException("Constant.TEST_DEALER_SEND_GOODS_ORDER_FAIL >> "
						+ e.getMessage(), e);
			}
		    
	}
	/**
	 * 判断搜索商品是否否和预期
	 */
	private void booleanGoodsIfEquals(){
		logger.info("判断搜索到的商品是否是你想要的");
    	if(productName.equals(shippingAct.getText(shippingAct.getSoldGoodsPage().getXpathGetProductName()))){
    		//点击确认合同按钮
    		shippingAct.getSoldGoodsAct().clickShipingButton();
		}else{
			shippingAct.failScreenShot("没有搜到指定商品");
			logger.error("点击搜索没有搜索到指定内容");
			Assert.fail("点击搜索没有搜索到指定内容");
		}
	}
	/**
	 * 判断确定发货页面中 需要填写的订单数量
	 */
	private void confirmPageInfo(){
		//获得div数量
		shippingAct.pause(1);
		int divNumbers = shippingAct.getDivsNumber();
		shippingAct.pause(1);
		String text= null;
		String jsStart = null;
		String jsEnd = null;
		if(0!=divNumbers){
			shippingAct.pause(1);
			//获得判断是否有时间框的节点内容
			text = shippingAct.getText();
			//在判断是否存在时间框的内容如果是操作就没有时间框 如果是：生产日期 就有时间框
			if(text.contains("操作")){
				for (int i = 1; i <= divNumbers; i++) {
					//输入批次号
					shippingAct.pause(1);
					//输入批次
			    	driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[1]/input[2]"))
			    	.sendKeys("1");
			    	shippingAct.pause(1);
			    	//获得页面批次号
			    	driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[2]/input"))
			    	.sendKeys(shippingAct.getBatchNumber());
				}
				//判断是否提交报错
				this.booleanSubmtIfWrong();
			}else if(text.contains("生产日期")){
				for (int i = 1; i <= divNumbers; i++) {
					//输入批次号
					shippingAct.pause(1);
					//修改时间框的js属性
					jsStart = "var object = document.getElementsByName('createTime');var obj='';" +
								"for (var i = 0; i<object.length;i++){ obj = object[i];" +
									"obj.readOnly=false;" +
									"}";
					jsEnd ="var object = document.getElementsByName('endTime');var obj='';" +
							"for (var i = 0; i<object.length;i++){ obj = object[i];" +
							"obj.readOnly=false;" +
							"}";
					//输入批次
			    	driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[1]/input[2]"))
			    	.sendKeys("1");
			    	shippingAct.pause(1);
			    	//输入数量
			    	driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[2]/input"))
			    	.sendKeys(shippingAct.getBatchNumber());
			    	//输入开始时间
			    	shippingAct.pause(1);
			    	//调用js 修改起始时间框的属性
			    	shippingAct.jsExecutor(jsStart, shippingAct.getShippingPage().getIdCliCreateTime());
					shippingAct.pause(1);
					driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[3]/input"))
			    	.sendKeys("2014-1-1");
					//输入结束时间
					shippingAct.pause(1);
					//调用js 修改结束时间框的属性
			    	shippingAct.jsExecutor(jsEnd, shippingAct.getShippingPage().getIdCliEndTime());
					shippingAct.pause(1);
					driver.findElement(By.xpath("//form[@id='despatch']/div/div["+i+"]/table/tbody/tr[2]/td[4]/input"))
			    	.sendKeys("2014-12-12");
				}
				//判断是否提交报错
				this.booleanSubmtIfWrong();
			}
		}
	}
	
	/**
	 * 判断提交是否报错
	 */
	private void booleanSubmtIfWrong(){
		//点击确认合同按钮
    	shippingAct.clickSubmitBuitton();
    	//判断提交是否报错
    	if(shippingAct.getAlertRightText().contains("发货成功！返回已卖出的商品页！")){
    		//点击弹出框中的确定
    	    shippingAct.clickConfirmButton();
    	}else if(shippingAct.getAlertText().contains("服务器忙！请稍后重试！")){
    		shippingAct.failScreenShot("服务器忙！请稍后重试！");
    		logger.error("test pc supplier 供应商发货 输入发货信息后提交报错，报错内容是：{} -- 导致用例执行失败",
    				shippingAct.getAlertText());
    		Assert.fail("test pc supplier 供应商发货 输入发货信息后提交报错,用例执行失败");
    	}
    	
	}
}
