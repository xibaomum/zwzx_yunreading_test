package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:MJZZPo
 *@Description:名家作者
 *@author:程婧
 *@date:2019年3月28日
 *
 */
public class MJZZPo extends BasePage{
	
	public MJZZPo() {
		super();
	}
		
	    // 首页-名家作者-第一人
	    @FindBy(xpath = "//mat-card[2]/mat-card-content/mat-list-item/div/div[3]/ul/li[1]/p")    
	    private WebElement homepage_author;
		
		// 首页名家作者下第一本图书
		@FindBy(xpath = "//sx-horizontal-book/ul/li[1]/div/div[2]/dl/dt")
		private WebElement homepage_author_book;
		
		// 【首页】按钮
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homepage_button;
		
		//【更多】按钮
		@FindBy(xpath = "//mat-card[2]/mat-card-content/div/i")
	    private WebElement more_button;
		
		//名家作者列表选择—刘慈欣
	    /*@FindBy(xpath = "/html/body/app-root/div/sx-auth/pull-load/div/ul/li[24]/div/img")
		 //@FindBy(xpath = "//p[contains(text(),'刘慈欣')]")
		private WebElement author_LCX;*/
		
		// 详情页标题
		@FindBy(className = "topBarTitle")
		private WebElement toptitle;
		public String title;
		
		
		
		/**
		 *@Method:homepageAuthor
		 *@Description:点击首页单人作者
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public String homepageAuthor(){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			homepage_author.click();
			homepage_author_book.click();
			title = toptitle.getText();
			return title;
		}
		
		/**
		 *@Method:moreAuthor
		 *@Description:点击首页[更多]按钮-刘慈欣
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public String moreAuthor(){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			homepage_button.click();
			more_button.click();
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
