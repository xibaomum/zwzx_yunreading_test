package common.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

/**
 * 
 * @ClassName:LoginPage
 * @Description:登录-登录页面类
 * @author:程婧
 * @date:2019年3月20日
 *
 */
public class LoginPagepo extends BasePage {

	public LoginPagepo() {
		super();
	}

	// 首页
	@FindBy(className = "top-bar-homeIcon")
	private WebElement homebutton;

	/****************************************** 【我的】按钮 ******************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[1]/mat-card-content/div[2]/div[5]/div[2]")
	private WebElement mine_buttton;

	/****************************************** 登录/注册按钮 ****************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-user/mat-card[1]/mat-card-content/div/div/div[2]/span")
	private WebElement login_register_buttton;

	/*********************************************
	 * 登 录
	 ******************************************************/
	// 登陆用户名
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/ul/li[1]/a/input")
	private WebElement login_username;

	// 密码
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/ul/li[2]/a/input")
	private WebElement login_password;

	// 登录按钮
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/div[1]/button/span")
	private WebElement login_button;

	/**********************************************
	 * 退 出
	 ******************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-user/mat-card[4]/mat-card-content/div/div")
	private WebElement loginout_btn;

	/********************************************** 登录异常 ******************************************************/
	// 账号不能为空!、登录名不存在、密码错误提示
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement usernameMsg;
	public String usernameMsgContent;

	// 密碼为空提示
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement passwordMsg;
	public String passwordMsgContent;

	// 用戶名不存在提示
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement usernameUableMsg;
	public String usernameUnable;

	// 密码错误提示
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement passworderrMsg;
	public String passworderror;

	/**
	 * 
	 * @Method:login
	 * @Description:输入用户名和密码，点击登录按钮
	 * @param username-用户名
	 * @param password-密码
	 *
	 */
	public void login(String username, String password) {
		mine_buttton.click();
		login_register_buttton.click();
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		System.out.print("login success！！");
	}

	/**
	 * 
	 * @Method:loginout
	 * @Description:退出系统
	 *
	 */
	public void loginOut() {
		homebutton.click();
		mine_buttton.click();
		loginout_btn.click();
		System.out.print("logout success！！");
	}

	/**
	 * 
	 * getUsernameMsgContent
	 * 
	 * @Description:清空用户名，点击登录按钮，获得用户名为空的提示信息
	 *
	 */
	public String getUsernameMsgContent() {
		login_username.clear();
		login_button.click();
		usernameMsgContent = usernameMsg.getText();
		return usernameMsgContent;

	}

	/**
	 * 
	 * @Method:getPasswordMsgContent
	 * @Description:获取密码为空的提示信息
	 *
	 */
	public String getPasswordMsgContent(String username) {
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		passwordMsgContent = passwordMsg.getText();
		return passwordMsgContent;
	}

	/**
	 * 
	 * getUsernameunable
	 * 
	 * @Description:用户名不存在
	 *
	 */
	public String getUsernameunable(String username, String password) {
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usernameUnable = usernameUableMsg.getText();
		return usernameUnable;
	}

	/**
	 * 
	 * getPasswordErr
	 * 
	 * @Description:密码错误
	 *
	 */
	public String getPasswordErr(String username, String password) {
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		passworderror = passworderrMsg.getText();
		return passworderror;
	}

}
