import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectByMyself {
    WebDriver web;
    @Test
    public void reapetAll(){
        web = new ChromeDriver();
        web.navigate().to("https://ya.ru/");
        web.findElement(By.name("text")).sendKeys("Toronto"+ Keys.ENTER);
        web.navigate().back();
        web.findElement(By.name("text")).sendKeys("The largest country in the world"+Keys.ENTER);
    }
}
