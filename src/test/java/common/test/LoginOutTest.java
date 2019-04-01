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

	// 1.正常登录
	@Parameters({ "username", "password" })
	@Test
	public void testLogin(String username, String password) {
		Reporter.log("验证登录操作是否正常");
		loginPagepo.login(username, password);
	}

	// 2.退出登录
	@Test
	public void testLoginOut() {
		Reporter.log("验证是否可以退出登录");
		loginPagepo.loginOut();
	}

	// 3.账户为空
	@Parameters("alterMsg")
	@Test
	public void testAssertUsername(String alterMsg) {
		Reporter.log("验证账户为空是否可以登录");
		Assert.assertEquals(loginPagepo.getUsernameMsgContent(), alterMsg);

	}

	// 4.密码为空
	@Parameters({ "username", "alterMsg" })
	@Test
	public void testAssertPassword(String username, String alterMsg) {
		Reporter.log("验证登录时密码为空提示是否正确");
		Assert.assertEquals(loginPagepo.getPasswordMsgContent(username), alterMsg);
	}

	// 5.用户名不存在
	@Parameters({ "username", "password", "alterMsg" })
	@Test
	public void testAssertUsernameUnable(String username, String password, String alterMsg) {
		Reporter.log("验证登录时用户名不存在提示是否正确");
		Assert.assertEquals(loginPagepo.getUsernameunable(username, password), alterMsg);
	}

	// 6.密码错误
	@Parameters({ "username", "password", "alterMsg" })
	@Test
	public void testAssertPasswordErr(String username, String password, String alterMsg) {
		Reporter.log("验证登录时用户名不存在提示是否正确");
		Assert.assertEquals(loginPagepo.getPasswordErr(username, password), alterMsg);
	}
}
