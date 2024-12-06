package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{
     @Test
     public void ploan()
     {
    	 System.out.println("good");
    	 Assert.assertTrue(false);
     }
     
     @BeforeTest
     public void prerequisite()
     {
    	 System.out.println("I will execute 1st");
     }
}
