package ASE.lecture7.ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ase_SeznamHomePage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement searchButton;

    public Ase_SeznamHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public Ase_NewResultPage clickOnSearchButton(){
        searchButton.click();
        return  new Ase_NewResultPage(driver);
    }

    public Ase_SeznamHomePage enterSearchExpression(String searchedExpression){
        searchInputField.sendKeys(searchedExpression);
        return this;
    }

}
