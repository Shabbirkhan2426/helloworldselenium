package com.shabbir.aprilhw.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ShippingInfoPage extends BasePage{

    WebDriver driver;

    public ShippingInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    //Shipping WebElements
     @FindBy(partialLinkText = "CHE")
     WebElement checkOutlink;
     @FindBy(xpath  = "(//input[@id = 'fullName'])[1]")
     WebElement enterFullName;

     //"(//input[@id = 'fullName'])[1]"
     @FindBy(xpath = "(//input[@id = 'addressLine1'])[1]")
     WebElement enterAddLine1;
     @FindBy (xpath = "(//input[@id = 'city'])[1]")
     WebElement enterCity;
     @FindBy (id= "stateProvinceRegion")
     WebElement selectState;
     @FindBy (xpath = "(//input[@id='postalCode'])[1]")
     WebElement enterPostalCode;
     @FindBy (xpath = "(//input[@id = 'phonePrimary'])[1]")
     WebElement enterPhoneNumber;
     @FindBy (xpath = "(//span[@class='check'])[1]")
     WebElement clickonDefaultAddCheckbox;
     @FindBy (xpath = "(//span[@class = 'circle'])[1]")
     WebElement clickonRadioButton;
     @FindBy (partialLinkText = "CON")
     WebElement clickOnContinueButton;
     @FindBy(xpath = "//div[@class ='col-md-12']")
     WebElement validationStringElement;


     //Mehtod for Shipping

    public void shipping(String expextedString ) throws InterruptedException {


        clickOnElement(checkOutlink);
        System.out.println("CheckOut Link is  clicked!!! ");
        Thread.sleep(3000);

        typeInATextBox(enterFullName,"Aff Kh");
        typeInATextBox(enterAddLine1,"123 Agus Dr");
        typeInATextBox(enterCity,"Detroit");

        //select(selectState);
        //select(selectState,"33");
        selectValueFromDropdown(selectState,"MI");


        typeInATextBox(enterPostalCode,"48212");
        typeInATextBox(enterPhoneNumber,"1112224444");

        clickOnElement(clickonRadioButton);
        clickOnElement(clickOnContinueButton);

        String validationString = validationStringElement.getText();
        Assert.assertEquals(validationString,expextedString);

    }


}
