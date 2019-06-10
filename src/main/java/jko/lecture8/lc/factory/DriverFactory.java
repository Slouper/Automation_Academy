package jko.lecture8.lc.factory;

import jko.lecture8.lc.enums.BrowserType;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
                throw new InvalidArgumentException("");
        }
    }
}