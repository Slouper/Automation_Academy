package MBA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sloupfirstlecture.basictestnostructure.SpaghettiTest;
import sloupfirstlecture.pageobjects.SeznamHomePage;
import sloupfirstlecture.pageobjects.SeznamSearchResultsPage;

@Test
public class firstMozillaTest {
    private static final Logger log = LoggerFactory.getLogger(SpaghettiTest.class);


    @Test
    public void searchTermAndClickOnResultWhenResultPageIsOpen() {
        log.debug("Test 'searchTermOnSeznamPage_WhenSeznamHomePageIsOpen' started");

        System.setProperty("webdriver.gecko.driver","C:\\gecko_driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver ();
        log.debug("WebDriver started ....");
        driver.get("https://www.csfd.cz/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Tvoje Máma");
        //driver.findElement(By.xpath("//*[@id = 'fulltext-input']")).sendKeys("Selenium driver");

        driver.findElement(By.xpath("//*[@id=\"main-search\"]/form/div/input[2]")).click();
        // driver.findElement(By.cssSelector("button.search-form__button")).click();
        driver.quit();
        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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







