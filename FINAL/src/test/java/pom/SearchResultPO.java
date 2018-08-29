package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;
public class SearchResultPO extends BasePage{
	public SearchResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement twitterLink;
	public WebElement twitterMethod() {
		return twitterLink;
	}
	@FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
	private WebElement linkedinLink;
	public WebElement linkedinMethod() {
		return linkedinLink;
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instagramLink;
	public WebElement instagramMethod() {
		return instagramLink;
	}
	@FindBy(xpath="//a[text()='Orkut']")
	private WebElement orkutLink;
	public WebElement orkutMethod() {
		return orkutLink;
	}
}
