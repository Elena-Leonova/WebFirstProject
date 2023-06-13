package ILCaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
       wd = new ChromeDriver();
       wd.manage().window().maximize();
       wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      // wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       wd.navigate().to("https://ilcarro.web.app");

    }

    public boolean isElementPresent(By locator, String text) {
       // return wd.findElement(By.xpath("//h2[normalize-space()='\"Login or Password incorrect\"']")).getText().equals("Login or Password incorrect");
        return wd.findElement(locator).getText().equals(text);
    }

    public boolean isElementDisplayed(By locator) {
        return wd.findElement(locator).isDisplayed();
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

    //====================================================
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
