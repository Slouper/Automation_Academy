package lma.Lukas_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class LukasTest {
    ChromeDriver driver;
    WebDriverWait wait;

    @Test
    public void testDoubleClickInActions() {

 
        driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();


        WebElement element = driver.findElement(By.id(""));
//        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[5]/a")).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkboxes")));

        Actions actions = new Actions(driver);

//        actions
//                .doubleClick(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"))).click()
//                .pause(Duration.ofSeconds(3))
//            //    .doubleClick(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"))).click()
//                .perform();
//
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

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().dismiss();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @BeforeClass
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }

}
