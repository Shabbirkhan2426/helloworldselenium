package com.shabbir.aprilhw.pageObject;

import org.testng.annotations.Test;

public class ShippingInfoTestPage extends BaseTestClass {

    @Test(priority = 0)
    public void homeTest()throws Exception{

        System.out.println("Verification item: ============");
        logInPage.login("My Profile");
        System.out.println("========= Assertion Passed ======");

    }

    @Test(priority = 1)
    public void addproducttoCardTest() throws InterruptedException {

        System.out.println("Verification item: ============");
        homePage.addProducttoCart("Shopping Cart");
        System.out.println("========= Assertion Passed for Shoppping Cart ======");

    }

    @Test(priority = 2)
    public void shippingTest() throws InterruptedException {

        System.out.println("Verification item: ============");
        shippproduct.shipping("Checkout");
        System.out.println("========= Assertion Passed for Checkout ======");

    }
}
