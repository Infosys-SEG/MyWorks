//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_OperationsPage { 
	WebDriver driver;
	public POM_Generated_OperationsPage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : Manager_Summary_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=MANAGERSUMMARY']")
	public WebElement click_Manager_Summary_Link;
	
	// Associated Label : Weekly_Punch_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=PUNCHTCMGRSUMRY']")
	public WebElement click_Weekly_Punch_Link;
	
	// Associated Label : Sch_Act_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=140504']")
	public WebElement click_Sch_Act_Link;
	
	// Associated Label : Accural_Balances_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=ACCR_BAL_REP']")
	public WebElement click_Accural_Balances_Link;
	
	// Associated Label : Associate_Exception_Report_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=EMPEXCEPTIONREPORT']")
	public WebElement click_Associate_Exception_Report_Link;
	
	// Associated Label : Time_Tools_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=TIMEVIEWS']")
	public WebElement click_Time_Tools_Link;
	
	// Associated Label : Who_Is_Here_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=ASSOCIN']")
	public WebElement click_Who_Is_Here_Link;
	
	// Associated Label : Who_Is_Missing_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=ASSOCMISSING']")
	public WebElement click_Who_Is_Missing_Link;
	
	// Associated Label : Approacing_OT_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=APPROT']")
	public WebElement click_Approacing_OT_Link;
	
	// Associated Label : Time_Summary_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=SUMMARY']")
	public WebElement click_Time_Summary_Link;
	
	// Associated Label : UnAccepted_Punches_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=UNACCEPTEDPUNCHES']")
	public WebElement click_UnAccepted_Punches_Link;
	
	// Associated Label : UnResolved_Punches_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=UNRESOLVEDPUNCHES']")
	public WebElement click_UnResolved_Punches_Link;
	
	// Associated Label : Manager_Functions_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=MANAGERFUNCTIONS']")
	public WebElement click_Manager_Functions_Link;
	
	// Associated Label : Message_List_Link
	@FindBy(xpath = "//a[@href='/RWSBILO/NavigationController.jsp?mm=OPERATIONS&sm=MSGLIST']")
	public WebElement click_Message_List_Link;
	

//*******************************************************************************


	// Element Actions


	//click:  Manager_Summary_Link
	public void click_click_Manager_Summary_Link(){
		click_Manager_Summary_Link.click();
	}

	// Hover:  Manager_Summary_Link
	public void hover_click_Manager_Summary_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Manager_Summary_Link).build().perform();
	}

	// visible or Not :  Manager_Summary_Link
	public boolean isDisplayed_click_Manager_Summary_Link(){
		if(click_Manager_Summary_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Manager_Summary_Link
	public boolean isEnabled_click_Manager_Summary_Link(){
		if(click_Manager_Summary_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Manager_Summary_Link
	public String getCssValue_click_Manager_Summary_Link(String attribute) {
		return click_Manager_Summary_Link.getCssValue(attribute);
	}

	//Get the text :  Manager_Summary_Link
	public String getText_click_Manager_Summary_Link(){
		return click_Manager_Summary_Link.getText();
	}

	//Get the value :  Manager_Summary_Link
	public String getValue_click_Manager_Summary_Link(){
		return click_Manager_Summary_Link.getAttribute("value");
	}
	// selected or Not :  Manager_Summary_Link
	public boolean isSelected_click_Manager_Summary_Link(){
		if(click_Manager_Summary_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Weekly_Punch_Link
	public void click_click_Weekly_Punch_Link(){
		click_Weekly_Punch_Link.click();
	}

	// Hover:  Weekly_Punch_Link
	public void hover_click_Weekly_Punch_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Weekly_Punch_Link).build().perform();
	}

	// visible or Not :  Weekly_Punch_Link
	public boolean isDisplayed_click_Weekly_Punch_Link(){
		if(click_Weekly_Punch_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Weekly_Punch_Link
	public boolean isEnabled_click_Weekly_Punch_Link(){
		if(click_Weekly_Punch_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Weekly_Punch_Link
	public String getCssValue_click_Weekly_Punch_Link(String attribute) {
		return click_Weekly_Punch_Link.getCssValue(attribute);
	}

	//Get the text :  Weekly_Punch_Link
	public String getText_click_Weekly_Punch_Link(){
		return click_Weekly_Punch_Link.getText();
	}

	//Get the value :  Weekly_Punch_Link
	public String getValue_click_Weekly_Punch_Link(){
		return click_Weekly_Punch_Link.getAttribute("value");
	}
	// selected or Not :  Weekly_Punch_Link
	public boolean isSelected_click_Weekly_Punch_Link(){
		if(click_Weekly_Punch_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Sch_Act_Link
	public void click_click_Sch_Act_Link(){
		click_Sch_Act_Link.click();
	}

	// Hover:  Sch_Act_Link
	public void hover_click_Sch_Act_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Sch_Act_Link).build().perform();
	}

	// visible or Not :  Sch_Act_Link
	public boolean isDisplayed_click_Sch_Act_Link(){
		if(click_Sch_Act_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Sch_Act_Link
	public boolean isEnabled_click_Sch_Act_Link(){
		if(click_Sch_Act_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Sch_Act_Link
	public String getCssValue_click_Sch_Act_Link(String attribute) {
		return click_Sch_Act_Link.getCssValue(attribute);
	}

	//Get the text :  Sch_Act_Link
	public String getText_click_Sch_Act_Link(){
		return click_Sch_Act_Link.getText();
	}

	//Get the value :  Sch_Act_Link
	public String getValue_click_Sch_Act_Link(){
		return click_Sch_Act_Link.getAttribute("value");
	}
	// selected or Not :  Sch_Act_Link
	public boolean isSelected_click_Sch_Act_Link(){
		if(click_Sch_Act_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Accural_Balances_Link
	public void click_click_Accural_Balances_Link(){
		click_Accural_Balances_Link.click();
	}

	// Hover:  Accural_Balances_Link
	public void hover_click_Accural_Balances_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Accural_Balances_Link).build().perform();
	}

	// visible or Not :  Accural_Balances_Link
	public boolean isDisplayed_click_Accural_Balances_Link(){
		if(click_Accural_Balances_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Accural_Balances_Link
	public boolean isEnabled_click_Accural_Balances_Link(){
		if(click_Accural_Balances_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Accural_Balances_Link
	public String getCssValue_click_Accural_Balances_Link(String attribute) {
		return click_Accural_Balances_Link.getCssValue(attribute);
	}

	//Get the text :  Accural_Balances_Link
	public String getText_click_Accural_Balances_Link(){
		return click_Accural_Balances_Link.getText();
	}

	//Get the value :  Accural_Balances_Link
	public String getValue_click_Accural_Balances_Link(){
		return click_Accural_Balances_Link.getAttribute("value");
	}
	// selected or Not :  Accural_Balances_Link
	public boolean isSelected_click_Accural_Balances_Link(){
		if(click_Accural_Balances_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Associate_Exception_Report_Link
	public void click_click_Associate_Exception_Report_Link(){
		click_Associate_Exception_Report_Link.click();
	}

	// Hover:  Associate_Exception_Report_Link
	public void hover_click_Associate_Exception_Report_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Associate_Exception_Report_Link).build().perform();
	}

	// visible or Not :  Associate_Exception_Report_Link
	public boolean isDisplayed_click_Associate_Exception_Report_Link(){
		if(click_Associate_Exception_Report_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Associate_Exception_Report_Link
	public boolean isEnabled_click_Associate_Exception_Report_Link(){
		if(click_Associate_Exception_Report_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Associate_Exception_Report_Link
	public String getCssValue_click_Associate_Exception_Report_Link(String attribute) {
		return click_Associate_Exception_Report_Link.getCssValue(attribute);
	}

	//Get the text :  Associate_Exception_Report_Link
	public String getText_click_Associate_Exception_Report_Link(){
		return click_Associate_Exception_Report_Link.getText();
	}

	//Get the value :  Associate_Exception_Report_Link
	public String getValue_click_Associate_Exception_Report_Link(){
		return click_Associate_Exception_Report_Link.getAttribute("value");
	}
	// selected or Not :  Associate_Exception_Report_Link
	public boolean isSelected_click_Associate_Exception_Report_Link(){
		if(click_Associate_Exception_Report_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Time_Tools_Link
	public void click_click_Time_Tools_Link(){
		click_Time_Tools_Link.click();
	}

	// Hover:  Time_Tools_Link
	public void hover_click_Time_Tools_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Time_Tools_Link).build().perform();
	}

	// visible or Not :  Time_Tools_Link
	public boolean isDisplayed_click_Time_Tools_Link(){
		if(click_Time_Tools_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Time_Tools_Link
	public boolean isEnabled_click_Time_Tools_Link(){
		if(click_Time_Tools_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Time_Tools_Link
	public String getCssValue_click_Time_Tools_Link(String attribute) {
		return click_Time_Tools_Link.getCssValue(attribute);
	}

	//Get the text :  Time_Tools_Link
	public String getText_click_Time_Tools_Link(){
		return click_Time_Tools_Link.getText();
	}

	//Get the value :  Time_Tools_Link
	public String getValue_click_Time_Tools_Link(){
		return click_Time_Tools_Link.getAttribute("value");
	}
	// selected or Not :  Time_Tools_Link
	public boolean isSelected_click_Time_Tools_Link(){
		if(click_Time_Tools_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Who_Is_Here_Link
	public void click_click_Who_Is_Here_Link(){
		click_Who_Is_Here_Link.click();
	}

	// Hover:  Who_Is_Here_Link
	public void hover_click_Who_Is_Here_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Who_Is_Here_Link).build().perform();
	}

	// visible or Not :  Who_Is_Here_Link
	public boolean isDisplayed_click_Who_Is_Here_Link(){
		if(click_Who_Is_Here_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Who_Is_Here_Link
	public boolean isEnabled_click_Who_Is_Here_Link(){
		if(click_Who_Is_Here_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Who_Is_Here_Link
	public String getCssValue_click_Who_Is_Here_Link(String attribute) {
		return click_Who_Is_Here_Link.getCssValue(attribute);
	}

	//Get the text :  Who_Is_Here_Link
	public String getText_click_Who_Is_Here_Link(){
		return click_Who_Is_Here_Link.getText();
	}

	//Get the value :  Who_Is_Here_Link
	public String getValue_click_Who_Is_Here_Link(){
		return click_Who_Is_Here_Link.getAttribute("value");
	}
	// selected or Not :  Who_Is_Here_Link
	public boolean isSelected_click_Who_Is_Here_Link(){
		if(click_Who_Is_Here_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Who_Is_Missing_Link
	public void click_click_Who_Is_Missing_Link(){
		click_Who_Is_Missing_Link.click();
	}

	// Hover:  Who_Is_Missing_Link
	public void hover_click_Who_Is_Missing_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Who_Is_Missing_Link).build().perform();
	}

	// visible or Not :  Who_Is_Missing_Link
	public boolean isDisplayed_click_Who_Is_Missing_Link(){
		if(click_Who_Is_Missing_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Who_Is_Missing_Link
	public boolean isEnabled_click_Who_Is_Missing_Link(){
		if(click_Who_Is_Missing_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Who_Is_Missing_Link
	public String getCssValue_click_Who_Is_Missing_Link(String attribute) {
		return click_Who_Is_Missing_Link.getCssValue(attribute);
	}

	//Get the text :  Who_Is_Missing_Link
	public String getText_click_Who_Is_Missing_Link(){
		return click_Who_Is_Missing_Link.getText();
	}

	//Get the value :  Who_Is_Missing_Link
	public String getValue_click_Who_Is_Missing_Link(){
		return click_Who_Is_Missing_Link.getAttribute("value");
	}
	// selected or Not :  Who_Is_Missing_Link
	public boolean isSelected_click_Who_Is_Missing_Link(){
		if(click_Who_Is_Missing_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Approacing_OT_Link
	public void click_click_Approacing_OT_Link(){
		click_Approacing_OT_Link.click();
	}

	// Hover:  Approacing_OT_Link
	public void hover_click_Approacing_OT_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Approacing_OT_Link).build().perform();
	}

	// visible or Not :  Approacing_OT_Link
	public boolean isDisplayed_click_Approacing_OT_Link(){
		if(click_Approacing_OT_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Approacing_OT_Link
	public boolean isEnabled_click_Approacing_OT_Link(){
		if(click_Approacing_OT_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Approacing_OT_Link
	public String getCssValue_click_Approacing_OT_Link(String attribute) {
		return click_Approacing_OT_Link.getCssValue(attribute);
	}

	//Get the text :  Approacing_OT_Link
	public String getText_click_Approacing_OT_Link(){
		return click_Approacing_OT_Link.getText();
	}

	//Get the value :  Approacing_OT_Link
	public String getValue_click_Approacing_OT_Link(){
		return click_Approacing_OT_Link.getAttribute("value");
	}
	// selected or Not :  Approacing_OT_Link
	public boolean isSelected_click_Approacing_OT_Link(){
		if(click_Approacing_OT_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Time_Summary_Link
	public void click_click_Time_Summary_Link(){
		click_Time_Summary_Link.click();
	}

	// Hover:  Time_Summary_Link
	public void hover_click_Time_Summary_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Time_Summary_Link).build().perform();
	}

	// visible or Not :  Time_Summary_Link
	public boolean isDisplayed_click_Time_Summary_Link(){
		if(click_Time_Summary_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Time_Summary_Link
	public boolean isEnabled_click_Time_Summary_Link(){
		if(click_Time_Summary_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Time_Summary_Link
	public String getCssValue_click_Time_Summary_Link(String attribute) {
		return click_Time_Summary_Link.getCssValue(attribute);
	}

	//Get the text :  Time_Summary_Link
	public String getText_click_Time_Summary_Link(){
		return click_Time_Summary_Link.getText();
	}

	//Get the value :  Time_Summary_Link
	public String getValue_click_Time_Summary_Link(){
		return click_Time_Summary_Link.getAttribute("value");
	}
	// selected or Not :  Time_Summary_Link
	public boolean isSelected_click_Time_Summary_Link(){
		if(click_Time_Summary_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  UnAccepted_Punches_Link
	public void click_click_UnAccepted_Punches_Link(){
		click_UnAccepted_Punches_Link.click();
	}

	// Hover:  UnAccepted_Punches_Link
	public void hover_click_UnAccepted_Punches_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_UnAccepted_Punches_Link).build().perform();
	}

	// visible or Not :  UnAccepted_Punches_Link
	public boolean isDisplayed_click_UnAccepted_Punches_Link(){
		if(click_UnAccepted_Punches_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  UnAccepted_Punches_Link
	public boolean isEnabled_click_UnAccepted_Punches_Link(){
		if(click_UnAccepted_Punches_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  UnAccepted_Punches_Link
	public String getCssValue_click_UnAccepted_Punches_Link(String attribute) {
		return click_UnAccepted_Punches_Link.getCssValue(attribute);
	}

	//Get the text :  UnAccepted_Punches_Link
	public String getText_click_UnAccepted_Punches_Link(){
		return click_UnAccepted_Punches_Link.getText();
	}

	//Get the value :  UnAccepted_Punches_Link
	public String getValue_click_UnAccepted_Punches_Link(){
		return click_UnAccepted_Punches_Link.getAttribute("value");
	}
	// selected or Not :  UnAccepted_Punches_Link
	public boolean isSelected_click_UnAccepted_Punches_Link(){
		if(click_UnAccepted_Punches_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  UnResolved_Punches_Link
	public void click_click_UnResolved_Punches_Link(){
		click_UnResolved_Punches_Link.click();
	}

	// Hover:  UnResolved_Punches_Link
	public void hover_click_UnResolved_Punches_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_UnResolved_Punches_Link).build().perform();
	}

	// visible or Not :  UnResolved_Punches_Link
	public boolean isDisplayed_click_UnResolved_Punches_Link(){
		if(click_UnResolved_Punches_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  UnResolved_Punches_Link
	public boolean isEnabled_click_UnResolved_Punches_Link(){
		if(click_UnResolved_Punches_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  UnResolved_Punches_Link
	public String getCssValue_click_UnResolved_Punches_Link(String attribute) {
		return click_UnResolved_Punches_Link.getCssValue(attribute);
	}

	//Get the text :  UnResolved_Punches_Link
	public String getText_click_UnResolved_Punches_Link(){
		return click_UnResolved_Punches_Link.getText();
	}

	//Get the value :  UnResolved_Punches_Link
	public String getValue_click_UnResolved_Punches_Link(){
		return click_UnResolved_Punches_Link.getAttribute("value");
	}
	// selected or Not :  UnResolved_Punches_Link
	public boolean isSelected_click_UnResolved_Punches_Link(){
		if(click_UnResolved_Punches_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Manager_Functions_Link
	public void click_click_Manager_Functions_Link(){
		click_Manager_Functions_Link.click();
	}

	// Hover:  Manager_Functions_Link
	public void hover_click_Manager_Functions_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Manager_Functions_Link).build().perform();
	}

	// visible or Not :  Manager_Functions_Link
	public boolean isDisplayed_click_Manager_Functions_Link(){
		if(click_Manager_Functions_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Manager_Functions_Link
	public boolean isEnabled_click_Manager_Functions_Link(){
		if(click_Manager_Functions_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Manager_Functions_Link
	public String getCssValue_click_Manager_Functions_Link(String attribute) {
		return click_Manager_Functions_Link.getCssValue(attribute);
	}

	//Get the text :  Manager_Functions_Link
	public String getText_click_Manager_Functions_Link(){
		return click_Manager_Functions_Link.getText();
	}

	//Get the value :  Manager_Functions_Link
	public String getValue_click_Manager_Functions_Link(){
		return click_Manager_Functions_Link.getAttribute("value");
	}
	// selected or Not :  Manager_Functions_Link
	public boolean isSelected_click_Manager_Functions_Link(){
		if(click_Manager_Functions_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Message_List_Link
	public void click_click_Message_List_Link(){
		click_Message_List_Link.click();
	}

	// Hover:  Message_List_Link
	public void hover_click_Message_List_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Message_List_Link).build().perform();
	}

	// visible or Not :  Message_List_Link
	public boolean isDisplayed_click_Message_List_Link(){
		if(click_Message_List_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Message_List_Link
	public boolean isEnabled_click_Message_List_Link(){
		if(click_Message_List_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Message_List_Link
	public String getCssValue_click_Message_List_Link(String attribute) {
		return click_Message_List_Link.getCssValue(attribute);
	}

	//Get the text :  Message_List_Link
	public String getText_click_Message_List_Link(){
		return click_Message_List_Link.getText();
	}

	//Get the value :  Message_List_Link
	public String getValue_click_Message_List_Link(){
		return click_Message_List_Link.getAttribute("value");
	}
	// selected or Not :  Message_List_Link
	public boolean isSelected_click_Message_List_Link(){
		if(click_Message_List_Link.isSelected()) { return true; } else { return false;} 
	}

}
