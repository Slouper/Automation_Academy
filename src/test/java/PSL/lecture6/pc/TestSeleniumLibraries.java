package PSL.lecture6.pc;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestSeleniumLibraries {
    private ChromeDriver driver;
    private Actions actions;

    @BeforeTest
    public void beforTest() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @AfterTest
    public void afterTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void actionsClickMoveToElement() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElementByXPath("//form[@id='checkboxes']/input[1]");

        actions
                .pause(3000)
                .click(checkbox)
                .pause(3000)
                .click(checkbox)
                .pause(3000)
                .perform();

        WebElement editorLink = driver.findElementByXPath("//*[@href='/tinymce']");

        actions
                .pause(2000)
                .moveToElement(editorLink)
                .pause(2000)
                .click(editorLink)
                .perform();
    }

    @Test
    public void sendKeysChord() {
        driver.get("https://the-internet.herokuapp.com/key_presses");

        actions
                .pause(2000)
                .sendKeys(Keys.ALT)
                .pause(1000)
                .sendKeys(Keys.ESCAPE)
                .pause(1000)
                .sendKeys(Keys.DELETE)
                .pause(1000)
                .sendKeys(Keys.ARROW_LEFT)
                .pause(2000)
                .sendKeys(Keys.chord(Keys.ARROW_LEFT, Keys.ARROW_RIGHT, "O", "KKKKKK"))
                .pause(2000)
                .perform();
    }

    @Test
    public void alertTest() {

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElementByXPath("//button[@onclick='jsAlert()']").click();

        actions.pause(2000).perform();

        System.out.println(driver.switchTo().alert().getText());

        actions.pause(2000).perform();

        driver.switchTo().alert().accept();

        actions.pause(2000).perform();

        driver.findElementByXPath("//button[@onclick='jsAlert()']").click();

        actions.pause(2000).perform();

        driver.switchTo().alert().dismiss();

        actions.pause(2000).perform();
    }

    @Test
    public void testSelectClass() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElementById("dropdown");

        Select select = new Select(dropDown);

        select.selectByValue("1");

        actions.pause(2000).perform();

        select.selectByIndex(1);

        actions.pause(2000).perform();

        select.selectByIndex(2);

        actions.pause(2000).perform();

        select.selectByVisibleText("Option 2");
    }
}
