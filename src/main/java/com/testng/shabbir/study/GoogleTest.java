package com.testng.shabbir.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

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

    @Test(priority = 1,groups="Title")
    public void googleTitelTest(){
        String title = driver.getTitle();
        System.out.println(title);
    }

    /*
    public void googleLogoTest(){

       boolean b= driver.findElement(By.xpath("//img[@id='logo-doodle-image']")).isDisplayed();
       //img[@id='logo-doodle-image']
    }*/

    @Test(priority = 2,groups = "Link Test")
    public void gmailLinkTest(){

        boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
    }

    @Test(priority = 3,groups = "Test")
    public void test1(){

        System.out.println("test1");

    }
    @Test(priority = 4,groups = "Test")
    public void test2(){

        System.out.println("test2");
    }
    @Test(priority = 5, groups = "Test")
    public void test3(){

        System.out.println("test3");
    }

    @AfterMethod
     public void tearDown () {
        driver.quit();
    }
}
