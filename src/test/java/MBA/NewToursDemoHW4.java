package MBA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class NewToursDemoHW4 {
    WebDriver driver;

    @Test
    public void testClickInActions() {

        driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Tvoje Máma");
        Actions actions = new Actions(driver);
        actions
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.RETURN)
                .pause(Duration.ofSeconds(3))
                .perform();
    }

    @BeforeClass
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }
}
