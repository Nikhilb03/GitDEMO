package synchronisation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Sect13brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//broken link - url tied up to it not working
		// Java methods will call URLs and gets you the status code
		
		List<WebElement> links=  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		//now iterate those links
		SoftAssert a = new SoftAssert();
		for(WebElement link : links)//this is enhanced for loop- getting one link in all
		{
			String url= link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();//java method open Connection 
			//written type of method is URLConnection
			//openConnection method present in URL class. Creating object url and calling that method with object.url
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			
			a.assertTrue(respCode<400, "the link with text"+link.getText()+"is broken with code"+ respCode);
			//respcode<400- false. so false of asserttrue is false. so test fails
			//above is hard assertion. so create softassertion object a. so a.assertTrue (hard assertion-  Assert.assertTrue)
			}
		a.assertAll(); //very critical step
		////String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); //to get url
		//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");// doing one single link
	    }
}
