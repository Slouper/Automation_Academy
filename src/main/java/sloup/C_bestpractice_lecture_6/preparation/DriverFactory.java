package sloup.C_bestpractice_lecture_6.preparation;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {
    private static final Logger log = LoggerFactory.getLogger(DriverFactory.class);

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static final HashMap<Object, WebDriver> driverPool = new HashMap<>();

    private DriverFactory() {
        // Singleton
    }

    /**
     * Use for one thread application - only one driver exist in application
     *
     * @return WebDriver
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        } else {
            return driver;
        }
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(getDriverFromPool(), 15);
        }
        return wait;
    }

    /**
     * Use for more thread application - for each thread is created new driver
     *
     * @return WebDriver
     */
    public static WebDriver getDriverFromPool() {
        return provideDriverByThread(Thread.currentThread());
    }

    private static synchronized WebDriver provideDriverByThread(Object threadKey) {
        if (driverPool.containsKey(threadKey)) {
            return driverPool.get(threadKey);
        } else {
            WebDriver driver = new ChromeDriver();
            driverPool.put(threadKey, driver);
            return driver;
        }
    }

    public static synchronized void quitAllSilently() {
        log.info("Quit all [{}] drivers silently.", driverPool.size());
        driverPool.forEach((threadKey, driver) -> quitSilently(driver));
    }

    private static void quitSilently(WebDriver driver) {
        try {
            driver.quit();
        } catch (Exception e) {
            log.error("Unexpected exception on driver quit.", e);
        }
    }

}
