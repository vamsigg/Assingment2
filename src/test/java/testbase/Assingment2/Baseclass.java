package testbase.Assingment2;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	public ResourceBundle rb;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{	                             
		rb=ResourceBundle.getBundle("config");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeing()
	{
     	driver.close();
	}
	
}
