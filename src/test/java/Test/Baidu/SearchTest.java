package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.Searchpo;

/**
 * 
 * @ClassName:SearchTest
 * @Description:搜索测试类
 * @author:程婧
 * @date:2019年3月27日
 *
 */
public class SearchTest {

	public Searchpo searchpo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		searchpo = new Searchpo();
	}

	// 搜索听书-十万个怎么办
	@Parameters()
	@Test
	public void testSearchBooks() {
		Reporter.log("搜索听书-十万个怎么办");
		searchpo.searchbook();
	}
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(searchpo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
