package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IlCaroTest {
    private WebDriver wd;
    private String baseUrl;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        baseUrl = "https://ilcarro.web.app/";
        wd.manage().window().maximize();
        //wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void testUntitledTestCase() throws Exception {
        wd.get("https://ilcarro.web.app/");
        wd.findElement(By.xpath("//a[@class='navigation-link'][normalize-space()='Log in']")).click();
        wd.findElement(By.xpath("//input[@id='email']")).click();
        wd.findElement(By.xpath("//input[@id='email']")).clear();
        wd.findElement(By.xpath("//input[@id='email']")).sendKeys("maxmayzel@gmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Rfrnec7_*");
        wd.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        if (wd.findElement(By.xpath("//h1[normalize-space()='Logged in']")).getText().equals("Logged in")) {
            System.out.println("test passed");
        }
        if (wd.findElement(By.xpath("//h1[normalize-space()='Logged in']")).isDisplayed()) {
            System.out.println("test passed");
        }
    }
//  @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//    wd.quit();
//  }
}