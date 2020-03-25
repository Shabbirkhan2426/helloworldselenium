package com.Shabbirhw.Marchtwentyfith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxScript {

    public static void main(String[] args) {

        secfirefoxscript();
    }

    public static void secfirefoxscript(){

        System.setProperty("webdriver.gecko.driver","/Users/shabbirkhan/projects/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://weather.com");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        driver.quit();
    }
}
