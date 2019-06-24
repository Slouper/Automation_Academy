package jko.test;

import jko.test.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RedmineTasksPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@class='icon icon-save']")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//*[@id='operators_status_id']")
    private WebElement statusDropdown;

    @FindBy(how = How.XPATH, using = "//*[@class='icon icon-checked']")
    private WebElement applyFilterButton;

    @FindBy(how = How.XPATH, using = "//*[@id='issue-31567']/td[4]")
    private WebElement statusOfFifthTask;

    RedmineTasksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isOpen() {
        return saveButton.isDisplayed();
    }

    RedmineTasksPage setStatusDropdownToClosed() {
        new Select(statusDropdown).selectByValue("c");
        return this;
    }

    RedmineTasksPage applyFilter() {
        applyFilterButton.click();
        return this;
    }

    RedmineTasksPage waitForTwoSeconds() {
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return this;
    }

    String getStatusOfFifthTask() {
        return statusOfFifthTask.getText();
    }
}
