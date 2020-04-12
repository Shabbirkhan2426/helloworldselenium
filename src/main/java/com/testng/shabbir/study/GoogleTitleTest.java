package com.testng.shabbir.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","/Users/shabbirkhan/projects/drivers/chromedriver");
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }

    @Test()
    public void googleTitelTest(){
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title,"Google123","title is not match");
    }
    /*@Test
    public void googleLogoTest(){

        boolean b= driver.findElement(By.xpath("//button[@id = 'logo-doodle-button']")).isDisplayed();
        Assert.assertTrue(b);// This is assert true statement validation

        //"//img[@id='logo-doodle-image']"
        //"//div[@id = 'logo-doodle']"
        //div[@class ='show-logo']
    }*/

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }
}
