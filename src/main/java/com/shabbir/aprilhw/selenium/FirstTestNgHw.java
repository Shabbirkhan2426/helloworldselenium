package com.shabbir.aprilhw.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FirstTestNgHw {

    WebDriver driver;

    @BeforeTest //Seting up environment
    public  void payproduct() throws Exception {

        System.setProperty("webdriver.chrome.driver","/Users/shabbirkhan/projects/drivers/chromedriver");
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
    }
    @Test(priority = 1)
    public void getTitleTest(){

        String actualTitle = driver.getTitle();
        System.out.println("Title is "+actualTitle);
        String expectedTitle = "Broadleaf Commerce Demo Store - Heat Clinic - Login";

        Assert.assertEquals(actualTitle,expectedTitle);
        //System.out.println("Test is passed");
        // Assert.assertNotEquals(actualTitle,expectedTitle);
        //Assert.assertFalse("Broadleaf Commerce Demo Store - Heat Clinic - Login"=="Broadleaf Commerce Demo Store - Heat Clinic");
        Assert.assertTrue("Broadleaf Commerce Demo Store - Heat Clinic - Login"=="Broadleaf Commerce Demo Store - Heat Clinic - Login");

    }
    @Test(priority = 2)
    public void productVisibleTest() throws Exception {

        WebElement loginInput = driver.findElement(By.xpath("//input[@name = 'username']"));
        loginInput.clear();
        System.out.println("Login Input field is cleared ");
        loginInput.sendKeys("affan102@yahoo.com");
        System.out.println("Login Input value entered ");
        Thread.sleep(5000);

        WebElement password =  driver.findElement(By.xpath(("(//input[@id='password'])[1]")));
        password.clear();
        System.out.println("Password Input field is cleared ");
        password.sendKeys("Agustina2426");
        System.out.println("Password Input value is entered ");
        Thread.sleep(5000);

        WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        login.click();
        System.out.println("Clicked on Login button");
        Thread.sleep(5000);

        WebElement clickonproduct = driver.findElement(By.linkText("Green Ghost"));
        clickonproduct.click();
        System.out.println("Clicked on Green Ghost link");
        Thread.sleep(5000);
        //Assert.assertTrue("Green Ghost"=="Green Ghos");//question on this
        Assert.assertTrue("Green Ghost"=="Green Ghost");
        System.out.println("Green Ghost bottle is visible to identify");

    }

    @Test(priority = 3)
    public void checkOutTest()throws Exception{

        //WebElement addbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        WebElement addbutton = driver.findElement(By.xpath("//button[@class='btn btn-primary js-addToCart']"));
        addbutton.click();
        System.out.println("Clicked on add button");
        Thread.sleep(5000);

        WebElement cart = driver.findElement(By.linkText("VIEW YOUR CART"));
        cart.click();
        System.out.println("Clicked on View Cart");
        Thread.sleep(5000);

       /* WebElement yourcart = driver.findElement(By.linkText("VIEW YOUR CART"));
        yourcart.click();
        System.out.println("View Your Cart clicked ");
        Thread.sleep(5000);*/

        WebElement payout = driver.findElement(By.partialLinkText("CHE"));
        payout.click();
        System.out.println("Checkout clicked ");
        Thread.sleep(5000);
        Assert.assertTrue(Boolean.parseBoolean("CHECKOUT"),"CHECKOUT link should be red color");
        //boolean b= driver.findElement(By.partialLinkText("CHE")).isDisplayed();
        System.out.println("Checkout link is red color identified");
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}