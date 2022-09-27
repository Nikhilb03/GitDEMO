package introo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatedjava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// if have id- most unique way and better than xpath, css
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		// int i=1;
		// while(i<5)
		// {
		// driver.findElement(By.id("hrefIncAdt")).click();//clicking +
		// i++;
		// } or
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();// clicking +
		}
		driver.findElement(By.id("btnclosepaxoption")).click();// click done
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
