package Pageobject;

import org.testng.annotations.Test;

import LoginPage.loginpage;
import resources.Baseclass;

public class Loginpagetestcases extends Baseclass{
	
	@Test
	
	public void login() {
	loginpage ob = new loginpage();
	ob.clicksigin();
	

}}
