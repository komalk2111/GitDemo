package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class will execute");
	}
	@Test(enabled=false)
	public void WebloginHomeLoan()
	{
		//selenium code
		System.out.println("WebloginHome");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method will execute");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class will execute");
	}
	@Test(timeOut=4000)
	public void MobileloginHomeLoan()
	{
		//appium code
		System.out.println("MobileloginHome");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method will execute");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void loginAPIHomeLoan(String uname,String key)
	{
		System.out.println("APIloginHome");
		System.out.println(uname);
		System.out.println(key);
	}

}
