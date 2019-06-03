package dma.Lekce6.du;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class dma_herokuapp_du {

    private WebDriver firefox = new FirefoxDriver();
    private WebDriverWait wait = new WebDriverWait(firefox, 15);
    Actions actions = new Actions(firefox);

    @BeforeTest
    public void beforeTest() {
        firefox.get("https://the-internet.herokuapp.com");
    }

    @AfterTest
    public void afterTest()
            throws InterruptedException {
        Thread.sleep(3000);
        firefox.quit();
    }

    @Test
    public void testDuActions() {
        firefox.get("https://the-internet.herokuapp.com/context_menu");
        actions.contextClick(firefox.findElement(By.xpath("//div[@contextmenu ='menu']"))).perform();


        firefox.get("https://the-internet.herokuapp.com");
        actions.doubleClick(firefox.findElement(By.xpath("//h1[@class='heading']")));

        firefox.get("https://the-internet.herokuapp.com/drag_and_drop");
        actions.dragAndDrop(firefox.findElement(By.xpath("//div[@id='column-a']")),
                firefox.findElement(By.xpath("//div[@id='column-b']"))).perform();
    }
}
