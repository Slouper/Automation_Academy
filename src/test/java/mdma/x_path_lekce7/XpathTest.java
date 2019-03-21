package mdma.x_path_lekce7;

import mdma.pageobject.monika.test.AbstractTest;
import mdma.pageobject.monika.test.SeznamHomePage;
import mdma.pageobject.monika.test.SeznamResultPage;
import org.testng.annotations.Test;


@Test
public class XpathTest extends AbstractTest {


    public void BestPractices() {

        getDriver().get("https://www.redmine.org");

        RedmineHomePage redmineHomePage = new RedmineHomePage(getDriver());
        redmineHomePage.clickOnLoginAnchor();

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
        redmineLoginPage.fillUsernameInput("pepe5565");
        redmineLoginPage.fillPasswordInput("PXPkehadBWX97Y9");
        redmineLoginPage.clickLoginButton();

        RedmineMainPage redmineMainPage = new RedmineMainPage(getDriver());
        redmineMainPage.clickOnHelpAnchor();

        RedmineTimeLogReportPage redmineTimeLogReportPage = new RedmineTimeLogReportPage(getDriver());
        redmineTimeLogReportPage.clickOnTimelogReport();

    }

}
