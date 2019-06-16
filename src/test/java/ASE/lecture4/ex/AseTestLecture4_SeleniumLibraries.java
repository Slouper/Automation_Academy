package ASE.lecture4.ex;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class AseTestLecture4_SeleniumLibraries {

    private ChromeDriver driver;
    //    private FirefoxDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alina.sedymova\\IdeaProjects\\Drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/");
        wait = new WebDriverWait(driver, 15);
        actions = new Actions(driver);
    }

    @AfterTest
    public void afterTest() {
//        exception handling (bad practise)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void testSeleniumLibraries() {
        //        driver.get("http://the-internet.herokuapp.com/checkboxes");
//        WebElement checkbox = driver.findElementByXPath("//form[@id='checkboxes']/input[1]");
//
//        //CHECKBOXES
//        actions
//                .pause(3000)
//                .click(checkbox)
//                .pause(3000)
//                .click(checkbox)
//                .pause(3000)
//                .perform();

        //skrolovani
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
        driver.get("http://the-internet.herokuapp.com/key_presses");

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
                .sendKeys(Keys.chord(Keys.ARROW_LEFT, Keys.ARROW_RIGHT, "0", "ddddd"))
                .pause(2000)
                .perform();
    }

    @Test
    public void alertTest() {

        driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElementByXPath("//button[@onclick='jsAlert()']").click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

    @Test
    public void selectClassTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
//        driver.navigate().to("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElementById("dropdown");

//        instance, kterou jiz nepripouziju:
//        new Select(dropDown).selectByValue("1");
//        Jinak vytvaret pres tuto new konstrukci:
        Select select = new Select(dropDown);

        actions.pause(2000).perform();
        select.selectByValue("1");
        actions.pause(2000).perform();
        select.selectByValue("2");
        actions.pause(2000).perform();
        select.selectByVisibleText("Option 1");
        actions.pause(2000).perform();

//        new Mouse().mouseMove();



    }

    @Test
    //pry nespolehliva metoda Robot

    public void testRobotLibrary() {
        Robot robot = null;

        Dimension windowSize = driver.manage().window().getSize();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.mouseMove(windowSize.height / 2, windowSize.width / 2);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        robot.mouseMove(50,50);



    }

}