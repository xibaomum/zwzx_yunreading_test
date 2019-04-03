package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;

/**
 * 
 * @ClassName:MJDaZPo
 * @Description:名家大作
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class MJDaZPo extends BasePage {

	public MJDaZPo() {
		super();
	}

	// 首页
	@FindBy(className = "top-bar-homeIcon")
	private WebElement homepage_button;

	// 首页-名家大作-获奖文学-第一本
	@FindBy(xpath = "//mat-card[7]/mat-card-content/div/mat-list-item/div/dl[1]/dd[1]/ul/li[1]/div/div[2]/div[1]")
	private WebElement hjwx_singlebook;

	// 首页-名家大作-获奖文学-【查看更多】
	@FindBy(xpath = "//mat-card[7]/mat-card-content/div/mat-list-item/div/dl[1]/dd[2]/div/a")
	private WebElement morebutton1;

	// 首页-名家大作-畅销图书-第一本
	@FindBy(xpath = "//mat-card[7]/mat-card-content/div/mat-list-item/div/dl[2]/dd[1]/ul/li[1]/div/div[2]/div[1]")
	private WebElement cxts_singlebook;

	// 首页-名家大作-畅销图书-查看更多
	@FindBy(xpath = "//mat-card[7]/mat-card-content/div/mat-list-item/div/dl[2]/dd[2]/div/a")
	private WebElement morebutton2;

	// 首页-名家大作-名家作品-第一本
	@FindBy(xpath = "//mat-card[7]/mat-card-content/div/mat-list-item/div/dl[3]/dd[1]/ul/li[1]/div/div[2]/div[1]")
	private WebElement mjzp_singlebook;

	// 首页-名家大作-名家作品-查看更多
	@FindBy(xpath = "//mat-card[7]/mat-card-content/div/mat-list-item/div/dl[3]/dd[2]/div/a")
	private WebElement morebutton3;

	// 首页-名家大作-获奖文学-查看更多-列表第一本
	@FindBy(xpath = "//sx-horizontal-book/ul/li[1]/div/div[2]/dl/dt/p")
	private WebElement morebookNO1;

	// 详情页标题
	@FindBy(className = "topBarTitle")
	private WebElement toptitle;
	public String title;

	/**
	 * @Method:singleBook
	 * @Description:点击首页单本图书
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String hjwx_singleBook() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hjwx_singlebook.click();
		title = toptitle.getText();
		return title;
	}

	/**
	 * @Method:moreBook
	 * @Description:点击首页图书[更多]按钮
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String hjwx_moreBook() {
		homepage_button.click();
		morebutton1.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		morebookNO1.click();
		title = toptitle.getText();
		return title;

	}

	/**
	 * @Method:cxts_singleBook
	 * @Description:点击首页单本听书
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String cxts_singleBook() {
		homepage_button.click();
		cxts_singlebook.click();
		title = toptitle.getText();
		return title;
	}

	/**
	 * @Method:moreListen
	 * @Description:点击首页听书[更多]按钮
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String cxts_moreBook() {
		homepage_button.click();
		morebutton2.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		morebookNO1.click();
		title = toptitle.getText();
		return title;
	}

	/**
	 * @Method:cxts_singleBook
	 * @Description:点击首页单本听书
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String mjzp_singleBook() {
		homepage_button.click();
		mjzp_singlebook.click();
		title = toptitle.getText();
		return title;
		
	}

	/**
	 * @Method:moreListen
	 * @Description:点击首页听书[更多]按钮
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String mjzp_moreBook() {
		homepage_button.click();
		morebutton3.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		morebookNO1.click();
		title = toptitle.getText();
		return title;
	}

	/**
	 * 
	 * @Method:getCurUrl
	 * @Description:获取当前页面的url
	 *
	 */
	public String getCurUrl() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver = InitTest.instance.driver;
		return driver.getCurrentUrl();
	}

}
