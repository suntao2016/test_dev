package com.ccigmall.auto.test.page.pc.supplier.user.subsupplier;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ccigmall.auto.test.page.pc.supplier.user.UserCenterPage;
/**
 * @author zhaixiaoyue
 * 供应商-用户管理-子供应商
 */
public class SubSupplierPage extends UserCenterPage {
	/**
	 * 
	 * @param driver
	 */
	public SubSupplierPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 创建新子供应商按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//form/div/ul[1]/li[2]/button")
	private WebElement addBtn;
	
	/**
	 * 修改按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[2]/li/p[7]/span[1]")
	private WebElement mdfBtn;
	
	/**
	 * 删除按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[2]/li/p[7]/span[2]")
	private WebElement delBtn;
	
	/**
	 * 查看按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div/ul[2]/li/p[7]/span[3]")
	private WebElement checkBtn;
	
	/**
	 * 公司名称输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='companyname']")
	private WebElement companyname;
	
	/**
	 * 国家地区下拉选择框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='companyarea']")
	private WebElement companyarea;
	
	/**
	 * 公司地址输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='companyaddr']")
	private WebElement companyaddr;
	
	/**
	 * 联系人姓名输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='contactname']")
	private WebElement contactname;
	
	/**
	 * 手机输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='tele']")
	private WebElement tele;
	
	/**
	 * 邮箱输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='mailbox']")
	private WebElement mailbox;
	
	/**
	 * 固定电话输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='contacttele']")
	private WebElement contacttele;
	
	/**
	 * 邮编输入框
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='postalcode']")
	private WebElement postalcode;
	
	/**
	 * 企业合法证明
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='fileField']")
	private WebElement proveFile;
	
	/**
	 * 公司详情文件
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='fileField1']")
	private WebElement detailFile;
	
	
	/**
	 * 商品类别
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='mer-cgr']")
	private WebElement productcategory;
	
	/**
	 * 选择商品类别-食品
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[16]/div[2]/div/div/div/ul/li[1]")
	private WebElement pcategoryS;
	
	/**
	 * 选择商品类别-确定
	 *
	 */
	@FindBy(how = How.XPATH, using = "//div[16]/div[2]/h4/span")
	private WebElement pcategoryQ;
		
	/**
	 * 用户名
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@name='loginName']")
	private WebElement loginName;
	
	/**
	 * 密码
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='pwd']")
	private WebElement pwd;
	
	/**
	 * 密码确认
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='pwdRepeat']")
	private WebElement pwdRepeat;
	
	/**
	 * 添加按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='registsubmit']")
	private WebElement addSubmmit;
	
	/**
	 * 返回按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='registcancel']")
	private WebElement addCancel;
	
	
	
	/**
	 * 删除确认按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/div/input[1]")
	private WebElement delQuery;
	
	/**
	 * 删除取消按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/div/input[2]")
	private WebElement delCancel;
	
	/**
	 * 提示框确认按钮
	 *
	 */
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/div/input")
	private WebElement query;
	
	/**
	 * 子供应商列表
	 *
	 */
	@FindBy(how = How.XPATH, using = "//ul[@class='title_2']/li")
	private List<WebElement> tr;
	
	
	/**
	 * @return the addBtn
	 */
	public WebElement getAddBtn() {
		return addBtn;
	}
	
	/**
	 * @return the mdfBtn
	 */
	public WebElement getMdfBtn() {
		return mdfBtn;
	}
	
	/**
	 * @return the delBtn
	 */
	public WebElement getDelBtn() {
		return delBtn;
	}
	
	/**
	 * @return the checkBtn
	 */
	public WebElement getCheckBtn() {
		return checkBtn;
	}
	
	/**
	 * @return the companyname
	 */
	public WebElement getCompanyname() {
		return companyname;
	}
	
	/**
	 * @return the companyarea
	 */
	public WebElement getCompanyarea() {
		return companyarea;
	}
	
	/**
	 * @return the companyaddr
	 */
	public WebElement getCompanyaddr() {
		return companyaddr;
	}
	
	/**
	 * @return the contactname
	 */
	public WebElement getContactname() {
		return contactname;
	}
	
	/**
	 * @return the tele
	 */
	public WebElement getTele() {
		return tele;
	}
	
	/**
	 * @return the mailbox
	 */
	public WebElement getMailbox() {
		return mailbox;
	}
	
	/**
	 * @return the contacttele
	 */
	public WebElement getContacttele() {
		return contacttele;
	}
	
	/**
	 * @return the postalcode
	 */
	public WebElement getPostalcode() {
		return postalcode;
	}
	
	/**
	 * @return the proveFile
	 */
	public WebElement getProveFile() {
		return proveFile;
	}
	
	/**
	 * @return the detailFile
	 */
	public WebElement getDetailFile() {
		return detailFile;
	}
	
	/**
	 * @return the productcategory
	 */
	public WebElement getProductcategory() {
		return productcategory;
	}
	
	/**
	 * @return the pcategoryS
	 */
	public WebElement getPcategoryS() {
		return pcategoryS;
	}
	
	/**
	 * @return the pcategoryQ
	 */
	public WebElement getPcategoryQ() {
		return pcategoryQ;
	}
	
	/**
	 * @return the loginName
	 */
	public WebElement getLoginName() {
		return loginName;
	}
	
	/**
	 * @return the pwd
	 */
	public WebElement getPwd() {
		return pwd;
	}
	
	/**
	 * @return the pwdRepeat
	 */
	public WebElement getPwdRepeat() {
		return pwdRepeat;
	}
	
	/**
	 * @return the addSubmmit
	 */
	public WebElement getaddSubmmit() {
		return addSubmmit;
	}
	
	/**
	 * @return the addCancel
	 */
	public WebElement getAddCancel() {
		return addCancel;
	}
	
	/**
	 * @return the delQuery
	 */
	public WebElement getDelQuery() {
		return delQuery;
	}
	
	/**
	 * @return the delCancel
	 */
	public WebElement getDelCancel() {
		return delCancel;
	}
	
	/**
	 * @return the query
	 */
	public WebElement getQuery() {
		return query;
	}
	

	/**
	 * @return the tr
	 */
	public List<WebElement> getTr() {
		return tr;
	}
}
