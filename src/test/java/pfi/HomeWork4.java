package pfi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class HomeWork4 {
    private static final Logger log = LoggerFactory.getLogger(HomeWork4.class);
    private ChromeDriver driver;

    @Test
    public void searchTermOnBingPage_WhenBingHomePageIsOpen() {
        log.debug("Test 'searchTermOnBingPage_WhenBingHomePageIsOpen' started");

        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Petr");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Svetr");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("petr@petr.cz");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Nová 1");
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("řádek 2");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Praha");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Praha");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("10000");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("petpet");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER)
                .perform();

        System.out.println(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText());

    }

    @BeforeTest
    private void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
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
