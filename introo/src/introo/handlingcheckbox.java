package introo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of testing framework- gives assertion- you have to download from maven and import that jar in project
public class handlingcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//*[name()='circle'])[6]")).click();

		// targeted attribute in CSS selector: copy required target and use * ex:
		// By.cssselector("input[id*='seniorcitizen']")
		// System.out.println(driver.findElement(By.xpath("(//*[name()='circle'])[6]")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("(//*[name()='circle'])[6]")).isSelected());
		// counting no. of checkboxes
		System.out.println(driver.findElements(By.xpath("(//*[name()='circle'])")).size()); // if only element- give
																							// first checkbox only
	}

}
