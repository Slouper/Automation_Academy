package MBA.Xpathy;

import org.testng.annotations.Test;
import sloup.D_xpath_lecture_7.RedmineHomePage;
import sloup.D_xpath_lecture_7.RedmineLoginPage;
import sloup.D_xpath_lecture_7.RedmineMainPage;
import sloup.D_xpath_lecture_7_test.AbstractTestXpath;

@Test
public class XPathTestCase extends AbstractTestXpath {

    @Test
    public void bestPracticeTest() {
        getDriver().get("https://www.redmine.org");

        RedmineHomePage redmineHomePage = new RedmineHomePage(getDriver());
        redmineHomePage.clickOnLoginAnchor();

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
        redmineLoginPage.fillUsernameInput("pepe5565");
        redmineLoginPage.fillPasswordInput("PXPkehadBWX97Y9");
        redmineLoginPage.clickLoginButton();

        RedmineMainPage redmineMainPage = new RedmineMainPage(getDriver());
        redmineMainPage.clickOnHelpAnchor();
    }
}
