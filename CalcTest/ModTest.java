import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ModTest {
	 @Test
	   public void test_Mod1() {
	      System.out.println("Test for a negative value") ;
	      Calc c= new Calc();
	      assertTrue(c.Modulus(-5,2)== -1) ;
	 }
	  	
	 	 @Test
	 	   public void test_Mod2() {
	 	      System.out.println("Test for a zero value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Modulus(0,3)== 0) ;     
	   }
	 	 
	 	 @Test
	 	   public void test_Mod3() {
	 	      System.out.println("Test for a positive value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Modulus(13,10)== 3) ;     
	   }	
}
