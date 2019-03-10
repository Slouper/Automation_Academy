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
public class DomaciUkolRedmine {

    WebDriver driver;

    @Test
    public void registerToRedmine() {

        Actions actions = new Actions(driver);

        driver.findElement(By.xpath("//a[@href='/account/register']")).click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Batman641639");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("Bruce");
        driver.findElement(By.xpath("//input[@id='user_lastname']")).sendKeys("Wayne");
        driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("bat641639@man.com");
        driver.findElement(By.xpath("//input[@id='user_custom_field_values_3']")).sendKeys("Blabla");

        actions
                .sendKeys(Keys.ENTER)
                .perform();


        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Batman641639");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");

        actions
                .sendKeys(Keys.ENTER)
                .perform();


        String warning = driver.findElement(By.xpath("//div[@id='flash_error']")).getText();
        System.out.println(warning);


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
        driver.get("http://www.redmine.org/");
        driver.manage().window().maximize();

    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }


}
