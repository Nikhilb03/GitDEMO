package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups=("smoke"))
	public void test()
	{
	System.out.println("welcome");

	}

	@BeforeTest
	public void test1 ()
	{
		System.out.println("welcome too");
	}
}
