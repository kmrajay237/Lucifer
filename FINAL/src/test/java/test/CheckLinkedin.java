package test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import library.BaseTest;
import pom.GoogleSearchPO;
import pom.SearchResultPO;
import util.ExtentTestManager;
public class CheckLinkedin extends BaseTest{
	@Test(priority=2,description="Checking Linkedin Link")
	public void linkedin() {
		try {
			 //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Checking Linkedin Link");
			GoogleSearchPO gs=new GoogleSearchPO(driver);
			gs.TextBox().sendKeys("linkedin");
			gs.TextBox().sendKeys(Keys.ENTER);
			SearchResultPO sr=new SearchResultPO(driver);
			sr.linkedinMethod().click();
			String expTitle="LinkedIn: Log In or Sign Up";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title Matching:Test Pass",true);
		} catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
		}
	}
}
