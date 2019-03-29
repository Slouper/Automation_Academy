package MBA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class RedmineHW5 {

    WebDriver driver;

    @Test
    public void Registration() {
        final Logger log = LoggerFactory.getLogger(RedmineHW5.class);

        driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("TvojeMama");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id=\"user_password_confirmation\"]")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id=\"user_firstname\"]")).sendKeys("Tvoje");
        driver.findElement(By.xpath("//*[@id=\"user_lastname\"]")).sendKeys("Mama");
        driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("tvojemama@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("TvojeMama");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd1234");
        Actions actions = new Actions(driver);
        actions
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.RETURN)
                .pause(Duration.ofSeconds(3))
                .perform();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"flash_error\"]")).getText());
    }

    @BeforeClass
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.redmine.org/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }
}







