package com.BrowserHelper;


import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
public class BrowserFactory 
{
		static WebDriver driver;
        Robot rb;
       
        public WebDriver startbrowser(String browserName) throws InterruptedException, IOException
        {
       
        	try
        	{
        		if(browserName.equalsIgnoreCase("IE"))
        		{
        			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IE32bit\\IEDriverServer.exe");     	
        			InternetExplorerOptions options = new InternetExplorerOptions();
        			options.destructivelyEnsureCleanSession();
                	driver = new InternetExplorerDriver(options); 
                	driver.manage().window().maximize();
                	Thread.sleep(1000);
                	driver.get("https://myworkqa.mywinn-dixie.com/RWSBILO/");            	
            		Thread.sleep(3000);
                }
        
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
       
        
        
        		
       
        		return driver;
      
        }
}
