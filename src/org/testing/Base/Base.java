package org.testing.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	//public ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "../DemoSite/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
        Options op = driver.manage();
        Window w = op.window();
        w.maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        
        String  url = "https://www.demo.guru99.com/V4/";
        System.out.println("**");
        driver.get(url);
        Thread.sleep(20000);
      System.out.println(driver.getTitle());
      driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr379318");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mejezYn");
      //driver.findElement(By.id("gh-btn")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
     
      
      Thread.sleep(5000);
      driver.findElement(By.linkText("New Customer")).click();
      Thread.sleep(5000);
      int size = driver.findElements(By.tagName("iframe")).size();
      System.out.println(size);
      System.out.println(driver.getCurrentUrl());
      driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
      driver.switchTo().frame("ad_iframe");
      System.out.println("switched to iframe");
      Thread.sleep(5000);
     // driver.findElement(By.linkText("Open")).click();
      try {
      driver.findElement(By.xpath("//*[@title='Google']")).click();
      }
      //Thread.sleep(5000);
      catch(Exception e1)
      {
    	  e1.printStackTrace();
    	  System.out.println("Exception condition 1");
    	  driver.findElement(By.xpath("//*[@title='step.exense.ch']")).click();
      }
      Thread.sleep(5000);
      driver.navigate().back();
      driver.switchTo().defaultContent();
      driver.findElement(By.linkText("New Customer")).click();
      Thread.sleep(5000);
      Actions ac = new Actions(driver);
      ac.sendKeys(Keys.PAGE_DOWN).perform();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rajnee");
     
      driver.findElement(By.xpath("//input[@value='f']")).click();
     
      driver.findElement(By.xpath("//input[@name='dob']")).click();
      /*driver.findElement(By.name("addr")).sendKeys("sector-22,"+
      		"Noida,"+
      		"India,"+
      		"Pin-201301");
      driver.findElement(By.name("city")).sendKeys("Noida");
      Thread.sleep(5000);
      driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");
      Thread.sleep(5000);
      driver.findElement(By.name("pinno")).sendKeys("201301");
      Thread.sleep(5000);
      driver.findElement(By.name("telephoneno")).sendKeys("9958749445");
      Thread.sleep(5000);
      driver.findElement(By.name("emailid")).sendKeys("vermasabhajeet@gmail.com");
      Thread.sleep(5000);
      System.out.println("222");
      //System.out.println(driver.switchTo().alert().getText());
     // driver.switchTo().alert().accept();
     
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
      System.out.println("1111");
      //System.out.println(driver.switchTo().alert().getText());
      //driver.switchTo().alert().accept();
      
      WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
      System.out.println("***1");
      Thread.sleep(5000);
     // Alert alert = driver.switchTo().alert();
      System.out.println("***22");// switch to alert

     // String alertMessage= driver.switchTo().alert().getText(); // capture alert message

      //System.out.println(alertMessage); // Print Alert Message
      Thread.sleep(5000);
     // alert.accept();
      submit.click();
      Alert alert = driver.switchTo().alert();
      System.out.println("***22");// switch to alert

      String alertMessage= driver.switchTo().alert().getText(); // capture alert message

      System.out.println(alertMessage); // Print Alert Message
      Thread.sleep(5000);
      alert.accept();
      System.out.println("3333");
		}
	}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception condition 2");
		}*/
		//driver.
      //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(""));
     /* System.out.println(close.isDisplayed());
      System.out.println(close.isEnabled());
      if(close.isEnabled()) {
    	  close.click();
      }
      else {
    	  System.out.println("close button not enabled");
      }*/
     // Thread.sleep(10000);
     // driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
     // driver.findElement(By.xpath("//a[@class='ns-2292a-e-18 button-common open-button']")).click();
      //System.out.println("12121");
      //driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
//      driver.findElement(By.id("awf_field-93653884")).sendKeys("vermasabhajeet@gmail.com");
//      driver.findElement(By.id("af-submit-image-482158182")).click();
     /* WebDriverWait wait = new WebDriverWait(driver,30);
      WebElement advance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-as-a")));
      advance.click();
      WebElement keywordoption = driver.findElement(By.id("_in_kw"));
      Select s = new Select(keywordoption );
      Thread.sleep(5000);
      //s.selectByVisibleText("Exact words, exact order");
      //s.selectByIndex(2);
      s.selectByValue("3");
      //driver.findElement(By.)
      //driver.close();
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("(//a[@class='vip'])[1]")).click();
      Thread.sleep(5000);
      WebElement select = driver.findElement(By.name("Network"));
      Select s1 = new Select(select);
      s1.selectByVisibleText("Cricket");
      Thread.sleep(5000);
      WebElement select1 = driver.findElement(By.name("Color"));
      Select s2 = new Select(select1);
      s2.selectByVisibleText("Purple");
      Thread.sleep(5000);
     // Actions ac = new Actions(driver);
      //ac.sendKeys(Keys.PAGE_DOWN).perform();
     // JavascriptExecutor js = (JavascriptExecutor)driver;
	  //js.executeScript("window.scrollBy(0,500)", "");
      Thread.sleep(5000);
      WebElement addToCart = driver.findElement(By.id("isCartBtn_btn"));
      Thread.sleep(5000);
      Actions ac = new Actions(driver);
      ac.sendKeys(Keys.PAGE_DOWN).perform();
      addToCart.click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    		  
      //driver.quit();
      
     */
		
			
			
      
    }
}