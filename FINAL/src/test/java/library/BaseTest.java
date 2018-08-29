package library;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest implements Constants {
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser(ITestResult r) {
		String path="./images/";
		if (r.getStatus()==2) {
			ScreenShot.getScreenshot(driver,path);
			Reporter.log("Shots",true);
		}
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}

