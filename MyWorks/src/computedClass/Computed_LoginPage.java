package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import generatedClass.POM_Generated_LoginPage;

public class Computed_LoginPage 
{
	
	public WebDriver Loginpage(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{
		POM_Generated_LoginPage loginpage= new POM_Generated_LoginPage(driver);
		//Thread.sleep(1000);
		System.out.println("before");
		loginpage.type_txt_UserId_Field("smuser");
		loginpage.type_txt_Password_Field("1234567");
		loginpage.click_click_Login_Button();
		
		return driver;
		
	}
}
