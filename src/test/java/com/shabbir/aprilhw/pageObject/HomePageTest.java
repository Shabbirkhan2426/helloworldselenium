package com.shabbir.aprilhw.pageObject;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTestClass {


    @Test
    public void homeTest()throws Exception{

        System.out.println("Verification item: ============");

        homePage.home("Shopping Cart");
        System.out.println("========= Assertion Passed ======");




    }


}
