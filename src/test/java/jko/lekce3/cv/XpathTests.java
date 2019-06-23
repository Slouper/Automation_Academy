package jko.lekce3.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class XpathTests {

    @Test
    public void registerToRedmine() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://redmine.org");

        WebDriverWait wait = new WebDriverWait(driver, 50);

        driver.findElement(By.xpath("//a[@href='/account/register']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']")));

        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("login");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password2018*");
        driver.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("password2018*");
        driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("tady by mohlo bejt nejaky jmeno");
        driver.findElement(By.xpath("//input[@id='user_lastname']")).sendKeys("tady by mohlo bejt nejaky prijmeni");
        driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("bla@blabla.blublu");
        driver.findElement(By.xpath("//input[@id='user_custom_field_values_3']")).sendKeys("nicka");





    }
}
