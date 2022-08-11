package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RSHomePage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseElectricalPro_Steps {
	public static WebDriver driver;
	RSHomePage home = new RSHomePage();
		
	@Given("user is on RS Components home page")
	public void RScomponents_homepage() throws InterruptedException {		
		home.launchHomePage();		
	}

	@When("user navigates to Audio Cable page")
	public void Navigates_audiocable_page() {
	   System.out.println("Step 2 :: Click on Browse option"); 
	   home.clickBrowseIcon();
	   
	   System.out.println("Step 3 :: Click on Electrical ,Automation & Cables option");
	   home.clickElectAutoCable();
	   
	   System.out.println("Step 4 :: Click on Cables & Wires option");
	   home.clickCablesWires();
	   
	   System.out.println("Step 5 :: Click on AV Cables option");
	   home.clickAVCables();
	   
	   System.out.println("Step 6 :: Click on Audio Cable option");
	  
	   
	}

	@And("user clicks on basket after adding Electrical item to it")
	public void Click_ElectProdbasket() {
        System.out.println("Step 7 :: Select the quantity of item to be ordered");
		
		System.out.println("Step 8 :: Click on the Add icon for the item to be ordered");
		
		System.out.println("Step 9 :: Click on the Shopping Cart icon ");	    
	   
	}

	@Then("payement is done by user")
	public void Product_payement() {
        System.out.println("Step 10 :: Click on the Guest Checkout for the item to be ordered");
		
		System.out.println("Step 11 :: Fill all Delivery information");
		
		System.out.println("Step 12 :: Deliver to this address");
		
		System.out.println("Step 13 :: Place Order Now");		
	  
	}

}
