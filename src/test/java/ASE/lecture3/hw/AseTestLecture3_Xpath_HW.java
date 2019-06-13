package ASE.lecture3.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AseTestLecture3_Xpath_HW {
    private ChromeDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        wait = new WebDriverWait(driver, 50);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void registerToTravelAgency() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
        driver.findElementByName("firstName").sendKeys("Sasha");
        driver.findElementByName("lastName").sendKeys("Pushkin");
        driver.findElementByName("phone").sendKeys("777888999");
        driver.findElementById("userName").sendKeys("chuva@sro.ru");
        driver.findElementByXPath("//input[@name='address1']").sendKeys("Pushkinskaya str. 1 ");
        driver.findElementByName("city").sendKeys("Pushkinskiye Gory");
        driver.findElementByName("state").sendKeys("Pskov region, Russia");
        driver.findElementByName("postalCode").sendKeys("181370");

        //zajimalo me jak funguje rozbalovatko, tak jsem si pohrala i s vyberem zemi
        driver.findElementByName("country").sendKeys("RUSSIA");
        driver.findElementById("email").sendKeys("EvženOněgin");
        driver.findElementByName("password").sendKeys("Evžen*Onegin");
        driver.findElementByName("confirmPassword").sendKeys("Evžen*Onegin");
    }

}
