package library;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShot {
	public static void getScreenshot(WebDriver driver,String folderpath) {
		SimpleDateFormat s=new SimpleDateFormat("mm-dd-yyyy hh-mm-ss");
		String dateTime=s.format(new Date());
		TakesScreenshot shot=(TakesScreenshot) driver;
		File srcFile=shot.getScreenshotAs(OutputType.FILE);
		String name=folderpath+"img_"+dateTime+"_"+".png";
		File destFile=new File(name);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
