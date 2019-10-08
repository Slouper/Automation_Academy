package MBA.SedmaLekceFluent.SedmaLekce;


import org.testng.annotations.Test;

public class XpathTestFluentInterfaceTest extends AbstractTestFluent {
    @Test
    public void BestPractices() {

        getDriver().get("https://www.redmine.org");
        RedmineHomePageFluent redmineHomePage = new RedmineHomePageFluent(getDriver());
        redmineHomePage.clickOnLoginAnchor()
                .fillUsernameInput("tvojemama1")
                .fillPasswordInput("tvojemama")
                .clickLoginButton()
                .clickOnHelpAnchor()
                .clickOnTimelogReport();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
