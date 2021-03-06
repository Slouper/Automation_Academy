package PSL.lecture8.lc.factory;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PSL.lecture8.lc.enums.BrowserType;

public class DriverFactory {

    public WebDriver initDriver(BrowserType browserType) {
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
    }

}
