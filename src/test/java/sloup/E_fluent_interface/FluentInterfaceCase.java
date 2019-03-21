package sloup.E_fluent_interface;

import org.testng.annotations.Test;
import sloup.D_xpath_lecture_7.RedmineHomePage;
import sloup.D_xpath_lecture_7_test.AbstractTestXpath;

@Test
public class FluentInterfaceCase extends AbstractTestXpath {

    @Test
    public void bestPracticeTest() {
        new RedmineHomePage(getDriver())
                .clickOnLoginAnchor(getDriver())
                .fillUsernameInput("pepe5565")
                .fillPasswordInput("PXPkehadBWX97Y9")
                .clickLoginButton(getDriver())
                .clickOnHelpAnchor();
    }
}
