package test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import library.BaseTest;
import pom.GoogleSearchPO;
import pom.SearchResultPO;
import util.ExtentTestManager;
public class CheckInstagram extends BaseTest{
	@Test(priority=1,description="Checking Instagram Link")
	public void instagram() {
		try {
			 //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Checking Instagram Link");
			GoogleSearchPO gs=new GoogleSearchPO(driver);
			gs.TextBox().sendKeys("instagram");
			gs.TextBox().sendKeys(Keys.ENTER);
			SearchResultPO sr=new SearchResultPO(driver);
			sr.instagramMethod().click();
			String expTitle="Instagram";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title Matching:Test Pass",true);
		} catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
		}
	}
}
