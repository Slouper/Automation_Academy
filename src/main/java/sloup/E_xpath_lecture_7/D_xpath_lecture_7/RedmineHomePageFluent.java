package sloup.E_xpath_lecture_7.D_xpath_lecture_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePageFluent extends AbstractPageXpathFluent {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnchor;

    public RedmineHomePageFluent(WebDriver driver) {
        super(driver);
        driver.get("https://www.redmine.org");
    }

    public RedmineLoginPageFluent clickOnLoginAnchor(WebDriver driver) {
        loginAnchor.click();
        return new RedmineLoginPageFluent(driver);
    }
}
