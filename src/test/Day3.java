package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 
{
	@Test(groups={"Smoke"})
	public void WebloginCarLoan()
	{
		//selenium code
		System.out.println("WebloginCar");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("I am no.1");
	}
	@Test(dependsOnMethods={"WebloginCarLoan"})
	public void MobileloginCarLoan()
	{
		//appium code
		System.out.println("MobileloginCar");
	}
	@Test(dataProvider="getData")
	public void Mobilesignout(String username,String password)
	{
		System.out.println("Mobile sign out car loan");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(groups={"Smoke"})
	public void APICarLoan()
	{
		System.out.println("APIloginCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1 st= username /password ---good creadit history
		//2nd= username password ---no creadit history
		//3rd =fraudleant creadit history
	
		Object[][]data=new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
	}

}
