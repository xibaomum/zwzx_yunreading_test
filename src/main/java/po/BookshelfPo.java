package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

/**
 * 
 * @ClassName:BookshelfPo
 * @Description:书架
 * @author:程婧
 * @date:2019年3月29日
 *
 */
public class BookshelfPo extends BasePage {

	public BookshelfPo() {
		super();
	}

	// 首页
	@FindBy(className = "top-bar-homeIcon")
	private WebElement homebutton;

	// 书架按钮
	@FindBy(xpath = "//div[contains(text(),'书架')]")
	private WebElement bookshelfbutton;

	// 编辑按钮
	@FindBy(xpath = "//span[contains(text(),'编辑')]")
	private WebElement editbutton;
	
	// 我的收藏-编辑按钮
	@FindBy(xpath = "//*[@id='mat-tab-content-6-1']/div/div[1]/div/div/span")
	private WebElement edit2button;

	// 全选按钮
	@FindBy(xpath = "//b[contains(text(),'全选')]")
	private WebElement allbutton;

	// 删除按钮
	@FindBy(xpath = "//b[contains(text(),'删除')]")
	private WebElement deletebutton;
	
	// 最近浏览_确认删除按钮
    @FindBy(xpath = "//*[@id='mat-dialog-1']/sx-dialog-confirm/sx-dialog/div/div[2]/sx-dialog-actions/button[2]/span")
    private WebElement delete2button;
    
 // //我的收藏_确认删除按钮
    @FindBy(xpath = "//*[@id='mat-dialog-2']/sx-dialog-confirm/sx-dialog/div/div[2]/sx-dialog-actions/button[2]/span")
    private WebElement delete3button;
    
    // 去首页看看按钮
 	@FindBy(className = "goBtn")
 	private WebElement gotohomebutton;
 	
    // 我的收藏tab
 	@FindBy(xpath = "//div[contains(text(),'我的收藏')]")
 	private WebElement collectTab;
	
	// 提示信息
	@FindBy(css = ".mat-simple-snackbar.ng-star-inserted")
	private WebElement altmsg;
	public String msgcontent;
	

	

	/**
	 * @Method:login_ZJLL_Res
	 * @Description:已登录状态_最近收藏_有资源_全选删除
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public String login_ZJLL_Res() {
		homebutton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookshelfbutton.click();
		editbutton.click();
		allbutton.click();
		deletebutton.click();
		delete2button.click();
		msgcontent = altmsg.getText();
		return msgcontent;
		
	}
	
	
	/**
	 * @Method:login_ZJLL_nullRes
	 * @Description:已登录状态_最近收藏_无资源
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public void login_ZJLL_nullRes() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookshelfbutton.click();
		//gotohomebutton.click();
	}
	
	/**
	 * @Method:login_WDSC_Res
	 * @Description:已登录状态_我的收藏_有资源_全选删除
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public String login_WDSC_Res() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookshelfbutton.click();
		collectTab.click();
		edit2button.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allbutton.click();
		deletebutton.click();
		delete3button.click();
		msgcontent = altmsg.getText();
		return msgcontent;
	}
	
	/**
	 * @Method:login_WDSCL_nullRes
	 * @Description:已登录状态_我的收藏_无资源
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public void login_WDSCL_nullRes() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookshelfbutton.click();
		collectTab.click();
	}
	
	/**
	 * @Method:login_WDSCL_nullRes
	 * @Description:已登录状态_我的收藏_无资源
	 * @param
	 * @author:程婧
	 * @date:2019年3月29日
	 *
	 */
	public void unlogin_bookshelf() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookshelfbutton.click();
		gotohomebutton.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookshelfbutton.click();
		collectTab.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//gotohomebutton.click();
	}

	
}
