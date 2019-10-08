package MBA.BestPracticeTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import sloup.C_bestpractice_lecture_6.preparation.BasePage;
import sloup.C_bestpractice_lecture_6.preparation.DriverFactory;
import sloup.C_bestpractice_lecture_6.preparation.PageFactory;

public abstract class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        // For one thread application
        // DriverFactory.getDriver().get("https://www.seznam.cz");

        // For more thread application
        DriverFactory.getDriverFromPool().get("https://www.seznam.cz");
    }

    @AfterClass
    public void quitDriver() {
        // For one thread application
        // DriverFactory.getDriver().quit();

        // Wait several seconds to see physically the result of the test
        sleep(3);

        // For more thread application
        DriverFactory.quitAllSilently();
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    protected <T extends BasePage> T createPage(Class<T> pageClass) {
        return PageFactory.createPage(pageClass);
    }

    protected <T extends BasePage> T createPage(T... page) {
        return PageFactory.createPage(page);
    }
}
