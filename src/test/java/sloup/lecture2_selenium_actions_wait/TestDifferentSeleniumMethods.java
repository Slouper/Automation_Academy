package sloup.lecture2_selenium_actions_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TestDifferentSeleniumMethods {
    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void testDoubleClickInActions() {

        driver.findElement(By.linkText("Checkboxes")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkboxes")));

        Actions actions = new Actions(driver);
        actions
                .click(driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")))
                .pause(Duration.ofSeconds(3))
                .click(driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")))
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

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        sleep(3000);

        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        sleep(5000);

        new Select(driver.findElement(By.id("dropdown")))
                .selectByIndex(1);

        sleep(3000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public void startDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }

}