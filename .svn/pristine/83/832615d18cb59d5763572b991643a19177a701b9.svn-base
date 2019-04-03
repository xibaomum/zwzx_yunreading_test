package common.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

public class RegisterPo extends BasePage {
	public RegisterPo() {
		super();
	}

	//【我的】按钮
	@FindBy(xpath = "//div[contains(text(),'我的')]")
	private WebElement mine_buttton;

	//【登录/注册】按钮 
	@FindBy(xpath = "//span[contains(text(),'登录/注册')]")
	private WebElement login_register_buttton;

	// 登陆页【注册】按钮
	@FindBy(xpath = "//b[contains(text(),'注册')]")
	private WebElement yn_register_button;

	// 账号
	@FindBy(xpath = "//mat-card-content/div/ul/li[1]/a/input")
	private WebElement useraccount;

	// 密码
	@FindBy(xpath = "//mat-card-content/div/ul/li[2]/a/input")
	private WebElement input_password1;

	// 确认密码
	@FindBy(xpath = "//mat-card-content/div/ul/li[3]/a/input")
	private WebElement input_password2;

	// 【注册】按钮
	@FindBy(css = ".mat-flat-button.loginBtn")
	private WebElement register_button;

	//【马上登录】按钮
	@FindBy(xpath = "//span[contains(text(),'马上登录')]")
	private WebElement register_ok_button;
	
	//错误提示信息
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement accountMsg;
	public String accountMsgContent;
	
	//法律说明
	@FindBy(className = "icon-d")
	private WebElement lawbutton;

	

	

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
	 * @Description:2。密码为空
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
	 * @Method:register
	 * @Description:3。账户大于12位
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
	 * @Description:4。用户名已重复
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
	 * @Description:5。账户包含特殊字符
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
	 * @Method:getpassworddif
	 * @Description:8。密码不一致
	 * @param account-账户
	 * @param password1-密码
	 * @param password2-确认密码
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
	
	/**
	 * 
	 * @Method:getbuttongrey
	 * @Description:9。未勾选法律说明文字
	 * @param account-账户
	 * @param password-密码
	 *
	 */
	public String getbuttongrey(String account,String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		lawbutton.click();
		String classname = register_button.getAttribute("className");
		System.out.print(classname);
		return classname;
	}
	
	
	/**
	 * 
	 * @Method:register
	 * @Description:10。正常注册
	 * @param account-账户
	 * @param password-密码、确认密码
	 *
	 */
	public void register(String account, String password) {
		useraccount.clear();
		useraccount.sendKeys(account);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		lawbutton.click();
		register_button.click();
		register_ok_button.click();
		System.out.print("register success！！");
	}
	
	


}
