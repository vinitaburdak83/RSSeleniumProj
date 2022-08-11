package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DeliveryInformationPage {
	public static WebDriver driver;
	
	By drpdown_Title = By.name("title");
    By txtbox_FirstName = By.name("firstName");
    By txtbox_LastName = By.name("lastName");
    By txtbox_Email = By.name("emailAddress");
    By txtbox_Telephoneno = By.name("telephoneNumber");
    By txtbox_CompanyName = By.name("companyName");
    By txtbox_TradingAs = By.name("companyName2");
    By txtbox_SteetNameNo1 = By.name("addressLine1");
    By txtbox_SteetNameNo2 = By.name("addressLine2");
    By txtbox_TownCity = By.name("addressLine3");
    By drpdown_County = By.name("addressLine4");
    By txtbox_PersRefNum = By.name("customerOrderReference");
    
    public void setTextInFirstName(String text) {
		driver.findElement(txtbox_FirstName).sendKeys(text);
	}
    
    public void setTextInLastName(String text) {
  		driver.findElement(txtbox_LastName).sendKeys(text);
  	}
    
    public void setTextInEmailAdd(String text) {
  		driver.findElement(txtbox_Email).sendKeys(text);
  	}
    
    public void setTextInTelephoneNo(String text) {
  		driver.findElement(txtbox_Telephoneno).sendKeys(text);
  	}
    
    public void setTextInCompanyName(String text) {
  		driver.findElement(txtbox_CompanyName).sendKeys(text);
  	}
    
    public void setTextInStreetNameNo1(String text) {
  		driver.findElement(txtbox_SteetNameNo1).sendKeys(text);
  	}
    
    public void setTextInStreetNameNo2(String text) {
  		driver.findElement(txtbox_SteetNameNo2).sendKeys(text);
  	}  
    
    public void setTextInTownCity(String text) {
  		driver.findElement(txtbox_TownCity).sendKeys(text);
  	}  
    
    public void setTextInTraddingAs(String text) {
  		driver.findElement(txtbox_TradingAs).sendKeys(text);
  	}
    
    public void setTextInPersonalReferNo(String text) {
  		driver.findElement(txtbox_PersRefNum).sendKeys(text);
  	}
    
    public void selectTitle(String text) {
  		Select title = new Select(driver.findElement(drpdown_Title));
  		title.selectByVisibleText(text);  		
  	}
    
    public void selectCounty(String text) {
  		Select county = new Select(driver.findElement(drpdown_County));
  		county.selectByVisibleText(text);  		
  	}
    
    
}
