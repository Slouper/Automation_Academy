package ASE.ase_test;

import ASE.ase_test.base.AbstractTest;
import ASE.ase_test.pageObjects.RedmineHomePage;
import ASE.ase_test.pageObjects.RedmineResultPage;
import org.testng.annotations.Test;


@Test
public class LoginToRedmineTest extends AbstractTest {

    @Test(description = "Prihlasit se a zkontrolovat hodnotu 5.ukolu")
    public void checkValueTest() {
//        String userNameExpression = "EvženOněgin";
        RedmineResultPage resultPage = new RedmineHomePage(getDriver())
                .clickOnLoginLink()
                .enterUserName("pepe5565")
                .enterPassword("PXPkehadBWX97Y9")
                .clickOnLoginButton()
                .clickOnTasks()
                .clickOnStatusWrap()
                .clickOnStatusClosed()
                .clickOnUseIt();

        waitForElementIsVisible(resultPage.getElementOnResultPage());


//        Assert.assertEquals(newtoursRegisterPage.getEmailValue(), userNameExpression);
    }

}
