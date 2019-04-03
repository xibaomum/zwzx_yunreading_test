package Test.Baidu;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.BaidusearchPo;





/**
 * 
 *@ClassName:BaidusearchTest
 *@Description:百度搜索中文在线测试类
 *@author:程婧
 *@date:2019年3月20日
 *
 */
public class BaidusearchTest {
	
	public BaidusearchPo baidusearchpo;
	WebDriver driver;
	
	@BeforeClass
	public void setup(){
		baidusearchpo  = new BaidusearchPo();
	}
	
	    //Input "软件测试" in search box and click search icon
		@Parameters("searchtext")
		@Test
		public void searchbook(String searchtext){
			baidusearchpo.inputSearchtext(searchtext);
			baidusearchpo.clickSearchbutton();
		}
		
		@AfterClass
		public void closed() {
			// 关闭浏览器
			System.out.println("关闭浏览器成功");
			baidusearchpo.driver.close();
		}
		
		
		
}
