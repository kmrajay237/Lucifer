package test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import library.BaseTest;
import pom.GoogleSearchPO;
import pom.SearchResultPO;
import util.ExtentTestManager;
public class CheckOrkut extends BaseTest{
	@Test(priority=3,description="Checking Orkut Link")
	public void orkut() {
		try {
			//ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Checking Orkut Link");
			GoogleSearchPO gs=new GoogleSearchPO(driver);
			gs.TextBox().sendKeys("orkut");
			gs.TextBox().sendKeys(Keys.ENTER);
			SearchResultPO sr=new SearchResultPO(driver);
			sr.orkutMethod().click();
			String expTitle="orkut.com";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title Matching:Test Pass",true);
		} catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
		}
	}
}
