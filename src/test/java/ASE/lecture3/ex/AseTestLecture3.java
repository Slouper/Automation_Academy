package ASE.lecture3.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AseTestLecture3 {
    private WebDriverWait wait;


    @Test
    public void registerToRedmine(){
        System.setProperty("webdriver.chrome.driver", "c:\\Users\\alina.sedymova\\IdeaProjects\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 50);

        driver.get("http://www.redmine.org");
        driver.findElement(By.xpath("//a[@href='/account/register']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']")));
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("ABCD");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("AbC*2");
        driver.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("potvrzuji");
        driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("Sasha");
        driver.findElement(By.xpath("//input[@id='user_lastname']")).sendKeys("Pushkin");
        driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("AbC@gmail.com");
        driver.findElement(By.xpath("//input[@id='user_custom_field_values_3']")).sendKeys("AbCd");

        driver.quit();

    }

}
