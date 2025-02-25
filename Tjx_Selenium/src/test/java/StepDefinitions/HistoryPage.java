package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HistoryPage {
	
	public static WebDriver driver;
	
    Actions ac = new Actions(driver);
	@Given("I invoke the Browser with {string}")
	public void i_invoke_the_browser_with(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
	}
	@Then("I should see TJX Homepage")
	public void i_should_see_tjx_homepage() {
		
	}
	@When("I click company button")
	public void i_click_company_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I veriy the dropdown of company button")
	public void i_veriy_the_dropdown_of_company_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I click History button")
	public void i_click_history_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I verify the History of TJX")
	public void i_verify_the_history_of_tjx() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
