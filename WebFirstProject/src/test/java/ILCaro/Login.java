package ILCaro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class Login extends TestBase {

    @Test
    public void positiveLoginTest(){

        app.getUserHelper().clickLogIn();
        app.getUserHelper().fillLoginForm("lena.postrash@gmail.com", "Mynameislena1!");
        app.getUserHelper().clickSubmit();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isElementDisplayed(By.xpath("//h2[normalize-space()='Logged in success']")));
      //wd.findElement(By.xpath("//a[.='Log in']")).click();

//      wd.findElement(By.id("email")).click();
//      wd.findElement(By.id("email")).clear();
//      wd.findElement(By.id("email")).sendKeys("lena.postrash@gmail.com");


//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("Mynameislena1!");


//        wd.findElement(By.xpath("//button[@type='submit']")).click();




    }

    @Test
    public void TestNegativeLoginTest(){
        app.getUserHelper().click(By.xpath("//a[.=' Log in ']"));
        app.getUserHelper().type(By.id("email"),"lena.postrash@gmail.com");
        app.getUserHelper().type(By.id("password"), "Mynameislena1i");
        app.getUserHelper().click(By.xpath("//button[@type='submit']"));
        app.getUserHelper(). pause(3000);
        Assert.assertTrue(! app.getUserHelper().isElementPresent(By.xpath("//div[@class='dialog-container']//h2"), "Login or Password incorrect"));
    }

}
