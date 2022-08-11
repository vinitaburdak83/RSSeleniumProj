package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.RSHomePage;
import io.cucumber.java.en.*;

public class PurchaseMechanicalPro_Steps {
	public static WebDriver driver;
	RSHomePage home = new RSHomePage();
		
	@Given("RS Components home page is displayed")
	public void RScomponents_homepage() throws InterruptedException {
		home.launchHomePage(); 
	}

	@When("user navigates to Clamps & Vices page")
	public void Navigates_clampsvices() {
		 System.out.println("Step 2 :: Click on Browse option"); 
		 home.clickBrowseIcon();
		 
		 System.out.println("Step 3 :: Click on Mechanical Products and Tools option");
		 home.clickMechaProdTools();
		 
		 System.out.println("Step 4 :: Click on Hand Tools option");
		 home.clickHandTools();
		 
		 System.out.println("Step 5 :: Click on Clamps & Vices option");
		 home.clickClampsVices();
		 
		 System.out.println("Step 6 :: Click on V Blocks option");
		 
		 		 
	}

	@And("user clicks on basket after adding Mechanical product to it")
	public void clicks_MechProbasket() {
		System.out.println("Step 7 :: Select the quantity of item to be ordered");
		
		System.out.println("Step 8 :: Click on the Add icon for the item to be ordered");
		
		System.out.println("Step 9 :: Click on the Shopping Cart icon ");	    
	}

	@Then("Mechanical product payement is done by user")
	public void mechanicalproduct_payement() {
		System.out.println("Step 10 :: Click on the Guest Checkout for the item to be ordered");
		
		System.out.println("Step 11 :: Fill all Delivery information");
		
		System.out.println("Step 12 :: Deliver to this address");
		
		System.out.println("Step 13 :: Place Order Now");
		
	}

}
