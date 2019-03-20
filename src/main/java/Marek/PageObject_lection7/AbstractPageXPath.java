package Marek.PageObject_lection7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public abstract class AbstractPageXPath {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void getChromeDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }


    @AfterMethod
    public void CloseDriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    protected WebDriver getDriver(){
        return driver;
    }
    protected WebDriverWait getWait() {return wait;}
}
