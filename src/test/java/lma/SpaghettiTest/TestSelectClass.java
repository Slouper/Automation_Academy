package lma.SpaghettiTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Test
public class TestSelectClass {
    public ChromeDriver driver;
    private static final Logger log = LoggerFactory.getLogger(TestSelectClass.class);


    @BeforeMethod
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void TestSelectClass() {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        log.debug("Test started");

        driver.get("https://the-internet.herokuapp.com/dropdown");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown")));

        List<WebElement> optionsList = new Select(driver.findElement(By.id("dropdown"))).getOptions();

        System.out.println(optionsList.size());



        log.debug("Test Ended");
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