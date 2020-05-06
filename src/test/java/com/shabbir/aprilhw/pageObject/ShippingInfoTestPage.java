package com.shabbir.aprilhw.pageObject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShippingInfoTestPage extends BaseTestClass {

    
    @Test(dataProvider = "shabbir")
    public void homeTest(String paraID, String paraPass)throws Exception{

        System.out.println("Verification item: ============");
        logInPage.login(paraID,paraPass,"My Profile");
        System.out.println("========= Assertion Passed ======");

    }

    @Test(priority = 2)
    public void addproducttoCardTest() throws InterruptedException {

        System.out.println("Verification item: ============");
        homePage.addProducttoCart("GREEN GHOST");
        System.out.println("========= Assertion Passed for Shoppping Cart ======");

    }

    @Test(dataProvider = "Shabbir1")
    public void shippingTest() throws InterruptedException {

        System.out.println("Verification item: ============");
        shippproduct.shipping("Checkout");
        System.out.println("========= Assertion Passed for Checkout ======");

    }
}
