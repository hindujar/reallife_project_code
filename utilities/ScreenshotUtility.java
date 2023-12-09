package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pages.TestBase;
import tests.LoginPageTest;

public class ScreenshotUtility extends TestBase {
	
	
	
	public static  String takeScreenshot() throws IOException {

		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = "D:\\Screenshots\\myScreenshot_"+System.currentTimeMillis()+".png";
		File target = new File(path);

		FileUtils.copyFile(source, target);
		
		String targetpath = target.getAbsolutePath();
		return targetpath;

}
} 


