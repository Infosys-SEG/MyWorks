//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_PayrollPage { 
	WebDriver driver;
	public POM_Generated_PayrollPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Review_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=PAYROLL&sm=REVIEW']")
	public WebElement click_Review_Link;
	
	// Associated Label : Pay_Results_Summary_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=PAYROLL&sm=PAYRES_SUMMARY']")
	public WebElement click_Pay_Results_Summary_Link;
	

//*******************************************************************************


	// Element Actions


	//click:  Review_Link
	public void click_click_Review_Link(){
		click_Review_Link.click();
	}

	// Hover:  Review_Link
	public void hover_click_Review_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Review_Link).build().perform();
	}

	// visible or Not :  Review_Link
	public boolean isDisplayed_click_Review_Link(){
		if(click_Review_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Review_Link
	public boolean isEnabled_click_Review_Link(){
		if(click_Review_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Review_Link
	public String getCssValue_click_Review_Link(String attribute) {
		return click_Review_Link.getCssValue(attribute);
	}

	//Get the text :  Review_Link
	public String getText_click_Review_Link(){
		return click_Review_Link.getText();
	}

	//Get the value :  Review_Link
	public String getValue_click_Review_Link(){
		return click_Review_Link.getAttribute("value");
	}
	// selected or Not :  Review_Link
	public boolean isSelected_click_Review_Link(){
		if(click_Review_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Pay_Results_Summary_Link
	public void click_click_Pay_Results_Summary_Link(){
		click_Pay_Results_Summary_Link.click();
	}

	// Hover:  Pay_Results_Summary_Link
	public void hover_click_Pay_Results_Summary_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Pay_Results_Summary_Link).build().perform();
	}

	// visible or Not :  Pay_Results_Summary_Link
	public boolean isDisplayed_click_Pay_Results_Summary_Link(){
		if(click_Pay_Results_Summary_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Pay_Results_Summary_Link
	public boolean isEnabled_click_Pay_Results_Summary_Link(){
		if(click_Pay_Results_Summary_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Pay_Results_Summary_Link
	public String getCssValue_click_Pay_Results_Summary_Link(String attribute) {
		return click_Pay_Results_Summary_Link.getCssValue(attribute);
	}

	//Get the text :  Pay_Results_Summary_Link
	public String getText_click_Pay_Results_Summary_Link(){
		return click_Pay_Results_Summary_Link.getText();
	}

	//Get the value :  Pay_Results_Summary_Link
	public String getValue_click_Pay_Results_Summary_Link(){
		return click_Pay_Results_Summary_Link.getAttribute("value");
	}
	// selected or Not :  Pay_Results_Summary_Link
	public boolean isSelected_click_Pay_Results_Summary_Link(){
		if(click_Pay_Results_Summary_Link.isSelected()) { return true; } else { return false;} 
	}

}
