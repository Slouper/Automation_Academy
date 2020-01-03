package ASE.ase_test.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    public ChromeDriver getDriver() {
        return driver;
    }

    private ChromeDriver driver;
    private Actions actions;
    private WebDriverWait wait;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("http://www.redmine.org");
        wait = new WebDriverWait(driver, 50);
        actions = new Actions(driver);
    }

    protected WebElement waitForElementIsVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    @AfterTest
    public void afterTest() {
        mySleep(3);
        driver.quit();
    }

    private void mySleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
