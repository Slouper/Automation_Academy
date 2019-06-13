package dma.Lekce6.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class dma_herokuapp_cv {

    private FirefoxDriver driver = new FirefoxDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 15);
    private Actions actions;

    @BeforeClass
    public void beforeTest() {

        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testSeleniumLibraries() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        actions.click(checkbox).pause(3000).click(checkbox).pause(3000).perform();
    }

    //  @Test
    // public void testSeleniumLibraries() {
    //     Actions actions = new Actions(driver);

    //         //checkboxes zakliknout a odkliknout

    //        driver.get("https://the-internet.herokuapp.com");
    //      WebElement checkbox = driver.findElementByXPath("//form[@id='checkboxes']/input[1]");

    //    actions
    //          .click(checkbox)
    //        .pause(3000)
    //      .click(checkbox)
    //    .pause(3000)
    //  .perform();

    //  WebElement editorLink = driver.findElementByXPath("//*[@href='/tinymce']");
    //   actions.pause(2000)
    //             .click(checkbox)
    //               .pause(2000)
    //
    //    @Test

    //           public void sendKeysChord() {
//
//          Actions actions = new Actions(driver);
    //        driver.get("https://the-internet.herokuapp.com/key_presses");
//
    //              actions
    //                    .pause(2000)
    //                  .sendKeys(Keys.ALT)
    //                .pause(1000)
    //              .sendKeys(Keys.ESCAPE)
    //            .perform();
    //    @Test
    //    public void alertTest() {
    //    driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
    //    driver.findElementByXPath("//button[@onclick='jsAlert']").click();
    //        System.out.println(driver.switchTo().getText());


    @Test
    public void testSelectClass() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));

        Select select = new Select(dropdown);

        select.selectByIndex(0);

        actions.pause(2000).perform();

        select.selectByValue("1");

        actions.pause(2000).perform();

        select.selectByVisibleText("Option 2");

        actions.pause(2000).perform();
    }

    public WebDriverWait getWait() {
        return wait;
    }
}