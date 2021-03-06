package pages.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLoginPage {


     public ProductLoginPage(WebDriver driver){
         PageFactory.initElements(driver,this);
     }

    @FindBy(name = "ctl00$MainContent$username")
    public WebElement username;

     @FindBy(name = "ctl00$MainContent$password")
    public WebElement password;

     @FindBy(name = "ctl00$MainContent$login_button")
    public  WebElement loginButton;

     public void login(String username, String password){
         this.username.sendKeys(username);
         this.password.sendKeys(password);
         this.loginButton.click();

     }



}
