//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_TimecardPage { 
	WebDriver driver;
	public POM_Generated_TimecardPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Save_Button
	@FindBy(xpath = "//div[@title='Save']")
	public WebElement click_Save_Button;
	
	// Associated Label : Print_Button
	@FindBy(xpath = "//div[@title='Print']")
	public WebElement click_Print_Button;
	
	// Associated Label : Undo_Button
	@FindBy(xpath = "//div[@title='Undo']")
	public WebElement click_Undo_Button;
	
	// Associated Label : Add_Shift_Button
	@FindBy(xpath = "//div[@title='Add Shift']//img[@src='../images/TCShift.gif']")
	public WebElement click_Add_Shift_Button;
	
	// Associated Label : Remove_Shift_Button
	@FindBy(xpath = "//div[@title='Remove Shift']//img[@src='../images/TCShift.gif']")
	public WebElement click_Remove_Shift_Button;
	
	// Associated Label : Add_Lunch_Button
	@FindBy(xpath = "//div[@title='Add Lunch']")
	public WebElement click_Add_Lunch_Button;
	
	// Associated Label : Remove_Lunch_Button
	@FindBy(xpath = "//div[@title='Remove Lunch']")
	public WebElement click_Remove_Lunch_Button;
	
	// Associated Label : Add_Break_Button
	@FindBy(xpath = "//div[@title='Add Break']")
	public WebElement click_Add_Break_Button;
	
	// Associated Label : Remove_Break_Button
	@FindBy(xpath = "//div[@title='Remove Break']")
	public WebElement click_Remove_Break_Button;
	
	// Associated Label : Add_SplPay_Button
	@FindBy(xpath = "//div[@title='Add Special Pay']")
	public WebElement click_Add_SplPay_Button;
	
	// Associated Label : Remove_SplPay_Button
	@FindBy(xpath = "//div[@title='Remove Special Pay']")
	public WebElement click_Remove_SplPay_Button;
	
	// Associated Label : Add_Punch_Button
	@FindBy(xpath = "//div[@title='Add Punch']")
	public WebElement click_Add_Punch_Button;
	
	// Associated Label : Remove_Punch_Button
	@FindBy(xpath = "//div[@title='Remove Punch']")
	public WebElement click_Remove_Punch_Button;
	
	// Associated Label : Review_Warnings_Button
	@FindBy(xpath = "//div[@title='Review Warnings']")
	public WebElement click_Review_Warnings_Button;
	
	// Associated Label : Accural_Balances_Button
	@FindBy(xpath = "//div[@title='Accrual Balances']")
	public WebElement click_Accural_Balances_Button;
	

//*******************************************************************************


	// Element Actions


	//click:  Save_Button
	public void click_click_Save_Button(){
		click_Save_Button.click();
	}

	// Hover:  Save_Button
	public void hover_click_Save_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Save_Button).build().perform();
	}

	// visible or Not :  Save_Button
	public boolean isDisplayed_click_Save_Button(){
		if(click_Save_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Save_Button
	public boolean isEnabled_click_Save_Button(){
		if(click_Save_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Save_Button
	public String getCssValue_click_Save_Button(String attribute) {
		return click_Save_Button.getCssValue(attribute);
	}

	//Get the text :  Save_Button
	public String getText_click_Save_Button(){
		return click_Save_Button.getText();
	}

	//Get the value :  Save_Button
	public String getValue_click_Save_Button(){
		return click_Save_Button.getAttribute("value");
	}
	// selected or Not :  Save_Button
	public boolean isSelected_click_Save_Button(){
		if(click_Save_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Print_Button
	public void click_click_Print_Button(){
		click_Print_Button.click();
	}

	// Hover:  Print_Button
	public void hover_click_Print_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Print_Button).build().perform();
	}

	// visible or Not :  Print_Button
	public boolean isDisplayed_click_Print_Button(){
		if(click_Print_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Print_Button
	public boolean isEnabled_click_Print_Button(){
		if(click_Print_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Print_Button
	public String getCssValue_click_Print_Button(String attribute) {
		return click_Print_Button.getCssValue(attribute);
	}

	//Get the text :  Print_Button
	public String getText_click_Print_Button(){
		return click_Print_Button.getText();
	}

	//Get the value :  Print_Button
	public String getValue_click_Print_Button(){
		return click_Print_Button.getAttribute("value");
	}
	// selected or Not :  Print_Button
	public boolean isSelected_click_Print_Button(){
		if(click_Print_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Undo_Button
	public void click_click_Undo_Button(){
		click_Undo_Button.click();
	}

	// Hover:  Undo_Button
	public void hover_click_Undo_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Undo_Button).build().perform();
	}

	// visible or Not :  Undo_Button
	public boolean isDisplayed_click_Undo_Button(){
		if(click_Undo_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Undo_Button
	public boolean isEnabled_click_Undo_Button(){
		if(click_Undo_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Undo_Button
	public String getCssValue_click_Undo_Button(String attribute) {
		return click_Undo_Button.getCssValue(attribute);
	}

	//Get the text :  Undo_Button
	public String getText_click_Undo_Button(){
		return click_Undo_Button.getText();
	}

	//Get the value :  Undo_Button
	public String getValue_click_Undo_Button(){
		return click_Undo_Button.getAttribute("value");
	}
	// selected or Not :  Undo_Button
	public boolean isSelected_click_Undo_Button(){
		if(click_Undo_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Add_Shift_Button
	public void click_click_Add_Shift_Button(){
		click_Add_Shift_Button.click();
	}

	// Hover:  Add_Shift_Button
	public void hover_click_Add_Shift_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Add_Shift_Button).build().perform();
	}

	// visible or Not :  Add_Shift_Button
	public boolean isDisplayed_click_Add_Shift_Button(){
		if(click_Add_Shift_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Add_Shift_Button
	public boolean isEnabled_click_Add_Shift_Button(){
		if(click_Add_Shift_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Add_Shift_Button
	public String getCssValue_click_Add_Shift_Button(String attribute) {
		return click_Add_Shift_Button.getCssValue(attribute);
	}

	//Get the text :  Add_Shift_Button
	public String getText_click_Add_Shift_Button(){
		return click_Add_Shift_Button.getText();
	}

	//Get the value :  Add_Shift_Button
	public String getValue_click_Add_Shift_Button(){
		return click_Add_Shift_Button.getAttribute("value");
	}
	// selected or Not :  Add_Shift_Button
	public boolean isSelected_click_Add_Shift_Button(){
		if(click_Add_Shift_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Remove_Shift_Button
	public void click_click_Remove_Shift_Button(){
		click_Remove_Shift_Button.click();
	}

	// Hover:  Remove_Shift_Button
	public void hover_click_Remove_Shift_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Remove_Shift_Button).build().perform();
	}

	// visible or Not :  Remove_Shift_Button
	public boolean isDisplayed_click_Remove_Shift_Button(){
		if(click_Remove_Shift_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Remove_Shift_Button
	public boolean isEnabled_click_Remove_Shift_Button(){
		if(click_Remove_Shift_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Remove_Shift_Button
	public String getCssValue_click_Remove_Shift_Button(String attribute) {
		return click_Remove_Shift_Button.getCssValue(attribute);
	}

	//Get the text :  Remove_Shift_Button
	public String getText_click_Remove_Shift_Button(){
		return click_Remove_Shift_Button.getText();
	}

	//Get the value :  Remove_Shift_Button
	public String getValue_click_Remove_Shift_Button(){
		return click_Remove_Shift_Button.getAttribute("value");
	}
	// selected or Not :  Remove_Shift_Button
	public boolean isSelected_click_Remove_Shift_Button(){
		if(click_Remove_Shift_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Add_Lunch_Button
	public void click_click_Add_Lunch_Button(){
		click_Add_Lunch_Button.click();
	}

	// Hover:  Add_Lunch_Button
	public void hover_click_Add_Lunch_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Add_Lunch_Button).build().perform();
	}

	// visible or Not :  Add_Lunch_Button
	public boolean isDisplayed_click_Add_Lunch_Button(){
		if(click_Add_Lunch_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Add_Lunch_Button
	public boolean isEnabled_click_Add_Lunch_Button(){
		if(click_Add_Lunch_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Add_Lunch_Button
	public String getCssValue_click_Add_Lunch_Button(String attribute) {
		return click_Add_Lunch_Button.getCssValue(attribute);
	}

	//Get the text :  Add_Lunch_Button
	public String getText_click_Add_Lunch_Button(){
		return click_Add_Lunch_Button.getText();
	}

	//Get the value :  Add_Lunch_Button
	public String getValue_click_Add_Lunch_Button(){
		return click_Add_Lunch_Button.getAttribute("value");
	}
	// selected or Not :  Add_Lunch_Button
	public boolean isSelected_click_Add_Lunch_Button(){
		if(click_Add_Lunch_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Remove_Lunch_Button
	public void click_click_Remove_Lunch_Button(){
		click_Remove_Lunch_Button.click();
	}

	// Hover:  Remove_Lunch_Button
	public void hover_click_Remove_Lunch_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Remove_Lunch_Button).build().perform();
	}

	// visible or Not :  Remove_Lunch_Button
	public boolean isDisplayed_click_Remove_Lunch_Button(){
		if(click_Remove_Lunch_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Remove_Lunch_Button
	public boolean isEnabled_click_Remove_Lunch_Button(){
		if(click_Remove_Lunch_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Remove_Lunch_Button
	public String getCssValue_click_Remove_Lunch_Button(String attribute) {
		return click_Remove_Lunch_Button.getCssValue(attribute);
	}

	//Get the text :  Remove_Lunch_Button
	public String getText_click_Remove_Lunch_Button(){
		return click_Remove_Lunch_Button.getText();
	}

	//Get the value :  Remove_Lunch_Button
	public String getValue_click_Remove_Lunch_Button(){
		return click_Remove_Lunch_Button.getAttribute("value");
	}
	// selected or Not :  Remove_Lunch_Button
	public boolean isSelected_click_Remove_Lunch_Button(){
		if(click_Remove_Lunch_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Add_Break_Button
	public void click_click_Add_Break_Button(){
		click_Add_Break_Button.click();
	}

	// Hover:  Add_Break_Button
	public void hover_click_Add_Break_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Add_Break_Button).build().perform();
	}

	// visible or Not :  Add_Break_Button
	public boolean isDisplayed_click_Add_Break_Button(){
		if(click_Add_Break_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Add_Break_Button
	public boolean isEnabled_click_Add_Break_Button(){
		if(click_Add_Break_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Add_Break_Button
	public String getCssValue_click_Add_Break_Button(String attribute) {
		return click_Add_Break_Button.getCssValue(attribute);
	}

	//Get the text :  Add_Break_Button
	public String getText_click_Add_Break_Button(){
		return click_Add_Break_Button.getText();
	}

	//Get the value :  Add_Break_Button
	public String getValue_click_Add_Break_Button(){
		return click_Add_Break_Button.getAttribute("value");
	}
	// selected or Not :  Add_Break_Button
	public boolean isSelected_click_Add_Break_Button(){
		if(click_Add_Break_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Remove_Break_Button
	public void click_click_Remove_Break_Button(){
		click_Remove_Break_Button.click();
	}

	// Hover:  Remove_Break_Button
	public void hover_click_Remove_Break_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Remove_Break_Button).build().perform();
	}

	// visible or Not :  Remove_Break_Button
	public boolean isDisplayed_click_Remove_Break_Button(){
		if(click_Remove_Break_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Remove_Break_Button
	public boolean isEnabled_click_Remove_Break_Button(){
		if(click_Remove_Break_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Remove_Break_Button
	public String getCssValue_click_Remove_Break_Button(String attribute) {
		return click_Remove_Break_Button.getCssValue(attribute);
	}

	//Get the text :  Remove_Break_Button
	public String getText_click_Remove_Break_Button(){
		return click_Remove_Break_Button.getText();
	}

	//Get the value :  Remove_Break_Button
	public String getValue_click_Remove_Break_Button(){
		return click_Remove_Break_Button.getAttribute("value");
	}
	// selected or Not :  Remove_Break_Button
	public boolean isSelected_click_Remove_Break_Button(){
		if(click_Remove_Break_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Add_SplPay_Button
	public void click_click_Add_SplPay_Button(){
		click_Add_SplPay_Button.click();
	}

	// Hover:  Add_SplPay_Button
	public void hover_click_Add_SplPay_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Add_SplPay_Button).build().perform();
	}

	// visible or Not :  Add_SplPay_Button
	public boolean isDisplayed_click_Add_SplPay_Button(){
		if(click_Add_SplPay_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Add_SplPay_Button
	public boolean isEnabled_click_Add_SplPay_Button(){
		if(click_Add_SplPay_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Add_SplPay_Button
	public String getCssValue_click_Add_SplPay_Button(String attribute) {
		return click_Add_SplPay_Button.getCssValue(attribute);
	}

	//Get the text :  Add_SplPay_Button
	public String getText_click_Add_SplPay_Button(){
		return click_Add_SplPay_Button.getText();
	}

	//Get the value :  Add_SplPay_Button
	public String getValue_click_Add_SplPay_Button(){
		return click_Add_SplPay_Button.getAttribute("value");
	}
	// selected or Not :  Add_SplPay_Button
	public boolean isSelected_click_Add_SplPay_Button(){
		if(click_Add_SplPay_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Remove_SplPay_Button
	public void click_click_Remove_SplPay_Button(){
		click_Remove_SplPay_Button.click();
	}

	// Hover:  Remove_SplPay_Button
	public void hover_click_Remove_SplPay_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Remove_SplPay_Button).build().perform();
	}

	// visible or Not :  Remove_SplPay_Button
	public boolean isDisplayed_click_Remove_SplPay_Button(){
		if(click_Remove_SplPay_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Remove_SplPay_Button
	public boolean isEnabled_click_Remove_SplPay_Button(){
		if(click_Remove_SplPay_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Remove_SplPay_Button
	public String getCssValue_click_Remove_SplPay_Button(String attribute) {
		return click_Remove_SplPay_Button.getCssValue(attribute);
	}

	//Get the text :  Remove_SplPay_Button
	public String getText_click_Remove_SplPay_Button(){
		return click_Remove_SplPay_Button.getText();
	}

	//Get the value :  Remove_SplPay_Button
	public String getValue_click_Remove_SplPay_Button(){
		return click_Remove_SplPay_Button.getAttribute("value");
	}
	// selected or Not :  Remove_SplPay_Button
	public boolean isSelected_click_Remove_SplPay_Button(){
		if(click_Remove_SplPay_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Add_Punch_Button
	public void click_click_Add_Punch_Button(){
		click_Add_Punch_Button.click();
	}

	// Hover:  Add_Punch_Button
	public void hover_click_Add_Punch_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Add_Punch_Button).build().perform();
	}

	// visible or Not :  Add_Punch_Button
	public boolean isDisplayed_click_Add_Punch_Button(){
		if(click_Add_Punch_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Add_Punch_Button
	public boolean isEnabled_click_Add_Punch_Button(){
		if(click_Add_Punch_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Add_Punch_Button
	public String getCssValue_click_Add_Punch_Button(String attribute) {
		return click_Add_Punch_Button.getCssValue(attribute);
	}

	//Get the text :  Add_Punch_Button
	public String getText_click_Add_Punch_Button(){
		return click_Add_Punch_Button.getText();
	}

	//Get the value :  Add_Punch_Button
	public String getValue_click_Add_Punch_Button(){
		return click_Add_Punch_Button.getAttribute("value");
	}
	// selected or Not :  Add_Punch_Button
	public boolean isSelected_click_Add_Punch_Button(){
		if(click_Add_Punch_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Remove_Punch_Button
	public void click_click_Remove_Punch_Button(){
		click_Remove_Punch_Button.click();
	}

	// Hover:  Remove_Punch_Button
	public void hover_click_Remove_Punch_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Remove_Punch_Button).build().perform();
	}

	// visible or Not :  Remove_Punch_Button
	public boolean isDisplayed_click_Remove_Punch_Button(){
		if(click_Remove_Punch_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Remove_Punch_Button
	public boolean isEnabled_click_Remove_Punch_Button(){
		if(click_Remove_Punch_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Remove_Punch_Button
	public String getCssValue_click_Remove_Punch_Button(String attribute) {
		return click_Remove_Punch_Button.getCssValue(attribute);
	}

	//Get the text :  Remove_Punch_Button
	public String getText_click_Remove_Punch_Button(){
		return click_Remove_Punch_Button.getText();
	}

	//Get the value :  Remove_Punch_Button
	public String getValue_click_Remove_Punch_Button(){
		return click_Remove_Punch_Button.getAttribute("value");
	}
	// selected or Not :  Remove_Punch_Button
	public boolean isSelected_click_Remove_Punch_Button(){
		if(click_Remove_Punch_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Review_Warnings_Button
	public void click_click_Review_Warnings_Button(){
		click_Review_Warnings_Button.click();
	}

	// Hover:  Review_Warnings_Button
	public void hover_click_Review_Warnings_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Review_Warnings_Button).build().perform();
	}

	// visible or Not :  Review_Warnings_Button
	public boolean isDisplayed_click_Review_Warnings_Button(){
		if(click_Review_Warnings_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Review_Warnings_Button
	public boolean isEnabled_click_Review_Warnings_Button(){
		if(click_Review_Warnings_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Review_Warnings_Button
	public String getCssValue_click_Review_Warnings_Button(String attribute) {
		return click_Review_Warnings_Button.getCssValue(attribute);
	}

	//Get the text :  Review_Warnings_Button
	public String getText_click_Review_Warnings_Button(){
		return click_Review_Warnings_Button.getText();
	}

	//Get the value :  Review_Warnings_Button
	public String getValue_click_Review_Warnings_Button(){
		return click_Review_Warnings_Button.getAttribute("value");
	}
	// selected or Not :  Review_Warnings_Button
	public boolean isSelected_click_Review_Warnings_Button(){
		if(click_Review_Warnings_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Accural_Balances_Button
	public void click_click_Accural_Balances_Button(){
		click_Accural_Balances_Button.click();
	}

	// Hover:  Accural_Balances_Button
	public void hover_click_Accural_Balances_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Accural_Balances_Button).build().perform();
	}

	// visible or Not :  Accural_Balances_Button
	public boolean isDisplayed_click_Accural_Balances_Button(){
		if(click_Accural_Balances_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Accural_Balances_Button
	public boolean isEnabled_click_Accural_Balances_Button(){
		if(click_Accural_Balances_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Accural_Balances_Button
	public String getCssValue_click_Accural_Balances_Button(String attribute) {
		return click_Accural_Balances_Button.getCssValue(attribute);
	}

	//Get the text :  Accural_Balances_Button
	public String getText_click_Accural_Balances_Button(){
		return click_Accural_Balances_Button.getText();
	}

	//Get the value :  Accural_Balances_Button
	public String getValue_click_Accural_Balances_Button(){
		return click_Accural_Balances_Button.getAttribute("value");
	}
	// selected or Not :  Accural_Balances_Button
	public boolean isSelected_click_Accural_Balances_Button(){
		if(click_Accural_Balances_Button.isSelected()) { return true; } else { return false;} 
	}

}
