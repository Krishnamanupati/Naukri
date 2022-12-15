package Utils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class UpdateResume {

	public static void attachResume(WebDriver driver) throws InterruptedException {
		
		WebElement uploadResumeBtn = driver.findElement(By.xpath("//input[@id='attachCV']"));
		uploadResumeBtn.sendKeys("D:\\Search New\\My Resume\\Manupati-Krishna-resume.pdf");
		Thread.sleep(5000);//check this code to refresh page and get latest timestamp
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement resumeLastUpdated = driver.findElement(By.xpath("//span[@class='updateOn']"));
		String resumeLastUpdatedTimeStamp = resumeLastUpdated.getText();
		System.out.println("[Passed: Resume " +resumeLastUpdatedTimeStamp +" ]");
		Reporter.log("[Passed: File uploaded successfully ]");
		System.out.println(driver.getTitle());
		
	}

	public static void deleteResume(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		try {
		
		WebElement deleteResume = driver.findElement(By.xpath("//a[contains(text(),'DELETE RESUME')]"));
		if(deleteResume.isDisplayed()) {
			WebElement resumeLastUpdated = driver.findElement(By.xpath("//span[@class='updateOn']"));
			String resumeLastUpdatedTimeStamp = resumeLastUpdated.getText();
			System.out.println("[Passed: Found previous resume on profile (" +resumeLastUpdatedTimeStamp +" )]");
			deleteResume.click();
			System.out.println("[Passed: Clicked on deleting resume ]");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			String mainWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();
			while (itr.hasNext()) {
				String cWindow = itr.next();
				if(!(mainWindow.equalsIgnoreCase(cWindow))) {
					driver.switchTo().window(cWindow);
				}
				
			}
	
			driver.findElement(By.xpath("(//iframe//following-sibling::div//*//div//button)[1]")).click();
			//driver.findElement(By.xpath("(//a[@class='cancelLayerDel']//following-sibling::button)[2]")).click();
			System.out.println("[Passed: Resume deleted ]");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else {
			System.out.println("No resume uploaded to profile");
			System.out.println("Continuing with resume upload");
		}
		}
		catch (Exception e) {
			System.out.println("No resume uploaded to profile");
			System.out.println("Continuing with resume upload");
		}
		
	}
	
	

}
