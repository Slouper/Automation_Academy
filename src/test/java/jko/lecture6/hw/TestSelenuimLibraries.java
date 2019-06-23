package jko.lecture6.hw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

    @Test
    public void contextClick() {
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement contextArea = driver.findElementById("hot-spot");

        Assert.assertTrue(contextArea.isDisplayed());

        actions.contextClick(contextArea).perform();

    }

    @Test
    public void doubleClick() {
        driver.get("https://codepen.io/juliogcampos/pen/BzdjwY");

        WebElement clickMe = driver.findElementByXPath("//*[@id='clickme']");

        Assert.assertTrue(clickMe.isDisplayed());

        actions.doubleClick(clickMe).perform();
    }

    @Test
    public void dragAndDrop() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement source = driver.findElementById("column-a");

        WebElement target = driver.findElementById("column-b");

        actions.dragAndDrop(source, target).build().perform();
    }
}
