package com.shabbir.aprilhw.pageObject;

import com.selenium.exceltestdata.utility.ExcelReader;
import com.shabbir.aprilhw.selenium.CheckoutProduct;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.selenium.exceltestdata.utility.ExcelReader.exclReader;

public class BaseTestClass {

    protected LogInPage logInPage;
    protected HomePage homePage;
    protected ShippingInfoPage shippproduct;
    protected CheckOutPage checkouttopurchase;
    private WebDriver driver;
    static String filePath ="/Users/shabbirkhan/Desktop/Testdata.xlsx";

   /* public BaseTestClass(){

    }*/

    @BeforeClass
    public void setUpMethod(){
        initilization();
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);
        shippproduct = new ShippingInfoPage(driver);
        checkouttopurchase= new CheckOutPage(driver);


    }

    @AfterClass
    public void tearDownMethod(){
        if(driver != null){
            driver.quit();
        }

    }


    public void initilization(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo.broadleafcommerce.org/");

    }

    @DataProvider(name="shabbir")
    public Object [][] excelData () throws IOException {
        Object [][] arrayData = exclReader();
        return arrayData;
    }

    @DataProvider(name = "Shabbir1")
    public Object [][] excelData1 () throws IOException {
        Object [][] arrayData1 = exclReader();
        return  arrayData1;
    }


}
