package common.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.po.RegisterPo;
import main.po.BasePage;

public class RegisterTest extends BasePage {

	public RegisterPo registerPo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		registerPo = new RegisterPo();
	}

	// 注册操作
	@Parameters({ "account", "password" })
	@Test
	public void testRegister(String account, String password) {
		Reporter.log("验证注册操作是否正常");
		registerPo.register(account, password);
	}

	// 验证注册时账户为空提示是否正确
	@Parameters("alterMsg")
	@Test
	public void testAssertAccountNull(String alterMsg) {
		Reporter.log("验证注冊时输入账户为空提示是否正确");
		Assert.assertEquals(registerPo.getaccountisnull(), alterMsg);
	}
	
	// 验证注册时账户大于12位提示是否正确
		@Parameters({ "account", "password","alterMsg" })
		@Test
		public void testAssertAccountLong(String account, String password,String alterMsg) {
			Reporter.log("验证注冊时输入账户大于12位提示是否正确");
			Assert.assertEquals(registerPo.getaccountislong(account,password), alterMsg);
		}

}
