package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.ZBTJPo;

/**
 * 
 * @ClassName:MJZZTest
 * @Description:名家作者测试类
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class ZBTJTest {

	public ZBTJPo zbtjpo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		zbtjpo = new ZBTJPo();
	}
	
	
	// 验证点击首页-重磅推荐-单本图书
	@Parameters()
	@Test
	public void testSingleBook() {
		Reporter.log("验证点击首页-重磅推荐-单本图书");
		zbtjpo.singleBook();
	}
	
	
	// 验证点击首页【更多】按钮-流浪地球
		@Parameters()
		@Test
		public void testMoreBook() {
			Reporter.log("验证点击首页【更多】按钮-流浪地球");
			zbtjpo.moreBook();
		}
	
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(zbtjpo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
