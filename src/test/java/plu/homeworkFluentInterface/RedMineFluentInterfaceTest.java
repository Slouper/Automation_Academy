package plu.homeworkFluentInterface;

import org.testng.annotations.Test;
import plu.homeworkFluentInterface.pageobject.RedMineHomePageHw8;

public class RedMineFluentInterfaceTest extends AbstractTestFluentInterface {

    @Test
    public void redMineFluentInterfaceTest() {
        new RedMineHomePageHw8(getDriver())
                .clickOnLoginAnchor(getDriver())
                .fillUsernameInput(username)
                .fillPasswordInput(password)
                .clickLoginButtonXpath(getDriver())
                .clickOnHelpAnchor(getDriver())
                .clickSpentTimeDetails(getDriver())
                .titleVerification();
    }

}
