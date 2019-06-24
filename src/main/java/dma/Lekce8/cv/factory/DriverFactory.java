package dma.Lekce8.cv.factory;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public WebDriver initDriver (String browserType) {

        switch (browserType) {
            case "CHROME":
                return new ChromeDriver();
            case "IE":
                return new InternetExplorerDriver();
            default:
                throw new InvalidArgumentException("Invalid argument received");
        }
    }
}
