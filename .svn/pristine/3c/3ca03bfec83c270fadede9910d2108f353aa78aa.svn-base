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

	// 【我的】按钮
	@FindBy(xpath = "//div[contains(text(),'我的')]")
	private WebElement mine_buttton;

	// 【登录/注册】按钮
	@FindBy(xpath = "//span[contains(text(),'登录/注册')]")
	private WebElement login_register_buttton;

	// 登陆用户名
	@FindBy(xpath = "//mat-card-content/div/ul/li[1]/a/input")
	private WebElement login_username;

	// 密码
	@FindBy(xpath = "//mat-card-content/div/ul/li[2]/a/input")
	private WebElement login_password;

	// 【登录】按钮
	// @FindBy(xpath =
	// "/html/body/app-root/div/sx-login/mat-card/mat-card-content/div/div[1]/button/span")
	@FindBy(css = ".loginBtn.mat-flat-button")
	private WebElement login_button;

	// 【退出登录】按钮
	@FindBy(xpath = "//div[contains(text(),'退出登录')]")
	private WebElement loginout_btn;

	// 错误提示信息
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement alterMsg;
	public String alterMsgContent;

	/**
	 * 
	 * @Method:login
	 * @Description:1.正常登录
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
	 * @Description:2.退出登录
	 *
	 */
	public void loginOut() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homebutton.click();
		mine_buttton.click();
		loginout_btn.click();
	}

	/**
	 * 
	 * @Method:getUsernameMsgContent
	 * 
	 * @Description:3.账户为空
	 *
	 */
	public String getUsernameMsgContent() {

		login_username.clear();
		login_button.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alterMsgContent = alterMsg.getText();
		return alterMsgContent;

	}

	/**
	 * 
	 * @Method:getPasswordMsgContent
	 * @Description:4.密码为空
	 *
	 */
	public String getPasswordMsgContent(String username) {
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_button.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alterMsgContent = alterMsg.getText();
		return alterMsgContent;
	}

	/**
	 * 
	 * @Method:getUsernameunable
	 * 
	 * @Description:5.用户名不存在
	 *
	 */
	public String getUsernameunable(String username, String password) {
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alterMsgContent = alterMsg.getText();
		return alterMsgContent;
	}

	/**
	 * 
	 * @Method:getPasswordErr
	 * 
	 * @Description:6.密码错误
	 *
	 */
	public String getPasswordErr(String username, String password) {
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alterMsgContent = alterMsg.getText();
		return alterMsgContent;
	}

}
