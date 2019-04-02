package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class W3ReferencePage extends AbstractPage {

    private WebDriver driver;

    public Object clickOnHTMLTag;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'w3-bar-item') and text()='HTML Tag Reference']")
    private WebElement HTMLTagAnchor;

    public W3ReferencePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public W3HTMLReferencePage clickOnHTMLTag(){
        HTMLTagAnchor.click();
        getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='main]/h1")));
        return new W3HTMLReferencePage(driver);
    }
}
