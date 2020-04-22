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
    @FindBy (xpath = "(//div[@class ='card-content'])[1]")
    WebElement cardInfoSelected;;

    // @FindBy (xpath = "//input [@class='js-shouldUseShippingAddress']")
    //WebElement checkboxselected1;

    //@FindBy(xpath = "span[@class ='check']")
    //WebElement checkboxselected;
    // @FindBy(xpath = "//input[@id = 'emailAddress']")
    //WebElement enterEmailAdd;
    //@FindBy(xpath = "(//div[@class ='card-content'])[1]")
    //WebElement cardselected;
    @FindBy (partialLinkText = "NUE")
    WebElement clickonContinueButton;
    //@FindBy (xpath = "//input [@id='shouldUseShippingAddress']")
   //WebElement checkboxselected1;
    @FindBy(partialLinkText = "ORDER")
    WebElement clickonPlaceYourOrderButton;
    @FindBy(xpath = "//p[@class ='confirmation-note']")

    //*[@id="order_confirmation"]/div[1]/div
            // div[@class='card confirmation-card']
            //div[@class='col-lg-12']
            //"//p[@class ='confirmation-note']"
    WebElement validationStringElement;


   //Mehtod for CheckOut

    public void checkout(String expectedString) throws InterruptedException {

        clickOnElement(cardInfoSelected);
        System.out.println("Card infor is selected ");

        // clickOnElement(cardselected);
        //System.out.println("Credit Information is selected");

        //clickOnElement(checkboxselected1);
        //System.out.println("Checkbox  is selected");

        //typeInATextBox(enterEmailAdd,"shabbirkhan2426@gmail.com");
        //System.out.println("Entered Email address ");

        clickOnElement(clickonContinueButton);

        clickOnElement(clickonPlaceYourOrderButton);

        String validationString = validationStringElement.getText();
        Assert.assertEquals(validationString,expectedString);
    }

}
