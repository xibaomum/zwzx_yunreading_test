package common.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
	
	// 登录-账户为空
	@Parameters("usernameMsg")
		@Test
		public void testAssertUsername(String usernameMsg) {
			Reporter.log("验证账户为空是否可以登录");
			Assert.assertEquals(loginPagepo.getUsernameMsgContent(), usernameMsg);
			;
		}

}
