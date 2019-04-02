package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class W3HTMLReferencePage {

    private WebDriver driver;

    public Object clickOnHTMLTag;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'w3-bar-item') and text()='HTML Tag Reference']")
    private WebElement HTMLTagAnchor;

    public W3HTMLReferencePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public W3TagPage clickOnHTMLTag(){
        HTMLTagAnchor.click();
        return new W3TagPage(driver);
    }
}
