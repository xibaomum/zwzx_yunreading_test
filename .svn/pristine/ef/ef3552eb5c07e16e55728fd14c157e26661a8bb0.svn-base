package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:PHBPo
 *@Description:排行榜
 *@author:程婧
 *@date:2019年3月28日
 *
 */
public class PHBPo extends BasePage{
	
	public PHBPo() {
		super();
	}
		
	    // 首页-排行榜-图书-单本
	    @FindBy(xpath = "//mat-list-item[1]/div/div[3]/ul/li[1]/div/div[2]/div[1]")
	    private WebElement singlebook;
	    
	    // 首页-排行榜-听书-单本
	    @FindBy(xpath = "//mat-list-item[2]/div/div[3]/ul/li[1]/div/div[2]/div[1]")
	    private WebElement singlelisten;
		
		// 【首页】按钮
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homepage_button;
		
		//图书【更多】按钮
		@FindBy(xpath = "//mat-card[6]/mat-card-content/div/div[2]/i")
		private WebElement more_book_button;
		
		//更多-图书列表第一
	    @FindBy(xpath = "//sx-horizontal-book/ul/li[1]/div[2]/div[2]/dl/dt/p")
		private WebElement more_book;
		
		//听书【更多】按钮
		@FindBy(xpath = "//mat-card[6]/mat-card-content/div/div[3]/i")
		private WebElement more_listen_button;
		
		//更多-听书列表第一
	    @FindBy(xpath = "//sx-horizontal-audio/ul/li[1]/div[2]/div[2]/dl/dt")
		private WebElement more_listen;
		
		//日榜
		@FindBy(xpath = "//div[contains(text(),'日榜')]")
		private WebElement day;
		
		//周榜
		@FindBy(xpath = "//div[contains(text(),'周榜')]")
		private WebElement week;
		
		//月榜
		@FindBy(xpath = "//div[contains(text(),'月榜')]")
		private WebElement month;
		
		//总榜
		@FindBy(xpath = "//div[contains(text(),'总榜')]")
		private WebElement total;
		
		//详情页标题
		@FindBy(className = "topBarTitle")
		private WebElement toptitle;
		public String title;

		
		
		/**
		 *@Method:singleBook
		 *@Description:点击首页单本图书
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public String singleBook(){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			singlebook.click();
			title = toptitle.getText();
			return title;
		}
		
		/**
		 *@Method:moreBook
		 *@Description:点击首页图书[更多]按钮
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public String moreBook(){
			homepage_button.click();
			more_book_button.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			week.click();
			month.click();
			total.click();
			day.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			more_book.click();
			title = toptitle.getText();
			return title;
			
		}
		
		/**
		 *@Method:singleListen
		 *@Description:点击首页单本听书
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public String singleListen(){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			homepage_button.click();
			singlelisten.click();
			title = toptitle.getText();
			return title;
		}
		
		/**
		 *@Method:moreListen
		 *@Description:点击首页听书[更多]按钮
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public String moreListen(){
			homepage_button.click();
			more_listen_button.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			week.click();
			month.click();
			total.click();
			day.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			more_listen.click();
			title = toptitle.getText();
			return title;
			
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
