package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Pages.RSHomePage;
import io.cucumber.java.en.*;

public class SearchValidKeyword_Steps {
	RSHomePage home = new RSHomePage();

	@Given("user is on RS Components home page to perform keyword search")
	public void RScomponents_homepage() throws InterruptedException {
		home.launchHomePage();
	}

	@When("^user enters the valid (.*) to Search Bar$")
	public void enters_keyword(String keyword) {
		System.out.println("Step 2 :: User enters the valid keyword " + keyword);
		home.setTextInSearchBox(keyword);
	}

	@And("user clicks on submit button after setting keyword")
	public void clicks_submitbutton() {
		System.out.println("Step 3 :: user clicks on submit button");
		home.submitSearchButton();
	}

	@Then("^search result page is displayed for keyword (.*)")
	public void verify_searchresultpage(String keyword) {
		WebDriver driver = RSHomePage.driver;
		if (driver.getPageSource().contains(keyword)) {
			System.out.println("****Search result page is displayed for keyword " + keyword);
		} else if (driver.getPageSource().contains("Sorry, we couldn't find any results for")) {
			System.out.println("**** No Search result found page is displayed for  " + keyword + "****");
		}

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
		System.out.println(" Closing the browser !!!");
	}
}
