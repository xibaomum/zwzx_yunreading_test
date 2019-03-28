package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:Bookpo
 *@Description:图书
 *@author:程婧
 *@date:2019年3月26日
 *
 */
public class BooksPo extends BasePage{
	
	public BooksPo() {
		super();
	}
		
	    // 图书按钮
		@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[1]/mat-card-content/div[2]/div[1]/div[2]")
		private WebElement bookbutton;

		// 详情页置顶说明
//		@FindBy(className = "topBarTitle")
//		private WebElement topmsg;
//		public String topmessage;
		
		// 李国文小说自选集
		@FindBy(xpath = "/html/body/app-root/div/sx-book/pull-load/div/div[1]/sx-horizontal-book/ul/li[4]/div/div[2]/dl/dt")
		private WebElement bookli;
		
		//【阅读】按钮
		@FindBy(className = "readBtn")
		private WebElement readingButton;
		
		
		/**
		 *@Method:toplistmsg
		 *@Description:图书列表置顶信息
		 *@author:程婧
		 *@date:2019年3月26日
		 *
		 */
		public void booklist(){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bookbutton.click();
		}
		
		/**
		 *@Method:bookdetail
		 *@Description:图书详情
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public void bookdetail(){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//点击图书-李国文小说自选集
			bookli.click();
		}
		
		/**
		 *@Method:bookreading
		 *@Description:阅读功能
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public void bookreading(){
			//bookbutton.click();
			//bookli.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//点击【阅读】按钮
			readingButton.click();
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
