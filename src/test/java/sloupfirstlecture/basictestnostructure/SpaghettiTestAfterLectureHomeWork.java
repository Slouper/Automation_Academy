package sloupfirstlecture.basictestnostructure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class SpaghettiTestAfterLectureHomeWork {
    private static final Logger log = LoggerFactory.getLogger(SpaghettiTestAfterLectureHomeWork.class);
    private FirefoxDriver driver;

    @BeforeTest
    private void getChromeDriver() {
        System.setProperty("webdriver.gecko.driver", "C:/chrome_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        log.debug("WebDriver started ....");

    }

    @Test
    public void searchTermOnBingPage_WhenBingHomePageIsOpen() {
        Actions actions = new Actions(driver);

        driver.get("https://jizdenky.regiojet.cz");
        driver.findElement(By.xpath("//*[@id='destination_from']")).sendKeys("Praha");
        driver.findElement(By.xpath("//*[@id='destination_to']")).sendKeys("Olomouc");
        WebElement element = driver.findElement(By.xpath("//*[@id='footer_content']/a[5]"));

        actions.moveToElement(element).build().perform();

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
