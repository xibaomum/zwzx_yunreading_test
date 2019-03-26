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
		
	// 验证注册时账户重复提示是否正确
	@Parameters({ "account", "password","alterMsg" })
	@Test
	public void testAssertAccountSame(String account, String password,String alterMsg) {
		Reporter.log("验证注冊时输入账户重复提示是否正确");
		Assert.assertEquals(registerPo.getaccountsame(account,password), alterMsg);
	}
	
	// 验证注册时账户存在特殊字符提示是否正确
	@Parameters({ "account", "password","alterMsg" })
	@Test
	public void testAssertAccountSpecial(String account, String password,String alterMsg) {
		Reporter.log("验证注冊时输入账户存在特殊字符提示是否正确");
		Assert.assertEquals(registerPo.getaccountspecial(account,password), alterMsg);
	}
	
	// 验证注册时密码为空提示是否正确
	@Parameters({ "account", "alterMsg" })
	@Test
	public void testAssertPsswordNull(String account,String alterMsg) {
		Reporter.log("验证注冊时输入密码为空提示是否正确");
		Assert.assertEquals(registerPo.getpasswordnull(account), alterMsg);
	}
	
	// 验证注册时密码小于6位提示是否正确
	@Parameters({ "account","password", "alterMsg" })
	@Test
	public void testAssertPsswordLess(String account,String password,String alterMsg) {
		Reporter.log("验证注冊时输入密码小于6位提示是否正确");
		Assert.assertEquals(registerPo.getpasswordless(account, password), alterMsg);
	}
		
	// 验证注册时密码大于16位提示是否正确
	@Parameters({ "account","password", "alterMsg" })
	@Test
	public void testAssertPsswordMore(String account,String password,String alterMsg) {
		Reporter.log("验证注冊时输入密码大于16位提示是否正确");
		Assert.assertEquals(registerPo.getpasswordmore(account, password), alterMsg);
	}
	
	// 验证注册时密码不一致提示是否正确
	@Parameters({ "account","password1","password2", "alterMsg" })
	@Test
	public void testAssertPsswordDif(String account,String password1,String password2,String alterMsg) {
		Reporter.log("验证注冊时输入密码不一致提示是否正确");
		Assert.assertEquals(registerPo.getpassworddif(account, password1, password2), alterMsg);
	}
	
	// 验证注册时未勾选法律说明【注册】按钮状态是否正确
	@Parameters({ "account","password","alterMsg" })
	@Test
	public void testAssertButtonGrey(String account,String password,String alterMsg) {
		Reporter.log("验证注冊时未勾选法律说明【注册】按钮状态是否正确");
		Assert.assertEquals(registerPo.getbuttongrey(account, password), alterMsg);
	}

}
