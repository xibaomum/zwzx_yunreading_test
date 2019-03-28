package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:JPTSPo
 *@Description:精品听书
 *@author:程婧
 *@date:2019年3月28日
 *
 */
public class JPTSPo extends BasePage{
	
	public JPTSPo() {
		super();
	}
		
	    // 首页-精品听书-单本-甲方乙方
	    @FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[4]/mat-card-content/mat-list-item/div/div[3]/div[1]/div[7]/ul/li[2]/div/div[2]/div[1]")
	    private WebElement singlebook;
		
		// 【首页】按钮
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homepage_button;
		
		//【更多】按钮
		//@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[4]/mat-card-content/div/i")
		@FindBy(xpath = "//mat-card[4]/mat-card-content/div/i")
		private WebElement more_button;
		
		//首页-更多-甲方乙方
	    @FindBy(xpath = "//dt[contains(text(),'甲方乙方')]")
		private WebElement more_book;
		
		
		
		/**
		 *@Method:singleBook
		 *@Description:点击首页单本图书-甲方乙方
		 *@author:程婧
		 *@date:2019年3月28日
		 *
		 */
		public void singleBook(){
			singlebook.click();
		}
		
		/**
		 *@Method:moreBook
		 *@Description:点击首页[更多]按钮-甲方乙方
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
