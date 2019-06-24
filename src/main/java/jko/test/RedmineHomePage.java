package jko.test;

import jko.test.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@name='Features']")
    private WebElement featuresText;

    @FindBy(how = How.XPATH, using = "//*[@href='/login']")
    private WebElement navigateToLoginButton;

    @FindBy(how = How.XPATH, using = "//*[@class='issues']")
    private WebElement tasksTab;

    RedmineHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isOpen() {
        return featuresText.isDisplayed();
    }

    RedmineLoginPage clickOnNavigateToLoginButton() {
        navigateToLoginButton.click();
        return new RedmineLoginPage(getDriver());
    }

    RedmineTasksPage clickOnTasksTab() {
        tasksTab.click();
        return new RedmineTasksPage(getDriver());
    }
}
