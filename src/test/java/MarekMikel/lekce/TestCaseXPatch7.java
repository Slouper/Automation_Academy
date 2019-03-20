package MarekMikel.lekce;

import Marek.PageObject_lection7.RedmineHomePageXPath;
import Marek.PageObject_lection7.RedmineLoginPageXPath;
import Marek.PageObject_lection7.RedmineMainPageXPatch;
import org.testng.annotations.Test;

@Test
public class TestCaseXPatch7 extends TestAbstract{

    @Test
    public void TestCaseXPatch7() {
        getDriver().get("http://www.redmine.org");

        RedmineHomePageXPath redmineHomePageXPath = new RedmineHomePageXPath(getDriver());
        redmineHomePageXPath.SearchLoginAnchor();


        RedmineLoginPageXPath redmineLoginPageXPath = new RedmineLoginPageXPath(getDriver());
        redmineLoginPageXPath.SearchUserLogin("pepe5565");
        redmineLoginPageXPath.SearchUserPassword("PXPkehadBWX97Y9");
        redmineLoginPageXPath.SearchLogin();

        RedmineMainPageXPatch redmineMainPageXPatch = new RedmineMainPageXPatch(getDriver());
        redmineMainPageXPatch.clickOnHelpAnchore();
    }
}
