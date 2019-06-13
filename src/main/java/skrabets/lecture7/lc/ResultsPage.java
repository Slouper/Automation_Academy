package skrabets.lecture7.lc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
  private WebDriver wd;

  @FindBy(how = How.XPATH, using = "//*[@class='Result-title-link'][1]")
  private WebElement firstResultLink;


  public ResultsPage(WebDriver wd){
    this.wd = wd;
    PageFactory.initElements(wd, this);
  }

  public WebBrowserAutomationPage clickOnFirstResultLink(){
    firstResultLink.click();
    return new WebBrowserAutomationPage(wd);
  }



}
