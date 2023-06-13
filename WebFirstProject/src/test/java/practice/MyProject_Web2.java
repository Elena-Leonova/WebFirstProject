package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyProject_Web2 {
    WebDriver webdriver;
    @Test
    public void openAndInput(){
        webdriver = new ChromeDriver();
        webdriver.navigate().to("https://ya.ru/");
        webdriver.findElement(By.name("text")).sendKeys("Adel"+ Keys.ENTER);
    }

}
