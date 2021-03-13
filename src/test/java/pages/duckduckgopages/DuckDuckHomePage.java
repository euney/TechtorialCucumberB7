package pages.duckduckgopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckDuckHomePage {


            public DuckDuckHomePage(WebDriver driver){

                PageFactory.initElements(driver,this);


            }

            @FindBy (id = "search_form")
            public WebElement searchBox;

            @FindBy(id = "search_button")
            public WebElement searchButton;






}
