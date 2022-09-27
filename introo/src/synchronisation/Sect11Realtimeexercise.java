package synchronisation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sect11Realtimeexercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1.count of links on page - Interview q
		// any link will have tag a (which is anchor)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2.count of links in footer section

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// listing webdriver scope
		footerdriver.findElements(By.tagName("a")).size();
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// 3.footer sect first column only

		WebElement columndriver = footerdriver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// 4.click on each link in column and check if the pages are opening
		// interview q. - what special have you donein auto? - we have 30 links and has
		// to validate all.
		// we had script clicking on each which was time consuming 15 min.
		// but we use below concep- everything opening in sep tab on single shot and
		// decrease time
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);// opens in new tab and without it test fails
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
		}
		// getting title of child tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
