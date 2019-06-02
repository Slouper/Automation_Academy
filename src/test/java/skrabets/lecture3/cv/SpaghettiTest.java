package skrabets.lecture3.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class SpaghettiTest {

  private WebDriver wd = new FirefoxDriver();
  private WebDriverWait wait = new WebDriverWait(wd, 15);

  @BeforeTest
  public void beforeTest()
  {
    wd.get("https://www.seznam.cz/");
  }


  @AfterTest
  public void afterTest() throws InterruptedException {
    Thread.sleep(3000);
    wd.quit();
  }

  @Test
  public void bingSearch() {
    WebElement searchInput = wd.findElement(By.xpath("//input[@name=\"q\"]"));
    searchInput.sendKeys("Selenium");
    searchInput.submit();
    WebElement searchButtonGlass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Page-header\"]/div/div[4]/form/div[3]/button")));
    System.out.println(searchButtonGlass.getAttribute("title"));


  }

}
