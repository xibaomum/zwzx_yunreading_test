package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.ListenbooksPo;

/**
 * 
 * @ClassName:ListenBookTest
 * @Description:听书测试类
 * @author:程婧
 * @date:2019年3月27日
 *
 */
public class ListenBooksTest {

	public ListenbooksPo listenbookspo;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		listenbookspo = new ListenbooksPo();
	}

	// 验证听书列表打开操作是否正确
	@Parameters()
	@Test
	public void testListenBooks() {
		Reporter.log("验证听书列表打开操作是否正确");
		if(listenbookspo.listenbooks().equals("00:00")){
			listenbookspo.back();
			System.out.print("lalalallalal----此资源内容配置不正确------hahahahahha");
		}else{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			listenbookspo.back();
			System.out.print("听书成功！");
		}
		
		
	}
	
	//验证当然url
	@Parameters("currentUrl")
	@Test
	public void testGetCurUrl(String currentUrl) {
		Reporter.log("验证是否当前url是否与预期匹配");
		Assert.assertEquals(listenbookspo.getCurUrl(), currentUrl);
	}

	
	
	
	
	
	
//	@AfterClass
//	public void closed() {
//		// 关闭浏览器
//		System.out.println("关闭浏览器成功");
//		bookspo.driver.close();
//	}

}
