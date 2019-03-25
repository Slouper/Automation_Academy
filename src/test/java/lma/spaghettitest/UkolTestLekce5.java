package lma.spaghettitest;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Test
public class UkolTestLekce5 {
    public ChromeDriver driver;
    private static final Logger log = LoggerFactory.getLogger(UkolTestLekce5.class);


    @BeforeMethod
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void UkolLekce5() {
        Actions action = new Actions(driver);

        Random rand = new Random();
        int n = rand.nextInt(1000);

        log.debug("Test 'UkolTestLekce5' started");

        driver.get("http://www.redmine.org/");

        driver.findElement(By.className("register")).click();

        log.debug("Register started....");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/h2")));

        driver.findElement(By.id("user_login")).sendKeys("Java" + n);
        driver.findElement(By.id("user_password")).sendKeys("Heslo123");
        driver.findElement(By.id("user_password_confirmation")).sendKeys("Heslo123");
        driver.findElement(By.id("user_firstname")).sendKeys("Krestni");
        driver.findElement(By.id("user_lastname")).sendKeys("Prijmeni");
        driver.findElement(By.id("user_mail")).sendKeys(n + "@fff.cz");
        driver.findElement(By.id("user_language")).click();
        driver.findElement(By.xpath("//*[@id=\"user_language\"]/option[13]")).click();
        driver.findElement(By.id("user_custom_field_values_3")).sendKeys("123456");

        action
                .sendKeys(Keys.ENTER)
                .perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flash_notice\"]")));

        log.debug("Login started....");

        driver.findElement(By.id("username")).sendKeys("Java" + n);
        driver.findElement(By.id("password")).sendKeys("Heslo123");

        action
                .sendKeys(Keys.ENTER)
                .perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flash_error\"]")));

        log.debug("You haven't activated your account yet. If you want to receive a new activation email, please click this link.");
    }


    @AfterMethod
    public void endDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}