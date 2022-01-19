package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../DemoSite/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);
		System.out.println("first page title: "+driver.getTitle());
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.close();
		System.out.println(driver.getWindowHandle());
		WebElement business = driver.findElement(By.linkText("Business"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.SHIFT).click(business).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(5000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		//driver.close();
		driver.switchTo().window(handles.get(1));
		driver.get("https://www.facebook.com/");
		System.out.println("title of second page: "+driver.getTitle());
		System.out.println(driver.getWindowHandle());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		driver.switchTo().window(handles.get(0));
		System.out.println("title of first page: "+driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		

	}

}
