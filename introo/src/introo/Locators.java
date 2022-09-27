package introo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.visionias.in/student/login-form.php");
		driver.findElement(By.id("login")).sendKeys("nikhil");//this whole statement is called webelement
		driver.findElement(By.name("password")).sendKeys("nnn");
		//driver.findElement(By.name("Submit")).click();
		
		//css selector - when class, id not given, then- 1. tagname[attribute='value'], 2. tagname#id 3.tagname.classname
		//ex: <input name="login" type="text" class="textfield" id="login" required="" placeholder="Enter your email id">
	//then css selector 1. input[type='text']; 2.input#login ;3. input.textfield
	//driver.findElement(By.linkText("FORGOT PASSWORD?")).click();
	//driver.findElement(By.xpath("//input[@required='required']")).sendKeys("bhargude nikhil");
	//driver.findElement(By.cssSelector("input[value='EMAIL LINK']")).click();
	//if dont have unique attributes- called indexing methods(last resort, 
		//but do mlostly by unique attribute) in xpath (check in console with $x())
		driver.findElement(By.xpath("(//input[@class='textfield'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@class='textfield'])[1]")).sendKeys("nikhilbhargude619@gmail.com");
		//driver.findElement(By.xpath("(//input[@class='textfield'])[2]")).clear();
		//xpath by tag name (parents and child)- //form/input[2]
		driver.findElement(By.xpath(" //form/input[2]")).clear();
	driver.findElement(By.xpath("(//input[@class='textfield'])[2]")).sendKeys("Nikhil619@");
	
	driver.findElement(By.name("Submit")).click();
	//System.out.println
		
	}

}
