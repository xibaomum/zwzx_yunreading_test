package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.StylePo;

/**
 * 
 * @ClassName:ListenBookTest
 * @Description:听书测试类
 * @author:程婧
 * @date:2019年3月27日
 *
 */
public class StyleTest {

	public StylePo stylePo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		stylePo = new StylePo();
	}

	// 验证图书tab下分类打开操作是否正确
	@Parameters()
	@Test
	public void testStyleBook() {
		Reporter.log("验证图书tab下分类打开操作是否正确");
		stylePo.style_book();
	}
	
	// 验证听书tab下分类打开操作是否正确
	@Parameters()
	@Test
	public void testStyleListen() {
		Reporter.log("验证听书tab下分类打开操作是否正确");
		stylePo.style_listen();
	}
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(stylePo.getCurUrl(), currentUrl);

	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
