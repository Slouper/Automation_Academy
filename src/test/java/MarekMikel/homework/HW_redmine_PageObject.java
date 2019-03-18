package MarekMikel.homework;

import Marek.PageObject.RedmineLoginPage;
import Marek.PageObject.RedmineRegisterPage;
import MarekMikel.lekce.TestAbstract;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;



public class HW_redmine_PageObject extends TestAbstract {
    private static final Logger log = LoggerFactory.getLogger(HW_redmine_PageObject.class);

    @Test
    public void TestRegisterPage() {
        log.debug("Test 'TestPageObject' started");
        getDriver().get("http://www.redmine.org/login");

        RedmineRegisterPage redmineRegisterPage = new RedmineRegisterPage(getDriver());
        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
            redmineLoginPage.SearchRegister();
        getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));
            redmineRegisterPage.FillValues(RedmineRegisterPage.user, "pes", "Marek", "Mikel", RedmineRegisterPage.email, "neco");

    }



}


