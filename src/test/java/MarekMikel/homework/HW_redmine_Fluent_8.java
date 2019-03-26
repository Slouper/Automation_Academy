package MarekMikel.homework;

import MarekMikel.lekce.TestAbstract;
import marek.pageObject_HW8.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;


public class HW_redmine_Fluent_8 extends TestAbstract {
    private static final Logger log = LoggerFactory.getLogger(HW_redmine_Fluent_8.class);

    private final String user = "marek" + (int)(Math.random() * 5000 + 1);
    private final String email = (int)(Math.random() * 5000 + 1) + "@seznam.cz";

    @Test
    public void TestRegisterPage() {
        log.debug("Test 'TestPageObject' started");
        getDriver().get("http://www.redmine.org");

        new RedmineHomePage8(getDriver())
                .clickOnLoginAnchor(getDriver())
                .inputLoginAnchor(getDriver(),"pepe5565", "PXPkehadBWX97Y9")
                .clickOnHelpAnchor(getDriver())
                .clickReportAnchor(getDriver());
//
//        new RedmineLoginPage8(getDriver())
//                .inputLoginAnchor(getDriver(), "pepe5565", "PXPkehadBWX97Y9");
//
//        new RedmineMainPage8(getDriver())
//                .clickOnHelpAnchor(getDriver());
//
//        new RedmineHelpPage8(getDriver())
//                .clickReportAnchor(getDriver());

        getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='Redmine-Timelog-Report']/following::h1")));
        assertEquals("Redmine Timelog Report",
                getDriver().findElement(By.xpath("//a[@name='Redmine-Timelog-Report']/following::h1")).getText());


    }
}


