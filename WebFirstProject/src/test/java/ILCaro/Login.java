package ILCaro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {
    @Test
    public void positiveLoginTest(){
      //wd.findElement(By.xpath("//a[.='Log in']")).click();
        click(By.xpath("//a[.=' Log in ']"));
//      wd.findElement(By.id("email")).click();
//      wd.findElement(By.id("email")).clear();
//      wd.findElement(By.id("email")).sendKeys("lena.postrash@gmail.com");
        type(By.id("email"),"lena.postrash@gmail.com");

//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("Mynameislena1!");
        type(By.id("password"), "Mynameislena1!");

//        wd.findElement(By.xpath("//button[@type='submit']")).click();
        click(By.xpath("//button[@type='submit']"));

       pause(3000);
        Assert.assertTrue(isElementDisplayed(By.xpath("//h2[normalize-space()='Logged in success']")));
    }

    @Test
    public void TestNegativeLoginTest(){
        click(By.xpath("//a[.=' Log in ']"));
        type(By.id("email"),"lena.postrash@gmail.com");
        type(By.id("password"), "Mynameislena1i");
        click(By.xpath("//button[@type='submit']"));
        pause(3000);
        Assert.assertTrue(!isElementPresent(By.xpath("//div[@class='dialog-container']//h2"), "Login or Password incorrect"));
    }

}
