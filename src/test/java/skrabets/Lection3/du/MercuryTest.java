package skrabets.Lection3.du;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MercuryTest {
  private WebDriver wd = new ChromeDriver();
  WebDriverWait wait = new WebDriverWait(wd, 50);

  @Test
  public void testMercuryTours(){
    wd.get("http://newtours.demoaut.com/mercurywelcome.php");
    wd.findElement(By.xpath("//a[text()='REGISTER']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody//tr//td//input[@name='firstName']")));
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='firstName']")).sendKeys("test");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='lastName']")).sendKeys("test");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='phone']")).sendKeys("1111");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='userName']")).sendKeys("userName@test.com");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='address1']")).sendKeys("test");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='address2']")).sendKeys("test");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='city']")).sendKeys("test");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='state']")).sendKeys("test");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='postalCode']")).sendKeys("test");
    new Select(wd.findElement(By.xpath("//table/tbody//tr//td//select[@name='country']"))).selectByVisibleText("BELARUS ");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@id='email']")).sendKeys("test@test.com");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='password']")).sendKeys("1234567890");
    wd.findElement(By.xpath("//table/tbody//tr//td//input[@name='confirmPassword']")).sendKeys("1234567890");


  }
}
