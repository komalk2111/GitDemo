package oopsConceptUsedFrame;

import org.testng.annotations.Test;

public class Ps1 extends Ps
{
	@Test
	public void TestRun()
	{
	   Ps2 ps2=new Ps2(3);
	   
	   DoThis();
	   System.out.println(ps2.Increment());
	   System.out.println(ps2.Decrement());
	   
	 //  Ps3 ps3=new Ps3(3);
	   System.out.println(ps2.multiplyTwo());
	   System.out.println(ps2.multiplyThree());
	}
	
}

