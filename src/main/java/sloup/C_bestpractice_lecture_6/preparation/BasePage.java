package sloup.C_bestpractice_lecture_6.preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        driver = DriverFactory.getDriverFromPool();
        wait = DriverFactory.getWait();
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
        waitForPageLoaded();
        checkPageIsOpen();
    }

    public abstract void checkPageIsOpen();

    protected void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = expectedConditions -> ((JavascriptExecutor) this.driver).executeScript("return document.readyState").toString()
                .equals("complete");
        try {
            wait.until(expectation);
        } catch (TimeoutException e) {
            throw new TimeoutException("Page is not loaded", e);
        }
    }

    /**
     * Methods check presence of element itself (substitution for method presenceOf(WebElement element))
     *
     */
    protected void isElementPresent(WebElement element) {
        getWait().until(expectedConditions -> !element.findElements(By.xpath("//self::*")).isEmpty());
    }

    protected void isElementDisplayed(WebElement element) {
        try {
            getWait().until(expectedConditions -> element.isDisplayed());
        } catch (TimeoutException e) {
            throw new TimeoutException("Element", e);
        }
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait() {
        return wait;
    }

    public <T extends BasePage> T createPage(Class<T> pageClass) {
        return PageFactory.createPage(pageClass);
    }

    protected <T extends BasePage> T createPage(T... page) {
        return PageFactory.createPage(page);
    }
}
