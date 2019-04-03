package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

/**
 * 
 * @ClassName:Baidusearchpo
 * @Description:百度搜索中文在线
 * @author:程婧
 * @date:2019年3月20日
 *
 */
public class BookmarkPo extends BasePage {

	public BookmarkPo() {
		super();
	}

	// 首页
	@FindBy(className = "top-bar-homeIcon")
	private WebElement homebutton;

	// 图书按钮
	@FindBy(xpath = "//div[contains(text(),'图书')]")
	private WebElement bookbutton;

	// 图书列表第一本图书
	@FindBy(xpath = "//sx-horizontal-book/ul/li[1]/div/div[2]/dl/dt")
	private WebElement book1;

	// 收藏按钮
	@FindBy(className = "collectBtn")
	private WebElement collectbutton;

	// 取消收藏按钮
	@FindBy(css = ".collectBtn.collectBtned")
	private WebElement uncollectbutton;

	// 提示信息
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement altmsg;
	public String msgcontent;
	

	

	/**
	 * @Method:login_collect
	 * @Description:已登录状态收藏图书
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public String login_collect() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homebutton.click();
		bookbutton.click();
		book1.click();
		collectbutton.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		msgcontent = altmsg.getText();
		return msgcontent;
	}

	/**
	 * @Method:login_collect
	 * @Description:已登录状态取消收藏图书
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public String login_uncollect() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		uncollectbutton.click();
		msgcontent = altmsg.getText();
		return msgcontent;
	}
	
	/**
	 * @Method:unlogin_collect
	 * @Description:未登录状态收藏图书
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public String unlogin_collect() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homebutton.click();
		bookbutton.click();
		book1.click();
		collectbutton.click();
		msgcontent = altmsg.getText();
		return msgcontent;
	}

}
