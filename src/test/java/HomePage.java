import DetailsPage.DetailsPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePage {

  WebDriver driver;


  @FindBy(xpath = "//input[@value='Go']")
  private WebElement go;

  @FindBy(xpath = "//div[@class='s-result-list sg-row']//span[@class='a-size-medium a-color-base a-text-normal']")
  private List<WebElement> results;

  public HomePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }


  @FindBy(id = "twotabsearchtextbox")
  WebElement searchBox;


  public HomePage search(String keyword) {
    searchBox.sendKeys(keyword);
    go.click();
//    String firstResult = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']//span[@class='a-size-medium a-color-base a-text-normal']")).get(0).getText();
    String firstResult = results.get(0).getText();
    assertEquals("Autobiography of a Yogi", firstResult);
    return this;
  }

  public DetailsPage openDetailsForFirstItem() {
    results.get(0).click();
    return new DetailsPage(driver);
  }
}
