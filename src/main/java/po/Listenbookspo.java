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
public class Listenbookspo extends BasePage{
	
	public Listenbookspo() {
		super();
	}
		
	    // 听书按钮
		@FindBy(xpath = "/html/body/app-root/div/sx-index/div/mat-card[1]/mat-card-content/div[2]/div[2]/div[2]")
		private WebElement listenbutton;
		
		// 静静的顿河
		@FindBy(xpath = "/html/body/app-root/div/app-audio/pull-load/div/div[1]/sx-horizontal-audio/ul/li[1]/div/div[2]/dl/dt")
		private WebElement listenJJDDH;
		
		//【播放】按钮
		@FindBy(className = "readBtn")
		private WebElement playButton;
		
		
		/**
		 *@Method:listenlist
		 *@Description:听书列表
		 *@author:程婧
		 *@date:2019年3月27日
		 *
		 */
		public void listenbooks(){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			listenbutton.click();
			listenJJDDH.click();
			playButton.click();
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
