package PObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Path {
	WebDriver driver ;
	
	public Path(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how= How.XPATH, using = "//a[@class='socialbtn google']")
	public String loginWithGoogle;
	
	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	public String gmailUserName;
}
