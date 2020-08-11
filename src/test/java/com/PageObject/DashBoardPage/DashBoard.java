package com.PageObject.DashBoardPage;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class DashBoard extends TestBase {
    @Test
    public void Departure_Time() throws Exception {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
        // Search Tab working or Not
        WebElement Departure = TestBase.byXpath("Departure_Time_Xpath");
        if (Departure.isDisplayed()) {
            Departure.click();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
            SoftAssert softAssertion = new SoftAssert();
            System.out.println("softAssert Method Was Started Departure_Time");
            softAssertion.assertTrue(false);
            System.out.println("softAssert Method Was Executed Departure_Time");

        } else {
            System.out.println("Departure_Time_Xpath not working");
        }
    }
    @Test
    public void Onward_Price()throws Exception{
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
        WebElement Onward_Price = TestBase.byXpath("Amount_Xpath");
        JavascriptExecutor js = (JavascriptExecutor) Onward_Price;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
        js.executeScript("arguments[0].scrollIntoView();", Onward_Price);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
        System.out.println("Move amount");

    }
}