package com.BrowserHelper;


import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class BrowserFactory 
{
		WebDriver driver;
        Robot rb;
       
        public WebDriver startbrowser(String browserName) throws InterruptedException, IOException
        {
       
        	try
        	{
        		if(browserName.equalsIgnoreCase("IE"))
        		{
        			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");     	      			
        			InternetExplorerOptions options = new InternetExplorerOptions();
        			options.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
                	driver = new InternetExplorerDriver(options);
                	driver.manage().window().maximize();
                	Thread.sleep(1000);
                	driver.get("https://myworkqa.mywinn-dixie.com/RWSBILO/");            	
            		Thread.sleep(1000);
                }
        
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
       
        
        
        		
       
        		return driver;
      
        }
}
