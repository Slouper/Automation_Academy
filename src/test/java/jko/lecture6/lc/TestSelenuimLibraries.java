package jko.lecture6.lc;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class TestSelenuimLibraries {

    private ChromeDriver driver;
    private Actions actions;

    @BeforeTest
    public void beforeTest() {

        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @AfterTest
    public void AfterTest() {

        sleep();

        driver.quit();

    }

    @Test
    public void testSeleniumLibraries() {

        Actions actions = new Actions(driver);

        // driver.get("https://the-internet.herokuapp.com/checkboxes");

        //  WebElement checkbox = driver.findElementByXPath("//form[@id='checkboxes']/input[1]");


//        actions
//                .pause(3000)
//                .click(checkbox)
//                .pause(3000)
//                .click(checkbox)
//                .pause(3000)
//                .perform();


        WebElement checkbox2 = driver.findElementByXPath("//*[@href='/tinymce']");

        actions.pause(2000)
                .moveToElement(checkbox2)
                .perform();

    }

    @Test
    public void TestSendKeys() {


        driver.get("https://the-internet.herokuapp.com/key_presses");

        actions.pause(2000)
                .sendKeys(Keys.ALT)
                .pause(2000)
                .sendKeys(Keys.ENTER)
                .pause(2000)
                .sendKeys(Keys.CONTROL)
                .pause(2000)
                .perform();
    }

    @Test
    public void alertTesr() {

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElementByXPath("//button[@onclick='jsAlert()']").click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

    }

    @Test
    public void selectTest() {

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElementById("dropdown");

        Select selectedDropdown = new Select(dropdown);

        selectedDropdown.selectByValue("1");
        actions.pause(2000);
        selectedDropdown.selectByValue("2");
        actions.pause(2000);
        selectedDropdown.selectByValue("1");
        actions.pause(2000);
        selectedDropdown.selectByValue("2");
        actions.pause(2000);

    }

    @Test
    public void testRobotLibrary() {

        Robot robot = null;

        Dimension windowSize = driver.manage().window().getSize();

        robot = getRobot(robot);

        robot.mouseMove(windowSize.height /2, windowSize.width / 2);

        sleep();

        robot.mouseMove(50, 50);

        sleep();

    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Robot getRobot(Robot robot) {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return robot;
    }
}
