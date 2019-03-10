package plu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkLessonFiveV2 {

    private ChromeDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void redMineTest() {

        //webpage url
        driver.get("http://www.redmine.org/");

        Actions actions = new Actions(driver);

       //register button
        actions
                .click(driver.findElement(By.linkText("Register")))
                .perform();

       //registration form
        driver.findElement(By.id("user_login")).sendKeys("userLoginPLU");
        driver.findElement(By.id("user_password")).sendKeys("NeprolomitelnyHeslo1234");
        driver.findElement(By.id("user_password_confirmation")).sendKeys("NeprolomitelnyHeslo1234");
        driver.findElement(By.id("user_firstname")).sendKeys("Automation");
        driver.findElement(By.id("user_lastname")).sendKeys("Tester");
        driver.findElement(By.id("user_mail")).sendKeys("1xxx111@tester.com");
        driver.findElement(By.id("user_language")).sendKeys("Deutsch");
        driver.findElement(By.id("user_custom_field_values_3")).sendKeys("MyRandomNick");

       //submit
        actions
                .click(driver.findElement(By.xpath("//*[@name='commit']")))
                .perform();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        //info message to console
        String infoMessage = driver.findElement(By.id("flash_notice")).getText();
        System.out.println(infoMessage);

        WebDriverWait wait2 = new WebDriverWait(driver, 5);

        //login form
        driver.findElement(By.id("username")).sendKeys("userLoginPLU");
        driver.findElement(By.id("password")).sendKeys("NeprolomitelnyHeslo1234");

        //login
        actions
                .click(driver.findElement(By.xpath("//*[@name='login']")))
                .perform();

        //error message to console
        String errorMessage = driver.findElement(By.id("flash_error")).getText();
        System.out.println(errorMessage);
    }

    @AfterMethod
    private void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}