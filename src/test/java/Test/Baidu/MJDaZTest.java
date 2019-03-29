package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.MJDaZPo;

/**
 * 
 * @ClassName:MJDaZTest
 * @Description:名家大作测试类
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class MJDaZTest {

	public MJDaZPo mjdazpo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		mjdazpo = new MJDaZPo();
	}

	// 验证点击首页单本图书
	@Parameters()
	@Test
	public void testHJWXSingleBook() {
		// 清除缓存
		mjdazpo.driver.manage().deleteAllCookies();
		Reporter.log("验证点击首页单本图书");
		mjdazpo.hjwx_singleBook();
	}

	// 验证点击首页【更多】按钮
	@Parameters("alterMsg")
	@Test
	public void testHJWXMoreBook(String alterMsg) {
		Reporter.log("验证点击首页【更多】按钮");
		Assert.assertEquals(mjdazpo.hjwx_moreBook(), alterMsg);
	}

	// 验证点击首页单本图书
	@Parameters()
	@Test
	public void testCXTSSingleBook() {
		// 清除缓存
		mjdazpo.driver.manage().deleteAllCookies();
		Reporter.log("验证点击首页单本图书");
		mjdazpo.cxts_singleBook();
	}

	// 验证点击首页【更多】按钮
	@Parameters("alterMsg")
	@Test
	public void testCXTSMoreBook(String alterMsg) {
		Reporter.log("验证点击首页【更多】按钮");
		Assert.assertEquals(mjdazpo.cxts_moreBook(), alterMsg);
	}

	// 验证点击首页单本图书
	@Parameters()
	@Test
	public void testMJZPSingleBook() {
		// 清除缓存
		mjdazpo.driver.manage().deleteAllCookies();
		Reporter.log("验证点击首页单本图书");
		mjdazpo.mjzp_singleBook();
	}

	// 验证点击首页【更多】按钮
	@Parameters("alterMsg")
	@Test
	public void testMJZPMoreBook(String alterMsg) {
		Reporter.log("验证点击首页【更多】按钮");
		Assert.assertEquals(mjdazpo.mjzp_moreBook(), alterMsg);
	}

	// 验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(mjdazpo.getCurUrl(), currentUrl);
	}

	// @AfterClass
	// public void closed() {
	// // 关闭浏览器
	// System.out.println("关闭浏览器成功");
	// bookspo.driver.close();
	// }

}
