package synchronisation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();//parent to child
		//capture all webelements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));// in first column
		//capture text of all webelements into new list by stream method
		List<String> originallist= elementsList.stream().map(s->s.getText()).collect(Collectors.toList()); 
		//-> lamda expression, s is any variable
		//sort list in step 3-> sorted list
		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		Assert.assertTrue(originallist.equals(sortedlist));
		
		
		//scan name column with gettext -> print price of the rice
		List<String>price;
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]")); //same as above in webelement- just changing to rows
		price= rows.stream().filter(s->s.getText().contains("Rice")).
		map(s->getPriceveggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		//if its not present in first page by pagenation
		if(price.size()<1)
		     {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		     }
	     }    while(price.size()<1);
  }
	private static String getPriceveggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
