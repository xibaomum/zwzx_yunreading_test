package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.MJZZPo;

/**
 * 
 * @ClassName:MJZZTest
 * @Description:名家作者测试类
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class MJZZTest {

	public MJZZPo mjzzpo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		mjzzpo = new MJZZPo();
	}
	
	
	// 验证点击首页单人作者下资源是否正确
	@Parameters()
	@Test
	public void testHomepageAuthor() {
		Reporter.log("验证听书列表打开操作是否正确");
		mjzzpo.homepageAuthor();
	}
	
	
	// 验证点击首页【更多】按钮-刘慈欣
		@Parameters()
		@Test
		public void testMoreAuthor() {
			Reporter.log("验证点击首页【更多】按钮-刘慈欣");
			mjzzpo.moreAuthor();
		}
	
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(mjzzpo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
