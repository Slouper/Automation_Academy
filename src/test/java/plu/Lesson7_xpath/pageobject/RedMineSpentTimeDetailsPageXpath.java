package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RedMineSpentTimeDetailsPageXpath extends BasePageXpath {

    @FindBy (how = How.XPATH, using="//h1[text()='Redmine Timelog Report']")
    private WebElement redmineTimeLogReportTitle;

    public RedMineSpentTimeDetailsPageXpath(WebDriver driver) {

        super(driver);
    }

    public String getTitleDisplayed(){
        return redmineTimeLogReportTitle.getText();
    }
}
