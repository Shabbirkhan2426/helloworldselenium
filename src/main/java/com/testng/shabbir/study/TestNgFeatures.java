package com.testng.shabbir.study;

import org.testng.annotations.Test;

public class TestNgFeatures {


    @Test
    public void loginTest(){

        System.out.println("Login Test");
        //int i = 9/0;
    }

    @Test(dependsOnMethods = "loginTest")
    public void HonePageTest(){

        System.out.println("Home Page Test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void SearchPageTest() {

        System.out.println("Search Page  Test");
    }
    @Test(dependsOnMethods = "loginTest")
    public void RegPageTest() {

        System.out.println("Reg Page  Test");
    }
}
