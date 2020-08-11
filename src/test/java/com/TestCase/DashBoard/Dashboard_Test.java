package com.TestCase.DashBoard;

import com.PageObject.DashBoardPage.DashBoard;
import org.testng.annotations.Test;

public class Dashboard_Test {
    public static DashBoard board = new DashBoard();
    @Test(priority = 7)
    public void Dashboard()throws Exception{
        board.Departure_Time();
        Thread.sleep(3000);
    }
    @Test(priority = 8)
    public void time()throws Exception{
        board.Onward_Price();
        Thread.sleep(3000);
    }
}
