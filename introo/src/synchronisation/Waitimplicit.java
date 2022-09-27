package synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitimplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicit- applicable to all cases (ex:3/5 sec), readable and optimised code as mentioned only once
		
		//disadva- impli- hides perfo issues (cant know which stage taking what time)
		//explicit- specific to parti scenario (ex:15 sec)to targeted step only- 2 ways- webdriver wait, fluent wait
		//ideal soln- combination of both is required

		WebDriverWait w =new WebDriverWait(driver, 5); //w is object, webdriverwait is class
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")))//to access methods inside class needs to create object
		
		
		
		

		
		
		//thread.sleep- part of java (hold on script for given sec irrespi of early loading)(not of selenium)
		//fluent Wait

		
	}

}
