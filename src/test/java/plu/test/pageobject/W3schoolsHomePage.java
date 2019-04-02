package plu.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import plu.pageobject.BasePage;

public class W3schoolsHomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[@id='navbtn_references']")
    private WebElement referencesBtn;

    @FindBy (how = How.XPATH, using = "//a[contains(text(),'HTML Tag Reference')]")
    public  WebElement htmlTagReference;

    public W3schoolsHomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.w3schools.com/");
    }

    public W3schoolsHomePage clickReferencesBtn(){
        referencesBtn.click();
        return new W3schoolsHomePage(getDriver());

    }

   // public void clickHtmlTagReferences(){
    //    htmlTagReference.click();
   // }


    public HtmlElementReferencesPage clickHtmlTagReferences(){
        htmlTagReference.click();
        return new HtmlElementReferencesPage(getDriver());
    }

   public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> referencesBtn.isDisplayed());
    }
}
