package ILCaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setUp(){
     app.init();

    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }
}
