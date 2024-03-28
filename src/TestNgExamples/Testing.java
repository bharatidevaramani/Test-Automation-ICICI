package TestNgExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	public class GoogleTest{
		
		WebDriver driver;
		
		//@BeforeMethod
		public void setUp() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\44743\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 //WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
	
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("http://www.google.com");
		}
		 
		// @Test
		 public void GoogleTitleTest()
		 
		 {
			 
		 String Title=driver.getTitle();
		 System.out.println(Title);
				 
		 }
		 
		// @Test
		 public void GoogleLogoTest()
		 
		 {
		
			 boolean b= driver.findElement(By.xpath("(//img[@alt='Google'])[1]")).isDisplayed();
			 System.out.println(b);
		 }	 
		 
		// @AfterMethod
		 public void Teardown() {
			
			driver.quit();
		 }
			
		}	
	
	
	//Git download was successful
	
	//bharati devaramani

}
