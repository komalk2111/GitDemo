package oopsConceptUsedFrame;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ps 
{
	@Test
    public void DoThis()
    {
	   System.out.println("I am run 1st");
    }
	
	@BeforeTest
	public void before()
	{
		System.out.println(" run before test");
	}
	
	@AfterTest
	public void after()
	{
		System.out.println("Run last");
	}
}
