package mdma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.net.ssl.KeyStoreBuilderParameters;
import java.time.Duration;

@Test
public class CtvrtaHodina {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void testDoubleClickInActions() {

        driver.findElement(By.linkText("Checkboxes")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkboxes")));

        Actions actions = new Actions(driver);

        actions
                .doubleClick(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]")))
                .perform();

        driver.get("https://the-internet.herokuapp.com/key_presses");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result")));

        actions
                .sendKeys(Keys.BACK_SPACE)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.CONTROL)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ARROW_LEFT)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ESCAPE)
                .pause(Duration.ofSeconds(3))
                .perform();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();



    }

    @BeforeClass
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }

}
