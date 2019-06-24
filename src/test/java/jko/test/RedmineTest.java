package jko.test;

import jko.test.base.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedmineTest extends AbstractTest {

    @Test
    public void RedmineLoginEtcTest() {

        String statusOfTheFifthTask = new RedmineHomePage(getDriver())
                .clickOnNavigateToLoginButton()
                .fillUserName("pexomat")
                .fillPassword("pexomat123")
                .clickOnLoginButton()
                .clickOnTasksTab()
                .setStatusDropdownToClosed()
                .applyFilter()
                .waitForTwoSeconds()
                .getStatusOfFifthTask();

        Assert.assertEquals(statusOfTheFifthTask, "Closed");
    }
}
