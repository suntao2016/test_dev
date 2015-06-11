package com.ccigmall.auto.test.page.pc.platform.promotion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ccigmall.auto.test.page.SettingPage;
/**
 * 
 * @author chenjingli
 * 
 */
public class ActivityRuleManagementPage  extends SettingPage{
	/**
	 * 活动规则管理
	 * @param driver
	 */
	public ActivityRuleManagementPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 点击创建平台规则按钮
	 */
	@FindBy(id="platformRuleButton")
	private WebElement IdCliRuleButton;
	/**
	 * 输入规则名称
	 */
	@FindBy(id="ruleName")
	private WebElement IdTypeRuleName;
	/**
	 * 输入规则描述
	 */
	@FindBy(id="description")
	private WebElement IdTypeRuleDescription;
	/**
	 * 点击确定按钮
	 */
	@FindBy(id="confirmButton")
	private WebElement IdClickSubmit;
	/**
	 * 点击取消按钮
	 */
	@FindBy(id="backButton")
	private WebElement IdClickRemoveButton;
	/**
	 * 点击订单确认按钮单选框
	 */
	@FindBy(id="triggerCondition")
	private WebElement IdClickRadioOrder;
	
	
	/**
	 * 点击创建平台规则按钮
	 */
	public WebElement getIdCliRuleButton() {
		return IdCliRuleButton;
	}
	/**
	 * 输入规则名称
	 */
	public WebElement getIdTypeRuleName() {
		return IdTypeRuleName;
	}
	public WebElement getIdTypeRuleDescription() {
		return IdTypeRuleDescription;
	}
	/**
	 * 点击确定按钮
	 */
	public WebElement getIdClickSubmit() {
		return IdClickSubmit;
	}
	/**
	 * 点击取消按钮
	 */
	public WebElement getIdClickRemoveButton() {
		return IdClickRemoveButton;
	}
	/**
	 * 点击订单确认按钮单选框
	 */
	public WebElement getIdClickRadioOrder() {
		return IdClickRadioOrder;
	}
	
	
}
