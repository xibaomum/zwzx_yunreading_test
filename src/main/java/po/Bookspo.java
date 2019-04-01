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
		@FindBy(xpath = "//div[contains(text(),'图书')]")
		private WebElement bookbutton;

		// 图书详情标题
		@FindBy(className = "topBarTitle")
		private WebElement topmsg;
		public String topmessage;
		
		// 图书列表第一本书——本用例适用于李国文小说自选集
		//or图书列表第一本书必须可读
		@FindBy(xpath = "//sx-horizontal-book/ul/li[1]/div/div[2]/dl/dt/p")
		private WebElement bookNo1;
		
		//【阅读】按钮
		@FindBy(className = "readBtn")
		private WebElement readingButton;
		
		//图书列表第一个【快速阅读】按钮
		@FindBy(className = "//sx-horizontal-book/ul/li[1]/div/div[2]/dl/dt/a")
		private WebElement quickEeadingButton;
		
		
		/**
		 *@Method:toplistmsg
		 *@Description:图书列表url
		 *@author:程婧
		 *@date:2019年3月26日
		 *
		 */
		public void booklist(){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bookbutton.click();
		}
		
		/**
		 *@Method:bookdetail
		 *@Description:图书详情标题
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public String bookdetail(){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//点击图书-李国文小说自选集
			bookNo1.click();
			topmessage = topmsg.getText();
			return topmessage;
		}
		
		/**
		 *@Method:bookreading
		 *@Description:阅读功能-获取具体图书url
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
