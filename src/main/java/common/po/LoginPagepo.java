package common.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;

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
	
	/******************************************【我的】按钮******************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[1]/mat-card-content/div[2]/div[5]/div[2]")
	private WebElement mine_buttton;

	/******************************************登录/注册按钮****************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-user/mat-card[1]/mat-card-content/div/div/div[2]/span")
	private WebElement login_register_buttton;

	/******************************************注   册*********************************************************/
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

	/********************************************马上登录按钮***************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-registerok/mat-card/mat-card-content/div/div[3]/button")
	private WebElement register_ok_button;
	
	/*********************************************登    录******************************************************/
	// 登陆用户名
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/ul/li[1]/a/input")
	private WebElement login_username;
	
	// 密码
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/ul/li[2]/a/input")
	private WebElement login_password;

	// 登录按钮
	@FindBy(xpath = "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/div[1]/button/span")
	private WebElement login_button;

	/**********************************************退    出******************************************************/
	@FindBy(xpath = "/html/body/app-root/div/sx-user/mat-card[4]/mat-card-content/div/div")
	private WebElement loginout_btn;

	/**
	 * 
	 * @Method:register
	 * @Description:点击登录页面注册按钮，输入账户、密码和确认密码，点击注册按钮，注冊成功
	 * @param account-账户
	 * @param password1-密码
	 * @param password2-确认密码
	 *
	 */
	public void register(String username, String password) {
		mine_buttton.click();
		login_register_buttton.click();
		yn_register_button.click();
		useraccount.clear();
		useraccount.sendKeys(username);
		input_password1.clear();
		input_password1.sendKeys(password);
		input_password2.clear();
		input_password2.sendKeys(password);
		register_button.click();
		register_ok_button.click();
	}

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
	}

	/**
	 * 
	 * @Method:loginout
	 * @Description:退出系统
	 *
	 */
	public void loginOut() {
		loginout_btn.click();
	}

	/**
	 * 
	 * @Method:getCurUrl
	 * @Description:获取当前页面的url
	 *
	 */
	public String getCurUrl() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver = InitTest.instance.driver;
		return driver.getCurrentUrl();
	}

}
