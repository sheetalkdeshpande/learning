import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {

  @Test
  public void webdriverTest(){

    HomePage homePage = new HomePage(Driver.getDriver());
    homePage.search("book").openDetailsForFirstItem().verifyDetailsPage();

  }

  @After
  public void closeBrowser(){
    Driver.getDriver().quit();
  }
}
