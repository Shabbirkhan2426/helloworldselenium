package com.shabbir.aprilhw.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CheckoutProduct {

    public static void main(String[] args)throws Exception {

        payproduct();


    }

    public static void payproduct()throws Exception{

        System.setProperty("webdriver.chrome.driver","/Users/shabbirkhan/projects/drivers/chromedriver");
        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        WebElement loginInput = driver.findElement(By.xpath("//input[@name = 'username']"));
        loginInput.clear();
        System.out.println("Login Input field is cleared ");
        loginInput.sendKeys("khanshabbir69@yahoo.com");
        System.out.println("Login Input value entered ");
        Thread.sleep(5000);

        WebElement password =  driver.findElement(By.xpath(("(//input[@id='password'])[1]")));
        password.clear();
        System.out.println("Password Input field is cleared ");
        password.sendKeys("Agustina2426");
        System.out.println("Password Input value is entered ");
        Thread.sleep(5000);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));
        login.click();
        System.out.println("Clicked on Login button");
        Thread.sleep(5000);

        WebElement clickonproduct = driver.findElement(By.linkText("Green Ghost"));
        clickonproduct.click();
        System.out.println("Clicked on Green Ghost link");
        Thread.sleep(5000);

        WebElement cart = driver.findElement(By.partialLinkText("cart"));
        cart.click();
        System.out.println("Clicked on View Cart");
        Thread.sleep(5000);

        WebElement yourcart = driver.findElement(By.linkText("VIEW YOUR CART"));
        yourcart.click();
        System.out.println("View Your Cart clicked ");
        Thread.sleep(5000);

        WebElement payout = driver.findElement(By.partialLinkText("CHE"));
        payout.click();
        System.out.println("Checkout clicked ");
        Thread.sleep(5000);

        WebElement fname = driver.findElement(By.xpath("(//input[@id = 'fullName'])[1]"));
        fname.clear();
        System.out.println("FullName field is cleared");
        fname.sendKeys("Ken Kh");
        System.out.println("FullName is entered");
        Thread.sleep(5000);

        WebElement lname = driver.findElement(By.xpath("(//input[@id = 'addressLine1'])[1]"));
        lname.clear();
        System.out.println("Address line is cleared ");
        lname.sendKeys("123 Ken Rd");
        System.out.println("Address line is entered ");
        Thread.sleep(5000);

        WebElement ct = driver.findElement(By.xpath("(//input[@id = 'city'])[1]"));
        ct.clear();
        System.out.println("City line is cleared ");
        ct.sendKeys("Detroit");
        System.out.println("City entered ");
        Thread.sleep(5000);

        Select objselect = new Select(driver.findElement(By.id("stateProvinceRegion")));
        objselect.selectByIndex(33);
        System.out.println("State been selected ");
        Thread.sleep(5000);

        WebElement pcode = driver.findElement(By.xpath("(//input[@id='postalCode'])[1]"));
        pcode.clear();
        System.out.println("Postal code is cleared");
        pcode.sendKeys("48212");
        System.out.println("Postal code is entered ");
        Thread.sleep(5000);

        WebElement pphone = driver.findElement(By.xpath("(//input[@id = 'phonePrimary'])[1]"));
        pphone.clear();
        System.out.println("Primary phone is cleared");
        pphone.sendKeys("123001222");
        System.out.println("Primary phone is entered");
        Thread.sleep(5000);

        WebElement cbox = driver.findElement(By.xpath("(//span[@class='check'])[1]"));
        cbox.click();
        System.out.println("Checkbox box for default addrss is clicked");
        Thread.sleep(5000);

        WebElement rbutton = driver.findElement(By.xpath("(//span[@class = 'circle'])[1]"));
        rbutton.click();
        System.out.println("Radio button is clicked");
        Thread.sleep(5000);

        WebElement continue1 = driver.findElement(By.partialLinkText("CON"));
        continue1.click();
        System.out.println("Continue button is clicked from Checkout Shipping information page ");

        WebElement checkadd = driver.findElement(By.xpath("(//span[@class='check'])[1]"));
        //WebElement chadd = driver.findElement(By.xpath("//*[@id=\"credit_card_payment_method\"]/div/div/div[2]/form/div[2]/div/div[1]/label/span[1]/span"));
        checkadd.click();
        System.out.println("Check address is clicked ");
        Thread.sleep(5000);

        WebElement sshippinadd =driver.findElement(By.xpath("(//span[@class='check'])[1]"));
        sshippinadd.click();
        System.out.println("Same as shipping address checkbox is clicked ");
        Thread.sleep(5000);

        WebElement cbutton = driver.findElement(By.partialLinkText("NUE"));
        cbutton.click();
        System.out.println("Continue button is clicked ");

        WebElement placeorder= driver.findElement(By.linkText("PLACE YOUR ORDER"));
        placeorder.click();
        System.out.println("Place Order is clicked ");












    }
}
