package ASE.lecture7.ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AseLecture7_NewResultPage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@class='Result-title-link'][1]")
    private WebElement firstResultLink;

    public AseLecture7_NewResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    public void clickOnFirstResultLink() {
//        firstResultLink.click();
//    }

    public Ase_WebBrowserAutomationPage clickOnFirstResultLink(){
        firstResultLink.click();
        return new Ase_WebBrowserAutomationPage(driver);

    }

}
