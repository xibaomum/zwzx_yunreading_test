package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;
import main.po.InitTest;

/**
 * 
 * @ClassName:ListenbooksPo
 * @Description:听书
 * @author:程婧
 * @date:2019年3月26日
 *
 */
public class ListenbooksPo extends BasePage {

	public ListenbooksPo() {
		super();
	}

	// 听书按钮
	@FindBy(xpath = "//div[contains(text(),'听书')]")
	private WebElement listenbutton;

	// 听书列表第一本
	@FindBy(xpath = "//sx-horizontal-audio/ul/li[1]/div/div[2]/dl/dt")
	private WebElement listenNO1;

	// 【播放】按钮
	@FindBy(className = "readBtn")
	private WebElement playButton;

	// 播放时长
	@FindBy(className = "jp-duration")
	private WebElement durationTime;
	public String durTimeMSG;

	// 【返回】按钮
	@FindBy(xpath = "p[contains(text(),'返回')]")
	private WebElement backButton;

	/**
	 * @Method:listenlist
	 * @Description:听书
	 * @author:程婧
	 * @date:2019年3月27日
	 *
	 */
	public String listenbooks() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listenbutton.click();
		listenNO1.click();
		playButton.click();
		durTimeMSG = durationTime.getText();
		return durTimeMSG;
	}
	
	/**
	 * @Method:back
	 * @Description:返回详情页
	 * @author:程婧
	 * @date:2019年3月27日
	 *
	 */
	public void back() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		backButton.click();
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
