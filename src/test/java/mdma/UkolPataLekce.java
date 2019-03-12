package mdma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class UkolPataLekce {

    WebDriver driver;
    WebDriverWait wait;

    public String getElementText(By locator) {
        WebElement locatorElement = driver.findElement(locator);
        return locatorElement.getText();
    }


    @Test
    public void testRegistrace() {


        Actions actions = new Actions(driver);


        driver.get("http://www.redmine.org/login");

        driver.findElement(By.className("register")).click();



        Random rand = new Random();

// Obtain a number between [0 - 49].
        int n = rand.nextInt(50);


        driver.findElement(By.xpath("//input[@name='user[login]']")).sendKeys("Kapitan" + n);
        driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("Kapitan");
        driver.findElement(By.xpath("//input[@name='user[password_confirmation]']")).sendKeys("Kapitan");
        driver.findElement(By.xpath("//input[@name='user[firstname]']")).sendKeys("Jean-Luc");
        driver.findElement(By.xpath("//input[@name='user[lastname]']")).sendKeys("Picard");
        driver.findElement(By.xpath("//input[@name='user[mail]']")).sendKeys("KapitanLodi" + n + "@enterprise.cz");


        actions
                .sendKeys(Keys.ENTER)
                .perform();

        //WebDriverWait wait = new WebDriverWait(driver, 5);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.Result-title-link")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kapitan" + n);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kapitan");

        actions
                .sendKeys(Keys.ENTER)
                .perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash_error")));



        System.out.println(getElementText(By.id("flash_error")));



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
    }

    @AfterTest
    private void afterTest() {
        try {
            //log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        driver.quit();
    }
}
