package skrabets.lecture6.lc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TestSeleniumLibraries {

  private WebDriver wd = new ChromeDriver();
  private WebDriverWait wait = new WebDriverWait(wd, 15);
  Actions actions = new Actions(wd);

  @BeforeClass
  public void beforeTest() {

    wd.get("https://the-internet.herokuapp.com/");
  }


  @AfterTest
  public void afterTest() throws InterruptedException {
    Thread.sleep(3000);
    wd.quit();
  }

  @Test(enabled = false)
  public void testSeleniumLibraries() {
    wd.get("https://the-internet.herokuapp.com/checkboxes");
    WebElement checkbox = wd.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
    actions.click(checkbox).pause(3000).click(checkbox).pause(3000).perform();
  }

  @Test
  public void testSelectClass(){
    wd.get("https://the-internet.herokuapp.com/dropdown");

    WebElement dropdown = wd.findElement(By.id("dropdown"));

    Select select = new Select(dropdown);

    select.selectByIndex(0);

    actions.pause(2000).perform();

    select.selectByValue("1");

    actions.pause(2000).perform();

    select.selectByVisibleText("Option 2");

    actions.pause(2000).perform();
  }

}
