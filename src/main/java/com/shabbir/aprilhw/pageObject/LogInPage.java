package com.shabbir.aprilhw.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPage extends BasePage {
    WebDriver driver;

    public LogInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //Login WebElements
    @FindBy(xpath = "(//*[@href='/login'])[1]")
    WebElement loginLink;
    @FindBy(id = "username")
    WebElement enterEmail;
    @FindBy(xpath = "(//*[@id='password'])[1]")
    WebElement enterPassword;
    @FindBy(xpath = "//*[@id='login']/form/button")
    WebElement logInButton;
    @FindBy(xpath = "(//*[@class='dropdown'])[1]")
    WebElement accountLink;
    @FindBy(xpath = "//*[@href='/account']")
    WebElement validationStringElement;
    @FindBy(xpath = "//*[@href='/logout']")
    WebElement logoutLink;


    //Registration WebElements
    @FindBy(xpath = "(//*[@href='/login'])[1]")
    WebElement loginLink1;
    @FindBy(id= "customer.emailAddress")
    WebElement registeruserEmail;
    @FindBy(name = "customer.firstName")
    WebElement enterFirstName;
    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    WebElement enterlastName;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    WebElement enterpassword;
    @FindBy(id = "passwordConfirm")
    WebElement confirmPassword;
    @FindBy(xpath = "//*[@id=\"registrationForm\"]/button")
    WebElement registerbutton;
    @FindBy(xpath = "(//a[@href ='/'])[3]")
    WebElement validatonStringElementHome;
    @FindBy(xpath = "//*[@href='/logout']")
    WebElement logoutLink1;



    //Login Method
    public void login(String userID, String pass,String expectedString) throws InterruptedException {

        clickOnElement(loginLink);
        System.out.println("Login Link clicked!!! ");

        typeInATextBox(enterEmail, userID);
        typeInATextBox(enterPassword,pass);

        //userid: test@example.com
        //Pass: Test1234

        System.out.println("ID and Password entered!!! ");
        clickOnElement(logInButton);

        System.out.println("Login button clicked!!!");

        clickOnElement(accountLink);
        Thread.sleep(1000);
        String validationString = validationStringElement.getText();
        Assert.assertEquals(validationString, expectedString);
        clickOnElement(logoutLink);


    }

    //Registrer Method
    /*public void registrationPage(String expectedString) throws Exception{

        clickOnElement(loginLink1);
        System.out.println("Login Link clicked!!! ");

        typeInATextBox(registeruserEmail, "affan24261@gmail.com");
        typeInATextBox(enterFirstName,"Affan");
        typeInATextBox(enterlastName,"Khan");
        typeInATextBox(enterpassword, "Agustina2426");
        typeInATextBox(confirmPassword,"Agustina2426");

        System.out.println("Email, Name and Password entered");

        clickOnElement(registerbutton);
        Thread.sleep(5000);

        String validationString = validatonStringElementHome.getText();
        Assert.assertEquals(validationString,expectedString);

        clickOnElement(logoutLink1);


        
    }*/

}