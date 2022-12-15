package Pages;




import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PObjects.Path;
import Utils.BrowserSetup;
import Utils.Login;
import Utils.UpdateResume;
import bsh.commands.dir;

public class ResumeChange {
	
	WebDriver driver = null;
	Path pathObj;
	

	@BeforeTest
	public void init() {
		
		
		driver= (WebDriver) new BrowserSetup().browserType();
	
		
	}
	
	@Test(priority = 1)
	public void Url() {
		
		Login.loadProfileUrl(driver);
		
	}
	
	@Test(priority = 2)
	public void login() {
		

		Login.login(driver);
		
	}
	
	@Test(priority = 3)
	public void deleteResume() {
		
		UpdateResume.deleteResume(driver);
	}
	
	
	@Test(priority = 4)
	public void uploadResume() throws InterruptedException {
		
		UpdateResume.attachResume(driver);
		
	}
	
	
	//VER-SGDm-jqmF-iWH1D
	
	
	  @Test(enabled = false) 
	  public void gmailLogin() {
	  System.out.println("Passed: trying to navigate to gmail login");
	  driver.navigate().to("https://accounts.google.com/");; }
	 
	
	
	@AfterTest
	public void close() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
}
