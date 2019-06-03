import jdk.nashorn.internal.parser.JSONParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class NewsTest {

  @Test
  public void printKarmaPoints() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","/Users/sheetal/Learning/NewsTest/src/test/resources/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://news.ycombinator.com/newest");




    for(int i =0; i < 3; i++) {
      //driver.findElement(By.xpath(String.format("//table[@class='itemlist']//tr[%s]//td[2]/a",i))).click();
      final List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href,'user')]"));

      elements.get(i).click();
      final String user = driver.findElement(By.xpath("//td[contains(text(),'user:')]/../td[2]")).getText();
      //System.out.println(user);
      final String karmaPoints = driver.findElement(By.xpath("//td[contains(text(),'karma:')]/../td[2]")).getText();
      System.out.println( user + " " + karmaPoints);

      driver.findElement(By.xpath("//a[text()='Hacker News']")).click();
      Thread.sleep(100);

    }
    driver.quit();

  }

  @Test
  public void testApi() throws IOException {


    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
      .url("https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty")
      .get()
      .addHeader("cache-control", "no-cache")
      .build();

    Response response = client.newCall(request).execute();
    final String topStories = response.body().string();

    final String[] stories = topStories.split(",");

    for(int i =0; i < 3; i++){

      final String story = stories[i].replace("[", "").trim();
      Request request1 = new Request.Builder()
        .url("https://hacker-news.firebaseio.com/v0/item/"+story+".json?print=pretty")
        .get()
        .addHeader("cache-control", "no-cache")
        .build();

      response = client.newCall(request1).execute();

      final String storyResponse = response.body().string().toString();


     // Get top stories
      //For 3 stories
        // Get story details
        // Get user and user details
        // Get karma points

    }

  }

}
