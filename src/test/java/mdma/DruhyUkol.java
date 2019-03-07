package mdma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DruhyUkol {

    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void testRegistrace() {


        Actions actions = new Actions(driver);


        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Monika");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Datlova");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("777777777");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("monika@seznam.cz");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Nevim 1359");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Praha");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Nevim");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("blabla");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("blabla");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("blabla");


        actions
                .sendKeys(Keys.ENTER)
                .perform();

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
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    private void afterTest() {
        try {
            //log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

}

