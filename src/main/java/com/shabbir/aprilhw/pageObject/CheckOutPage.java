package com.shabbir.aprilhw.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends BasePage {

    WebDriver driver;

    public CheckOutPage (WebDriver driver){

        super(driver);
        PageFactory.initElements(driver, this);
    }

    //ChekcOut Elements

    @FindBy(xpath = "(//div[@class ='card-content'])[1]")
    WebElement cardselected;
    @FindBy (partialLinkText = "NUE")
    WebElement clickonContinueButton;
    @FindBy(partialLinkText = "ORDER")
    WebElement clickonPlaceYourOrderButton;
    @FindBy(xpath = "//div[@class='card confirmation-card']")
    WebElement validationStringElement;


   //Mehtod for CheckOut

    public void checkout(String expectedString) throws InterruptedException {

        clickOnElement(cardselected);
        System.out.println("Credit Information is selected");

        clickOnElement(clickonContinueButton);
        clickOnElement(clickonPlaceYourOrderButton);

        String validationString = validationStringElement.getText();
        Assert.assertEquals(validationString,expectedString);
    }

}
