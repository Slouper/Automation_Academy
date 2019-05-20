package sloup.D_xpath_lecture_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineMainPage extends AbstractPageXpath {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help'] ")
    private WebElement helpAnchor;

    public RedmineMainPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnHelpAnchor() {
        helpAnchor.click();
    }
}
