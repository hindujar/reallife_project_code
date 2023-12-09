package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.TestBase;

public class Fictiontest  extends TestBase{
	HomePage hp;
	@Test
	public void fiction_book() throws InterruptedException
	{
		hp.fiction();
	}

}
