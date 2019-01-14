//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_AssociatePage { 
	WebDriver driver;
	public POM_Generated_AssociatePage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : AssociatePage_Verify
	@FindBy(xpath = "//select[@id='UserId']")
	public WebElement txt_AssociatePage_Verify;
	
	// Associated Label : Timecard_Tab
	@FindBy(xpath = "//span[text()='Timecard']")
	public WebElement click_Timecard_Tab;
	
	// Associated Label : Audit_Tab
	@FindBy(xpath = "//span[text()='Audit']")
	public WebElement click_Audit_Tab;
	
	// Associated Label : Pay_Results_Tab
	@FindBy(xpath = "//span[text()='Pay Results']")
	public WebElement click_Pay_Results_Tab;
	

//*******************************************************************************


	// Element Actions


	// Type:  AssociatePage_Verify
	public void type_txt_AssociatePage_Verify(String value) {
		txt_AssociatePage_Verify.clear();
		txt_AssociatePage_Verify.sendKeys(value);
	}

	//click:  AssociatePage_Verify
	public void click_txt_AssociatePage_Verify(){
		txt_AssociatePage_Verify.click();
	}

	// Hover:  AssociatePage_Verify
	public void hover_txt_AssociatePage_Verify(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_AssociatePage_Verify).build().perform();
	}

	// visible or Not :  AssociatePage_Verify
	public boolean isDisplayed_txt_AssociatePage_Verify(){
		if(txt_AssociatePage_Verify.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  AssociatePage_Verify
	public boolean isEnabled_txt_AssociatePage_Verify(){
		if(txt_AssociatePage_Verify.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  AssociatePage_Verify
	public String getCssValue_txt_AssociatePage_Verify(String attribute) {
		return txt_AssociatePage_Verify.getCssValue(attribute);
	}

	//Get the text :  AssociatePage_Verify
	public String getText_txt_AssociatePage_Verify(){
		return txt_AssociatePage_Verify.getText();
	}

	//Get the value :  AssociatePage_Verify
	public String getValue_txt_AssociatePage_Verify(){
		return txt_AssociatePage_Verify.getAttribute("value");
	}
	// selected or Not :  AssociatePage_Verify
	public boolean isSelected_txt_AssociatePage_Verify(){
		if(txt_AssociatePage_Verify.isSelected()) { return true; } else { return false;} 
	}

	//click:  Timecard_Tab
	public void click_click_Timecard_Tab(){
		click_Timecard_Tab.click();
	}

	// Hover:  Timecard_Tab
	public void hover_click_Timecard_Tab(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Timecard_Tab).build().perform();
	}

	// visible or Not :  Timecard_Tab
	public boolean isDisplayed_click_Timecard_Tab(){
		if(click_Timecard_Tab.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Timecard_Tab
	public boolean isEnabled_click_Timecard_Tab(){
		if(click_Timecard_Tab.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Timecard_Tab
	public String getCssValue_click_Timecard_Tab(String attribute) {
		return click_Timecard_Tab.getCssValue(attribute);
	}

	//Get the text :  Timecard_Tab
	public String getText_click_Timecard_Tab(){
		return click_Timecard_Tab.getText();
	}

	//Get the value :  Timecard_Tab
	public String getValue_click_Timecard_Tab(){
		return click_Timecard_Tab.getAttribute("value");
	}
	// selected or Not :  Timecard_Tab
	public boolean isSelected_click_Timecard_Tab(){
		if(click_Timecard_Tab.isSelected()) { return true; } else { return false;} 
	}

	//click:  Audit_Tab
	public void click_click_Audit_Tab(){
		click_Audit_Tab.click();
	}

	// Hover:  Audit_Tab
	public void hover_click_Audit_Tab(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Audit_Tab).build().perform();
	}

	// visible or Not :  Audit_Tab
	public boolean isDisplayed_click_Audit_Tab(){
		if(click_Audit_Tab.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Audit_Tab
	public boolean isEnabled_click_Audit_Tab(){
		if(click_Audit_Tab.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Audit_Tab
	public String getCssValue_click_Audit_Tab(String attribute) {
		return click_Audit_Tab.getCssValue(attribute);
	}

	//Get the text :  Audit_Tab
	public String getText_click_Audit_Tab(){
		return click_Audit_Tab.getText();
	}

	//Get the value :  Audit_Tab
	public String getValue_click_Audit_Tab(){
		return click_Audit_Tab.getAttribute("value");
	}
	// selected or Not :  Audit_Tab
	public boolean isSelected_click_Audit_Tab(){
		if(click_Audit_Tab.isSelected()) { return true; } else { return false;} 
	}

	//click:  Pay_Results_Tab
	public void click_click_Pay_Results_Tab(){
		click_Pay_Results_Tab.click();
	}

	// Hover:  Pay_Results_Tab
	public void hover_click_Pay_Results_Tab(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Pay_Results_Tab).build().perform();
	}

	// visible or Not :  Pay_Results_Tab
	public boolean isDisplayed_click_Pay_Results_Tab(){
		if(click_Pay_Results_Tab.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Pay_Results_Tab
	public boolean isEnabled_click_Pay_Results_Tab(){
		if(click_Pay_Results_Tab.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Pay_Results_Tab
	public String getCssValue_click_Pay_Results_Tab(String attribute) {
		return click_Pay_Results_Tab.getCssValue(attribute);
	}

	//Get the text :  Pay_Results_Tab
	public String getText_click_Pay_Results_Tab(){
		return click_Pay_Results_Tab.getText();
	}

	//Get the value :  Pay_Results_Tab
	public String getValue_click_Pay_Results_Tab(){
		return click_Pay_Results_Tab.getAttribute("value");
	}
	// selected or Not :  Pay_Results_Tab
	public boolean isSelected_click_Pay_Results_Tab(){
		if(click_Pay_Results_Tab.isSelected()) { return true; } else { return false;} 
	}

}
