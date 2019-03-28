package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:XSSDPo
 *@Description:新书速递
 *@author:程婧
 *@date:2019年3月28日
 *
 */
public class XSSDPo extends BasePage{
	
	public XSSDPo() {
		super();
	}
		
	    // 首页-精品听书-单本
	    @FindBy(xpath = "//dt[contains(text(),'测试图书2019 小辣 002')]")
	    private WebElement singlebook;
		
		// 【首页】按钮
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homepage_button;
		
		//【更多】按钮
		//@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[5]/mat-card-content/div/i")
		@FindBy(xpath = "//mat-card[5]/mat-card-content/div/i")
		private WebElement more_button;
		
		//首页-更多
	    @FindBy(xpath = "//dt[contains(text(),'李国文说唐')]")
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
