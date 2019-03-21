package plu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class WorkshopExample {
    private static final Logger log = LoggerFactory.getLogger(HomeworkTest1.class);
    private ChromeDriver driver;

    WebDriverWait wait;

    @BeforeClass
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");

        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testDoubleClickinActions() {
        log.debug("Test 'workshopExample' started");

       // driver.get("https://the-internet.herokuapp.com");

       // driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();

        //driver.findElement(By.xpath("//body//input[2]")).click();

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkboxes")));

        Actions actions = new Actions(driver);

     //   actions
                //.click(driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")))
               // .pause(Duration.ofSeconds(3))
           //     .click(driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")))
             //   .perform();


//        driver.get("https://the-internet.herokuapp.com/key_presses");
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result")));
//
//        actions
//                .sendKeys(Keys.BACK_SPACE)
//                .pause(Duration.ofSeconds(3))
//                .sendKeys(Keys.CONTROL)
//                .pause(Duration.ofSeconds(3))
//                .sendKeys(Keys.ARROW_LEFT)
//                .pause(Duration.ofSeconds(3))
//                .sendKeys(Keys.ESCAPE)
//                .pause(Duration.ofSeconds(3))
//                .perform();


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().accept();  //nebo dismiss - accept je OK, dismiss je krizkem shozeni

        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    @AfterClass
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
