package main.po;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

import main.util.GlobalContant;

/**
 * 
 * @ClassName:InitTest
 * @Description:初始化浏览器，并设置浏览器
 * @author:程婧
 * @date:2019年3月20日
 *
 */
@SuppressWarnings("deprecation")
public class InitTest {
	public final static InitTest instance = new InitTest();

	public final WebDriver driver;
	private final int TIMEOUT = GlobalContant.TIMEOUT;

	InitTest() {
		if (GlobalContant.BROWSER.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Internet Explorer\\MicrosoftWebDriver.exe");

			driver =new EdgeDriver();
			//窗口最大化
			driver.get(GlobalContant.BASEURL2);
			driver.manage().window().maximize();

		} else if (GlobalContant.BROWSER.equals("chrome")) {

			// Chrome

			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();

			// 打开链接url
			driver.get(GlobalContant.BASEURL2);
			// 窗口最大化
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

		} else{
			driver = null;
			System.out.println("请设定正确的浏览器！");
		}
	}

	public InitTest getInstance() {
		return instance;
	}

}
