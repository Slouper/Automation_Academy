package ASE.ase_test.pageObjects;

import ASE.ase_test.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginLink;

    @Override
    protected boolean isOpen() {
        return loginLink.isDisplayed();
    }

    public RedmineHomePage(WebDriver driver) {
        super(driver);
    }

    public RedmineLoginPage clickOnLoginLink() {
        loginLink.click();
        return new RedmineLoginPage(getDriver());
    }
}
