package com.Shabbirhw.Marchtwentyfith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Safari {

    public static void main(String[] args) {

        safarihw();

    }

    public static void safarihw(){

        //System.setProperty("webdriver.safri.driver","/Users/shabbirkhan/projects/drivers/safaridriver");
        WebDriver driver = new SafariDriver();
        //driver.get("http://google.com");
        driver.navigate().to("https://weather.com");


        //driver.navigate().to("https://weather.com");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        driver.quit();
    }
}
