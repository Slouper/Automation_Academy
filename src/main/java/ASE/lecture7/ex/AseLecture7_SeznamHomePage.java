package ASE.lecture7.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AseLecture7_SeznamHomePage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement searchButton;

    public AseLecture7_SeznamHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public AseLecture7_NewResultPage clickOnSearchButton(){
        searchButton.click();
        return  new AseLecture7_NewResultPage(driver);
    }

    public AseLecture7_SeznamHomePage enterSearchExpression(String searchedExpression){
        searchInputField.sendKeys(searchedExpression);
        return this;
    }

}
