import java.util.Scanner;
public class CalculatorApp {

	public static void main(String[] args) {
	
		double Result=0;
		
		Calc calculate= new Calc();
		
		//Take user input for first number
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double num1= sc.nextDouble();
		
		// Select the operations
		
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.println("5. Modulus ");
		
		//num3 is used to select the operation 
		
		System.out.println("Select one of the above options: ");
		int num3= sc.nextInt();
		
		System.out.println("Enter the second number: ");
		double num2= sc.nextDouble();
	
		/*
		if (num3==1)
	Result= calculate.Addition(num1, num2);
	
		if(num3==2)
	Result= calculate.Subtraction(num1, num2);
	
		if(num3==3)
	Result= calculate.Multiplication(num1, num2);
	
		if (num3==4)
	Result= calculate.Division(num1, num2);
	
		if(num3==5)
	Result= calculate.Modulus(num1, num2);
		
		*/
		
	Result=calculate.SingleCalc(num1, num2, num3);
		
		System.out.println("The result is "+ Result);
	}

}

