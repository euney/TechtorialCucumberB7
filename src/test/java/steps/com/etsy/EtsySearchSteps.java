package steps.com.etsy;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.etsyPages.EtsyHomePage;
import utils.BrowserUtils;
import utils.Driver;

public class EtsySearchSteps {

    WebDriver driver;
    EtsyHomePage homePage;

    @Before
    public void beforeScenario(){
       //It wil run before each scenario
        System.out.println("Before annotation.");
    }

    @Before("@tc2")
    public void conditionalHook(){
        System.out.println("Conditional annotation");

    }


    @After
    public void afterScenario(Scenario scenario){
       //It will after each scenario
        System.out.println("After annotation");

        if (scenario.isFailed()){
            BrowserUtils.takeScreenShot();
        }

    }
    @BeforeStep
    public void beforeStep(){
        System.out.println("Before each step");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("After each step");
    }

    @Given("the user navigates to the {string}")
    public void the_user_navigates_to_the(String url) {
        driver= Driver.getDriver();
        driver.get(url);
    }
    @When("the user search with {string}")
    public void the_user_search_with(String searchValue) {
        homePage= new EtsyHomePage(driver);
        homePage.sendSearchKey(searchValue);

    }




    @Then("the user should see the title {string}")
    public void the_user_should_see_the_title(String expectedTitle) {
        String actualTitle= driver.getTitle();

        Assert.assertEquals("Validation of title",expectedTitle,actualTitle);


    }








}
