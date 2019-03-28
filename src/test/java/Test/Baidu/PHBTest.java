package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.PHBPo;

/**
 * 
 * @ClassName:PHBTest
 * @Description:重磅推荐测试类
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class PHBTest {

	public PHBPo phbpo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		phbpo = new PHBPo();
	}

	// 验证点击首页单本图书
	@Parameters()
	@Test
	public void testSingleBook() {
		// 清除缓存
		phbpo.driver.manage().deleteAllCookies();
		Reporter.log("验证点击首页单本图书");
		phbpo.singleBook();
	}

	// 验证点击首页【更多】按钮
	@Parameters("alterMsg")
	@Test
	public void testMoreBook(String alterMsg) {
		Reporter.log("验证点击首页【更多】按钮");
		Assert.assertEquals(phbpo.moreBook(), alterMsg);
	}
	
	// 验证点击首页单本听书
		@Parameters()
		@Test
		public void testSingleListen() {
			// 清除缓存
			phbpo.driver.manage().deleteAllCookies();
			Reporter.log("验证点击首页单本图书");
			phbpo.singleListen();
		}

		// 验证点击首页【更多】按钮
		@Parameters("alterMsg")
		@Test
		public void testMoreListen(String alterMsg) {
			Reporter.log("验证点击首页【更多】按钮");
			Assert.assertEquals(phbpo.moreListen(), alterMsg);
		}
	
	
	
	
	

	// 验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(phbpo.getCurUrl(), currentUrl);
	}

	// @AfterClass
	// public void closed() {
	// // 关闭浏览器
	// System.out.println("关闭浏览器成功");
	// bookspo.driver.close();
	// }

}
