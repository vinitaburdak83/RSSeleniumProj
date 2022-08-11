package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Pages.RSHomePage;
import io.cucumber.java.en.*;

public class SearchValidPartNo_Steps {
	RSHomePage home = new RSHomePage();

	@Given("user is on RS Components home page to perform Stock Part No search")
	public void RScomponents_homepage() throws InterruptedException {
		home.launchHomePage();
	}
	
	@When("^user enters the RS Stock Part number (.*) to Search Bar$")
	public void enters_stock_partno(String partn) {
		System.out.println("Step 2 :: User enters the valid RS Stock Part no " + partn);
		home.setTextInSearchBox(partn);
	}
	
	@And("user clicks on submit button after setting Stock Part number")
	public void clicks_submitbutton() {
		System.out.println("Step 3 :: user clicks on submit button");
		home.submitSearchButton();
	}

	@Then("^search result page is displayed for RS Stock Part No (.*)")
	public void searchresultpage_stockpartno(String partn) {
		WebDriver driver = RSHomePage.driver;
		if (driver.getPageSource().contains(partn)) {
			System.out.println("****Search result page is displayed for RS Stock Part No " + partn);
		} else if (driver.getPageSource().contains("Sorry, we couldn't find any results for")) {
			System.out.println("**** No Search result found page is displayed for  " + partn + "****");
		}

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
		System.out.println(" Closing the browser !!!");
	}
}
