package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;
public class GoogleSearchPO extends BasePage {
	public GoogleSearchPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(name = "q")
	private WebElement TextBox;
	public WebElement TextBox() {
		return TextBox;
	}
}
