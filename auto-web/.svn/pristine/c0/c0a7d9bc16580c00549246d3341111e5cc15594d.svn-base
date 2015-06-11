/**
 * 
 */
package com.ccigmall.auto.test.act.pc.dealer.user.usermanage;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ccigmall.auto.test.act.SettingActiton;
import com.ccigmall.auto.test.act.pc.dealer.IndexAct;
import com.ccigmall.auto.test.act.pc.dealer.user.UserCenterAct;
import com.ccigmall.auto.test.page.pc.dealer.IndexPage;
import com.ccigmall.auto.test.page.pc.dealer.LoginPage;
import com.ccigmall.auto.test.page.pc.dealer.user.RegisterPage;
import com.ccigmall.auto.test.page.pc.dealer.user.UserCenterPage;
import com.ccigmall.auto.test.page.pc.dealer.user.base.BaseInfoPage;
import com.ccigmall.auto.test.page.pc.dealer.user.usermanage.UserManagePage;

/**
 * @author dengshuhai
 * 
 * @since 2015-01-07 经销商用户中心 信息管理
 */
public class UserManageAct extends UserCenterAct {

	/**
	 * slf4j
	 */
	public final static Logger logger = LoggerFactory
			.getLogger(UserManageAct.class);

	/**
	 * 用户中心页面
	 * 
	 */
	private UserManagePage userManagePage;

	/**
	 * 
	 * @param driver
	 */
	public UserManageAct(WebDriver driver) {
		super(driver);
		userManagePage = new UserManagePage(driver);
	}

	/**
	 * 点击创建新用户
	 */
	public void clickAddUser() {
		logger.info("点击 创建新用户：{}",userManagePage.getAddUser());
		this.click(userManagePage.getAddUser());
	}
	
	/**
	 * 点击删除按钮
	 */
	public void clickDelUser() {
		logger.info("点击删除按钮：{}",userManagePage.getDelUser());
		this.click(userManagePage.getDelUser());
	}
	/**
	 * 点击全选按钮
	 */
	public void clickCheck() {
		logger.info("点击全选按钮：{}",userManagePage.getCheckAll());
		this.click(userManagePage.getCheckAll());
	}
	/**
	 * 输入用户名
	 */
	public void inputUserName(String text) {
		logger.info("输入用户名：{}",text);
		this.type(userManagePage.getUserName(),text);
	}
	/**
	 * 输入密码
	 */
	public void inputPassword(String text) {
		logger.info("输入密码：{}",text);
		this.type(userManagePage.getPassword(),text);
	}
	/**
	 * 输入确认密码
	 */
	public void inputRePassword(String text) {
		logger.info("输入确认密码：{}",text);
		this.type(userManagePage.getRepassword(),text);
	}
/**
 * 选择role
 * @param text
 */

	public void selectRole(String text) {
		if(text!=null||!"".equals(text)){
			logger.info("选择角色：{}",text);
			new Select(userManagePage.getRoleSelect()).selectByVisibleText(text);
		}else{
			logger.error("缓存中的角色名称：{}不存在！",text);
			Assert.fail("缓存中的角色名称不存在！");
		}
	}
	/**
	 * 添加用户-确定
	 */
	public void clickSaveButton() {
		logger.info(" 添加用户-确定：{}",userManagePage.getAddUserButton());
		this.click(userManagePage.getAddUserButton());
	}
	/**
	 * 添加用户-取消
	 */
	public void clickCancelButton() {
		logger.info(" 添加用户-取消：{}",userManagePage.getAddUserCancel());
		this.click(userManagePage.getAddUserCancel());
	}
	
	/*****************************修改用户*******************************/
	/**
	 * 输入密码
	 */
	public void inputModifyPassword(String text) {
		logger.info("输入密码：{}",text);
		this.type(userManagePage.getPassword1(),text);
	}
	/**
	 * 输入确认密码
	 */
	public void inputModifyRePassword(String text) {
		logger.info("输入确认密码：{}",text);
		this.type(userManagePage.getRepassword1(),text);
	}
/**
 * 选择role
 * @param text
 */

	public void selectModifyRole(String text) {
		if(text!=null||!"".equals(text)){
			logger.info("选择角色：{}",text);
			new Select(userManagePage.getRoleSelect1()).selectByVisibleText(text);
		}else{
			logger.error("缓存中的角色名称：{}不存在！",text);
			Assert.fail("缓存中的角色名称不存在！");
		}
	}
	/**
	 *修改用户-确定
	 */
	public void clickModifySaveButton() {
		logger.info(" 修改用户-确定：{}",userManagePage.getUserEidtConfirm());
		this.click(userManagePage.getUserEidtConfirm());
	}
	/**
	 * 修改用户-取消
	 */
	public void clickModifyCancelButton() {
		logger.info("修改用户-取消：{}",userManagePage.getUserEidtCancel());
		this.click(userManagePage.getUserEidtCancel());
	}
	
	/**
	 * 通过用户名称 查找 删除
	 * @param username
	 */
	public void selectDelByUserName(String username){
		List<WebElement> eles ;
			boolean flag = false;
		if(username.contains("过期"))
			Assert.fail("用户名称过期，流程无法继续！");
		do {
			eles = userManagePage.getUserInfoList();
			int size = eles.size();
			logger.info("信息条数为:{}", size);
			for (int i = 0; i < size; i++) {
				String msg = eles.get(i).getText().trim();
				logger.info("取到的用户为：{}", msg);
				if (msg != null && username.equals(msg)) {
					logger.info("找到第{}个对应用户:{}，点击删除", i+1,username);
					int j = i+1;
					click(driver.findElement(By.xpath(".//*[@id='deleteForm']/div/div[3]/div/ul[2]/li["
											+j+ "]/p[4]/span[1]")));
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}else{
				if (isElementExist("//button[contains(text(),'下一页')]/img",3)&&userManagePage.getNextPage().getAttribute("src").contains("x7.png")) {
					// 点击下一页
					click(userManagePage.getNextPage());
				}else{
					logger.debug("未找到该用户！无法删除");
					Assert.fail("未找到该用户:"+username);
				}
			}
		
		} while (!flag);
	}
	/**
	 * 通过用户名称 查找 编辑
	 * @param username
	 *
	 */
	public void selectModifyByUserName(String username){
		if(username.contains("过期"))
		Assert.fail("用户名称过期，流程无法继续！");
		
		List<WebElement> eles ;
		boolean flag = false;
		do {
			eles = userManagePage.getUserInfoList();
			int size = eles.size();
			logger.info("信息条数为:{}", size);
			for (int i = 0; i < size; i++) {
				String msg = eles.get(i).getText().trim();
				logger.info("取到的用户为：{}", msg);
				if (msg != null && username.equals(msg)) {
					logger.info("找到第{}个对应用户:{}，点击编辑", i+1,username);
					int j = i+1;
					 click(driver.findElement(By.xpath(".//*[@id='deleteForm']/div/div[3]/div/ul[2]/li["
							 +j+ "]/p[4]/span[2]")));
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}else{
				if (isElementExist("//button[contains(text(),'下一页')]/img",3)&&userManagePage.getNextPage().getAttribute("src").contains("x7.png")) {
					// 点击下一页
					click(userManagePage.getNextPage());
				}else{
					logger.debug("未找到该用户！无法编辑");
					Assert.fail("未找到该用户:"+username);
				}
			}
		
		} while (!flag);
	}
	
	/**
	 * 删除用户-确定
	 */
	public void clickDelAlertConfirm() {
		logger.info(" 删除用户-确定：{}",userManagePage.getAlertConfirm());
		this.click(userManagePage.getAlertConfirm());
	}
	/**
	 * 删除用户-取消
	 */
	public void clickDelAlertCancel() {
		logger.info(" 删除用户-取消：{}",userManagePage.getAlertCancel());
		this.click(userManagePage.getAlertCancel());
	}
	
}
