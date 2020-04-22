package com.shabbir.aprilhw.pageObject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckOutTestPage extends BaseTestClass{
    @Parameters({"emailID", "password"})
    @Test(priority = 1)
    public void homeTest(String paraID, String paraPass)throws Exception{

        System.out.println("Verification item: ============");
        logInPage.login(paraID,paraPass,"My Profile");
        System.out.println("========= Assertion Passed ======");

    }

    @Test(priority = 2)
    public void addproducttoCardTest() throws InterruptedException {

        System.out.println("Verification item: ============");
        homePage.addProducttoCart("GREEN GHOST");
        System.out.println("========= Assertion Passed for Green Ghost ======");

    }

    @Test(priority = 3)
    public void shippingTest() throws InterruptedException {

        System.out.println("Verification item: ============");
        shippproduct.shipping("Checkout");
        System.out.println("========= Assertion Passed for Checkout ======");

    }

    @Test(priority = 4)

    public void checktest() throws InterruptedException {

        System.out.println("Verification item: ============");
        checkouttopurchase.checkout("A confirmation email will be sent to khanshabb111@gmail.com.");
        System.out.println("========= Assertion Passed for Confirmation ======");

    }
}

