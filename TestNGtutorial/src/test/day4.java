package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test (groups=("smoke"))
	public void WebloginHomeloan()
	{
		//selenium code for it
		System.out.println("webloginhome");
	}
	@Parameters({"URL"})
	@Test //for it execution depends on alphabetical order
	public void Mobilelogin(String uname)
	{
		//appium
		System.out.println("mobileloginhome");
		System.out.println("uname");
	}

	@BeforeMethod
	//INTERVIEW Q: before method is parti to class file and execute before other methods
	//before test related testng xml file- based upon test folder scope
	public void loginAPI()
	{
		System.out.println("APIloginhome");
		//rest API automation
	}

	}
