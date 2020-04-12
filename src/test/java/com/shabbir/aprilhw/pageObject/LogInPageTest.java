package com.shabbir.aprilhw.pageObject;

import org.testng.annotations.Test;

public class LogInPageTest extends BaseTestClass {


    @Test
    public void loginTest() throws Exception {
        System.out.println("Login Page Verification items:    ==========");
        //System.out.println(logInPage.login(""));

        logInPage.login("My Profile");
        System.out.println("========= Assertion Passed ======");




        System.out.println("Homepage Verification item: ============");

        logInPage.registrationPage("HOME");
        System.out.println("========= Assertion Passed ======");

    }


}
