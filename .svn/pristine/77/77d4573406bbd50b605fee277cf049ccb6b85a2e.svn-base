package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.JPTSPo;

/**
 * 
 * @ClassName:JPTSTest
 * @Description:重磅推荐测试类
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class JPTSTest {

	public JPTSPo jptspo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		jptspo = new JPTSPo();
	}
	
	
	
	
	// 验证点击首页单本图书进入标题
	@Parameters("alterMsg")
	@Test
	public void testSingleBook(String alterMsg) {
		//清除缓存
		jptspo.driver.manage().deleteAllCookies();
		Reporter.log(" 验证点击首页单本图书进入标题");
		Assert.assertEquals(jptspo.singleBook(), alterMsg);
		
	}
	
	
	// 验证点击首页【更多】按钮列表进入标题
		@Parameters("alterMsg")
		@Test
		public void testMoreBook(String alterMsg) {
			//清除缓存
			jptspo.driver.manage().deleteAllCookies();
			Reporter.log("验证点击首页【更多】按钮列表进入标题");
			Assert.assertEquals(jptspo.moreBook(), alterMsg);
			
		}
	
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(jptspo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
