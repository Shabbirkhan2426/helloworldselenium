package com.testng.shabbir.study;

import org.testng.annotations.*;

public class TestNgBasics {

    //PRe-condition annotation ----starting with @Before

    @BeforeSuite  //1
    public void setUp(){

        System.out.println("Set up system properly for chrome ");

    }
    @BeforeTest  //2
    public void launchBrowser(){

        System.out.println("Launch the browser ");
    }


    @BeforeClass //3
    public void login(){

        System.out.println("Log into the app");

    }

    @BeforeMethod //4
    public void enterURL(){

        System.out.println("Enter the URL");
    }

    //Test cases----starting with @Test
    @Test //5
    public void googleTitleTest(){
        System.out.println("Google Title Test");

    }

    @Test
    public void searchTest(){

        System.out.println("Search the Test");
    }

    @Test
    public void googleLogoTest(){

        System.out.println("Google logo Test");
    }
    //Postcondition---startin with @After
    @AfterMethod //6
    public void logOut(){

        System.out.println("logout form app");
    }

    @AfterClass //7
    public void clsoeBroswer(){

        System.out.println("Close the browser");
    }

    @AfterTest  //8
    public void deleteAllCookies(){

        System.out.println("Delete all the cookies");

    }

    @AfterSuite//9
    public void generateTestReport(){

        System.out.println("Generate the Test Report");
    }


}
