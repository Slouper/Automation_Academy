package MBA.SedmaLekce;


import MBAsource.Xpathyclassic.RedmineHomePage;
import MBAsource.Xpathyclassic.RedmineLoginPage;
import MBAsource.Xpathyclassic.RedmineMainPage;
import org.testng.annotations.Test;

public class XpathTest extends AbstractTest{
    @Test
    public void BestPractices() {

        getDriver().get("https://www.redmine.org");

        RedmineHomePage redmineHomePage = new RedmineHomePage(getDriver());
        redmineHomePage.clickOnLoginAnchor();

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
        redmineLoginPage.fillUsernameInput("tvojemama1");
        redmineLoginPage.fillPasswordInput("tvojemama");
        redmineLoginPage.clickLoginButton();

        RedmineMainPage redmineMainPage = new RedmineMainPage(getDriver());
        redmineMainPage.clickOnHelpAnchor();

        RedmineTimeLogReportPage redmineTimeLogReportPage = new RedmineTimeLogReportPage(getDriver());
        redmineTimeLogReportPage.clickOnTimelogReport();

    }
}
