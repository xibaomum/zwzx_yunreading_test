package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:StylePo
 *@Description:图书
 *@author:程婧
 *@date:2019年3月26日
 *
 */
public class StylePo extends BasePage{
	
	public StylePo() {
		super();
	}
		
	    // 分类按钮
		@FindBy(xpath = "//span[contains(text(),'分类')]")
		private WebElement button;
		
		// 图书分类第一个
		@FindBy(xpath = "//*[@id='mat-tab-content-0-0']/div/div/ul/li[1]/div[2]/p[1]")
		private WebElement tsNO1;
		
		// 首页
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homebutton;
		
		// 听书tab
		@FindBy(xpath = "//*[@id='mat-tab-label-1-1']/div")
		private WebElement listentab;
		
		// 听书分类第一个
		@FindBy(xpath = "//*[@id='mat-tab-content-1-1']/div/div/ul/li[1]/div[2]/p[1]")
		private WebElement listenNO1;
		
		
		
		/**
		 *@Method:listenlist
		 *@Description:听书列表
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public void style_book(){
			button.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tsNO1.click();
			
		}
		
		/**
		 *@Method:listenlist
		 *@Description:听书列表
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public void style_listen(){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			homebutton.click();
			button.click();
			listentab.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			listenNO1.click();
			
		}

		/**
		 * 
		 *@Method:getCurUrl
		 *@Description:获取当前页面的url
		 *
		 */	
		public String  getCurUrl(){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebDriver driver=InitTest.instance.driver;
			return driver.getCurrentUrl();		
		}
		
		
		
		
}
