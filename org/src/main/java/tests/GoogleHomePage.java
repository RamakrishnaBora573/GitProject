package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePage {

	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() throws Exception {
		 driver.get("https://www.google.co.in");
		 driver.manage().window().maximize();		 
		 Thread.sleep(3000);
	  }
	  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
	   
	   System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	     
	  }
	  
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
}
