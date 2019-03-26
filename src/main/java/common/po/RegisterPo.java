package common.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

public class RegisterPo extends BasePage {
	public RegisterPo() {
		super();
	}

	/****************************************** 【我的】按钮 ******************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[1]/mat-card-content/div[2]/div[5]/div[2]")
	private WebElement mine_buttton;

	/****************************************** 登录/注册按钮 ****************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-user/mat-card[1]/mat-card-content/div/div/div[2]/span")
	private WebElement login_register_buttton;

	/******************************************
	 * 注 册
	 *********************************************************/
	// 登陆页注册按钮
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/div[2]/button/span")
	private WebElement yn_register_button;

	// 账号
	@FindBy(xpath = "/html/body/app-root/div/sx-register/mat-card/mat-card-content/div/ul/li[1]/a/input")
	private WebElement useraccount;

	// 密码
	@FindBy(xpath = "/html/body/app-root/div/sx-register/mat-card/mat-card-content/div/ul/li[2]/a/input")
	private WebElement input_password1;

	// 确认密码
	@FindBy(xpath = "/html/body/app-root/div/sx-register/mat-card/mat-card-content/div/ul/li[3]/a/input")
	private WebElement input_password2;

	// 注册按钮
	@FindBy(xpath = "/html/body/app-root/div/sx-register/mat-card/mat-card-content/div/div[1]/button")
	private WebElement register_button;

	/******************************************** 马上登录按钮 ***************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-registerok/mat-card/mat-card-content/div/div[3]/button")
	private WebElement register_ok_button;
	
	//账号异常
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement accountMsg;
	public String accountMsgContent;
	

	/**
	 * 
	 * @Method:register
	 * @Description:1。正常注册
	 * @param account-账户
	 * @param password-密码、确认密码
	 *
	 */
	public void register(String account, String password) {
		mine_buttton.click();
		login_register_buttton.click();
		yn_register_button.click();
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		register_ok_button.click();
		System.out.print("register success！！");
	}

	/**
	 * 
	 * @Method:getaccountisnull
	 * @Description:1。账户为空
	 *
	 */
	public String getaccountisnull() {
		mine_buttton.click();
		login_register_buttton.click();
		yn_register_button.click();
		useraccount.clear();
		input_password1.clear();
		input_password2.clear();
		register_button.click();
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;
		

	}
	
	/**
	 * 
	 * @Method:register
	 * @Description:2。账户大于12位
	 * @param account-账户
	 * @param password-密码、确认密码
	 *
	 */
	public String getaccountislong(String account,String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;

	}
	
	
	/**
	 * 
	 * @Method:register
	 * @Description:3。用户名已重复
	 * @param account-账户
	 * @param password-密码、确认密码
	 *
	 */
	public String getaccountsame(String account,String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;

	}
	
	/**
	 * 
	 * @Method:register
	 * @Description:4。账户包含特殊字符
	 * @param account-账户
	 * @param password-密码、确认密码
	 *
	 */
	public String getaccountspecial(String account,String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;

	}
	
	/**
	 * 
	 * @Method:register
	 * @Description:5。密码为空
	 * @param account-账户
	 *
	 */
	public String getpasswordnull(String account) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password2.clear();
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;
	}
	
	/**
	 * 
	 * @Method:getpasswordless
	 * @Description:6。密码小于6位
	 * @param account-账户
	 * @param password-密码
	 *
	 */
	public String getpasswordless(String account,String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;
	}
	
	/**
	 * 
	 * @Method:getpasswordmore
	 * @Description:7。密码大于16位
	 * @param account-账户
	 * @param password-密码
	 *
	 */
	public String getpasswordmore(String account,String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;
	}
	
	/**
	 * 
	 * @Method:getpasswordmore
	 * @Description:7。密码大于16位
	 * @param account-账户
	 * @param password-密码
	 *
	 */
	public String getpassworddif(String account,String password1,String password2) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password1);
		input_password2.clear();
		input_password2.sendKeys(password2);
		register_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountMsgContent = accountMsg.getText();
		return accountMsgContent;
	}


}
