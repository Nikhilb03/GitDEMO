package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test (groups=("smoke"))//among all test cases, wants to run only few- use groups functionality (can exclude also)
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@AfterSuite 
	public void aftersuite()
	{
		System.out.println("I am the Last");
	}

}
//parameterisation in TestNG done by- you can drive the data from testng xml in file or using DataProvider annotations
