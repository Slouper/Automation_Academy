package PMA.homework.patahodina;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PataHodina {
    private static final Logger log = LoggerFactory.getLogger(PataHodina.class);

    private ChromeDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startChromeDriverOpenWebPage() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        log.debug("WebDriver started ....");
        wait = new WebDriverWait(driver, 10);
        driver.get("http://www.redmine.org/");
    }


    @Test
    public void registration() {

        int n = (int) (Math.random() * 50000);
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
        actions
                .sendKeys(driver.findElement(By.id("user_login")), "BobPrvni" + n)
                .sendKeys(driver.findElement(By.id("user_password")), "123123")
                .sendKeys(driver.findElement(By.id("user_password_confirmation")), "123123")
                .sendKeys(driver.findElement(By.id("user_firstname")), "Bob")
                .sendKeys(driver.findElement(By.id("user_lastname")), "Bobek")
                .sendKeys(driver.findElement(By.id("user_mail")), "kralici" + n + "@zklobouku.cz")
                .sendKeys(driver.findElement(By.id("user_custom_field_values_3")), "Bob")

                .pause(Duration.ofSeconds(1))
                .click(driver.findElement(By.name("commit")))

                .perform();


        actions
                .sendKeys(driver.findElement(By.id("username")), "BobPrvni" + n)
                .sendKeys(driver.findElement(By.id("password")), "123123")
                .pause(Duration.ofSeconds(1))
                .click(driver.findElement(By.name("login")))


                .perform();

        log.debug("objevilo se upozornění:" + driver.findElement(By.id("flash_error")).getText());

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
