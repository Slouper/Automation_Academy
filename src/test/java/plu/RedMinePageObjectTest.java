package plu;

import org.testng.annotations.Test;
import plu.pageobject.RedMineHomePage;
import plu.pageobject.RedMineLoginPage;
import plu.pageobject.RedMineRegisterPage;

import java.util.UUID;

public class RedMinePageObjectTest extends AbstractTest {

    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

    private static String randomUserName() {
        return "random-" + UUID.randomUUID().toString() + "userName";
    }


    @Test
    public void redMinePageObjectTest(){
        getDriver().get("http://www.redmine.org/");

        // redmine homepage
        RedMineHomePage redMineHomePage = new RedMineHomePage(getDriver());

        redMineHomePage.isOpen();

        //register button
        redMineHomePage.clickRegisterButton();

        // Generate a random email
        final String randomEmail = randomEmail();

        // Generate a random username
        final String userName = randomUserName();

        //redmine register page
        RedMineRegisterPage redMineRegisterPage = new RedMineRegisterPage(getDriver());
        redMineRegisterPage.isOpen();

        //registration form
        redMineRegisterPage.insertUserLogin(userName);
        redMineRegisterPage.insertUserPassword("NeprolomitelneHeslo1234");
        redMineRegisterPage.insertUserPasswordConfirmation("NeprolomitelneHeslo1234");
        redMineRegisterPage.insertFirstName("Automation");
        redMineRegisterPage.insertLastName("Tester");
        redMineRegisterPage.insertUserMail(randomEmail);
        redMineRegisterPage.insertUserLanguage("Deutsch");
        redMineRegisterPage.insertUserCustomFieldValues3("MyRandomNick");

        //submit
        redMineRegisterPage.clickSubmitButton();

        //info message to console
        redMineRegisterPage.getFlashNotice();

        //login page
        RedMineLoginPage redMineLoginPage = new RedMineLoginPage(getDriver());
        redMineLoginPage.isOpen();

        //login form
        redMineLoginPage.setUserName(userName);
        redMineLoginPage.setPassword("NeprolomitelneHeslo1234");

        //login button
        redMineLoginPage.clickLoginButton();

        //error message to console
        redMineLoginPage.getFlashError();

    }
}
