package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;



/**
 * 
 *@ClassName:Searchpo
 *@Description:搜索
 *@author:程婧
 *@date:2019年3月27日
 *
 */
public class Searchpo extends BasePage{
	
	public Searchpo() {
		super();
	}
		
	    // 搜索框
		@FindBy(css = ".ng-untouched.ng-pristine.ng-valid")
		private WebElement search;
		
		// 搜索页搜索框
		@FindBy(xpath = "/html/body/app-root/div/sx-search/mat-card/mat-card-content/sx-cmpt-search/div/form/input")
		private WebElement search2;
		
		// 【搜索】按钮
		@FindBy( css = ".mat-button-wrapper")
		private WebElement searchbutton;
		
		// 听书tab
		@FindBy(xpath = "//*[@id='mat-tab-label-0-1']/div")
		private WebElement listentab;
		
		//十万个怎么办
		@FindBy(xpath = "//*[@id='mat-tab-content-0-1']/div/div/pull-load/div/sx-vertical-audio/ul/li/div/div[1]/img")
		private WebElement bookname;
		
		
		/**
		 *@Method:searchbook
		 *@Description:搜索听书-十万个怎么办
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public void searchbook(){
			search.click();
			search2.sendKeys("十万个怎么办");
			searchbutton.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			listentab.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bookname.click();
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
