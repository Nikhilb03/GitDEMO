package synchronisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sect11Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		// August 30- generic test to identify date
		// famous interviewc que to write generic test
		driver.findElement(By.id("travel_date")).click();

		while (driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("August")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();// parent child tag
			break;
		}

		List<WebElement> dates = driver.findElements(By.className("day"));// identified common attribute and wrote logic
		driver.findElements(By.className("day")).size();
		for (int i = 0; i < driver.findElements(By.className("day")).size(); i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
