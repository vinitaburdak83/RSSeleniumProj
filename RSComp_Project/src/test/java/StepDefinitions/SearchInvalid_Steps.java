package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Pages.RSHomePage;
import io.cucumber.java.en.*;

public class SearchInvalid_Steps {	
	RSHomePage home = new RSHomePage();
	
	@Given("user is on RS Components home page to perform search")
	public void RScomponents_homepage() throws InterruptedException {
		home.launchHomePage(); 		
	}
	
	@When("^user enters the invalid (.*) to Search Bar$")
	public void enters_invalidinput(String search) {
		System.out.println("Step 2 :: User enters the invalid search " + search);
		home.setTextInSearchBox(search);	    
	}

	@And("user clicks on submit button")
	public void clicks_submitbutton() {
		System.out.println("Step 3 :: user clicks on submit button");
		home.submitSearchButton();
	}

	@Then("^no result found page is displayed for (.*)")
	public void noresult_page(String search) {
		WebDriver driver = RSHomePage.driver;
		if (driver.getPageSource().contains("Sorry, we couldn't find any results for")) {
	       System.out.println("****No search result page is displayed for search " + search);
		}else {  
			System.out.println("**** Failed :: Search result page is displayed for  " + search +"****");
		}
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
		System.out.println(" Closing the browser !!!");
	}

}
