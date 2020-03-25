package com.Shabbirhw.Marchtwentyfith;

import org.openqa.selenium.WebDriver;

public class ChromeDriver {

    public static void main(String[] args) {

       chrome();

    }

    public static void chrome(){

        System.setProperty("com.Shabbirhw.Marchtwentyfith.ChromeDriver","/Users/shabbirkhan/projects/drivers/chrome");
        WebDriver driver = (WebDriver) new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
       String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        driver.quit();

    }
}
