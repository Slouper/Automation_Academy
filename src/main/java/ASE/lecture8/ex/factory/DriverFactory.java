package ASE.lecture8.ex.factory;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverFactory {

    public WebDriver initDriver(String browserType) {

        switch (browserType) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            case IE:
                return new InternetExplorerDriver();
            default:
                throw new InvalidArgumentException("Invalid argument received");
        }
//        switch (browserType) {
//            case "CHROME":
//                return new ChromeDriver();
//            case "IE":
//                return new InternetExplorerDriver();
//            default:
//                throw new InvalidArgumentException("Invalid argument received");
//
//        }
    }
}
