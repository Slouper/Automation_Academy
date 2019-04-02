package pageObjectsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReferencesPage extends AbstractPage{

    @FindBy(how = How.XPATH, using = "//*[@id='nav_references']/div/div[1]/a[1]")
    private WebElement tag;


    public ReferencesPage(WebDriver driver) {
        super(driver);
    }


    public ReferencesPage clickOnHtmlTagReference(){
        tag.click();
        return this;
    }
}
