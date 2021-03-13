package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {



    public static void selectByIndex(WebElement element, int indexNumber){

        Select select= new Select(element);
        select.selectByIndex(indexNumber);

    }
    public static void selectValue(WebElement element, String value){

        Select select= new Select(element);
        select.selectByValue(value);

    }

    public static void selectText(WebElement element, String text){
        Select select= new Select(element);
        select.selectByVisibleText(text);
    }
    public static String takeScreenShot(){

        //we use get ScreenshotAs method to get screenshot from our driver
        //We convert output to FILE type
        File source=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);

       //System.getProperty("user.dir"); -->it will give current project file directory
        //CurrentTimeMillis() -->we use this method to get unique name for our every screenshot file
        String destination = System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";


        //Create one File object for Destination
        File des= new File(destination);

        try{
            FileUtils.copyFile(source,des);

        }catch (IOException e){
            e.printStackTrace();
        }


        return destination;
    }


}
