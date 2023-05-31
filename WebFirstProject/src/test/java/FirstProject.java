import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProject {
    WebDriver wd;
    @Test
    public void webDriverSearch(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.google.com/");
        wd.findElement(By.name("q")).sendKeys("Webdriver"+ Keys.ENTER);
        wd.navigate().back();
        wd.findElement(By.name("q")).sendKeys("Tickets"+ Keys.ENTER);

    }
}
