import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivTest {

	
	 @Test
	   public void test_Div1() {
	      System.out.println("Test for a negative value") ;
	      Calc c= new Calc();
	      assertTrue(c.Division(6,-2)== -3) ;
	 }
	  	
	 	 @Test
	 	   public void test_Div2() {
	 	      System.out.println("Test for a zero value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Division(0,10)== 0) ;     
	   }
	 	 
	 	 @Test
	 	   public void test_Div3() {
	 	      System.out.println("Test for a positive value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Division(10,100)== 0.1) ;     
	   }	
}
