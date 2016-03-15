import org.junit.* ;
import static org.junit.Assert.* ;

public class AddTest {

	Calc c= new Calc();
	
	 @Test
	   public void test_Add1() {
	      System.out.println("Test for a negative value") ;
	      Calc c= new Calc();
	      assertTrue(c.Addition(5,-2)== 3) ;
	 }
	  	
	 	 @Test
	 	   public void test_Add2() {
	 	      System.out.println("Test for a zero value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Addition(0,0)== 0) ;     
	   }
	 	 
	 	 @Test
	 	   public void test_Add3() {
	 	      System.out.println("Test for a positive value") ;
	 	      Calc c= new Calc();
	 	      assertTrue(c.Addition(10,30)== 40) ;     
	   }	 
	 	 
	 	 
}

