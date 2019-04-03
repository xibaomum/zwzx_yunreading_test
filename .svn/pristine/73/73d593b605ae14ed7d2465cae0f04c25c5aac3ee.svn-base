package common.po;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;



/**
 * 
 *@ClassName:BacktToHomepagePo
 *@Description:返回首页
 *@author:程婧
 *@date:2019年3月29日
 *
 */
public class BacktToHomepagePo extends BasePage{
	
	public BacktToHomepagePo() {
		super();
	}
	
	
	    // 首页
		@FindBy(className = "top-bar-homeIcon")
		private WebElement homebutton;

		
		/**
		 *@Method:searchtext
		 *@Description:搜索内容输入
		 *@param searchtext
		 *@author:程婧
		 *@date:2019年3月20日
		 *
		 */
		public void back(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			homebutton.click();
		}
		
}
