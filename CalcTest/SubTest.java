import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubTest {
	 @Test
	   public void test_Sub1() {
	      System.out.println("Test for a negative value") ;
	      Calc c= new Calc();
	      assertTrue(c.Subtraction(5,-2)== 7) ;
	 }
	  	
	 	 @Test
	 	   public void test_Sub2() {
	 	      System.out.println("Test for a zero value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Subtraction(0,2)== -2) ;     
	   }
	 	 
	 	 @Test
	 	   public void test_Sub3() {
	 	      System.out.println("Test for a positive value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Subtraction(10,3)== 7) ;     
	   }	
}
