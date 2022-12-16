package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search {

	public static String[] keyWords = {"QA, ", "Testing, ", "automation"};
	
	@SuppressWarnings("deprecation")
	public static void searchJob(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.get("https://www.naukri.com/qa-testing-automation-jobs?experience=4&functionAreaIdGid=5&functionAreaIdGid=13&ctcFilter=6to10&ctcFilter=10to15");
		
		
		  System.out.println("Searching for jobs in search bar");
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); WebElement
		  searchBtn = driver.findElement(By.id("qsb-keyskill-sugg"));
		  searchBtn.sendKeys(keyWords); System.out.println(keyWords.toString() +
		  " has entered");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		System.out.println(driver.getTitle());
System.out.println();
	}

	public static void sort(WebDriver driver) {
		
		WebElement sort = driver.findElement(By.xpath("//p[@class='sort-droop-label']"));
		sort.click();
		driver.findElement(By.xpath("//p[@class='sort-droop-label']/following-sibling::ul//li[@data-value='f']")).click();
	}
	

}
