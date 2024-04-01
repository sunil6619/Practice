package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	

	public WebDriver driver;
	@BeforeClass
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.rugartisan.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//butoon[@class=\"btn btn-secondary btn-md rounded-0\"]")).click();
			
	}
	
//	@AfterClass
//	
//	public void teardown() {
//		driver.close();
//	}

}
