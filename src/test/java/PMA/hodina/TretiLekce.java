package PMA.hodina;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TretiLekce {
    private static final Logger log = LoggerFactory.getLogger(TretiLekce.class);

    private ChromeDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startChromeDriverOpenWebPage() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        log.debug("WebDriver started ....");
        wait = new WebDriverWait(driver, 10);
        driver.get("https://the-internet.herokuapp.com/");
    }


    @Test
    public void openHerokuappWeb() {
        Actions actions = new Actions(driver);
  /*      driver.findElement(By.linkText("Checkboxes")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkboxes")));

        actions
                .doubleClick(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")))
                .click()
                .perform();*/

/*
        driver.get("https://the-internet.herokuapp.com/key_presses");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result")));

    actions
            .sendKeys(Keys.BACK_SPACE)
            .pause(Duration.ofSeconds(1))
            .sendKeys(Keys.CONTROL)
            .pause(Duration.ofSeconds(1))
            .sendKeys(Keys.LEFT)
            .pause(Duration.ofSeconds(1))
            .sendKeys(Keys.NUMPAD9)
            .perform();
*/


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().dismiss();




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
