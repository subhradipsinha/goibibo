package com.TestCase.Login;

import com.PageObject.LoginPage.Login;
import com.PageObject.DashBoardPage.DashBoard;
import org.testng.annotations.Test;

@Test(priority = 1)
public class Login_Page {
    public static Login login = new Login();

    @Test(priority = 2)
    public void Url_Hit() throws Exception {
        login.init();
    }
    @Test(priority = 3)
    public void Departure()throws Exception {
        login.Departure();
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void From()throws Exception {
        login.From();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void To()throws Exception {
        login.To();
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void Search()throws Exception{
        login.Search();
        Thread.sleep(3000);
    }

    @Test(priority = 9)
    public void Quit()throws Exception{
        login.Quit();
        Thread.sleep(3000);
    }
}