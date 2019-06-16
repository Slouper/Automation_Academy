package ASE.lecture7.hw.pageObjects;

import ASE.lecture7.hw.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewtoursHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[text()='REGISTER']")
    private WebElement registerLink;

    @Override
    protected boolean isOpen() {
        return registerLink.isDisplayed();
    }

    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }

    public NewtoursRegisterPage clickOnRegisterLink() {
        registerLink.click();
        return new NewtoursRegisterPage(getDriver());
    }
}
