package common.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.po.BacktToHomepagePo;





/**
 * 
 *@ClassName:BaidusearchTest
 *@Description:百度搜索中文在线测试类
 *@author:程婧
 *@date:2019年3月20日
 *
 */
public class BackToHomepageTest {
	
	public BacktToHomepagePo backtToHomepagePo;
	WebDriver driver;
	
	@BeforeClass
	public void setup(){
		backtToHomepagePo  = new BacktToHomepagePo();
	}
	
	    //Input "软件测试" in search box and click search icon
		@Parameters()
		@Test
		public void testback(){
			backtToHomepagePo.back();
		}
		
		
}
