package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Login {
	
		

	public static void login(WebDriver driver) {
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("krishnamanupati@gmail.com");
		System.out.println("[Passed: Email/Username has entered]");
		Reporter.log("[Passed: Email/Username has entered]");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("14011f0017");
		System.out.println("[Passed: Password has entered]");
		Reporter.log("[Passed: Password has entered]");
		driver.findElement(By.xpath("//button[starts-with(text(),'Login')]")).click();
		System.out.println("[Passed: Submit has clicked]");
		Reporter.log("[Passed: Submit has clicked]");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

	public static void loadProfileUrl(WebDriver driver) {
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		System.out.println("[Passed: Naukri portal has opend]");
		Reporter.log("[Passed: Naukri portal has opend]");
		
	}

	public static void loadHomePage(WebDriver driver) {
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		System.out.println("[Passed: Naukri portal has opend]");
		Reporter.log("[Passed: Naukri portal has opend]");
		
	}

	
	/*// Below is the code for login with pop up window through Gmail
	 * driver.findElement(By.xpath("//a[@class='socialbtn google']")).click();
	 * Set<String> windows= driver.getWindowHandles(); Iterator<String> I1=
	 * windows.iterator();
	 * while(I1.hasNext()) {
	 * String child_window=I1.next();
	 * if(!parentWindow.equals(child_window)) {
	 * driver.switchTo().window(child_window);
	 * System.out.println(driver.switchTo().window(child_window).getTitle());  }}
	 */
	
	/*This method is to click on upload resume button and selecting resume manually
	 * @Test(enabled = false) public void resume() throws InterruptedException {
	 * //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 * Thread.sleep(3000);
	 * System.out.println("[Passed: Waited for 3 seconds to load page]");
	 * //driver.findElement(By.xpath("//input[@id='attachCV']")).click(); //clicking
	 * attach resume button //driver.findElement(By.
	 * xpath("//*[@class='text' and contains(text(),'Resume')]/following-sibling::a"
	 * )).click(); driver.findElement(By.xpath(
	 * "//*[@class='collection-item']//a[text()='Update']")).click();
	 * System.out.println("[Passed: Clicked on Update resume button/link]");
	 * 
	 * }
	 */

	

}
