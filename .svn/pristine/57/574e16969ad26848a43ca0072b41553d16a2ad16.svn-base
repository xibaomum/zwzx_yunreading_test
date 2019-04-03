package Test.Baidu;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.BookmarkPo;

/**
 * 
 * @ClassName:BaidusearchTest
 * @Description:百度搜索中文在线测试类
 * @author:程婧
 * @date:2019年3月20日
 *
 */
public class BookmarkTest {

	public BookmarkPo bookmarkpo;
	// WebDriver driver;

	@BeforeClass
	public void setup() {
		bookmarkpo = new BookmarkPo();
	}

	// 1.登录状态收藏图书
	@Parameters("alterMsg")
	@Test
	public void testAssertLoginCollect(String alterMsg) {
		Reporter.log("登录状态收藏图书");
		Assert.assertEquals(bookmarkpo.login_collect(), alterMsg);
	}

	// 2.登录状态取消收藏图书
	@Parameters("alterMsg")
	@Test
	public void testAssertLoginUNCollect(String alterMsg) {
		Reporter.log("登录状态取消收藏图书");
		Assert.assertEquals(bookmarkpo.login_uncollect(), alterMsg);
	}

	// 3.未登录状态收藏图书
	@Parameters("alterMsg")
	@Test
	public void testAssertUNLoginCollect(String alterMsg) {
		Reporter.log("未登录状态收藏图书");
		Assert.assertEquals(bookmarkpo.unlogin_collect(), alterMsg);
	}

	// @AfterClass
	// public void closed() {
	// // 关闭浏览器
	// System.out.println("关闭浏览器成功");
	// bookmarkpo.driver.close();
	// }

}
