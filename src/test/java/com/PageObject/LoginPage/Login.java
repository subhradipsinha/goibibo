package com.PageObject.LoginPage;

import com.demo.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class Login extends TestBase {
    @Test
    public void init() throws Exception {
        //Call URL
        TestBase.initilize();
        System.out.println("URL Call");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
        Thread.sleep(15000);
    }

    @Test
    public void From() throws Exception {
        //Retrieve WebElement 'Signin' to perform mouse hover
        WebElement From_destination = TestBase.byXpath("From_Xpath");
        if (From_destination.isDisplayed()) {
            From_destination.click();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
            Actions from_destination = new Actions(driver);
            From_destination.sendKeys(TestData.getProperty("From_Value"));
            from_destination.moveToElement(From_destination).click().perform();

            System.out.println("From_Value");
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
            Thread.sleep(3000);


            SoftAssert softAssert = new SoftAssert();
            System.out.println("Retrieve WebElement 'From_Value' to perform mouse hover");
            softAssert.assertTrue(false);
            System.out.println("softAssert Method Was Executed From_Value");
        } else {
            System.out.println("Retrieve WebElement 'From_Value' to perform mouse hover not working");
            SoftAssert softAssert = new SoftAssert();
            System.out.println("Retrieve WebElement 'From_Value' to perform mouse hover not working");
            softAssert.assertTrue(true);
            System.out.println("softAssert Method not Executed From_Value");
        }
    }

    @Test
    public void To() throws Exception {

        WebElement To_destination = TestBase.byXpath("To_Xpath");
        if (To_destination.isDisplayed())
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MINUTES);
            Actions to_destination = new Actions(driver);
            to_destination.sendKeys(TestData.getProperty("To_Value"));
            to_destination.moveToElement(To_destination).click().perform();
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MINUTES);
            Thread.sleep(3000);
            SoftAssert softAssert = new SoftAssert();
            System.out.println("Retrieve WebElement 'To_Value' to perform mouse hover");
            softAssert.assertTrue(false);
            System.out.println("softAssert Method Was Executed To_Value");
    }
    @Test
    public void Departure()throws Exception{
        driver.navigate().refresh();
        Thread.sleep(5000);
        WebElement Departure_Date = TestBase.byXpath("Departure_Xpath");
        if (Departure_Date.isDisplayed())
        {
            Departure_Date.click();
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MINUTES);
            Actions action = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MINUTES);
            Thread.sleep(5000);
            WebElement Date = TestBase.byXpath("Action_date");
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MINUTES);
            Thread.sleep(15000);
            action.moveToElement(Date).click().perform();
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MINUTES);
            Thread.sleep(5000);
        }else {
            System.out.println("Action Class not working");
        }
    }
    @Test
    public void Search()throws Exception{
        WebElement Search_Button = TestBase.byXpath("Search_Xpath");
        if(Search_Button.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
            Search_Button.click();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
            System.out.println("Search button working");
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
            Thread.sleep(3000);

        }else {
            System.out.println("Search void not working");
        }
        }
    @Test
    public void Quit()throws Exception{
        driver.close();
        System.out.println("driver close");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
    }
}