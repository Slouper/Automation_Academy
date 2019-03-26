package plu.homeworkFluentInterface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class RedMineSpentTimeDetailsPageHw8 extends BasePageHw8 {

    @FindBy(how = How.XPATH, using = "//h1[text()='Redmine Timelog Report']")
    private WebElement redmineTimeLogReportTitle;

    public RedMineSpentTimeDetailsPageHw8(WebDriver driver) {

        super(driver);
    }

    public String getTitleDisplayed() {
        return redmineTimeLogReportTitle.getText();
    }
    public void titleVerification(){
        String expectedTitleText = "Redmine Timelog Report";
        String titleText = getTitleDisplayed();
        Assert.assertTrue(titleText.contains(expectedTitleText), "Redmine Timelog Report");
    }
}
