package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTest {
    private WebDriver wd;
    // private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        //js = (JavascriptExecutor) wd;
        //vars = new HashMap<String, Object>();
    }
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    @Test
    public void test() throws InterruptedException {
        wd.get("https://www.google.com/");
        wd.manage().window().setSize(new Dimension(800, 824));
        wd.findElement(By.id("APjFqb")).sendKeys("Webdriver");
        Thread.sleep(5000);
    }
}
