package introo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.cssSelector("input#email")).sendKeys("rahul");
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());

		//Assert.assertEquals(false, null);
	
		//if you know locators well, then rest is cake walk
		
		//in only xpath- you go by text- ex: //button(tagname)[text()='Log Out']
		
	}

}
