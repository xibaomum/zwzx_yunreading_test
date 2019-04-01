package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;

/**
 * 
 * @ClassName:XSDJDPo
 * @Description:新时代经典
 * @author:程婧
 * @date:2019年3月28日
 *
 */
public class XSDJDPo extends BasePage {

	public XSDJDPo() {
		super();
	}

	// 首页-新时代经典-第一本
	@FindBy(xpath = "//mat-card[8]/mat-card-content/mat-list-item/div/ul/li[1]/div/div[2]/div")
	private WebElement singlebook;

	// 【首页】按钮
	@FindBy(className = "top-bar-homeIcon")
	private WebElement homepage_button;

	// 【更多】按钮
	@FindBy(xpath = "//mat-card[8]/mat-card-content/div/i")
	private WebElement more_button;

	// 列表第一本
	@FindBy(xpath = "//sx-horizontal-book/ul/li[1]/div/div[2]/dl/dt/p")
	private WebElement more_book;

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
	public String singleBook() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		singlebook.click();
		title = toptitle.getText();
		return title;
	}

	/**
	 * @Method:moreBook
	 * @Description:点击首页[更多]按钮
	 * @author:程婧
	 * @date:2019年3月28日
	 *
	 */
	public String moreBook() {
		homepage_button.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		more_button.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		more_book.click();
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
