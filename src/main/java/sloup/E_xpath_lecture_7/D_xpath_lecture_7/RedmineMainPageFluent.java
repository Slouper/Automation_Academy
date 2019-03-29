package sloup.E_xpath_lecture_7.D_xpath_lecture_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineMainPageFluent extends AbstractPageXpathFluent {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help'] ")
    private WebElement helpAnchor;

    public RedmineMainPageFluent(WebDriver driver) {
        super(driver);
    }

    public void clickOnHelpAnchor() {
        helpAnchor.click();
    }
}
