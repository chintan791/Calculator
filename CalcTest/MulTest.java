import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MulTest {

	
	 @Test
	   public void test_Mul1() {
	      System.out.println("Test for a negative value") ;
	      Calc c= new Calc();
	      assertTrue(c.Multiplication(5,-2)== -10) ;
	 }
	  	
	 	 @Test
	 	   public void test_Mul2() {
	 	      System.out.println("Test for a zero value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Multiplication(0,10)== 0) ;     
	   }
	 	 
	 	 @Test
	 	   public void test_Mul3() {
	 	      System.out.println("Test for a positive value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Multiplication(10,3)== 30) ;     
	   }	
}
