package lma.RedimeHWTest;

import RedmineHW.RedmineHomePage;
import RedmineHW.RedmineLoginPage;
import RedmineHW.RedmineRegisterPage;
import org.testng.annotations.Test;

@Test
public class RedmineObjectTest extends RedmineObjectTestAbstract {

    @Test
    public void RedmineObjectTest() {

        getDriver().get("http://www.redmine.org/");

        RedmineHomePage redmineHomePage = new RedmineHomePage(getDriver());
        redmineHomePage.clickOnRegister();

        RedmineRegisterPage redmineRegisterPage = new RedmineRegisterPage(getDriver());
        redmineRegisterPage.userLogin("Java" + random());
        redmineRegisterPage.userPassword("Heslo123");
        redmineRegisterPage.userPasswordConfirmation("Heslo123");
        redmineRegisterPage.userFirstname("Krestni");
        redmineRegisterPage.userLastname("Prijmeni");
        redmineRegisterPage.userMail(random() + "@aaa.cz");
        redmineRegisterPage.userLanguageSelect();
        redmineRegisterPage.userIrcNick("123456");
        redmineRegisterPage.clickRegisterButton();

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
        redmineLoginPage.usernameLogin("Java" + random());
        redmineLoginPage.usernamePassword("Heslo123");
        redmineLoginPage.clickLoginButton();
    }
}