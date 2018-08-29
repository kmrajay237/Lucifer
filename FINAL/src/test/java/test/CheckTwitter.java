package test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import library.BaseTest;
import pom.GoogleSearchPO;
import pom.SearchResultPO;
import util.ExtentTestManager;
public class CheckTwitter extends BaseTest{
	@Test(priority=4,description="Checking Twitter Link")
	public void twitter() {
		try {
			//ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Checking Twitter Link");
			GoogleSearchPO gs=new GoogleSearchPO(driver);
			gs.TextBox().sendKeys("twitter");
			gs.TextBox().sendKeys(Keys.ENTER);
			SearchResultPO sr=new SearchResultPO(driver);
			sr.twitterMethod().click();
			String expTitle="Login on Twitter";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title Matching:Test Pass",true);
		} catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
		}
	}
}
