package MarekMikel.tretiLekce;

import MarekMikel.homework.FirstHW;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestMethods {
    private static final Logger log = LoggerFactory.getLogger(FirstHW.class);
    private ChromeDriver driver;
    WebDriverWait wait;

    @Test
    public void TestMethods() throws InterruptedException {
        log.debug("Test 'TestMethods' started");
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkboxes")));

        Actions actions = new Actions(driver);
        actions
                .doubleClick(driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")))
                .perform();


        driver.get("https://the-internet.herokuapp.com/key_presses");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result")));

        actions
                .sendKeys(Keys.BACK_SPACE)
                .pause(Duration.ofSeconds(1))
                .sendKeys(Keys.CONTROL)
                .pause(Duration.ofSeconds(1))
                .sendKeys(Keys.ARROW_LEFT)
                .pause(Duration.ofSeconds(1))
                .sendKeys(Keys.ESCAPE)
                .pause(Duration.ofSeconds(1))
                .perform();

        //to same co vyse - ale nepochopi to, jelikoz nemuze tam zapisovat. Tento test bere pouze vstup z klavesnice
        //driver.findElement(By.id("result")).sendKeys(Keys.ALT);


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().dismiss();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
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


