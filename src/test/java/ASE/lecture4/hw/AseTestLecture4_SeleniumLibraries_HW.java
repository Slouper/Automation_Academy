package ASE.lecture4.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AseTestLecture4_SeleniumLibraries_HW {
    //    private ChromeDriver driver;
    private FirefoxDriver driver;
    private WebDriverWait wait;
    private Actions actions;


    @BeforeTest
    public void beforeTest() {
//        driver = new ChromeDriver();

        //Context Menu functionality on the https://the-internet.herokuapp.com/context_menu currently only works on Firefox, so I'm using Firefox
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alina.sedymova\\IdeaProjects\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        wait = new WebDriverWait(driver, 50);
        actions = new Actions(driver);

    }

    @AfterTest
    public void afterTest() {

        //Thread.sleep just for user to notice the event
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();


    }

    @Test
    public void testContextClick() {
//      Right-click the mouse at the last known mouse coordinates
        driver.get("https://the-internet.herokuapp.com");
        actions.contextClick().perform();
        System.out.println("Right-click");
    }

    @Test
    public void testContextClickWebElement() {
//      Right-click the mouse on the specified element
        driver.get("https://the-internet.herokuapp.com/context_menu");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='hot-spot']")));
        WebElement element = driver.findElement(By.id("hot-spot"));
        actions.contextClick(element).perform();
    }

    @Test
    public void testdragNdrop() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//        actions.dragAndDrop(driver.findElementById("column-a"),driver.findElement(By.id("column-b"))).build().perform();
//        OR:

        //Element which needs to drag
        WebElement From = driver.findElement(By.id("column-a"));
        //Drag and Drop by Pixel
        actions.dragAndDropBy(From, 150, 150).build().perform();
    }

    @Test
    public void testDoubleClick() {
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        WebElement element = driver.findElementByXPath("//a[contains(text(),'click here')]");
        actions
                .doubleClick(element)
                .pause(3000)
                .doubleClick()
                .perform();
    }

    @Test
    public void testMoveByOffset() {
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        WebElement elementLink = driver.findElementByXPath("//a[contains(text(),'Elemental Selenium')]");
        actions.moveByOffset(elementLink.getLocation().x, elementLink.getLocation().y).click(elementLink).pause(2000).build().perform();
    }


//    //        Mouse
//    WebElement box = driver.findElementById("hot-spot");
//    Coordinates c = ((RemoteWebElement)box).getCoordinates();
//        driver.getMouse().mouseMove (c);

}

