package com.shabbir.aprilhw.pageObject;

import org.testng.annotations.Test;

public class LogInPageTest extends BaseTest {



    @Test(dataProvider = "shabbir")
    public void loginTest(String paraID, String paraPass) throws Exception {

        System.out.println("Login Page Verification items:    ==========");

        logInPage.login(paraID,paraPass,"My Profile");

        System.out.println("========= Assertion Passed ======");

    }


}
//@Parameters({"emailID", "password"})

    /*@Test
    public void loginTest(String paraID, String paraPass) throws Exception {

        System.out.println("Login Page Verification items:    ==========");

        logInPage.login(paraID,paraPass,"My Profile");

        System.out.println("========= Assertion Passed ======");

    }
*/