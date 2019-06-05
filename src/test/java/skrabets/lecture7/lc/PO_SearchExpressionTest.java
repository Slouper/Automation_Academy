package skrabets.lecture7.lc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PO_SearchExpressionTest {

  private ChromeDriver chrome;

  @BeforeClass
  public void beforeTest() {
    chrome = new ChromeDriver();
    chrome.get("https://www.seznam.cz/");
    chrome.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    chrome.manage().window().fullscreen();
  }


  @Test
  public void shouldBeExpressionFound() {
    Assert.assertEquals(new SeznamHomePage(chrome)
            .enterSearchExpression("Selenium Webdriver")
            .clickOnSearchButton()
            .clickOnFirstResultLink()
            .getArticleValue(), "What is Selenium?");
  }


  @AfterTest
  public void afterTest() {
    chrome.quit();
  }
}
