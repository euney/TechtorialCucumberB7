package pages.duckduckgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DuckDuckGoSearchResults {




    public DuckDuckGoSearchResults(WebDriver driver){

        PageFactory.initElements(driver,this);


    }
        @FindBy(xpath = "")
        public List<WebElement> listOfLinks;

        @FindBy(xpath = "")
        public List<WebElement> listName;




}
