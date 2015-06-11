/**
 * 
 */
package com.ccigmall.auto.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

/**
 * @author jianping.gao
 * 
 */
public class SettingPage {

	protected WebDriver driver;

	/**
	 * 
	 * @param driver
	 */
	public SettingPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(finder, this);
	}

}
