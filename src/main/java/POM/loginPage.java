package POM;

import org.openqa.selenium.WebDriver;

public class loginPage {

	public void login()
	{
		System.out.println("This is login page.");
	}
	
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
