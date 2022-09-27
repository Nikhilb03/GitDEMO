package introo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//siblings- child to parent traverse
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
		System.out.print(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		

		
	}

}
