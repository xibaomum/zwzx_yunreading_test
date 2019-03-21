package common.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.po.LoginPagepo;

public class LoginOutTest {

	public LoginPagepo loginPagepo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		loginPagepo = new LoginPagepo();
	}
	
	
	// 登录操作
	@Parameters({ "username", "password" })
	@Test
	public void testLogin(String username, String password) {
		Reporter.log("验证登录操作是否正常");
		loginPagepo.login(username, password);
	}

	// 退出登录
	@Test
	public void testLoginOut() {
		Reporter.log("验证是否可以退出登录");
		loginPagepo.loginOut();
	}

}
