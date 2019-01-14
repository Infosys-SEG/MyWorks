//******************************
package  generatedClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generated_MyTimePage { 
	WebDriver driver;
	public POM_Generated_MyTimePage (WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// Object Repository


	// Associated Label : MyTime_PageVerify_Text
	@FindBy(xpath = "//td[contains(text(),'MyTime')]")
	public WebElement txt_MyTime_PageVerify_Text;
	
	// Associated Label : Operations_Link
	@FindBy(xpath = "//a[contains(text(),'Operations')]")
	public WebElement click_Operations_Link;
	
	// Associated Label : Payroll_Link
	@FindBy(xpath = "//a[contains(text(),'Payroll')]")
	public WebElement click_Payroll_Link;
	
	// Associated Label : Print_Icon
	@FindBy(xpath = "//img[@id='print']")
	public WebElement click_Print_Icon;
	
	// Associated Label : Excel_Icon
	@FindBy(xpath = "//img[@id='excel']")
	public WebElement click_Excel_Icon;
	
	// Associated Label : PDF_Icon
	@FindBy(xpath = "//img[@id='pdf']")
	public WebElement click_PDF_Icon;
	
	// Associated Label : Selected_Week_Button
	@FindBy(xpath = "//select[@id='lstWeekend']")
	public WebElement txt_Selected_Week_Button;
	
	// Associated Label : Previous_Week_Button
	@FindBy(xpath = "//img[@id='leftMove']")
	public WebElement click_Previous_Week_Button;
	
	// Associated Label : Next_Week_Button
	@FindBy(xpath = "//img[@id='rightMove']")
	public WebElement click_Next_Week_Button;
	
	// Associated Label : Select_Associate_Link
	@FindBy(xpath = "//a[@href='#' and @class='tblrow-sp' and contains(@onclick,'redirectToTCard')]")
	public WebElement click_Select_Associate_Link;
	

//*******************************************************************************


	// Element Actions


	// Type:  MyTime_PageVerify_Text
	public void type_txt_MyTime_PageVerify_Text(String value) {
		txt_MyTime_PageVerify_Text.clear();
		txt_MyTime_PageVerify_Text.sendKeys(value);
	}

	//click:  MyTime_PageVerify_Text
	public void click_txt_MyTime_PageVerify_Text(){
		txt_MyTime_PageVerify_Text.click();
	}

	// Hover:  MyTime_PageVerify_Text
	public void hover_txt_MyTime_PageVerify_Text(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_MyTime_PageVerify_Text).build().perform();
	}

	// visible or Not :  MyTime_PageVerify_Text
	public boolean isDisplayed_txt_MyTime_PageVerify_Text(){
		if(txt_MyTime_PageVerify_Text.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  MyTime_PageVerify_Text
	public boolean isEnabled_txt_MyTime_PageVerify_Text(){
		if(txt_MyTime_PageVerify_Text.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  MyTime_PageVerify_Text
	public String getCssValue_txt_MyTime_PageVerify_Text(String attribute) {
		return txt_MyTime_PageVerify_Text.getCssValue(attribute);
	}

	//Get the text :  MyTime_PageVerify_Text
	public String getText_txt_MyTime_PageVerify_Text(){
		return txt_MyTime_PageVerify_Text.getText();
	}

	//Get the value :  MyTime_PageVerify_Text
	public String getValue_txt_MyTime_PageVerify_Text(){
		return txt_MyTime_PageVerify_Text.getAttribute("value");
	}
	// selected or Not :  MyTime_PageVerify_Text
	public boolean isSelected_txt_MyTime_PageVerify_Text(){
		if(txt_MyTime_PageVerify_Text.isSelected()) { return true; } else { return false;} 
	}

	//click:  Operations_Link
	public void click_click_Operations_Link(){
		click_Operations_Link.click();
	}

	// Hover:  Operations_Link
	public void hover_click_Operations_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Operations_Link).build().perform();
	}

	// visible or Not :  Operations_Link
	public boolean isDisplayed_click_Operations_Link(){
		if(click_Operations_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Operations_Link
	public boolean isEnabled_click_Operations_Link(){
		if(click_Operations_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Operations_Link
	public String getCssValue_click_Operations_Link(String attribute) {
		return click_Operations_Link.getCssValue(attribute);
	}

	//Get the text :  Operations_Link
	public String getText_click_Operations_Link(){
		return click_Operations_Link.getText();
	}

	//Get the value :  Operations_Link
	public String getValue_click_Operations_Link(){
		return click_Operations_Link.getAttribute("value");
	}
	// selected or Not :  Operations_Link
	public boolean isSelected_click_Operations_Link(){
		if(click_Operations_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Payroll_Link
	public void click_click_Payroll_Link(){
		click_Payroll_Link.click();
	}

	// Hover:  Payroll_Link
	public void hover_click_Payroll_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Payroll_Link).build().perform();
	}

	// visible or Not :  Payroll_Link
	public boolean isDisplayed_click_Payroll_Link(){
		if(click_Payroll_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Payroll_Link
	public boolean isEnabled_click_Payroll_Link(){
		if(click_Payroll_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Payroll_Link
	public String getCssValue_click_Payroll_Link(String attribute) {
		return click_Payroll_Link.getCssValue(attribute);
	}

	//Get the text :  Payroll_Link
	public String getText_click_Payroll_Link(){
		return click_Payroll_Link.getText();
	}

	//Get the value :  Payroll_Link
	public String getValue_click_Payroll_Link(){
		return click_Payroll_Link.getAttribute("value");
	}
	// selected or Not :  Payroll_Link
	public boolean isSelected_click_Payroll_Link(){
		if(click_Payroll_Link.isSelected()) { return true; } else { return false;} 
	}

	//click:  Print_Icon
	public void click_click_Print_Icon(){
		click_Print_Icon.click();
	}

	// Hover:  Print_Icon
	public void hover_click_Print_Icon(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Print_Icon).build().perform();
	}

	// visible or Not :  Print_Icon
	public boolean isDisplayed_click_Print_Icon(){
		if(click_Print_Icon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Print_Icon
	public boolean isEnabled_click_Print_Icon(){
		if(click_Print_Icon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Print_Icon
	public String getCssValue_click_Print_Icon(String attribute) {
		return click_Print_Icon.getCssValue(attribute);
	}

	//Get the text :  Print_Icon
	public String getText_click_Print_Icon(){
		return click_Print_Icon.getText();
	}

	//Get the value :  Print_Icon
	public String getValue_click_Print_Icon(){
		return click_Print_Icon.getAttribute("value");
	}
	// selected or Not :  Print_Icon
	public boolean isSelected_click_Print_Icon(){
		if(click_Print_Icon.isSelected()) { return true; } else { return false;} 
	}

	//click:  Excel_Icon
	public void click_click_Excel_Icon(){
		click_Excel_Icon.click();
	}

	// Hover:  Excel_Icon
	public void hover_click_Excel_Icon(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Excel_Icon).build().perform();
	}

	// visible or Not :  Excel_Icon
	public boolean isDisplayed_click_Excel_Icon(){
		if(click_Excel_Icon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Excel_Icon
	public boolean isEnabled_click_Excel_Icon(){
		if(click_Excel_Icon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Excel_Icon
	public String getCssValue_click_Excel_Icon(String attribute) {
		return click_Excel_Icon.getCssValue(attribute);
	}

	//Get the text :  Excel_Icon
	public String getText_click_Excel_Icon(){
		return click_Excel_Icon.getText();
	}

	//Get the value :  Excel_Icon
	public String getValue_click_Excel_Icon(){
		return click_Excel_Icon.getAttribute("value");
	}
	// selected or Not :  Excel_Icon
	public boolean isSelected_click_Excel_Icon(){
		if(click_Excel_Icon.isSelected()) { return true; } else { return false;} 
	}

	//click:  PDF_Icon
	public void click_click_PDF_Icon(){
		click_PDF_Icon.click();
	}

	// Hover:  PDF_Icon
	public void hover_click_PDF_Icon(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_PDF_Icon).build().perform();
	}

	// visible or Not :  PDF_Icon
	public boolean isDisplayed_click_PDF_Icon(){
		if(click_PDF_Icon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  PDF_Icon
	public boolean isEnabled_click_PDF_Icon(){
		if(click_PDF_Icon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  PDF_Icon
	public String getCssValue_click_PDF_Icon(String attribute) {
		return click_PDF_Icon.getCssValue(attribute);
	}

	//Get the text :  PDF_Icon
	public String getText_click_PDF_Icon(){
		return click_PDF_Icon.getText();
	}

	//Get the value :  PDF_Icon
	public String getValue_click_PDF_Icon(){
		return click_PDF_Icon.getAttribute("value");
	}
	// selected or Not :  PDF_Icon
	public boolean isSelected_click_PDF_Icon(){
		if(click_PDF_Icon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Selected_Week_Button
	public void type_txt_Selected_Week_Button(String value) {
		txt_Selected_Week_Button.clear();
		txt_Selected_Week_Button.sendKeys(value);
	}

	//click:  Selected_Week_Button
	public void click_txt_Selected_Week_Button(){
		txt_Selected_Week_Button.click();
	}

	// Hover:  Selected_Week_Button
	public void hover_txt_Selected_Week_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Selected_Week_Button).build().perform();
	}

	// visible or Not :  Selected_Week_Button
	public boolean isDisplayed_txt_Selected_Week_Button(){
		if(txt_Selected_Week_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Selected_Week_Button
	public boolean isEnabled_txt_Selected_Week_Button(){
		if(txt_Selected_Week_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Selected_Week_Button
	public String getCssValue_txt_Selected_Week_Button(String attribute) {
		return txt_Selected_Week_Button.getCssValue(attribute);
	}

	//Get the text :  Selected_Week_Button
	public String getText_txt_Selected_Week_Button(){
		return txt_Selected_Week_Button.getText();
	}

	//Get the value :  Selected_Week_Button
	public String getValue_txt_Selected_Week_Button(){
		return txt_Selected_Week_Button.getAttribute("value");
	}
	// selected or Not :  Selected_Week_Button
	public boolean isSelected_txt_Selected_Week_Button(){
		if(txt_Selected_Week_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Previous_Week_Button
	public void click_click_Previous_Week_Button(){
		click_Previous_Week_Button.click();
	}

	// Hover:  Previous_Week_Button
	public void hover_click_Previous_Week_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Previous_Week_Button).build().perform();
	}

	// visible or Not :  Previous_Week_Button
	public boolean isDisplayed_click_Previous_Week_Button(){
		if(click_Previous_Week_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Previous_Week_Button
	public boolean isEnabled_click_Previous_Week_Button(){
		if(click_Previous_Week_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Previous_Week_Button
	public String getCssValue_click_Previous_Week_Button(String attribute) {
		return click_Previous_Week_Button.getCssValue(attribute);
	}

	//Get the text :  Previous_Week_Button
	public String getText_click_Previous_Week_Button(){
		return click_Previous_Week_Button.getText();
	}

	//Get the value :  Previous_Week_Button
	public String getValue_click_Previous_Week_Button(){
		return click_Previous_Week_Button.getAttribute("value");
	}
	// selected or Not :  Previous_Week_Button
	public boolean isSelected_click_Previous_Week_Button(){
		if(click_Previous_Week_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Next_Week_Button
	public void click_click_Next_Week_Button(){
		click_Next_Week_Button.click();
	}

	// Hover:  Next_Week_Button
	public void hover_click_Next_Week_Button(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Next_Week_Button).build().perform();
	}

	// visible or Not :  Next_Week_Button
	public boolean isDisplayed_click_Next_Week_Button(){
		if(click_Next_Week_Button.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Next_Week_Button
	public boolean isEnabled_click_Next_Week_Button(){
		if(click_Next_Week_Button.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Next_Week_Button
	public String getCssValue_click_Next_Week_Button(String attribute) {
		return click_Next_Week_Button.getCssValue(attribute);
	}

	//Get the text :  Next_Week_Button
	public String getText_click_Next_Week_Button(){
		return click_Next_Week_Button.getText();
	}

	//Get the value :  Next_Week_Button
	public String getValue_click_Next_Week_Button(){
		return click_Next_Week_Button.getAttribute("value");
	}
	// selected or Not :  Next_Week_Button
	public boolean isSelected_click_Next_Week_Button(){
		if(click_Next_Week_Button.isSelected()) { return true; } else { return false;} 
	}

	//click:  Select_Associate_Link
	public void click_click_Select_Associate_Link(){
		click_Select_Associate_Link.click();
	}

	// Hover:  Select_Associate_Link
	public void hover_click_Select_Associate_Link(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Select_Associate_Link).build().perform();
	}

	// visible or Not :  Select_Associate_Link
	public boolean isDisplayed_click_Select_Associate_Link(){
		if(click_Select_Associate_Link.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Select_Associate_Link
	public boolean isEnabled_click_Select_Associate_Link(){
		if(click_Select_Associate_Link.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Select_Associate_Link
	public String getCssValue_click_Select_Associate_Link(String attribute) {
		return click_Select_Associate_Link.getCssValue(attribute);
	}

	//Get the text :  Select_Associate_Link
	public String getText_click_Select_Associate_Link(){
		return click_Select_Associate_Link.getText();
	}

	//Get the value :  Select_Associate_Link
	public String getValue_click_Select_Associate_Link(){
		return click_Select_Associate_Link.getAttribute("value");
	}
	// selected or Not :  Select_Associate_Link
	public boolean isSelected_click_Select_Associate_Link(){
		if(click_Select_Associate_Link.isSelected()) { return true; } else { return false;} 
	}

}
