package ASE.lecture8.ex;

import ASE.lecture8.ex.base.AseAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeznamHomePage extends AseAbstractPage{

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement searchButton;

    @Override
    protected boolean isOpen() {
        return searchButton.isDisplayed();
    }

    public SeznamHomePage(WebDriver driver) {
        super(driver);
    }

    public NewResultPage clickOnSearchButton(){
        searchButton.click();
        return  new NewResultPage(getDriver());
    }

    public SeznamHomePage enterSearchExpression(String searchedExpression){
        searchInputField.sendKeys(searchedExpression);
        return this;
    }

}
