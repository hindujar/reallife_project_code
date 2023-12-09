package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	Actions a = new Actions(driver);
	
	@FindBy(xpath="//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]")
	WebElement MyAccount;
	
	@FindBy(xpath="//div[@class='userpopup']/descendant::a[1]")
	WebElement LoginBtn;
	
	
    @FindBy(linkText="Fiction Books")
	WebElement FictionBooks;
	@FindBy (xpath="(//div[@class='text-center position-relative blackhover'])[1]")
	WebElement TouchBook;
	@FindBy(xpath="//input[@class='btn themebackground text-white']")
	WebElement BuyNow;
	
	
	@FindBy(xpath="(//span[@class='itemcount'])[1]")
	WebElement Cart;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void	clickLogin() throws InterruptedException {
		
		a.moveToElement(MyAccount).perform();
		Thread.sleep(1500);
		
		LoginBtn.click();
		
	}
	public void fiction() throws InterruptedException {
		FictionBooks.click();
		Thread.sleep(1500);
	}
	public void books() throws InterruptedException
	{
		TouchBook.click();
		Thread.sleep(1500);
	}
	
public void click_buynow() throws InterruptedException
{
	BuyNow.click();
	Thread.sleep(1500);
}
public void Cart() throws InterruptedException
{
	Cart.click();
	Thread.sleep(1500);
}

}
