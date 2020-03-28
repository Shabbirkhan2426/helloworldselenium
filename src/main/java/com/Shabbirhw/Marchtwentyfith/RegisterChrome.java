package com.Shabbirhw.Marchtwentyfith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterChrome {

    public static void main(String[] args) throws Exception{

        register();

    }

    public static void register()throws Exception{

        System.setProperty("webdriver.chrome.driver","/Users/shabbirkhan/projects/drivers/chromedriver");
        WebDriver driver =  new ChromeDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        WebElement emailInput = driver.findElement(By.id("customer.emailAddress"));
        emailInput.clear();
        System.out.println("Email Input field is cleared ");
        emailInput.sendKeys("shabbirkhan1982@yahoo.com");
        System.out.println("Email Input value entered ");
        Thread.sleep(5000);

        WebElement firstName = driver.findElement(By.name("customer.firstName"));
        firstName.clear();
        System.out.println("Customer First Name  Input field is cleared ");
        firstName.sendKeys("Shabbir");
        System.out.println("Customer First Name  Input value is entered ");
        Thread.sleep(5000);

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
        lastName.clear();
        System.out.println("Customer Last Name  Input field is cleared ");
        lastName.sendKeys("Khan");
        System.out.println("Customer Last Name  Input value  is entered ");
        Thread.sleep(5000);

        WebElement password =  driver.findElement(By.xpath("(//input[@id='password'])[2]"));
        password.clear();
        System.out.println("Password Input field is cleared ");
        password.sendKeys("Agustina2426");
        System.out.println("Password Input value is entered ");
        Thread.sleep(5000);

        WebElement confirmPass = driver.findElement(By.id("passwordConfirm"));
        confirmPass.clear();
        System.out.println("Confirm Password  Input field is cleared ");
        confirmPass.sendKeys("Agustina2426");
        System.out.println("Confirm Password Input value is entered ");

        Thread.sleep(5000);

        WebElement register1 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/button"));
        register1.click();
        System.out.println("Clicked on Register button");

        //driver.quit();



    }
}
