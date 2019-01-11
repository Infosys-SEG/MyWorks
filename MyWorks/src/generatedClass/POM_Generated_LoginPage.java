//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_LoginPage { 
	WebDriver driver;
	public POM_Generated_LoginPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : UserId_Field
	@FindBy(xpath = "//input[@name='txtUserID']")
	public WebElement txt_UserId_Field;
	
	// Associated Label : Password_Field
	@FindBy(xpath = "//input[@name='txtPassword']")
	public WebElement txt_Password_Field;
	
	// Associated Label : Login_Button
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement click_Login_Button;
	

//*******************************************************************************


	// Element Actions


	// Type:  UserId_Field
	public void type_txt_UserId_Field(String value) {
		txt_UserId_Field.clear();
		txt_UserId_Field.sendKeys(value);
	}

	//click:  UserId_Field
	public void click_txt_UserId_Field(){
		txt_UserId_Field.click();
	}

	// Hover:  UserId_Field
	public void hover_txt_UserId_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_UserId_Field).build().perform();
	}

	// visible or Not :  UserId_Field
	public boolean isDisplayed_txt_UserId_Field(){
		if(txt_UserId_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  UserId_Field
	public boolean isEnabled_txt_UserId_Field(){
		if(txt_UserId_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  UserId_Field
	public String getCssValue_txt_UserId_Field(String attribute) {
		return txt_UserId_Field.getCssValue(attribute);
	}

	//Get the text :  UserId_Field
	public String getText_txt_UserId_Field(){
		return txt_UserId_Field.getText();
	}

	//Get the value :  UserId_Field
	public String getValue_txt_UserId_Field(){
		return txt_UserId_Field.getAttribute("value");
	}
	// selected or Not :  UserId_Field
	public boolean isSelected_txt_UserId_Field(){
		if(txt_UserId_Field.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Password_Field
	public void type_txt_Password_Field(String value) {
		txt_Password_Field.clear();
		txt_Password_Field.sendKeys(value);
	}

	//click:  Password_Field
	public void click_txt_Password_Field(){
		txt_Password_Field.click();
	}

	// Hover:  Password_Field
	public void hover_txt_Password_Field(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Password_Field).build().perform();
	}

	// visible or Not :  Password_Field
	public boolean isDisplayed_txt_Password_Field(){
		if(txt_Password_Field.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Password_Field
	public boolean isEnabled_txt_Password_Field(){
		if(txt_Password_Field.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Password_Field
	public String getCssValue_txt_Password_Field(String attribute) {
		return txt_Password_Field.getCssValue(attribute);
	}

	//Get the text :  Password_Field
	public String getText_txt_Password_Field(){
		return txt_Password_Field.getText();
	}

	//Get the value :  Password_Field
	public String getValue_txt_Password_Field(){
		return txt_Password_Field.getAttribute("value");
	}
	// selected or Not :  Password_Field
	public boolean isSelected_txt_Password_Field(){
		if(txt_Password_Field.isSelected()) { return true; } else { return false;} 
	}

	//click:  Login_Button
	public void click_click_Login_Button(){
		click_Login_Button.click();
	}

	// Hover:  Login_Button
	public void hover_click_Login_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Login_Button).build().perform();
	}

	// visible or Not :  Login_Button
	public boolean isDisplayed_click_Login_Button(){
		if(click_Login_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Login_Button
	public boolean isEnabled_click_Login_Button(){
		if(click_Login_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Login_Button
	public String getCssValue_click_Login_Button(String attribute) {
		return click_Login_Button.getCssValue(attribute);
	}

	//Get the text :  Login_Button
	public String getText_click_Login_Button(){
		return click_Login_Button.getText();
	}

	//Get the value :  Login_Button
	public String getValue_click_Login_Button(){
		return click_Login_Button.getAttribute("value");
	}
	// selected or Not :  Login_Button
	public boolean isSelected_click_Login_Button(){
		if(click_Login_Button.isSelected()) { return true; } else { return false;} 
	}

}
