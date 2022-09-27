package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ajax/mouseover interactions (specific to some sites only if such function)(till now clickig)
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");// set property to invoke browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// to maximise window

		driver.get("https://www.amazon.com/");
		// now create Actions class and object a
		Actions a = new Actions(driver); // In actions class argument needs to pass driver object. so driver object get
											// capa of action class methods
		WebElement move = (driver.findElement(By.id("nav-link-accountList")));

		// move to specific elements
		a.moveToElement(move).contextClick().build().perform();// context click to rightclick
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();// shift for to get in caps

	}

}
