package MarekMikel.homework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class FirstHW {
    private static final Logger log = LoggerFactory.getLogger(FirstHW.class);
    private FirefoxDriver driver;

    @BeforeMethod
    public void getDriver() {
        System.setProperty("webdriver.gecko.driver", "C:/selenium_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
    }

    @Test
    public void findWebdriverFirefox() {
            log.debug("Test 'FirstHW' started");
            driver.get("https://www.google.com");
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Webdriver for Firefox");

            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            driver.findElement(By.xpath("/k/*[text()='GitHub - mozilla/geckodriver: WebDriver for Firefox']")).click();

//            WebDriverWait wait = new WebDriverWait(driver, 5);
//
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.Result-title-link")));
//
//            driver.findElement(By.cssSelector("a.Result-title-link")).click();

            }


    @AfterMethod
    private void CloseDriver() {
            try {
            log.debug("Waiting 2 seconds before test end.");
            Thread.sleep(2000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
            driver.quit();
            }

    }
