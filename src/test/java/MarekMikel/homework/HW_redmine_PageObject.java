package MarekMikel.homework;

import marek.pageObject.RedmineLoginPage;
import marek.pageObject.RedmineRegisterPage;
import MarekMikel.lekce.TestAbstract;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;


public class HW_redmine_PageObject extends TestAbstract {
    private static final Logger log = LoggerFactory.getLogger(HW_redmine_PageObject.class);

    private final String user = "marek" + (int)(Math.random() * 5000 + 1);
    private final String email = (int)(Math.random() * 5000 + 1) + "@seznam.cz";

    @Test
    public void TestRegisterPage() {
        log.debug("Test 'TestPageObject' started");
        getDriver().get("http://www.redmine.org/login");

        RedmineRegisterPage redmineRegisterPage = new RedmineRegisterPage(getDriver());
        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
            redmineLoginPage.SearchRegister();
        getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));
            redmineRegisterPage.FillValues(user, "pesakocka", "marek", "Mikel", email, "neco");
        assertEquals("Účet byl úspěšně vytvořen. Pro aktivaci účtu klikněte na odkaz v emailu, který vám byl zaslán.", redmineLoginPage.SearchCreated().getText());
            redmineLoginPage.SearchUserLogin(user);
            redmineLoginPage.SearchUserPassword("pesakocka");
            redmineLoginPage.SearchLogin();


        assertEquals("Neaktivovali jste si dosud Váš účet. Pro opětovné zaslání aktivačního emailu klikněte na tento odkaz, prosím." , redmineLoginPage.SearchError().getText());


    }



}


