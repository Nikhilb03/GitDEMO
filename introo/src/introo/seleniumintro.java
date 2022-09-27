package introo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumintro {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Firefox - firefoxDriver ->Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		// chromedriver.exe-> Chrome browser
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Firefox Launch
		//geckodriver
		
		//webdriver.gecko.driver
		//System.setProperty ("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

	}

}
