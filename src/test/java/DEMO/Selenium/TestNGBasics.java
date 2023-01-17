package DEMO.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	WebDriver driver;
	 
	@BeforeSuite
	public void SetUP()
	{
		System.setProperty( 
	            "webdriver.chrome.driver", 
	            "D:\\work\\chromedriver_win32\\chromedriver.exe"); 
	}
	
	@BeforeClass
	 public void LaunchChrome()
    { 
    	
    	 
         //driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); 
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
       
    }
	
	@BeforeMethod
	public void LaunchURL()
	{     
		// Instantiate a ChromeDriver class. 
        driver = new ChromeDriver(); 
  
        // Maximize the browser 
        driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
	}
	
	@BeforeTest
	public void Login()
	{
		
	}
	
	
	@Test(priority=1,groups="Title")
	public void GoogleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("Title :-" + title);
		
	}
	
	@Test(priority=2,groups="Logo")
	public void GoogleLogoTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();
		System.out.println("Res :-" + b);
		
	}
	
	@Test(priority=3,groups="Search")
	public void EnterSearchText()
	{
		System.out.println("Search Text");
	}
	
	@Test(priority=4,groups="Search")
	public void ClickSearch()
	{
		System.out.println("Click Search Text");
	}
	
	
	@AfterMethod
	public void LogOut()
	{
		driver.quit();
	}
	
	@AfterTest
	public void DeleteCookies()
	{
       // driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		
	}
	
	@AfterSuite
	public void GenerateTestReport()
	{
		
	}
}
