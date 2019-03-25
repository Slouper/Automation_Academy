package lma.xpathhwtest;

import org.testng.annotations.Test;
import xpathhw.*;

@Test
public class XpathTest extends XpathTestAbstract {

    @Test
        public void xpathHWTest(){
        getDriver().get("http://www.redmine.org/");

        XpathHomePage xPathHomePage = new XpathHomePage(getDriver());
        xPathHomePage.xpathLoginButton();

        XpathLoginPage xpathLoginPage = new XpathLoginPage(getDriver());
        xpathLoginPage.xpathUsernameLogin("pepe5565");
        xpathLoginPage.xpathUsernamePassword("PXPkehadBWX97Y9");
        xpathLoginPage.xpathClickLoginButton();

        XpathMainPage xpathMainPage = new XpathMainPage(getDriver());
        xpathMainPage.xPathHelpButton();

        XpathHelpPage xpathHelpPage = new XpathHelpPage(getDriver());
        xpathHelpPage.xpathTimeReport();

        XpathReportPage xpathReportPage = new XpathReportPage(getDriver());
        xpathReportPage.xpathTimeReportCheck();
    }
}
