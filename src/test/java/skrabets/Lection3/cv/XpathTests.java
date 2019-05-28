package skrabets.Lection3.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class XpathTests {
  private WebDriver wd = new ChromeDriver();
  WebDriverWait wait = new WebDriverWait(wd, 50);

  @Test
  public void registerToRedmine(){
    wd.get("https://www.redmine.org/");
    wd.findElement(By.xpath("//a[@href='/account/register']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']")));
    wd.findElement(By.xpath("//input[@id='user_login']")).sendKeys("ABCD");
    wd.findElement(By.xpath("//input[@id='user_password']")).sendKeys("ABCD");
    wd.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("ABCD");
    wd.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("ABCD");
    wd.findElement(By.xpath("//input[@id='user_lastname']")).sendKeys("ABCD");
    wd.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("ABCD");
    new Select(wd.findElement(By.xpath("//select[@id='user_language']"))).selectByVisibleText("English");
    wd.findElement(By.xpath("//input[@type='submit']")).click();
    wd.quit();
  }
}
