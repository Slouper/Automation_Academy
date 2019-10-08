package MBA.SedmaLekceFluent.SedmaLekce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePageFluent extends AbstractPageFluent {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnchor;

    WebDriver driver;

    public RedmineHomePageFluent(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }


    public RedmineLoginPageFluent clickOnLoginAnchor() {
        loginAnchor.click();
        return new RedmineLoginPageFluent(driver);
    }
}
