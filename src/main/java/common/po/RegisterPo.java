package common.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

public class RegisterPo extends BasePage{
	public RegisterPo() {
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
		System.out.print("register success！！");
	}
	
}