package Marek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestSelectClass {
    private static final Logger log = LoggerFactory.getLogger(TestSelectClass.class);
    private ChromeDriver driver;
    WebDriverWait wait;


    @Test
    public void testSelectClass() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dropdown")));

        List<WebElement> listOptions = new Select(driver.findElement(By.id("dropdown"))).getOptions();
        System.out.println(listOptions.size());
    }

    @BeforeClass
    public void getChromeDriver() {
        //System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

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


