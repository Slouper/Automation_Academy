package skrabets.lecture7.lc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeznamHomePage {
  private WebDriver wd;

  @FindBy(how = How.XPATH, using = "//*[@name='q']")
  private WebElement searchInputField;

  @FindBy(how = How.XPATH, using = "//button[@type='submit']")
  private WebElement searchButton;


  public SeznamHomePage(WebDriver wd){
    this.wd = wd;
    PageFactory.initElements(wd, this);
  }

  public ResultsPage clickOnSearchButton(){
    searchButton.click();
    return new ResultsPage(wd);
  }

  public SeznamHomePage enterSearchExpression(String expression){
    searchInputField.sendKeys(expression);
    return this;
  }

}
