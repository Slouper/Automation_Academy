package skrabets.lecture7.lc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebBrowserAutomationPage {
  @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/h2[1]")
  private WebElement article;

  public WebBrowserAutomationPage(WebDriver wd){
    PageFactory.initElements(wd, this);
  }

  public String getArticleValue(){
    return article.getText();

  }

}
