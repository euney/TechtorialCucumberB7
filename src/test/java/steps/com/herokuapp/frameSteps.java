package steps.com.herokuapp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.FramePages;
import utils.Driver;

public class frameSteps {


        WebDriver driver;
        FramePages framePages;



    @Given("the user open the herokuapp frames")
    public void the_user_open_the_herokuapp_frames() {
     driver=Driver.getDriver();
     driver.navigate().to("http://the-internet.herokuapp.com/iframe");


    }




    @Then("the user send paragraph")
    public void the_user_send_paragraph(String docString) {
    framePages=new FramePages(driver);
    driver.switchTo().frame("mce_0_ifr");
    framePages.sendKey(docString);


    }








}
