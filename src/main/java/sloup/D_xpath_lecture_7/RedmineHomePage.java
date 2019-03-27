package sloup.D_xpath_lecture_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePage extends AbstractPageXpath {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnchor;

    public RedmineHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginAnchor() {
        loginAnchor.click();
    }
}
