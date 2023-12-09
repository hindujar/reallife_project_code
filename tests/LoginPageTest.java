package tests;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import pages.HomePage;
import pages.LoginPage;
import pages.TestBase;
import utilities.ExcelUtility;
import utilities.MyListener;
@Listeners(MyListener.class)
public class LoginPageTest extends TestBase {
	
	
	HomePage hp;
	LoginPage lp;
	public static int RowNum=1;
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}

	
	@Test
	public void test_login() throws IOException, InterruptedException
	{
		hp.clickLogin();
		lp.user_login();
		String uname=lp.get_uname();
		
		Assert.assertEquals(uname,"vijayvel10301@gmail.com");
		//lp.user_logout();
		RowNum=RowNum+1;
	}
	 @DataProvider(name="LoginDetails") public Object[][] datasupplier() throws
	  EncryptedDocumentException, IOException {
	  
	  Object[] [] input = ExcelUtility.getTestData("Sheet1"); return input;
	  
	  }
	 @Test(priority=2)
		public void FictionBooksclick() throws InterruptedException
		{
			hp.fiction();
			hp.books();
			
			//lp.user_logout();
		}
	 @Test(priority=3)
	public void buynow_click() throws InterruptedException
	{
		hp.click_buynow();
	}
	@Test(priority=4)
	public void Carts() throws InterruptedException
	{
		hp.Cart();
	}

	@AfterTest
	public void close_browser()
	{
		driver.close();
	}
	
	



}
