package plu;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WS4_FF {

    private static final Logger log = LoggerFactory.getLogger(HomeworkTest1.class);
    private FirefoxDriver driver;
   // String resultTitle = "Nepodařilo se vyhledat vhodné spojení | Dopravní podnik hlavního města Prahy";

    @BeforeTest
    public void getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:/firefox_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
    }


    @Test
    public void searchBusRegioJetPage_WhenRegioJetPageIsOpen() {
        log.debug("Test 'searchRegioJetBus' started");

        driver.get("https://jizdenky.regiojet.cz/");

        driver.findElement(By.id("destination_from")).sendKeys("Praha");

        driver.findElement(By.id("destination_to")).sendKeys("Olomouc");

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        driver.findElement(By.xpath("//button[@type='submit']")).click();

       // driver.findElement(By.id("chkLowDeckConnection")).click();

       // driver.findElement(By.id("cmdSearch")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

       // wait.until(ExpectedConditions.titleContains(resultTitle));
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
