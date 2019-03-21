package common.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.po.RegisterPo;
import main.po.BasePage;

public class RegisterTest extends BasePage{
	
	public RegisterPo registerPo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		registerPo = new RegisterPo();
	}
	
	// 注册操作
		@Parameters({ "username", "password" })
		@Test
		public void testRegister(String username, String password) {
			Reporter.log("验证注册操作是否正常");
			registerPo.register(username, password);
		}

	
}
