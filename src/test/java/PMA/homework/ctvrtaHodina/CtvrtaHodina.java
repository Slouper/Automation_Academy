package PMA.homework.ctvrtaHodina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sloupfirstlecture.basictestnostructure.SpaghettiTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CtvrtaHodina {
    private static final Logger log = LoggerFactory.getLogger(SpaghettiTest.class);

    private ChromeDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startChromeDriverOpenWebPage() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        log.debug("WebDriver started ....");
        wait = new WebDriverWait(driver, 10);
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }


    @Test
    public void regtration() {
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
        actions
                .sendKeys(driver.findElement(By.name("firstName")), "Bob")
                .sendKeys(Keys.TAB)
                .sendKeys("Bobek")
                .sendKeys(Keys.TAB)
                .sendKeys("123 123 123")
                .sendKeys(Keys.TAB)
                .sendKeys("kralici@klobouk.cz")
                .sendKeys(driver.findElement(By.name("address1")), "Klobouk")
                .sendKeys(Keys.TAB)
                .sendKeys("Cestovní 578")
                .sendKeys(Keys.TAB)
                .sendKeys("Nowhere")
                .sendKeys(Keys.TAB)
                .sendKeys("CZ")
                .sendKeys(Keys.TAB)
                .sendKeys("123 15")
                .sendKeys(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")), "CZECh REPUBLIC")
                .sendKeys(Keys.ENTER)
                .sendKeys(driver.findElement(By.id("email")), "kralici@klobouk.cz")
                .sendKeys(driver.findElement(By.name("password")), "vstávat")
                .sendKeys(driver.findElement(By.name("confirmPassword")), "vstávat")
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ENTER)

                .perform();

    }

    @AfterMethod
    public void afterTest() {
        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
