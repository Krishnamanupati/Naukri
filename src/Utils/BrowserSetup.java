package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserSetup {
		WebDriver driver ;
	@Test
	public WebDriver browserType() {
		
		//System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("[Passed: Browser window opened and maximized ]");
		System.out.println();
		return driver;
	}
	
	//C:\Users\krish\eclipse-workspace\Naukri
	
}
