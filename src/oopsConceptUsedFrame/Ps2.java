package oopsConceptUsedFrame;

import org.testng.annotations.Test;

public class Ps2 extends Ps3
{
	int a;
  //default constructor
   public Ps2(int a)
   {
	   super(a); //parent cons is invoked
	   this.a=a;
   }
  
   public int Increment()
   {
	  a= a+1;
	   return a;
   }
  
   public int Decrement()
   {
	   a=a-1;
	   return a;
   }
}
