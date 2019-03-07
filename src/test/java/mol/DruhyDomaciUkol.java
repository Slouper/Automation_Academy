package mol;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class DruhyDomaciUkol {

    WebDriver driver;

    @Test
    public void registerUser() {

        Actions actions = new Actions(driver);

        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Matt");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Murdock");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("daredevil@marvel.com");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("363 South 4th Street");
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("364 South 5th Street");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("NYC");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("USA");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("10000");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Daredevil");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Daredevil123");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Daredevil123");

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
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }


}
