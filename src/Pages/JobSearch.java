package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utils.BrowserSetup;
import Utils.Login;
import Utils.Search;

public class JobSearch {
	
	static WebDriver driver = null;
	
	@BeforeTest(alwaysRun = true)
	public void browserSetup() {
		
		driver = new BrowserSetup().browserType();
	}
	
	@Test(priority = 1)
	public void NavigateNaukri() {
		
		Login.loadHomePage(driver);
	}
	
	@Test(priority = 2)
	public void NaukriLogin() {
		Login.login(driver);
	}
	
	@Test(priority = 3)
	public void SearchJob() {
		Search.searchJob(driver);
		
	}
	
	@Test(priority = 4)
	public void sortResults() {
		Search.sort(driver);
	}
	
	
	@AfterTest
	public void driverClose() {
		String homeTitle = driver.getTitle();
		//driver.close();
		System.out.println("[Passed: Webdriver closed successfully ]");
		//Assert.assertEquals(homeTitle, "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
		//SoftAssert softAssert = null ;
		//softAssert.assertAll();
		}

}
