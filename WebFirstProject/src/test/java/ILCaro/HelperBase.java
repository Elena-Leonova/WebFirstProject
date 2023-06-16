package ILCaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
    public boolean isElementPresent(By locator, String text) {
        // return wd.findElement(By.xpath("//h2[normalize-space()='\"Login or Password incorrect\"']")).getText().equals("Login or Password incorrect");
        return wd.findElement(locator).getText().equals(text);
    }

    public boolean isElementDisplayed(By locator) {
        return wd.findElement(locator).isDisplayed();
    }


    public void click(By locator){

        wd.findElement(locator).click();
    }

    public void type(By locator, String text){
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
