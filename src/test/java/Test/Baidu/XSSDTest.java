package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.XSSDPo;

/**
 * 
 * @ClassName:JPTSTest
 * @Description:重磅推荐测试类
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class XSSDTest {

	public XSSDPo xssdpo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		xssdpo = new XSSDPo();
	}
	
	
	
	
	// 验证点击首页单本图书
	@Parameters("alterMsg")
	@Test
	public void testSingleBook(String alterMsg) {
		//清除缓存
		xssdpo.driver.manage().deleteAllCookies();
		Reporter.log("验证点击首页单本图书");
		Assert.assertEquals(xssdpo.singleBook(), alterMsg);
		
	}
	
	
	// 验证点击首页【更多】按钮
		@Parameters("alterMsg")
		@Test
		public void testMoreBook(String alterMsg) {
			Reporter.log("验证点击首页【更多】按钮");
			Assert.assertEquals(xssdpo.moreBook(), alterMsg);
			
		}
	
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(xssdpo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
