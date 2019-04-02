package plu.homeworkFluentInterface;

import org.testng.annotations.Test;
import plu.homeworkFluentInterface.pageobject.RedMineHomePageHw8;

public class RedMineFluentInterfaceTest extends AbstractTestFluentInterface {

    @Test
    public void redMineFluentInterfaceTest() {
        new RedMineHomePageHw8(getDriver())
                .clickOnLoginAnchor()
                .fillUsernameInput(username)
                .fillPasswordInput(password)
                .clickLoginButtonXpath()
                .clickOnHelpAnchor()
                .clickSpentTimeDetails()
                .titleVerification();
    }

}
