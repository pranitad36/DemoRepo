package DEMO.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    
    public void LaunchChrome()
    {
    	 System.setProperty( 
    	            "webdriver.chrome.driver", 
    	            "D:\\work\\chromedriver_win32\\chromedriver.exe"); 
    	
    	// Instantiate a ChromeDriver class. 
         WebDriver driver = new ChromeDriver(); 
   
         // Maximize the browser 
         driver.manage().window().maximize(); 
   
         // Launch Website 
         driver.get("https://www.geeksforgeeks.org/");
         driver.quit();
       
    }
    
    
    public void LaunchFirefox()
    {
    	System.setProperty( 
 	            "webdriver.gecko.driver", 
 	            "geckodriver.exe");       
         
         WebDriver driver  = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		String appTitle = driver.getTitle();
		
		System.out.println("Application title is :: "+appTitle);
		driver.close();
    
    }
    
   
    public void TC_TextBox() throws InterruptedException
    {
    	System.setProperty( 
 	            "webdriver.gecko.driver", 
 	            "geckodriver.exe");       
         
        WebDriver driver  = new FirefoxDriver();
		driver.navigate().to("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Pranita");
		driver.findElement(By.id("userEmail")).sendKeys("daphalpranita6@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune-411017");
		driver.findElement(By.id("permanentAddress")).sendKeys("Pune-411017");
		//WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.(By.id("permanentAddress")));
		 // wait time added
	     Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		driver.close();
	}
    
   
    public void TC_ButtonClick() throws InterruptedException
    {
    	System.setProperty( 
 	            "webdriver.gecko.driver", 
 	            "geckodriver.exe");       
         
        WebDriver driver  = new FirefoxDriver();
        driver.navigate().to("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(elementLocator).perform();
		Thread.sleep(2000);
		elementLocator = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(elementLocator).perform();
		driver.close();
    }
    
    
    public void TC_CheckBox() 
    {
    	System.setProperty( 
 	            "webdriver.gecko.driver", 
 	            "geckodriver.exe");       
         
        WebDriver driver  = new FirefoxDriver();
        driver.navigate().to("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//*[@aria-label='Toggle']")).click();
		
		driver.close();
    }
    
    
   /* public void TC_RadioButton() throws InterruptedException
    {
    	System.setProperty( 
 	            "webdriver.gecko.driver", 
 	            "geckodriver.exe");       
         
        WebDriver driver  = new FirefoxDriver();
        driver.navigate().to("https://demoqa.com/radio-button");
        WebElement radioElement = driver.findElement(By.id("yesRadio"));
        Thread.sleep(2000);
        boolean selectState = radioElement.isDisplayed();
      //performing click operation only if element is not selected
        if(selectState == false) {
        	radioElement.click();
        }
        boolean isEnable = radioElement.isEnabled();
		
      //performing click operation only if element is not selected
      if(isEnable == false) {
      	radioElement.click();
      }
    }*/
    
    
    
}
