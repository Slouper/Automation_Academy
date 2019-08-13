//package dma.Lekce10.cv;
//
//import dma.Lekce8.cv.base.AbstractPage8;
//import dma.Lekce8.cv.factory.DriverFactory;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//@Test
//public class AbstractTest {
//    private WebDriver driver;
//
//    @BeforeTest
//        public void beforeTest() {
//            driver = new DriverFactory().initDriver("ChromeDriver");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//            driver.get("https://seznam.cz/");
//        }
//
//
//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
//}
