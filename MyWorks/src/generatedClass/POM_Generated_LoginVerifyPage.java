//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_LoginVerifyPage { 
	WebDriver driver;
	public POM_Generated_LoginVerifyPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Store_Manager_LoginVerify_Text
	@FindBy(xpath = "//td[text()='Welcome Store Manager User']")
	public WebElement click_Store_Manager_LoginVerify_Text;
	
	// Associated Label : MyWork_Logo
	@FindBy(xpath = "//img[@src='https://myworkqa.mywinn-dixie.com/RWSBILO/images/2034.gif']")
	public WebElement click_MyWork_Logo;
	
	// Associated Label : MyScheduling_Logo
	@FindBy(xpath = "//img[@src='images/rws-button.gif']")
	public WebElement click_MyScheduling_Logo;
	
	// Associated Label : MyTime_Logo
	@FindBy(xpath = "//img[@src='images/rta-button.gif']")
	public WebElement click_MyTime_Logo;
	
	// Associated Label : Exit_Button
	@FindBy(xpath = "//a[@href='Logout.jsp']")
	public WebElement click_Exit_Button;
	

//*******************************************************************************


	// Element Actions


	//click:  Store_Manager_LoginVerify_Text
	public void click_click_Store_Manager_LoginVerify_Text(){
		click_Store_Manager_LoginVerify_Text.click();
	}

	// Hover:  Store_Manager_LoginVerify_Text
	public void hover_click_Store_Manager_LoginVerify_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Store_Manager_LoginVerify_Text).build().perform();
	}

	// visible or Not :  Store_Manager_LoginVerify_Text
	public boolean isDisplayed_click_Store_Manager_LoginVerify_Text(){
		if(click_Store_Manager_LoginVerify_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Store_Manager_LoginVerify_Text
	public boolean isEnabled_click_Store_Manager_LoginVerify_Text(){
		if(click_Store_Manager_LoginVerify_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Store_Manager_LoginVerify_Text
	public String getCssValue_click_Store_Manager_LoginVerify_Text(String attribute) {
		return click_Store_Manager_LoginVerify_Text.getCssValue(attribute);
	}

	//Get the text :  Store_Manager_LoginVerify_Text
	public String getText_click_Store_Manager_LoginVerify_Text(){
		return click_Store_Manager_LoginVerify_Text.getText();
	}

	//Get the value :  Store_Manager_LoginVerify_Text
	public String getValue_click_Store_Manager_LoginVerify_Text(){
		return click_Store_Manager_LoginVerify_Text.getAttribute("value");
	}
	// selected or Not :  Store_Manager_LoginVerify_Text
	public boolean isSelected_click_Store_Manager_LoginVerify_Text(){
		if(click_Store_Manager_LoginVerify_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  MyWork_Logo
	public void click_click_MyWork_Logo(){
		click_MyWork_Logo.click();
	}

	// Hover:  MyWork_Logo
	public void hover_click_MyWork_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_MyWork_Logo).build().perform();
	}

	// visible or Not :  MyWork_Logo
	public boolean isDisplayed_click_MyWork_Logo(){
		if(click_MyWork_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyWork_Logo
	public boolean isEnabled_click_MyWork_Logo(){
		if(click_MyWork_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyWork_Logo
	public String getCssValue_click_MyWork_Logo(String attribute) {
		return click_MyWork_Logo.getCssValue(attribute);
	}

	//Get the text :  MyWork_Logo
	public String getText_click_MyWork_Logo(){
		return click_MyWork_Logo.getText();
	}

	//Get the value :  MyWork_Logo
	public String getValue_click_MyWork_Logo(){
		return click_MyWork_Logo.getAttribute("value");
	}
	// selected or Not :  MyWork_Logo
	public boolean isSelected_click_MyWork_Logo(){
		if(click_MyWork_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  MyScheduling_Logo
	public void click_click_MyScheduling_Logo(){
		click_MyScheduling_Logo.click();
	}

	// Hover:  MyScheduling_Logo
	public void hover_click_MyScheduling_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_MyScheduling_Logo).build().perform();
	}

	// visible or Not :  MyScheduling_Logo
	public boolean isDisplayed_click_MyScheduling_Logo(){
		if(click_MyScheduling_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyScheduling_Logo
	public boolean isEnabled_click_MyScheduling_Logo(){
		if(click_MyScheduling_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyScheduling_Logo
	public String getCssValue_click_MyScheduling_Logo(String attribute) {
		return click_MyScheduling_Logo.getCssValue(attribute);
	}

	//Get the text :  MyScheduling_Logo
	public String getText_click_MyScheduling_Logo(){
		return click_MyScheduling_Logo.getText();
	}

	//Get the value :  MyScheduling_Logo
	public String getValue_click_MyScheduling_Logo(){
		return click_MyScheduling_Logo.getAttribute("value");
	}
	// selected or Not :  MyScheduling_Logo
	public boolean isSelected_click_MyScheduling_Logo(){
		if(click_MyScheduling_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  MyTime_Logo
	public void click_click_MyTime_Logo(){
		click_MyTime_Logo.click();
	}

	// Hover:  MyTime_Logo
	public void hover_click_MyTime_Logo(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_MyTime_Logo).build().perform();
	}

	// visible or Not :  MyTime_Logo
	public boolean isDisplayed_click_MyTime_Logo(){
		if(click_MyTime_Logo.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyTime_Logo
	public boolean isEnabled_click_MyTime_Logo(){
		if(click_MyTime_Logo.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyTime_Logo
	public String getCssValue_click_MyTime_Logo(String attribute) {
		return click_MyTime_Logo.getCssValue(attribute);
	}

	//Get the text :  MyTime_Logo
	public String getText_click_MyTime_Logo(){
		return click_MyTime_Logo.getText();
	}

	//Get the value :  MyTime_Logo
	public String getValue_click_MyTime_Logo(){
		return click_MyTime_Logo.getAttribute("value");
	}
	// selected or Not :  MyTime_Logo
	public boolean isSelected_click_MyTime_Logo(){
		if(click_MyTime_Logo.isSelected()) { return true; } else { return false;} 
	}

	//click:  Exit_Button
	public void click_click_Exit_Button(){
		click_Exit_Button.click();
	}

	// Hover:  Exit_Button
	public void hover_click_Exit_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Exit_Button).build().perform();
	}

	// visible or Not :  Exit_Button
	public boolean isDisplayed_click_Exit_Button(){
		if(click_Exit_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Exit_Button
	public boolean isEnabled_click_Exit_Button(){
		if(click_Exit_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Exit_Button
	public String getCssValue_click_Exit_Button(String attribute) {
		return click_Exit_Button.getCssValue(attribute);
	}

	//Get the text :  Exit_Button
	public String getText_click_Exit_Button(){
		return click_Exit_Button.getText();
	}

	//Get the value :  Exit_Button
	public String getValue_click_Exit_Button(){
		return click_Exit_Button.getAttribute("value");
	}
	// selected or Not :  Exit_Button
	public boolean isSelected_click_Exit_Button(){
		if(click_Exit_Button.isSelected()) { return true; } else { return false;} 
	}

}
