package plu.Lesson7_xpath;


import org.testng.Assert;
import org.testng.annotations.Test;
import plu.Lesson7_xpath.pageobject.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class RedMinePageObjectTestL7 extends AbstractTestXpath {

    @Test
    public void redMinePageObjectTestXpath(){
        getDriver().get("http://www.redmine.org/");

        // redmine homepage
        RedMineHomePageXpath redMineHomePageXpath = new RedMineHomePageXpath(getDriver());
        redMineHomePageXpath.isOpen();
        redMineHomePageXpath.clickOnLoginAnchor();

        //redmine loginpage
        RedMineLoginPageXpath redMineLoginPageXpath = new RedMineLoginPageXpath(getDriver());
        redMineLoginPageXpath.isOpen();
        redMineLoginPageXpath.fillUsernameInput("pepe5565");
        redMineLoginPageXpath.fillPasswordInput("PXPkehadBWX97Y9");
        redMineLoginPageXpath.clickLoginButtonXpath();

        //redmine mainpage
        RedMineMainPageXpath redMineMainPageXpath = new RedMineMainPageXpath(getDriver());
        redMineMainPageXpath.isOpen();
        redMineMainPageXpath.clickOnHelpAnchor();

        //redmine helppage
        RedMineHelpPageXpath redMineHelpPageXpath = new RedMineHelpPageXpath(getDriver());
        redMineHelpPageXpath.isOpen();
        redMineHelpPageXpath.clickSpentTimeDetails();

        //redmine Spent Time Details title check
        RedMineSpentTimeDetailsPageXpath redMineSpentTimeDetailsPageXpath = new RedMineSpentTimeDetailsPageXpath(getDriver());
        String expectedTitleText = "Redmine Timelog Report";
        String titleText = redMineSpentTimeDetailsPageXpath.getTitleDisplayed();
        Assert.assertTrue(titleText.contains(expectedTitleText), "Redmine Timelog Report");
    }

}
