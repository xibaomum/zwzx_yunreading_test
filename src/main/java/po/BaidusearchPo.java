package po;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import main.po.BasePage;



/**
 * 
 *@ClassName:Baidusearchpo
 *@Description:百度搜索中文在线
 *@author:程婧
 *@date:2019年3月20日
 *
 */
public class BaidusearchPo extends BasePage{
	
	public BaidusearchPo() {
		super();
	}
	
	
	    // 搜索框
		@FindBy(id = "kw")
		private WebElement searchtextbox;

		// 搜索按钮
		@FindBy(id = "su")
		private WebElement searchbutton;
		
		/**
		 *@Method:searchtext
		 *@Description:搜索内容输入
		 *@param searchtext
		 *@author:程婧
		 *@date:2019年3月20日
		 *
		 */
		public void inputSearchtext(String searchtext){
			searchtextbox.clear();
			searchtextbox.sendKeys(searchtext);		
		}
		
		/**
		 *@Method:clickSearchbutton
		 *@Description:点击搜索按钮
		 *@author:程婧
		 *@date:2019年3月20日
		 *
		 */
		public void clickSearchbutton(){
			searchbutton.click();	
		}
	
}
