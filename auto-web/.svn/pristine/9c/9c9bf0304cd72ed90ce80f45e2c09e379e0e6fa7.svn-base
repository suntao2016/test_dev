/**
 * 
 */
package com.ccigmall.auto.test.step.pc.supplier.seller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import com.ccigmall.auto.test.act.pc.supplier.seller.product.CreateProductAct;
import com.ccigmall.auto.test.constant.Constant;
import com.ccigmall.auto.test.step.pc.supplier.SupplierStep;

/**
 * @author jianping.gao
 *  创建商品
 */
public class CreateProductStep extends SupplierStep {

	/**
	 * slf4j
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CreateProductStep.class);
	
	/**
	 * 创建商品
	 */
	private CreateProductAct createProductAct;

	
	/**
	 * 供应商创建商品
	 * @throws Exception
	 */
	@Test(description = "供应商创建商品")
	public void createProduct() throws Exception {
		try {
			
			createProductAct =new CreateProductAct(driver);
			//点击卖家中心
			createProductAct.clickSellerCenter();
			//点击发布商品
			createProductAct.clickCreateProduct();
			//点击一级分类
			createProductAct.clickFisrtClassify();
			//点击二级分类
			createProductAct.clickSecondClassify();		
			//点击三级分类
			createProductAct.clickThirdClassify();
			createProductAct.pause(5);
			//点击下一步,填写商品详细信息
			createProductAct.clickNext();
			//输入商品标题
			String title=createProductAct.enterProductTitle("回归demo");
			setMemVal(Constant.PRODUCT_NAME, title);
		    //选择主品牌
			createProductAct.selectFirstBrand("巧克力联盟");
			//选择子品牌
			createProductAct.selectSecondBrand("联盟金帝");
			//输入产地
			createProductAct.enterOrigin("意大利  米兰");
			//选择颜色
			createProductAct.selectColor("白色");
			//选择原产地
			createProductAct.selectOriginplace("英国");
			//输入制造商
			createProductAct.enterManufacturers("华盛顿特区宾夕法尼亚大道1600号 - 白宫");
			//输入保质期
			createProductAct.enterSheilLife(1);
			//选择保质期单位
			createProductAct.selectSheilLifeType("年");
			//输入商品备注
			createProductAct.enterRemark("阿波罗登月，我来点火,你来抽烟");			
			//上传证明资质的图片
			createProductAct.uploadQualificationImg();
			//选择产品规格 
			createProductAct.clickPackMiddle();
			createProductAct.clickPackSmall();
			createProductAct.clickTasteCoffee();
			createProductAct.clickTasteCream();
			//上传对应的图片
			productName=getMemVal(Constant.PRODUCT_NAME);
			createProductAct.uploadTasteImg(productName);
			//选择计量单位
			createProductAct.selectMeasureUnit("件");
			//选择计价单位
			createProductAct.selectDenominatedUnit("人民币");
			//价格类型  CIF价格
			createProductAct.clickCIFPrice();
			//到岸港口名称
			createProductAct.enterCIF_Port("上海");;		
			//起批量： 盒及以上   人民币/盒
			createProductAct.enterStartUnit(1, 5);
			//按产品规格报价
			createProductAct.clickSkuPriceRadio();
            //输入最小起订量
			createProductAct.enterMinNum(1);
			//输入规格产品单价
			createProductAct.enterSkuUnit(1);
			//收集订单
			createProductAct.clickOrderCollectionType();			
			//输入预计发货日期
			createProductAct.enterDeliveryDate();
			//输入生产能力
			createProductAct.enterMadeNum(20000);
			//选择生产能力 单位
			createProductAct.selectMadeNumType("周");
			//输入最后收单日期
			createProductAct.enterFinalDeliveryDate();
			//输入最大收单量
			createProductAct.enterMaxProdNum(20000);		
			//条形码信息 ： 自动生成
			createProductAct.clickAutoBarcode();			
			//输入包装清单
			createProductAct.enterPackingList("民兵-3洲际导弹自动销毁系统");
			//输入售后服务
			createProductAct.enterSalesService("拍价就送充气娃娃");
			//输入区号
			createProductAct.enterAreaCode(100);
			//输入号码
			createProductAct.enterMobile(88888888);
			//点击提交
			createProductAct.clickSubmit();		
		} catch (AssertionError e) {
			logger.error("supplier create product fail ", e);
			Assert.fail("supplier create product fail >> "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("supplier create product fail ", e);
			throw new TestNGException("supplier create product fail >> "
					+ e.getMessage(), e);
		}
	}
	

}
