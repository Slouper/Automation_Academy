package lma.spaghettitest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class SpaghettiTest {
    private static final Logger log = LoggerFactory.getLogger(SpaghettiTest.class);
    private ChromeDriver driver;

    @Test
    public void searchTermOnSeznamPage_WhenSeznamHomePageIsOpen() {
        log.debug("Test 'searchTermOnSeznamPage_WhenSeznamHomePageIsOpen' started");

        driver.get("https://www.seznam.cz");

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium driver");
        //driver.findElement(By.xpath("//*[@id = 'fulltext-input']")).sendKeys("Selenium driver");

        driver.findElement(By.xpath("//button[contains(@class,'search-form__button')]")).click();
        // driver.findElement(By.cssSelector("button.search-form__button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.Result-title-link")));

        driver.findElement(By.cssSelector("a.Result-title-link")).click();
    }

    @Test
    public void searchTermOnBingPage_WhenBingHomePageIsOpen() {
        log.debug("Test 'searchTermOnBingPage_WhenBingHomePageIsOpen' started");

        driver.get("https://www.bing.com/");

        driver.findElement(By.id("sb_form_q")).sendKeys("Selenium driver");

        driver.findElement(By.id("sb_form_go")).click();

    }

    @BeforeMethod
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");

    }

    @AfterMethod
    public void endDriver() {
        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

