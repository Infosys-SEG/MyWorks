package executableClass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BrowserHelper.BrowserFactory;

import computedClass.Computed_LoginPage;

public class chk 
{
	WebDriver driver;
	
	@Test
	public void BrowserBanner() throws InterruptedException, IOException, AWTException 
	{
		Computed_LoginPage loginpage = new Computed_LoginPage();
		BrowserFactory browserFactory = new BrowserFactory();
		driver=browserFactory.startbrowser("IE");
		driver=loginpage.Loginpage(driver);
	}
}
