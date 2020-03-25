package com.infix.exaple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {

    public static void main(String[] args) {
        newseleniumtest();

    }
    public static void newseleniumtest(){

        System.setProperty("webdriver.gecko.driver","/Users/shabbirkhan/projects/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.youtube.com/");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        driver.quit();

    }
}
