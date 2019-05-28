package dma.Lekce3.du;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dma_Lekce3_du {

    @Test
    public void mercuryTours () {
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercuryregister.php");

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='REGISTER']")));

        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Dominik");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Málek");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+420603666777");
        driver.findElement(By.xpath("//input[@name='userName'][@id='userName']")).sendKeys("dominik.malek@gmail.com");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Koryta");
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("21");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Kostelec nad Orlicí");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Hradec Králové");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("517 41");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DominikMalek");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Heslo123");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Heslo123");

        //driver.quit();
    }

}
