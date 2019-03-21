package MarekMikel.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class SecondHW_register {
    private static final Logger log = LoggerFactory.getLogger(FirstHW.class);
    private ChromeDriver driver;
    WebDriverWait wait;

    @Test
    public void TestRegister() {
        log.debug("Test 'TestMethods' started");
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Contact')]")));

        driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("marek");
        driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Mikel");
        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("111222333");
        driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("marek.mikel@test.cz");
        driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("Taborka 123");
        driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("Nusle");
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Praha");
        driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Cesko");
        driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("14000");

        WebElement element = driver.findElement(By.name("country"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText("TAIWAN");

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("MarekMikel");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("praha");
        driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("praha");

        driver.findElement(By.xpath("//*[@name='register']"));
        Actions actions = new Actions(driver);
        actions
                .sendKeys(Keys.ENTER)
                .perform();

        assertEquals("Dear marek Mikel,", driver.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText());
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


