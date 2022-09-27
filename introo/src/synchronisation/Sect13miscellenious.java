package synchronisation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils; //cannot be able to add jars

public class Sect13miscellenious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//maximising window and deleting cookies
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");
		//only delete in given session
		//click on link //login page- verify login url
		driver.get("http://google.com");
		
		//taking screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new file("D:\\screenshot.png")); //dont give C drive as its more secure
		 //WRITE manually package above: import org.apache.commons.io.FileUtils 
		//and download jar from apache common io in zip form  unzip to place in built path in project
		}

}
