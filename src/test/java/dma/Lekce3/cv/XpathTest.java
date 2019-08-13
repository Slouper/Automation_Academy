package dma.Lekce3.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class XpathTest {

    @Test
    public void registerToRedmine () {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.redmine.org");

        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.findElement(By.xpath("//a[@href='/account/register']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id= 'user_login']")));

        driver.findElement(By.xpath("//input[@id= 'user_login']")).sendKeys("DominikMalek");
        driver.findElement(By.xpath("//input[@id= 'user_password']")).sendKeys("Heslo");
        driver.findElement(By.xpath("//input[@id= 'user_password_confirmation']")).sendKeys("Heslo");
        driver.findElement(By.xpath("//input[@id= 'user_firstname']")).sendKeys("Dominik");
        driver.findElement(By.xpath("//input[@id= 'user_lastname']")).sendKeys("Málek");
        driver.findElement(By.xpath("//input[@id= 'user_mail']")).sendKeys("93dominik.jamall@gmail.com");
        driver.findElement(By.xpath("//select[@id= 'user_language']//option[@value = 'en']")).click();
        driver.findElement(By.xpath("//input[@id= 'user_custom_field_values_3']")).sendKeys("93dominik");
    }
}
