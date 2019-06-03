package DetailsPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {

  WebDriver driver;

  @FindBy(id="title")
  WebElement title;

  public DetailsPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }


  public DetailsPage verifyDetailsPage() {
// Store the current window handle
    String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
    for(String winHandle : driver.getWindowHandles()){
      driver.switchTo().window(winHandle);
    }
    Assert.assertEquals("Autobiography of a Yogi",title.getText());
    return this;
  }
}
