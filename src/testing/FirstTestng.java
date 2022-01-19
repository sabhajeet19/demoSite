package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestng {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
  @Test
  public void verifyHomePageTitle() {
	  System.out.println("Lounching Chrome Browser");
	  System.setProperty("webdriver.chrome.driver","../DemoSite/chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.close();
  }

}
