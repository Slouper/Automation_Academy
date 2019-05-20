package pageObjectsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[@id='navbtn_references']")
    private WebElement teferences;

    public HomePage (WebDriver driver) {
        super(driver);
        driver.get("https://www.w3schools.com/");
    }

    public HomePage clickOnReferences() {

        teferences.click();
        return this;
        //return new ReferencesPage(getDriver());

    }


}
