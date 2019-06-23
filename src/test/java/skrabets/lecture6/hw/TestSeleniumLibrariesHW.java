package skrabets.lecture6.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TestSeleniumLibrariesHW {

  private WebDriver firefox = new FirefoxDriver();
  private WebDriverWait wait = new WebDriverWait(firefox, 15);
  Actions actions = new Actions(firefox);

  @BeforeClass
  public void beforeTest() {
    firefox.get("https://the-internet.herokuapp.com/");
  }


  @AfterTest
  public void afterTest() throws InterruptedException {
    Thread.sleep(3000);
    firefox.quit();
  }

  @Test(enabled = false)
  public void testSeleniumLibraries() {
    firefox.get("https://the-internet.herokuapp.com/checkboxes");
    WebElement checkbox = firefox.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
    actions.click(checkbox).pause(3000).click(checkbox).pause(3000).perform();
  }

  @Test(enabled = false)
  public void testSelectClass(){

    WebElement dropdown = firefox.findElement(By.id("dropdown"));

    Select select = new Select(dropdown);

    select.selectByIndex(0);

    actions.pause(2000).perform();

    select.selectByValue("1");

    actions.pause(2000).perform();

    select.selectByVisibleText("Option 2");

    actions.pause(2000).perform();
  }

  public void testActionMethods(){
    firefox.get("https://the-internet.herokuapp.com/context_menu");
    //actions.contextClick().perform();
    actions.contextClick(firefox.findElement(By.xpath("//div[@id='hot-spot']"))).perform();
    firefox.get("https://the-internet.herokuapp.com/drag_and_drop");
    actions.doubleClick(firefox.findElement(By.xpath("//h3"))).perform();
    actions.dragAndDrop(firefox.findElement(By.xpath("//div[@class='column'][@id='column-a']")),
            firefox.findElement(By.xpath("//div[@class='column'][@id='column-b']"))).perform();
    actions.moveByOffset(firefox.findElement(By.xpath("//div[@class='column'][@id='column-a']")).getLocation().x+1,
            firefox.findElement(By.xpath("//div[@class='column'][@id='column-a']")).getLocation().y+2).perform();
  }

}
