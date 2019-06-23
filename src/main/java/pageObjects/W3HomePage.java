package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class W3HomePage extends AbstractPage{

    private WebDriver driver;

    public Object clickOnReference;
    @FindBy(how = How.XPATH, using = "//a[@id='navbtn_references']")
    private WebElement referenceAnchor;

    public W3HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public W3ReferencePage clickOnReference(){
        referenceAnchor.click();
        return new W3ReferencePage(driver);
    }
}
