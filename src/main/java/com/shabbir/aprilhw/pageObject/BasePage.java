package com.shabbir.aprilhw.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){

        this.driver = driver;

    }

    protected WebDriver getDriver(){

        return this.driver;
    }

    //This method clicks on elements
    public void clickOnElement(WebElement element) throws InterruptedException {
        Thread.sleep(2000);
        drawBorder(element);
        element.click();
    }

    //This method types a String a textBox
    public void typeInATextBox(WebElement element, String textToBeEntered){
        drawBorder(element);
        element.clear();
        element.sendKeys(textToBeEntered);
    }

    public void drawBorder(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
    }
}
