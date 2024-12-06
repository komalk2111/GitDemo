package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will last execution");
	}

	@Test(groups={"Smoke"})
	public void Demo()
	{
       System.out.println("hello");
	}
	
	@AfterSuite
	public void last()
	{
		System.out.println("last");
	}
	@Parameters({"URL"})
	@Test
	public void SecondTest(String urlname)
	{
		System.out.println("Hi");
		System.out.println(urlname);
	}

}
