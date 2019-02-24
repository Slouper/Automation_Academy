package patrikluksch;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class HomeworkTest1 {

    private static final Logger log = LoggerFactory.getLogger(HomeworkTest1.class);
    private FirefoxDriver driver;
    String resultTitle = "Nepodařilo se vyhledat vhodné spojení | Dopravní podnik hlavního města Prahy";

    @BeforeTest
    public void getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:/firefox_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
    }


    @Test
    public void searchBusOnDPPPage_WhenDPPSpojeniPageIsOpen() {
        log.debug("Test 'searchBusOnDPP' started");

        driver.get("http://spojeni.dpp.cz/");

        driver.findElement(By.id("ctlFrom_txtObject")).sendKeys("Palouček");

        driver.findElement(By.id("ctlTo_txtObject")).sendKeys("I. P. Pavlova");

        driver.findElement(By.id("optChangesDirect")).click();

        driver.findElement(By.id("chkLowDeckConnection")).click();

        driver.findElement(By.id("cmdSearch")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.titleContains(resultTitle));
    }

    @AfterTest
    private void quitDriver() {
        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

}
