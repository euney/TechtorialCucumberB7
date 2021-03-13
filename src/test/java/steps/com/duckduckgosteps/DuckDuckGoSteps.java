package steps.com.duckduckgosteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.duckduckgopages.DuckDuckGoSearchResults;
import pages.duckduckgopages.DuckDuckHomePage;
import utils.ConfigReader;
import utils.Driver;

public class DuckDuckGoSteps {

        WebDriver driver;
        DuckDuckHomePage duckDuckHomePage;
        DuckDuckGoSearchResults duckDuckGoSearchResults;



    @Given("user is on DuckDuck home page")
    public void user_is_on_duck_duck_home_page() {
      driver= Driver.getDriver();
      driver.get("https://duckduckgo.com/");
    }
    @When("user searches for Selenium")
    public void user_searches_for_selenium() {
    duckDuckHomePage= new DuckDuckHomePage(driver);
    duckDuckHomePage.searchBox.sendKeys(ConfigReader.getProperty("search"));
    duckDuckHomePage.searchButton.click();
    }
    @Then("user sees results for selenium")
    public void user_sees_results_for_selenium() {

    }









}
