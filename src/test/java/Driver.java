import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

  public static WebDriver driver;

  static {
      System.setProperty("webdriver.chrome.driver", "src/test/chromedriver/chromedriver");
      driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
  }


  public Driver() {
  }

  public static WebDriver getDriver(){return  driver;}
}
