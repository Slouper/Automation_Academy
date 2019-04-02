package sloup.E_fluent_interface;

import org.testng.annotations.Test;
import sloup.D_xpath_lecture_7.RedmineHomePage;
import sloup.D_xpath_lecture_7_test.AbstractTestXpath;
import sloup.E_xpath_lecture_7.D_xpath_lecture_7.RedmineHomePageFluent;

@Test
public class FluentInterfaceCase extends AbstractTestXpath {

    @Test
    public void bestPracticeTest() {
        new RedmineHomePageFluent(getDriver())
                .clickOnLoginAnchor(getDriver())
                .fillUsernameInput("pepe5565")
                .fillPasswordInput("PXPkehadBWX97Y9")
                .clickLoginButton(getDriver())
                .clickOnHelpAnchor();
    }
}
