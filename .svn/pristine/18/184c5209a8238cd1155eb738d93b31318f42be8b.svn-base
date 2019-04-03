package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.BooksPo;

/**
 * 
 * @ClassName:BaidusearchTest
 * @Description:百度搜索中文在线测试类
 * @author:程婧
 * @date:2019年3月20日
 *
 */
public class BooksTest {

	public BooksPo bookspo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		bookspo = new BooksPo();
	}

	// 验证图书列表打开操作是否正确
	@Parameters()
	@Test
	public void testbooklist() {
		Reporter.log("验证图书列表打开操作是否正确");
		bookspo.booklist();
	}
	
	// 验证选择图书，图书详情是否正确
	@Parameters("alterMsg")
	@Test
	public void testAssertBookDetail(String alterMsg) {
		Reporter.log("验证选择图书，图书详情是否正确");
		Assert.assertEquals(bookspo.bookdetail(), alterMsg);
		
	}
	
	//点击【阅读】按钮
	@Parameters()
	@Test
	public void testReading(){
		Reporter.log("验证阅读操作是否正常");
		bookspo.bookreading();
		}	
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(bookspo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
