package lma.finalobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='navbtn_references']")
    private WebElement referenceButtonClick;

    @FindBy(how = How.XPATH, using = "//*[@id='nav_references']/div/div[1]/a[1]")
    private WebElement htmlTagreRerenceClick;

    public HomePage(WebDriver driver) {
        super(driver);
        getWait().until(ExpectedConditions.visibilityOf(referenceButtonClick));
    }

    public HomePage referenceButtonClick() {
        referenceButtonClick.click();
        return this;
    }

    public HtmlTagReferencePage htmlTagreRerenceClick() {
        htmlTagreRerenceClick.click();
        return new HtmlTagReferencePage(getDriver());
    }

}
