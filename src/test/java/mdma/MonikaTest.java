package mdma;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class MonikaTest {
    private static final Logger log = LoggerFactory.getLogger(MonikaTest.class);
    private FirefoxDriver driver;

    @Test
    public void searchTermOnWikipediaPage_WhenWikipediaHomePageIsOpen() {
        log.debug("Test 'searchTermOnWikipediaPage_WhenWikipediaHomePageIsOpen' started");

        driver.get("https://www.wikipedia.org/");

        driver.findElementById("searchInput").sendKeys("Programovaci jazyk");

        driver.findElementByXPath("//*[@id=\"search-form\"]/fieldset/button/i").click();
    }

    @BeforeTest
    public void getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:/gecko_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
    }

    @AfterTest
    private void afterTest() {
        try {
            //log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
