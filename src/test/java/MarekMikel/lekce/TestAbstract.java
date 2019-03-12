package MarekMikel.lekce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public abstract class TestAbstract {

    private WebDriver driver;

    @BeforeClass
    public void getChromeDriver() {
        driver = new ChromeDriver();
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
}
