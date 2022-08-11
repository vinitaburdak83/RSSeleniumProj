package Pages;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RSHomePage {
	
	public static WebDriver driver;
	public static Actions action; 
	String actualTitle, expectedTitle;
	
	By txtbox_SearchBar = By.name("searchTerm");
	By icon_ShoppingCart = By.xpath(" //*[@id=\"header-account-section\"]/div/div/nav/a[3]/div/div[2]/div/div/svg");
	By drpdown_Browse = By.id("desktop-browse-icon");
	By drpdown_ElecAutoCables = By.xpath("//span[contains(.,'Electrical, Automation & Cables')]");
	By button_SubmitSearch = By.xpath("//*[@id=\"searchFrom\"]/div[4]/div[1]/button/svg/path");
	By drpdown_cablesWires = By.xpath("//span[contains(.,'Cables & Wires')]");
	By link_AVCables = By.linkText("AV Cables");
	By drpdown_MechaProdTools = By.xpath("//button[contains(.,'Mechanical Products & Tools')]");
	By drpdown_HandTools = By.xpath("//span[contains(.,'Hand Tools')]");
	By link_ClampsVices = By.linkText("Clamps & Vices");
	
	
	public void launchHomePage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.get("https://uk.rs-online.com/web/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Step 1 :: Consumer is on the RS Components home page");		
		if (driver.findElement(By.id("ensCloseBanner")).isEnabled()) {
		      driver.findElement(By.id("ensCloseBanner")).click();
		      System.out.println("Clicking on All Accept button on cookies pop-up");
		}
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(txtbox_SearchBar).sendKeys(text);
	}
	
	public void submitSearchButton() {
		//driver.findElement(button_SubmitSearch).click();
		driver.findElement(txtbox_SearchBar).sendKeys(Keys.ENTER);
	}
	
	public void clickBrowseIcon() {
		driver.findElement(drpdown_Browse).click();
	}
	
	public void clickElectAutoCable() {
		driver.findElement(drpdown_ElecAutoCables).click();
		action.moveToElement(driver.findElement(drpdown_ElecAutoCables)).perform();
	}
	
	public void clickCablesWires() {
		driver.findElement(drpdown_cablesWires).click();
		action.moveToElement(driver.findElement(drpdown_cablesWires)).perform();
	}
	
	public void clickAVCables() {
		driver.findElement(link_AVCables).click();
	}
	
	public void clickMechaProdTools() {
		driver.findElement(drpdown_MechaProdTools).click();
		action.moveToElement(driver.findElement(drpdown_MechaProdTools)).perform();
	}
	
	public void clickHandTools() {
		driver.findElement(drpdown_HandTools).click();
		action.moveToElement(driver.findElement(drpdown_HandTools)).perform();
	}
	
	public void clickClampsVices() {
		driver.findElement(link_ClampsVices).click();
		actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		expectedTitle = "Clamps & Vices";
		if (actualTitle.contains(actualTitle)) {
			System.out.println("Clamps & Vices page is displayed");}
		else {
				System.out.println("Page ::" + actualTitle + " is displayed");
		}					 
	}
}
