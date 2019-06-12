package PSL.lecture10.lc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import PSL.lecture10.lc.base.AbstractPage;

public class HboHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='cssmenu']//a[@href='/schedule']")
    private WebElement scheduleButton;

    @Override
    protected boolean isOpen() {
        return scheduleButton.isDisplayed();
    }

    public HboHomePage(WebDriver driver) {
        super(driver);
    }

    public HboSchedulePage clickOnScheduleButton() {
        scheduleButton.click();
        return new HboSchedulePage(getDriver());
    }
}
