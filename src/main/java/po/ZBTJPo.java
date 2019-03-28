package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:ZBTJPo
 *@Description:重磅推荐
 *@author:程婧
 *@date:2019年3月28日
 *
 */
public class ZBTJPo extends BasePage{
	
	public ZBTJPo() {
		super();
	}
		
	    // 首页-重磅推薦-单本-流浪地球
	    @FindBy(xpath = "//div[contains(text(),'流浪地球')]")
	    private WebElement singlebook;
		
		// 【首页】按钮
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homepage_button;
		
		//重磅推荐-【更多】按钮
		//@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[3]/mat-card-content/div/i")
		@FindBy(xpath = "//mat-card[3]/mat-card-content/div/i")
	    private WebElement more_button;
		
		//首页-更多-流浪地球
	    @FindBy(xpath = "//dt[contains(text(),'流浪地球')]")
		private WebElement more_book;
		
		
		
		/**
		 *@Method:singleBookr
		 *@Description:点击首页重磅推荐单本图书
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public void singleBook(){
			singlebook.click();
			
		}
		
		/**
		 *@moreBook
		 *@Description:点击首页[更多]按钮-流浪地球
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public void moreBook(){
			homepage_button.click();
			more_button.click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			more_book.click();
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
