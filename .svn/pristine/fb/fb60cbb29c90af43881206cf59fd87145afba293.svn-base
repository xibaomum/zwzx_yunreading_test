package Test.Baidu;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.BookshelfPo;

/**
 * 
 * @ClassName:BaidusearchTest
 * @Description:百度搜索中文在线测试类
 * @author:程婧
 * @date:2019年3月20日
 *
 */
public class BookshelfTest {

	public BookshelfPo bookshelfpo;
	// WebDriver driver;

	@BeforeClass
	public void setup() {
		bookshelfpo = new BookshelfPo();
	}

	// 1.已登录状态_最近收藏_有资源_全选删除
	@Parameters("alterMsg")
	@Test
	public void testAssertLogin_WDLL_Res(String alterMsg) {
		Reporter.log("已登录状态_最近收藏_有资源_全选删除");
		Assert.assertEquals(bookshelfpo.login_ZJLL_Res(), alterMsg);
	}

	// 2.已登录状态_最近收藏_无资源
	@Parameters()
	@Test
	public void testAssertLogin_WDLL_nullRes() {
		Reporter.log("登录状态_最近收藏_无资源");
		bookshelfpo.login_ZJLL_nullRes();
	}

	// 3.已登录状态_我的收藏_有资源_全选删除
	@Parameters("alterMsg2")
	@Test
	public void testAssertLogin_WDSC_Res(String alterMsg2) {
		Reporter.log("已登录状态_我的收藏_有资源_全选删除");
		Assert.assertEquals(bookshelfpo.login_WDSC_Res(), alterMsg2);
	}

	// 4.已登录状态_我的收藏_无资源
	@Parameters()
	@Test
	public void testAssertLogin_WDSC_nullRes() {
		Reporter.log("登录状态_我的收藏_无资源");
		bookshelfpo.login_WDSCL_nullRes();
	}

	// 5.未登录状态_我的收藏_最近浏览
	@Parameters()
	@Test
	public void testAssertUnlogin() {
		Reporter.log("未登录状态_我的收藏_最近浏览");
		bookshelfpo.unlogin_bookshelf();
	}

	// @AfterClass
	// public void closed() {
	// // 关闭浏览器
	// System.out.println("关闭浏览器成功");
	// bookmarkpo.driver.close();
	// }

}
