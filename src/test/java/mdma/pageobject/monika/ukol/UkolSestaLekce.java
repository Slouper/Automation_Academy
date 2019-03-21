package mdma.pageobject.monika.ukol;

import mdma.pageobject.monika.test.AbstractTest;
import mdma.pageobject.monika.test.SeznamHomePage;
import mdma.pageobject.monika.test.SeznamResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;


@Test
public class UkolSestaLekce extends AbstractTestDU {

    @Test
    public void UkolSestaLekce() {

        getDriver().get("http://www.redmine.org/login");
        RedmineLoginPage loginPage = new RedmineLoginPage(getDriver());
        loginPage.register();

        Random rand = new Random();

// Obtain a number between [0 - 49].
        int n = rand.nextInt(50);
        String user = "Kapitan" + n;
        String password = "Kapitan";

        RedmineRegistrePage registrePage = new RedmineRegistrePage(getDriver());

        registrePage.insertLogin(user);
        registrePage.insertPassword(password);
        registrePage.insertPassword_confirmation(password);
        registrePage.insertName("Jean-Luc");
        registrePage.insertLastName("Picard");
        registrePage.insertEmail("KapitanLodi" + n + "@enterprise.cz");
        registrePage.clickEnter();

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
        redmineLoginPage.fillUsernameInput(user);
        redmineLoginPage.fillPasswordInput(password);
        redmineLoginPage.clickLoginButton();
    }

}


