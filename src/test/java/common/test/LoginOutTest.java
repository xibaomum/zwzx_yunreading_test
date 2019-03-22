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
	public WebDriver driver;

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

	}

	// 验证登录时密码为空提示是否正确
	@Parameters({ "username", "passwordMsg" })
	@Test
	public void testAssertPassword(String username, String passwordMsg) {
		Reporter.log("验证登录时密码为空提示是否正确");
		Assert.assertEquals(loginPagepo.getPasswordMsgContent(username), passwordMsg);
	}

	// 验证登录时用户名不存在提示是否正确
	@Parameters({ "username", "password", "usernameUableMsg" })
	@Test
	public void testAssertUsernameUnable(String username, String password, String usernameUableMsg) {
		Reporter.log("验证登录时用户名不存在提示是否正确");
		Assert.assertEquals(loginPagepo.getUsernameunable(username, password), usernameUableMsg);
	}

	// 验证登录时密码错误提示是否正确
		@Parameters({ "username", "password", "passworderrMsg" })
		@Test
		public void testAssertPasswordErr(String username, String password, String passworderrMsg) {
			Reporter.log("验证登录时用户名不存在提示是否正确");
			Assert.assertEquals(loginPagepo.getPasswordErr(username, password), passworderrMsg);
		}
}
