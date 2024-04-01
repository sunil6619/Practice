package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.Baseclass;

public class loginpage extends Baseclass{
	
	@FindBy(xpath = "//span[@class=\"top-menu\"]")
	private WebElement signin;
	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "//button[@id=\"btn-submit\"]")
	private WebElement loginbutton;
	
	
	public loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clicksigin() {
		signin.click();
	}
	
	public void emailenter() {
		email.sendKeys("sunil.suri1101@gmail.com");
		password.sendKeys("258963");
		loginbutton.click();
	}
	
	
	
	
	

}
