package sloupfirstlecture.basictestwithstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sloupfirstlecture.pageobjects.SeznamHomePage;
import sloupfirstlecture.pageobjects.SeznamSearchResultsPage;

@Test
public class PageObjectTests {
    private static final Logger log = LoggerFactory.getLogger(PageObjectTests.class);

    @Test
    public void searchTermAndClickOnResultWhenResultPageIsOpen() {

        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        log.debug("WebDriver started ....");

        driver.get("https://www.seznam.cz");

        SeznamHomePage seznamHomePage = new SeznamHomePage(driver);
        seznamHomePage.searchExpressionOnSeznamHomePage("Selenium driver");

        SeznamSearchResultsPage resultPage = new SeznamSearchResultsPage(driver);
        resultPage.clickOnResultOnResultPage();

        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.error("Thread interrupted!", e);
            Thread.currentThread().interrupt();
        }

        driver.quit();

    }

    @BeforeTest
    public WebDriver startDriver() {
        return null;
    }

    @AfterTest
    public void quitDriver(WebDriver driver) {
        driver.quit();
    }

}
