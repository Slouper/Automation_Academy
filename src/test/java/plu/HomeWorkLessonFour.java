package plu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkLessonFour {

    private ChromeDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


    @Test
    public void newToursRegistration() {

        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        Actions actions = new Actions(driver);

        actions
                .click(driver.findElement(By.linkText("REGISTER")))
                .perform();

       //contact information
        driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Testerský");
        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("774124574");
        driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("automationTester");

        //mailing information
        driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("5 Kuriaka");
        driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("Fezeki");
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Tirana");
        driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Albania");
        driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("445786");
        driver.findElement(By.xpath("//*[@name='country']")).sendKeys("ALBANIA");

        //user information

        driver.findElement(By.id("email")).sendKeys("autotest@autotest.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("12345");

       //submit
        actions
                .click(driver.findElement(By.xpath("//*[@name='register']")))
                .sendKeys(Keys.ENTER)
                .perform();


        WebDriverWait wait = new WebDriverWait(driver, 5);

        //URL assertion after successful registration

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://newtours.demoaut.com/create_account_success.php" );

    }

    @AfterTest
    private void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
