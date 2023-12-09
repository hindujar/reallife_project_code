package exetentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import tests.LoginPageTest;

public class Sharedreport extends LoginPageTest{
	
public static ExtentReports extentreports;
public static ExtentTest extentTest;
@BeforeTest
public void getnameMethod(ITestContext context)
{
	extentTest=	extentreports.createTest(context.getName());
}

@BeforeSuite  // this method will be excuted before suite begins its execution
public void InitalizeExtentReport()
{
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter("BookSwagOnReport.html");
	extentreports = new ExtentReports();
	extentreports.attachReporter(sparkreporter);
	// on the report display more information about OS, browser, java etc
	extentreports.setSystemInfo("OS", System.getProperty("os.name"));
	extentreports.setSystemInfo("JAVA", System.getProperty("java.version"));
	
}

@AfterSuite
public void generateReports() throws IOException
{
	extentreports.flush();
	Desktop.getDesktop().browse(new File("BookSwagOnReport.html").toURI());
}


	

}
