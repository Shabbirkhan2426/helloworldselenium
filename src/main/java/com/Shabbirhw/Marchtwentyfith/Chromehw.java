package com.Shabbirhw.Marchtwentyfith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromehw {

    public static void main(String[] args) {

       chrome();

    }

    public static void chrome(){

        System.setProperty("webdriver.chrome.driver","/Users/shabbirkhan/projects/drivers/chromedriver");
        WebDriver driver =  new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        driver.quit();

    }
}
